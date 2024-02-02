package de.schulung.todo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import de.schulung.todo.model.AbstractAufgabe;
import de.schulung.todo.model.Aufgabe;
import de.schulung.todo.model.WiederkehrendeAufgabe;

public class AufgabeManager {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args){


        AufgabenContainer <AbstractAufgabe> cnt = new AufgabenContainer<>();

        cnt.aufgabeHinzufuegen(new Aufgabe("normale", "Aufgabe", "erledigt"));
        cnt.aufgabeHinzufuegen(new WiederkehrendeAufgabe("wieder", "aufgabe", "in arbeit", "30 minuten"));

        cnt.aufgabenAnzeigen();



        
        // List<Aufgabe> aufgaben = new ArrayList<>(Arrays.asList(
        //     new Aufgabe("test1", "asd", "erledigt"),
        //     new Aufgabe("test2", "asd", "erledigt")
            
        // ));
        // System.out.println("AufgabenMangaerTool");
        // while(true){
        //     try{
        //         System.out.println("Menu: 1 - neu anlegen, 2 - Auflisten, q - exit");
        //         switch (readEingabe("wähle Menüpunkt")) {
        //             case "1":
        //                 //speichern in Liste liste.add(neueAufgabe)
        //                 System.out.println("Erfasse neue Aufgabe!");
        //                 Aufgabe auf = aufgabeErfassen();
        //                 if(auf != null)
        //                     aufgaben.add(auf);
        //                 break;
        //             case "2":
        //                 //liste Ausgaben mit for(Aufgabe a : liste){ ... }
        //                 for (Aufgabe aufgabe : aufgaben) {
        //                     System.out.println(aufgabe);
        //                 }
        //                 break;
        //             case "q":
        //                 System.exit(0);
        //             default: 
        //                 System.err.println("bitte wähle richtig!");
        //                 break;
        //         }
        //     }catch(IOException error){
        //         System.err.println(error);
        //         error.printStackTrace();
        //     }catch(UngueltigerStatusException | LeereEingabeException e){
        //         System.out.println("Fehler bei der Aufgabenerstellung: " + e.getMessage());
        //     }
        // }

    }

    private static Aufgabe aufgabeErfassen() throws IOException, LeereEingabeException, UngueltigerStatusException {
        String title = readEingabe("Titel:");
        if(title.trim().isEmpty()){
            throw new LeereEingabeException("Die Eingabe darf nicht leer sien");
        }
        
        String beschreibung = readEingabe("Beschreibung:");

        System.out.println("Status: [erledigt] [in Arbeit] [offen]");
        String status = readEingabe("Status:");
        if(!status.equals("erledigt") && !status.equals("in Arbeit") && !status.equals("offen")){
            throw new UngueltigerStatusException("Ungültiger Status");
        }

        return new Aufgabe(title, beschreibung, status);
    }
    
    public static String readEingabe(String prefix) throws IOException{
        System.out.print(prefix +" > ");
        return input.readLine();
    }   

}
