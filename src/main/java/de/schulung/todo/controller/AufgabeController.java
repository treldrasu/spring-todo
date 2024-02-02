package de.schulung.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.schulung.todo.model.AbstractAufgabe;
import de.schulung.todo.model.Aufgabe;
import de.schulung.todo.services.AufgabenService;

@RestController
@RequestMapping("/aufgaben")
public class AufgabeController {

    private final AufgabenService aufgabenService;

    @Autowired
    public AufgabeController(AufgabenService aufgabenService) {
        this.aufgabenService = aufgabenService;
    }

    @GetMapping("")
    public List<Aufgabe> holeAufgabe(){
        return aufgabenService.holeAlleAufgaben();
    }


    @PostMapping("")
    public void erstelleAufgabe(@RequestBody Aufgabe neueAufgabe) {
        aufgabenService.erstelleNeueAufgabe(neueAufgabe);
    }
}
