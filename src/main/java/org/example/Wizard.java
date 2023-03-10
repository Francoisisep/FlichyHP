package org.example;

import java.util.Scanner;

public class Wizard {
    public Wizard () {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Tu es un sorcier, quel est ton nom ? \n Hagrid");
        String Nom = scanner.nextLine();
        System.out.println("Bienvenue " + Nom );


        Wand joueur1 = new Wand();
        SortingHat house = new SortingHat();

    }
}