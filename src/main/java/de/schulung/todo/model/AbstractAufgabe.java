package de.schulung.todo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

// @Entity
// @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class AbstractAufgabe {
    @Id
    @GeneratedValue
    private Long id; 
    
    private String titel;
    
    private String beschreibung;
    
    private String status;

    public AbstractAufgabe(){}

    public AbstractAufgabe(String titel, String beschreibung, String status) {
        this.titel = titel;
        this.beschreibung = beschreibung;
        this.status = status;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    

    @Override
    public String toString() {
        return "AbstractAufgabe [id=" + id + ", titel=" + titel + ", beschreibung=" + beschreibung + ", status="
                + status + " [Details: "+ aufgabeDetails() + "] ]";
    }

    //jede Spezialiserung brauch diese MEthode ausimplementiert!
    public abstract String aufgabeDetails();

    
}
