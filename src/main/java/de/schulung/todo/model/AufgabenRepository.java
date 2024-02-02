package de.schulung.todo.model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AufgabenRepository extends 
                                JpaRepository<Aufgabe, Long> {
    // Hier können benutzerdefinierte Methoden für den 
    // Datenzugriff definiert werden

}
