package com.ejercicio.EjercicioSpringSesion3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EjercicioSpringSesion3Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EjercicioSpringSesion3Application.class, args);
		ProductoRepository nuevoProducto = context.getBean(ProductoRepository.class);

		//Inserción del producto Laptop
		//Producto laptop = new Producto(null,"Laptop","Dell",550.99,false);
		//nuevoProducto.save(laptop);

		//Inserción del producto Teclado
		//Producto teclado = new Producto(null, "Teclado","Yamaha",780.55,true);
		//nuevoProducto.save(teclado);

		System.out.println(nuevoProducto.findAll());
		System.out.println("Cantidad de productos en DB: " + nuevoProducto.count());
	}
}
