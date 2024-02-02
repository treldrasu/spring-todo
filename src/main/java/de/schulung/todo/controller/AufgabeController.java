package de.schulung.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
}
