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
    private double DamageWizard;
    private int PercentageWizard;

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
        System.out.println("À Poudlard vous êtes autorisés à avoir un animal de compagnie.\n Voulez-vous avoir un animal de compagnie ? soit oui soit non");
        String réponse = scanner.nextLine();
        switch (réponse) {
            case "oui":
                System.out.println("Vous avez le choix entre: OWL,RAT,CAT,TOAD. Vous devez en choisir 1");
                /* il manque le enum */
                String animal = scanner.nextLine(); // demander l'annimal
                System.out.println("Parfait Vous pouvez aller à Poudlard.");
                break;
            default:
                System.out.println("Parfait Vous pouvez aller à Poudlard.");
                break;

        }
        SortingHat house = new SortingHat();
        this.HouseWizard = house.getHouseWizard();
        House maison = new House(HouseWizard);
        this.DamageWizard = maison.getDamageWizard();
       this.PercentageWizard = maison.getPercentageWizard();

    }

    public int getLevel(){return Level;}
    public int setLevel(int Level){ this.Level = Level; return Level; }
    public double getLivePointsWizard(){return LivePointsWizard;}
    public double setLivePointsWizard(double LivePointsWizard){ this.LivePointsWizard = LivePointsWizard; return LivePointsWizard; }
    public String getNameWizard(){return NameWizard;}
    public String getCore(){return Core;}
    public String getHouseWizard(){return HouseWizard;}
    public double getDamageWizard(){return DamageWizard;}
    public double setDamageWizard(double DamageWizard){ this.DamageWizard = DamageWizard; return DamageWizard;}
    public int getPercentageWizard(){return PercentageWizard;}


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



}