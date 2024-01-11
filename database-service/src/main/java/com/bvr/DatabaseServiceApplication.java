package com.bvr;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatabaseServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DatabaseServiceApplication.class, args);
	}
	
	private static final Logger log = LoggerFactory.getLogger(DatabaseServiceApplication.class);
	
	@Autowired
	private BookRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.save(new Book("PySpark"));
		repository.save(new Book("GoLang"));
		repository.save(new Book("Python"));
		repository.save(new Book("Javascript"));
		repository.save(new Book("Java"));
		repository.save(new Book("Ruby"));
		repository.save(new Book("Scala"));
		repository.save(new Book("C#"));
		
		log.info("Created Primary Records");
		
		System.out.println("\n find all records");
		
		repository.findAll().forEach(e -> System.out.println(e.getName()));
		
		System.out.println("\n find by id record");
		
		repository.findById(3L).ifPresent(e -> System.out.println(e.getName()));
		
		System.out.println("\n find by name records");
		
		repository.findByName("Java").forEach(e -> System.out.println(e.getId()+ " " + e.getName()));
		
//		Book bookToDelete = repository.findById(4L).get();
//		System.out.println("Delete Book : " + bookToDelete.getName());
//		
//		repository.delete(bookToDelete);
		
		
//		repository.findByName("GoLang").forEach(e -> {
//			System.out.println("Delete Book : " + e.getName());
//			repository.delete(e);
//		});
		
//		repository.deleteById(5L);
		
//		repository.deleteAllById(Arrays.asList(102L, 59L));
		
//		repository.deleteAll(repository.findByName("java"));
		
		System.out.println("\n Update records");
		
		repository.findById(3L).ifPresent(x -> {
			System.out.println(x);
			x.setName("Python - FastAPI and DataBricks");
			repository.save(x);
		});
		
		
		
	}


}
