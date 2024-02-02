package de.schulung.todo.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import de.schulung.todo.model.Aufgabe;

@Controller
public class DemoController {
    @GetMapping("/")
    String getDemo(Model model){
        model.addAttribute("something", "this is from controller");
        model.addAttribute("aufgabenListe", Arrays.asList(
            new Aufgabe(1L, "Todo1", "beschreibung", "erledigt"),
            new Aufgabe(2L, "Todo2", "beschreibung", "offen"),
            new Aufgabe(3L, "Todo3", "besibung", "in Arbeit")
        ));
        return "index";
    }
}
