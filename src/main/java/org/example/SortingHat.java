package org.example;

public class SortingHat {
    public SortingHat(){
        /* chiffre entre 0 et 3
        range = max - min + 1 = 4-1+1 = 4
        rand = random * range  = random * 4 */
        int rand = (int)(Math.random() * 4) ;
        String[] tab = {"Poufsouffle","Serpentard", "Gryffondor", "Serdaigle"};


        System.out.println("Bravo votre maison est " + tab[rand]);
    }
}
