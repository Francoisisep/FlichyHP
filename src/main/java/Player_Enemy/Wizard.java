package Player_Enemy;
import Player_Enemy.House_Wand_Pet.House;
import Player_Enemy.House_Wand_Pet.Pet;
import Player_Enemy.House_Wand_Pet.SortingHat;
import Player_Enemy.House_Wand_Pet.Wand;
import Spell_Potions.Spell;
import lombok.Getter;
import lombok.Setter;

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
        boolean ok = false;
        while(!ok){
            String choice = scanner.next();
            int result1 = choice.compareTo("oui");
            int result2 = choice.compareTo("non");
            if (result1 == 0){
                Pet p1 = Pet.OWL;
                Pet p2 = Pet.CAT;
                Pet p3 = Pet.TOAD;
                Pet p4 = Pet.RAT;
                System.out.println("Vous avez le choix entre:"+ p1 + ", " + p2 + ", " + p3 + ", " + p4 +". Vous devez en choisir 1.");
                boolean ok1 = false;
                String animal = scanner.nextLine();
                while (!ok1) {
                    animal = scanner.nextLine(); // demander l'annimal
                    int result3 = animal.compareTo("OWL");
                    int result4 = animal.compareTo("CAT");
                    int result5 = animal.compareTo("TOAD");
                    int result6 = animal.compareTo("RAT");
                    if (result3 == 0 || result4 == 0 || result5 == 0 || result6 == 0){ ok1 = true;}
                    else { System.out.println("Votre réponse est incorrect1.");}
                }
                ok = true;
            }
            else if (result2 == 0) { ok =true;}
            else { System.out.println("Votre réponse est incorrect.");}
        }

        System.out.println("Parfait Vous pouvez aller à Poudlard.");
        SortingHat house = new SortingHat();
        this.HouseWizard = house.getHouseWizard();
        House maison = new House(HouseWizard);
        this.DamageWizard = maison.getDamageWizard();
       this.PercentageWizard = maison.getPercentageWizard();
        Spell spell = new Spell();
    }
    public String getString(String choice1,String choice2){
        boolean ok = false;
        while(!ok){
            String choice = scanner.next();
            if (choice == choice1){
                ok = true;
            }
            else if (choice == choice2) {
                ok =true;
            }
            else {
                System.out.println("Votre réponse est incorrect.");
            }
        }
        return scanner.next();
    }
}