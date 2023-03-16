package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tu es un sorcier, quel est ton nom ? \n Hagrid");
        String Nom = scanner.nextLine();
        Wizard wizard = new Wizard(Nom);



//Spell s = new Spell(1);
//s.move(1);

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

}


