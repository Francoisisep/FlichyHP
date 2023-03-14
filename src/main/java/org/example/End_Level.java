package org.example;

import java.util.Scanner;

public class End_Level {
    public End_Level(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Vous pouvez choisir d’augmenter vos points de vie (Potion), vos points de dégâts.\n" +
                "Qu'est-ce que vous voulez améliorer?");
        String choix = scanner.nextLine();
        switch (choix){
            case "Potion":
         //       Potions potions =new Potions (liste potion); il faudrait qu'il ajoute...
                break;
            case "dégat":
                // a trouver (Attaque?)
                break;
            default:
                // à recommencer
                break;
        }


    }
}
