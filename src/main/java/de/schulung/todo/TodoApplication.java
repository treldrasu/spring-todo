package de.schulung.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import de.schulung.todo.model.Aufgabe;
import de.schulung.todo.model.AufgabenRepository;

@SpringBootApplication
public class TodoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(TodoApplication.class, args);

		AufgabenRepository rep = ctx.getBean(AufgabenRepository.class);

		rep.save(new Aufgabe("Todo 1", "schöne Beschreibung", "erledigt"));
		rep.save(new Aufgabe("Todo 2", "Beschreibung", "offen"));

	}

}
