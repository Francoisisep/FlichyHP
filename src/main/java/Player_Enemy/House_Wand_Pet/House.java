package Player_Enemy.House_Wand_Pet;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class House  {
    private int PercentageWizard;
    private double DamageWizard;
    public House(String maison){

        switch (maison){
            case "Gryffondor":
                System.out.println("Vous êtes plus résistants aux dégâts que dans les autres maisons.");
                PercentageWizard = 40;
                DamageWizard = 0.5;
                break;
            case "Serpentard":
                System.out.println("Vos sorts font plus de dégâts.");
                PercentageWizard = 40;
                DamageWizard = 1;
                break;
            case "Poufsouffle":
                System.out.println("Vos potions sont les plus efficaces.");
                PercentageWizard = 40;
                DamageWizard = 0.5;
                break;
            case "Serdaigle":
                System.out.println("Vos sorts sont plus précis.");
                PercentageWizard = 50;
                DamageWizard = 0.5;
                break;


        }
    }
    public double getDamageWizard(){return DamageWizard;}
    public int getPercentageWizard(){return PercentageWizard;}


}

