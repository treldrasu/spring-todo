package de.schulung.todo.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import de.schulung.todo.model.Aufgabe;
import de.schulung.todo.services.AufgabenService;

@Controller
public class DemoController {

    private final AufgabenService aufgabenService;

    @Autowired
    public DemoController(AufgabenService service){
        this.aufgabenService = service;
    }

    @GetMapping("/")
    String getDemo(Model model){
        model.addAttribute("aufgabenListe", aufgabenService.holeAlleAufgaben());
        model.addAttribute("aufgabe", new Aufgabe());
        model.addAttribute("listStatus", Arrays.asList("offen", "Erledigt", "in Arbeit"));
        return "index";
    }
}
