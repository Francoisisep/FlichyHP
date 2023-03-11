package org.example;

import java.util.Scanner;

public class Wand {
    public Wand ()
    {
// this
        System.out.println("Vous devez avoir une baguette, allez cher Olivender pour en avoir une." );
        int taille = (int)(Math.random() * 20) ; /* Taille des baguettes entre 16 cm et 35 cm */
        taille += 16;

        System.out.println("Félicitation votre baguette mesure "+taille+ " cm et elle contient du XXX");
    }
}