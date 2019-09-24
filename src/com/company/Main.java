package com.company;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import static com.company.Utils.*;

public class Main {


    public static void main(String[] args) {

        ArrayList<String> films = new ArrayList<>();
        String choice = "";

        System.out.println("Bienvenue...");
        do{
            display("A pour ajouter un film");
            display("V pour voir les films");
            display("E pour effacer tous les films");
            display("S pour sortir du programme");
            choice = ask("Votre choix ?");
            switch (choice){
                case "A" : {
                    String name = ask("Quel film souhaitez-vous ajouter?");
                    films.add(name);
                    break;
                }
                case "V" : {
                    for (String film : films){
                        display("Film : " + film);
                    }
                    break;
                }
                case "E": {
                    films.clear();
                    break;
                }
                case "S": {
                    display("Merci et à bientôt!");
                    break;
                }
                default: {
                    display("Mauvais choix");
                }
            }
        } while(!choice.equals("S"));

    }

}
