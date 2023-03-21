package Player_Enemy.House_Wand_Pet;

import lombok.Getter;
import lombok.Setter;

import java.lang.invoke.LambdaConversionException;
@Setter
@Getter
public class SortingHat {
    private String HouseWizard;
  /*  public String house;
    public String getHouse(){
        return house;
        public void setHouse( String newHouse){
            this.house = newHouse;
        }
    }*/
    public SortingHat() {
        System.out.println("Vous êtes arrivés à Poudlard. Le chapeau magique va vous répartir dans une maison.");
        /* chiffre entre 0 et 3
        range = max - min + 1 = 4-1+1 = 4
        rand = random * range  = random * 4 */
        int rand = (int) (Math.random() * 4);
        String[] tab = {"Poufsouffle", "Serpentard", "Gryffondor", "Serdaigle"};
        HouseWizard = tab[rand];
        System.out.println("Bravo, votre maison est " + HouseWizard + ". Voici vos avantages:");
        /*donner les caractériques de la maison choisie (swtich) dans cette classe ou celle de House? */

        //void maison(){
        //  System.out.println(tab[rand]);
    }

   // public String getHouseWizard(){return HouseWizard;}




}
