package com.example.demo.controllers;

import com.example.demo.entities.Book;
import com.example.demo.repository.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/*
 * Existen 2 tipos de controladores en Spring: @RestController y @Controller
 * El @RestController permite trabajar con archivos .json para la comunicación entre micro servicios -> Se utiliza en Aplicaciones REST
 * El @Controller permite trabajar con archivos html y cargarlos en una vista para presentar información -> Se utiliza con Spring MVC
 * */
@RestController
public class BookController {
    //Declaración de un sistema de logs para el controlador.
    private final Logger log = LoggerFactory.getLogger(BookController.class);

    /*
    Cualquier anotación de tipo Mapping (Get, Post, Put, etc) sirven para trabajar en entornos web. Permiten vincular una URL
    y dependiendo de la anotación, se comportará de una u otra forma.
    La anotación @GetMapping solicita un recurso (pide información) mediante una URL
    La anotación @PutMapping y @PostMapping se utilizan para crear información en el backend. Es decir, envían datos al servidor.
    * */

    // Atributos
    private BookRepository bookRepository;

    // Constructores
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // CRUD sobre la entidad Book
    // Buscar todos los libros (ArrayList de Libros)
    /**
     * http://localhost8080/api/books
     * @return
     * Mediante la anotación @GetMapping y gracias a la libreria .jackson, la petición convierte el objeto Java en un
     * archivo .json y lo muestra al cliente que hizo la petición.
     */
    @GetMapping("/api/books")
    public List<Book> findAll(){
        // Recuperar los libros de BD
        return bookRepository.findAll();
    }
    // Buscar un solo libro en BD por su id
    /*
    En una petición con anotaciones Mapping podemos especificar un parámetro cambiante/dinámico en la URL que especificamos
    en la anotación con llaves ({}) y el nombre del parámetro
    * */
    @GetMapping("/api/books/{id}")
    // Para que los parámetros especificados en la URL funcionen, en el método hay que agregar la anotación @PathVariable
    // Opcionalmente dentro de la anotación podemos especificar el parámetro con el que se va a trabajar. Esto se usa al tener
    // nombres diferentes en los parámetros.
    public ResponseEntity<Book> findById(@PathVariable Long id){
        //El método findById de Spring JPA devuelve un tipo de dato Optional la cual es una clase especial que envuelve el resultado
        //Para evitar trabajar con valores null.
        //Para trabajar con ella, se crea un objeto de tipo Optional que contiene la clase que estamos buscando.
        Optional<Book> bookOpt = bookRepository.findById(id);
        // Opción 1 con programación imperativa
        /*
        * Usando la clase ResponseEntity podemos devolver estados http (código 200 de ok, 404 de not found,etc)
        * */
        if (bookOpt.isPresent())
           return ResponseEntity.ok(bookOpt.get());
        else
            return ResponseEntity.notFound().build();
        // Opcion 2 con programación funcional
//           return bookOpt.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());

    }
    // Crear un nuevo libro en BD
    @PostMapping("/api/books")
    /*  Para poder guardar datos recibidos con la anotación @PostMapping, debemos añadir la anotación @RequestBody en
        el parámetro que recibe el método y así extraer los datos.
    * */
    public ResponseEntity<Book> create(@RequestBody Book book, @RequestHeader HttpHeaders headers){
        //Mediante la anotación @RequestHeader se puede obtener la información de headers enviada por el usuario que hizo
        //una petición.
        System.out.println(headers.get("User-Agent"));
        //Comprobación de que el id del objeto no exista en BBDD. Si existe, no es una creación, es una actualización.
        if(book.getId() != null) {
            log.warn("Trying to create a book with id");
            System.out.println("Trying to create a book with id");
            return ResponseEntity.badRequest().build();
        }
        Book result = bookRepository.save(book);
        // Guardar el libro recibido por parámetro en la BD
        return ResponseEntity.ok(result);
    }
    // Actualizar un libro existente en BD
    /* El método Put http normalmente se utiliza para actualizar datos ya existentes en una BBDD. Sin embargo, no hay
       problema si se utiliza Put para crear y actualizar, ni con Post para lo mismo.
    * */
    @PutMapping("/api/books")
    public ResponseEntity<Book> update(@RequestBody Book book){
        //Opción 1
        //Si no tiene id quiere decir que se intenta crear un nuevo registro, no una actualización
        if(book.getId() == null) {
            log.warn("Trying to update a non existent book");
            return ResponseEntity.badRequest().build();
        }
        //Comprobación de que exista este libro en la BBDD para poder actualizarlo
        if(!bookRepository.existsById(book.getId())) {
            log.warn("Trying to update a non existent book");
            return ResponseEntity.notFound().build();
        }
        //Proceso de actualización
        Book result = bookRepository.save(book);
        return ResponseEntity.ok(result);
    }
    // Borrar un libro en BD
    @DeleteMapping("/api/books/{id}")
    public ResponseEntity<Book> delete(@PathVariable Long id){
        if(!bookRepository.existsById(id)) {
            log.warn("Trying to delete a non existent book");
            return ResponseEntity.notFound().build();
        }
        bookRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
    // Borrar todos los libros
    @DeleteMapping("/api/books")
    public ResponseEntity<Book> deleteAll(){
        log.info("REST Request for delete all books");
        bookRepository.deleteAll();
        return ResponseEntity.noContent().build();
    }
}