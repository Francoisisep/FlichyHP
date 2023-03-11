package org.example;

import java.util.Scanner;

public class Wizard {
    public Wizard () {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Tu es un sorcier, quel est ton nom ? \n Hagrid");
        String Nom = scanner.nextLine();
        System.out.println("Bienvenue " + Nom );
        System.out.println("Voici le Règlement:\n Vous démarrez avec 3 points de vie. \n Si vous avez plus de points de vie vous perdez");
        System.out.println("Vous démarrez avec 0 potions. Une potion permet de gagner des points de vie.");
        System.out.println("Et vous ne connaissez pour l'instant aucun sortilège.");
        System.out.println(" Vous êtes au niveau 0\n Il y  a 7 niveaux qui correspondent à chacune de vos années à passer à Poudlard.");
        System.out.println("Si vous y arrivez, vous serez diplômés de la plus prestigieuse école de sorcellerie de la planète !");


    }
}