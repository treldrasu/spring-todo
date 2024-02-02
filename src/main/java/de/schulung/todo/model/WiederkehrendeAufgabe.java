package de.schulung.todo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

public class WiederkehrendeAufgabe extends AbstractAufgabe {

    @Column(name = "wiederholungs_intervall")
    private String wiederholungsIntervall;

    public WiederkehrendeAufgabe(String titel, String beschreibung, String status, String wiederholungsIntervall) {
        super(titel, beschreibung, status);
        this.wiederholungsIntervall = wiederholungsIntervall;
    }

    @Override
    public String aufgabeDetails() {
        return "Wiederholungsintervall: " + wiederholungsIntervall + "\n";
    }
}
