package org.example;
public class Enemy extends AbstractEnemy {
    private double LivePoints;
    private int Percentage;
    public Enemy(String EnemyName, String NameWizard, double LivePointsWizard, int PercentageWizard, String HouseWizard) {
        switch (EnemyName) {
            case "Troll":
                LivePoints = 2;
                Percentage = 10;
                fight(LivePoints,Percentage,LivePointsWizard, NameWizard,PercentageWizard,EnemyName,HouseWizard);
                break;
            case "Basilic":
                LivePoints = 3;
                Percentage = 20;
                fight(LivePoints,Percentage,LivePointsWizard, NameWizard,PercentageWizard,EnemyName,HouseWizard);
                break;
            case "Dementor":
                LivePoints = 3;
                Percentage = 40;
                fight(LivePoints,Percentage,LivePointsWizard, NameWizard,PercentageWizard,EnemyName,HouseWizard);
                break;
            case "Portkey":
                LivePoints = 1;
                Percentage = 50;
                fight(LivePoints,Percentage,LivePointsWizard, NameWizard,PercentageWizard,EnemyName,HouseWizard);
                break;
            case "Ombrage":
                LivePoints = 10;
                Percentage = 45;
                fight(LivePoints,Percentage,LivePointsWizard, NameWizard,PercentageWizard,EnemyName,HouseWizard);
                break;
            case "DeathEaters":
                LivePoints = 8;
                Percentage = 40;
                fight(LivePoints,Percentage,LivePointsWizard, NameWizard,PercentageWizard,EnemyName,HouseWizard);
                break;
            case "Lestrange":
                LivePoints = 1;
                Percentage = 55;
                fight(LivePoints,Percentage,LivePointsWizard, NameWizard,PercentageWizard,EnemyName,HouseWizard);
                break;
    }
}
    public void fight(double LivePoints,int Percentage,double LivePointsWizard, String NameWizard, int PercentageWizard, String EnemyName, String HouseWizard) {
        while (LivePoints > 0 && LivePointsWizard > 0) {
            LivePoints = attack(NameWizard, "Enemy", PercentageWizard);
            if (LivePoints > 0) {
                LivePointsWizard = attack(EnemyName, HouseWizard, Percentage);
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