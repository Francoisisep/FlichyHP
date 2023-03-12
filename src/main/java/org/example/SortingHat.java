package org.example;

import java.lang.invoke.LambdaConversionException;

public class SortingHat{
    public SortingHat(){
        System.out.println("Vous êtes arrivé à Poudlard le chapeau magique va vous répartir dans une maison");
        /* chiffre entre 0 et 3
        range = max - min + 1 = 4-1+1 = 4
        rand = random * range  = random * 4 */
        int rand = (int)(Math.random() * 4) ;
        String[] tab = {"Poufsouffle","Serpentard", "Gryffondor", "Serdaigle"};
        String maison = tab[rand];
        System.out.println("Bravo votre maison est " + maison + ". Voici vos avantages:");
        /*donner les caractériques de la maison choisie (swtich) dans cette classe ou celle de House? */
        House maison1 = new House(maison);

    }
}
