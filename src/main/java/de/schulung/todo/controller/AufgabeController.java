package de.schulung.todo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import de.schulung.todo.model.Aufgabe;
import de.schulung.todo.services.AufgabenService;

@Controller
@RequestMapping("/aufgaben")
public class AufgabeController {

    private final AufgabenService aufgabenService;

    @Autowired
    public AufgabeController(AufgabenService aufgabenService) {
        this.aufgabenService = aufgabenService;
    }

    @PostMapping("")
    public String erstelleAufgabe(@ModelAttribute("aufgabe") Aufgabe neueAufgabe) {
        aufgabenService.erstelleNeueAufgabe(neueAufgabe);
        return "redirect:/";
    }

    @DeleteMapping("/{aufgabenId}")
    public String loescheAufgabe(@PathVariable Long aufgabenId) {
        aufgabenService.loescheAufgabe(aufgabenId);
        return "redirect:/";
    }
}
