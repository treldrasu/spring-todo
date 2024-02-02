package de.schulung.todo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import de.schulung.todo.AufgabenRepository;
import de.schulung.todo.model.Aufgabe;

@Service
public class AufgabenService {

    private final AufgabenRepository aufgabenRepository;

    @Autowired
    public AufgabenService(AufgabenRepository aufgabenRepository) {
        this.aufgabenRepository = aufgabenRepository;
    }

    public void erstelleNeueAufgabe(Aufgabe neueAufgabe) {
        // Hier könntest du die Logik für das Erstellen und Speichern einer Aufgabe implementieren
        aufgabenRepository.save(neueAufgabe);
    }

    public List<Aufgabe> holeAlleAufgaben() {
        return aufgabenRepository.findAll();
    }
}
