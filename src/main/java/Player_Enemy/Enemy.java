package Player_Enemy;

public class Enemy extends AbstractEnemy {
    double LivePointsWizard1;
    private double LivePoints;
    private int Percentage;
    public Enemy(String EnemyName, String NameWizard, double LivePointsWizard, int PercentageWizard, String HouseWizard,double DamageWizard) {
        switch (EnemyName) {
            case "Troll":
                this.LivePoints = 2;
                this.Percentage = 10;
                fight(LivePoints,Percentage,LivePointsWizard, NameWizard,PercentageWizard,EnemyName,HouseWizard,DamageWizard);
                break;
            case "Basilic":
                this.LivePoints = 3;
                this.Percentage = 20;
                fight(LivePoints,Percentage,LivePointsWizard, NameWizard,PercentageWizard,EnemyName,HouseWizard,DamageWizard);
                break;
            case "Dementor":
                this.LivePoints = 3;
                this.Percentage = 40;
                fight(LivePoints,Percentage,LivePointsWizard, NameWizard,PercentageWizard,EnemyName,HouseWizard,DamageWizard);
                break;
            case "Portkey":
                this.LivePoints = 1;
                this.Percentage = 50;
                fight(LivePoints,Percentage,LivePointsWizard, NameWizard,PercentageWizard,EnemyName,HouseWizard,DamageWizard);
                break;
            case "Ombrage":
                this.LivePoints = 10;
                this.Percentage = 55;
                fight(LivePoints,Percentage,LivePointsWizard, NameWizard,PercentageWizard,EnemyName,HouseWizard,DamageWizard);
                break;
            case "DeathEaters":
                this.LivePoints = 12;
                this.Percentage = 60;
                fight(LivePoints,Percentage,LivePointsWizard, NameWizard,PercentageWizard,EnemyName,HouseWizard,DamageWizard);
                break;
            case "Lestrange":
                this.LivePoints = 1;
                this.Percentage = 65;
                fight(LivePoints,Percentage,LivePointsWizard, NameWizard,PercentageWizard,EnemyName,HouseWizard,DamageWizard);
                break;
    }
}
    public void fight(double LivePoints,int Percentage,double LivePointsWizard, String NameWizard, int PercentageWizard, String EnemyName, String HouseWizard,double DamageWizard) {
        while (LivePoints > 0 && LivePointsWizard > 0) {
            double intermédiaireLivePoints = LivePoints;
            LivePoints =LivePoints - attack( PercentageWizard,Damagepoint(NameWizard, "Enemy",DamageWizard)); //A récuperer grace à la classe Wizard
            if(LivePoints-intermédiaireLivePoints < 0) {
                System.out.println("Vous avez atteint votre cible.");
                System.out.println("points de vie de l'ennemi: " + LivePoints + " Points de vie du sorcier: "+ LivePointsWizard);
            }
            if (LivePoints > 0) {
                double intermédiaireLivePointsWizard = LivePointsWizard;
                LivePointsWizard =LivePointsWizard - attack( Percentage,Damagepoint(EnemyName, HouseWizard,DamageWizard));
                if (LivePointsWizard-intermédiaireLivePointsWizard <0) {
                    Context(EnemyName);
                    System.out.println("points de vie de l'ennemi: " + LivePoints + " Points de vie du sorcier: "+ LivePointsWizard);}
            }
            else {System.out.println("Vous avez réussi à vous débarraser du "+ EnemyName + "."); LivePointsWizard1 = LivePointsWizard;}
            if (LivePointsWizard <= 0){ System.out.println("Vous avez perdu."); }
        }
    }
public void Context(String EnemyName){
    switch (EnemyName){
        case "Troll":
            System.out.println("Le Troll vous lance des objets. Vous perdez de la vie.");
            break;
        case "Basilic":
            System.out.println("Le Basilic vous donne un coup de queue. Vous perdez de la vie.");
            break;
        case "Dementor":
            System.out.println("Le Détraqueur aspire votre âme. Vous perdez de la vie.");
            break;
        default:
            EnemySort();
            break;
    }
}
    public void EnemySort (){ // donne le sort que lance l'adversaire du joueur
        int rand = (int) (Math.random() * 3);
        String[] tab = {"Avada Kedavra", "Impero", "Endoloris"};
        String impardonnable = tab[rand];
        System.out.println("Vous avec reçu le sortilège " + impardonnable + ", vous perdez de la vie."); }
    public double getLivePointsWizard(){return LivePointsWizard1;}
}
