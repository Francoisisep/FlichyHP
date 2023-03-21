package Player_Enemy;
import Player_Enemy.House_Wand_Pet.House;
import Player_Enemy.House_Wand_Pet.Pet;
import Player_Enemy.House_Wand_Pet.SortingHat;
import Player_Enemy.House_Wand_Pet.Wand;
import Spell_Potions.Spell;
import lombok.Getter;
import lombok.Setter;

import java.util.InputMismatchException;
import java.util.Scanner;
@Setter
@Getter
public class Wizard extends Character {
   Scanner scanner = new Scanner(System.in);
    private String HouseWizard;
    private int Level;
    private String Core;
    private double LivePointsWizard;
    private String NameWizard;
    private double DamageWizard;
    private int PercentageWizard;
    public Wizard(String NameWizard){
        this.NameWizard = NameWizard;
        Wand wand = new Wand();
        this.Core = wand.getCore(); //Je récupère la composition de la baguette pour le niveau 7
        this.LivePointsWizard = 10;
        this.Level=1;
        System.out.println("À Poudlard vous êtes autorisés à avoir un animal de compagnie.\n Voulez-vous avoir un animal de compagnie ? soit oui soit non");
        String réponse = scanner.nextLine();
        /*
        try {
            String [] choix = {"oui","non"};
            System.out.println("À Poudlard vous êtes autorisés à avoir un animal de compagnie.\n Voulez-vous avoir un animal de compagnie ? soit oui soit non");
            String réponse = scanner.nextLine();
        }
        catch (Exception e){
            System.out.println("La réponse est incorrecte. Recommencez");
            String réponse = scanner.nextLine();
        }
        finally {
            return réponse;
        }
         */
        switch (réponse) {
            case "oui":
                Pet p1 = Pet.OWL;
                Pet p2 = Pet.CAT;
                Pet p3 = Pet.TOAD;
                Pet p4 = Pet.RAT;
                System.out.println("Vous avez le choix entre: " + p1 + ", " + p2 + ", " + p3 + ", " + p4 +". Vous devez en choisir 1");
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
        Spell spell = new Spell();
    }
    /*
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

     */
}