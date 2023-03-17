package org.example;

import java.util.Scanner;

public class Wizard extends Character{

   Scanner scanner = new Scanner(System.in);
    private String pet;
    private String wand;
    private String HouseWizard;
    //private int weaponDamage;
    private int Level;

    private String Core;
    private double LivePointsWizard;
    private String NameWizard;
    public double DamageWizard;

    /*
    List<Potion> potions;
    List<Spell> knownSpells;
*/
    //Constructeur
    public Wizard(String NameWizard){
        this.NameWizard = NameWizard;
        Wand wand = new Wand();
        this.Core = wand.getCore(); //Je récupère la composition de la baguette pour le niveau 7
        this.LivePointsWizard = 10;
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
        this.HouseWizard = house.getHouseWizard();
        System.out.println("TTTTTTTTEEEEEESSSSSSTTTTT"+ this.HouseWizard);
/*
        PasserNiveau(Level);
        this.Level += 1;
        Niveau1 niveau1 = new Niveau1();
        PasserNiveau(Level);
        this.Level += 1;
        Niveau2 niveau2 = new Niveau2();
        PasserNiveau(Level);
        this.Level += 1;

 */
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
    public int setLevel(int Level){
        this.Level = Level;
        return Level;
    }
    public double getLivePointsWizard(){return LivePointsWizard;}
    public double setLivePointsWizard(double LivePointsWizard){
        this.LivePointsWizard = LivePointsWizard;
        return LivePointsWizard;
    }
    public String getNameWizard(){return NameWizard;}
    public String getCore(){return Core;}
    public String getHouseWizard(){return HouseWizard;}
    public double getDamageWizard(){return DamageWizard;}
    public double setDamageWizard(double DamageWizard){
        this.DamageWizard = DamageWizard;
        return DamageWizard;
    }

/*
    public List<Potion> getPotion(){return potions;}

    public int getNumberPotion(){return potions.size();}

    public List<Spell> getSpell(){return knownSpells;}

    public int getNumberSpell(){return knownSpells.size();}
    */



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
    public void PasserNiveau(int niveau) {
        System.out.println("Vous avez un cours de sortilège");
        // Spell sort = new  Spell(niveau); // a cause de la abstract class AbstractSpell

    }


}