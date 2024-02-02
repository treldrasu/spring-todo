package de.schulung.todo;
import java.util.ArrayList;
import java.util.List;

import de.schulung.todo.model.AbstractAufgabe;
import de.schulung.todo.model.Aufgabe;

public class AufgabenContainer<T extends AbstractAufgabe> {
    private List<T> aufgabenListe;

    public AufgabenContainer() {
        this.aufgabenListe = new ArrayList<>();
    }

    public void aufgabeHinzufuegen(T aufgabe) {
        aufgabenListe.add(aufgabe);
    }

    public void aufgabenAnzeigen() {
        for (T aufgabe : aufgabenListe) {
            System.out.println(aufgabe);
        }
    }

    // Weitere Methoden zur Aufgabenverwaltung können hier hinzugefügt werden
}
