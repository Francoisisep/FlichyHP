package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Wizard wizard = new Wizard();
        Wand joueur = new Wand();
        int niveau = 0;
        System.out.println("À Poudlard vous êtes autorisé d'avoir un animale de compagnie.\n Voulez-vous avoir un animal de compagnie ? soit oui soit non");
        String réponse = scanner.nextLine();
        switch (réponse) {
            case "oui":
                System.out.println("Vous avez le choix entre: OWL,RAT,CAT,TOAD. Vous devez en choisir 1");
                /* il manque le enum */
                String animal = scanner.nextLine(); // demander l'annimal
                System.out.println("Parfait Vous pouvez à Poudlard.");
                break;
            default:
                System.out.println("Parfait Vous pouvez à Poudlard.");
                break;

        }
        SortingHat house = new SortingHat();
        PasserNiveau(niveau);
        niveau += 1;
        Niveau1 niveau1 = new Niveau1();
        PasserNiveau(niveau);
        niveau += 1;
        //Niveau2 niveau2 = new Niveau2();
        PasserNiveau(niveau);
        niveau += 1;
        //Niveau3 niveau3 = new Niveau3();
        PasserNiveau(niveau);
        niveau += 1;
        //Niveau4 niveau4 = new Niveau4();
        PasserNiveau(niveau);
        niveau += 1;
        //Niveau5 niveau5 = new Niveau5();
        PasserNiveau(niveau);
        //Niveau6 niveau6 = new Niveau6();
        //Niveau7 niveau7 = new Niveau7();




/*
    Pet p1 = Pet.OWL;
       // System.out.println(p1);
    Pet p2 = Pet.CAT;
        //System.out.println(p2);
    Pet p3 = Pet.TOAD;
     //   System.out.println(p3);
    Pet p4 = Pet.RAT;
        System.out.println(p1+" "+p2+" "+p3+" "+p4);

 */
}
public static void PasserNiveau(int niveau) {
    System.out.println("Vous avez un cours de sortilège");
    Sortilèges sort = new  Sortilèges(niveau);

}
}


