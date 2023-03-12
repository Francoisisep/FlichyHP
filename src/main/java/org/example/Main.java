package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Wizard wizard = new Wizard();
        Wand joueur = new Wand();
        System.out.println("À Poudlard vous êtes autorisé d'avoir un animale de compagnie.\n Voulez-vous avoir un animal de compagnie ? soit oui soit non");
        String réponse = scanner.nextLine();
        switch (réponse){
            case "non" :
                System.out.println("Parfait Vous pouvez à Poudlard.");
                break;
            case "oui":
                System.out.println("Vous avez le choix entre: OWL,RAT,CAT,TOAD. Vous devez en choisir 1");
                /* il manque le enum */
                System.out.println("Parfait Vous pouvez à Poudlard.");
                break;

            default:
                System.out.println("Vous êtes incapable de répondre correctement donc vous n'aurez pas d'animaux de compagnie.");

        }
        SortingHat house = new SortingHat();
/*
        Pet p1 = Pet.OWL;
        System.out.println(p1);
        Pet p2 = Pet.CAT;
        System.out.println(p2);
        Pet p3 = Pet.TOAD;
        System.out.println(p3);
        Pet p4 = Pet.RAT;
        System.out.println(p4);*/
    }
}