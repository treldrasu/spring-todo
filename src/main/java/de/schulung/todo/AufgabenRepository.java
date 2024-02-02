package de.schulung.todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.schulung.todo.model.Aufgabe;

@Repository
public interface AufgabenRepository extends 
                                JpaRepository<Aufgabe, Long> {
    // Hier können benutzerdefinierte Methoden für den 
    // Datenzugriff definiert werden

}
