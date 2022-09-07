package com.example.demo;

import com.example.demo.entities.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class SpringRestDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringRestDataJpaApplication.class, args);
		BookRepository repository = context.getBean(BookRepository.class);

		// CRUD / Esto se lo hace en un Controlador
		// Crear un libro
		// Para enviar directamente en el constructor un parámetro tipo DATE: LocalDate.of("Año","Mes","Día")
		Book libro1 = new Book(null,"La llamada de Cthulhu","H.P. Lovecraft",200,85.99, LocalDate.of(1980,6,20),true);
		Book libro2 = new Book(null,"La Divina Comedia","Dante Alighieri",500,99.99, LocalDate.of(1965,12,24),true);
		// Almacenar un libro
		System.out.println("Cantidad de libros en BD: " + repository.findAll().size());

		repository.save(libro1);
		repository.save(libro2);
		// Recuperar todos los libros
		System.out.println("Cantidad de libros en BD: " + repository.findAll().size());
		// Eliminar un libro
		//repository.deleteById(1L);
		System.out.println("Cantidad de libros en BD: " + repository.findAll().size());
	}
}