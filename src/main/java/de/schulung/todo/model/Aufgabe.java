package de.schulung.todo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aufgabe{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id; 
    String titel;
    String beschreibung;
    String status;

    public Aufgabe(){}

    public Aufgabe(String titel, String beschreibung, String status) {
        this.titel = titel;
        this.beschreibung = beschreibung;
        this.status = status;
    }

    public Aufgabe(Long i, String titel, String beschreibung, String status) {
        this.id = i;
        this.titel = titel;
        this.beschreibung = beschreibung;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Aufgabe [id=" + id + ", titel=" + titel + ", beschreibung=" + beschreibung + ", status=" + status + "]";
    }

    


}
