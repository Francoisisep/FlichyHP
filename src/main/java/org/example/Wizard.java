package org.example;

import java.util.Scanner;

public class Wizard extends Character{

   Scanner scanner = new Scanner(System.in);
    private String pet;
    private String wand;
    private String house;
    //private int weaponDamage;
    private int Level;

    private double LivePointsWizard;
    /*
    List<Potion> potions;
    List<Spell> knownSpells;
*/
    //Constructeur
    public Wizard(String name){
        Wand wand = new Wand();
        LivePointsWizard = 10; //LifePoints = 100
        this.Level=1;
        /*
        this.potions = new ArrayList<>();
        this.knownSpells = new ArrayList<>();
        */
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

        PasserNiveau(Level);
        this.Level += 1;
        Niveau1 niveau1 = new Niveau1();
        PasserNiveau(Level);
        this.Level += 1;
        Niveau2 niveau2 = new Niveau2();
        PasserNiveau(Level);
        this.Level += 1;
        /*
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
*/
    }

    public int getLevel(){return Level;}
/*
    public List<Potion> getPotion(){return potions;}

    public int getNumberPotion(){return potions.size();}

    public List<Spell> getSpell(){return knownSpells;}

    public int getNumberSpell(){return knownSpells.size();}
    */

    public int setLevel(int Level){
        this.Level = Level;
        return Level;
    }

    public int setLifePoints;


    //Fonctions inventaire

    //Ajout de potions et de lembas à l'inventaire
/*
    public List<Potion> addPotion(){
        int addMana=30;
        //Ajouter la potion à l'inventaire
        this.potions.add(new Potion(addMana));
        return potions;
    }

    public List<Spell> addSpell(){
        int addLife=20;
        //Ajouter la potion à l'inventaire
        this.knownSpells.add(new Spell(addLife));
        return this.knownSpells;
    }

    public List<Potion> consumePotion(){
        setLifePoints(getLifePoints()+potions.get(0).getAddMana());
        this.potions.remove(0);
        return this.potions;
    }
*/
   // public Character.attack(Enemy enemy);
    public static void PasserNiveau(int niveau) {
        System.out.println("Vous avez un cours de sortilège");
        // Spell sort = new  Spell(niveau); // a cause de la abstract class AbstractSpell

    }
}