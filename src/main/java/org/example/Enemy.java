package org.example;
public class Enemy extends AbstractEnemy {
    private double LivePoints;
    private int Percentage;
    public Enemy(String EnemyName, String NameWizard, double LivePointsWizard, int PercentageWizard, String HouseWizard) {
        switch (EnemyName) {
            case "Troll":
                this.LivePoints = 2;
                this.Percentage = 10;
                fight(LivePoints,Percentage,LivePointsWizard, NameWizard,PercentageWizard,EnemyName,HouseWizard);
                break;
            case "Basilic":
                this.LivePoints = 3;
                this.Percentage = 20;
                fight(LivePoints,Percentage,LivePointsWizard, NameWizard,PercentageWizard,EnemyName,HouseWizard);
                break;
            case "Dementor":
                this.LivePoints = 3;
                this.Percentage = 40;
                fight(LivePoints,Percentage,LivePointsWizard, NameWizard,PercentageWizard,EnemyName,HouseWizard);
                break;
            case "Portkey":
                this.LivePoints = 1;
                this.Percentage = 50;
                fight(LivePoints,Percentage,LivePointsWizard, NameWizard,PercentageWizard,EnemyName,HouseWizard);
                break;
            case "Ombrage":
                this.LivePoints = 10;
                this.Percentage = 45;
                fight(LivePoints,Percentage,LivePointsWizard, NameWizard,PercentageWizard,EnemyName,HouseWizard);
                break;
            case "DeathEaters":
                this.LivePoints = 8;
                this.Percentage = 40;
                fight(LivePoints,Percentage,LivePointsWizard, NameWizard,PercentageWizard,EnemyName,HouseWizard);
                break;
            case "Lestrange":
                this.LivePoints = 1;
                this.Percentage = 55;
                fight(LivePoints,Percentage,LivePointsWizard, NameWizard,PercentageWizard,EnemyName,HouseWizard);
                break;
    }
}
    public void fight(double LivePoints,int Percentage,double LivePointsWizard, String NameWizard, int PercentageWizard, String EnemyName, String HouseWizard) {
        double DamageWizard = 0.5;
        while (this.LivePoints > 0 && LivePointsWizard > 0) {
            this.LivePoints = attack( PercentageWizard,Damagepoint(NameWizard, "Enemy",DamageWizard)); //A récuperer grace à la classe Wizard
            System.out.println("dd" + this.LivePoints);
            if (this.LivePoints > 0) {
                LivePointsWizard = attack( Percentage,Damagepoint(EnemyName, HouseWizard,DamageWizard));
                System.out.println("ss"+ LivePointsWizard);
            }
            else {
                System.out.println("Vous avez réussit à vous débarrasez de "+ EnemyName);
            }
        }
        if (LivePointsWizard <= 0){
            System.out.println("Vous avez perdu");
        }
    }
}