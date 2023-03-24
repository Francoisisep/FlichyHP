package Player_Enemy;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class Level {
    private String EnemyName;
    private String Result;
    public  Level(int Level) {
        switch (Level) {
            case 1:
                System.out.println("Vous êtes arrivés au niveau 1.\n" +
                        "Vous devez sauver un camarade de votre maison dans les toilettes du donjon. \n" +
                        "Vous affrontez le Troll. Utilisez Wingardium Leviosa pour faire tomber des objets sur la tête du troll.");
                EnemyName = "Troll";
                break;
            case 2:
                System.out.println("Vous êtes arrivés au niveau 2\n" +
                        "Vous devez sauver un de vos camarades de votre maison qui est enfermé dans la chambre des secrets.\n" +
                        "Vous êtes dans la chambre des secrets, vous affrontez le Basilic.\n" +
                        "Vous devez utiliser les crochets pour détruire le journal de Jedusor.");
                EnemyName = "Basilic";
                break;
            case 3:
                System.out.println("Vous êtes arrivés au niveau 3\n" +
                        "Attention aux détraqueurs! Ils sont en liberté. Ils errent dans les rues, les campagnes.\"\n" +
                        "Vous devez les repousser en utilisant le sortilège Expectro Patronum.");
                EnemyName = "Dementor";
                break;
            case 4:
                System.out.println("Vous êtes arrivés au niveau 4\n" +
                        "Par malheur vous avez remporté le Tournoi des Trois Sorciers. Vous êtes dans un cimetière, où se trouvent aussi Voldemort et Peter Pettigrew. \n" +
                        "Vous devez attraper le porte loin avec le sortilège Accio.");
                EnemyName = "Portkey";
                break;
            case 5:
                System.out.println("Vous êtes arrivés au niveau 5\n" +
                        "Vous êtes dans la salle d'examen de Poudlard. Vous devez distraire Ombrage.\n" +
                        "Vous devez la combattre jusqu’à obtenir des feux d’artifice dans votre inventaire.");
                EnemyName = "Ombrage";
                break;
            case 6:
                System.out.println("Vous êtes arrivés au niveau 6\n" +
                        "Vous êtes dans la Tour s'Astronomie. \n" +
                        "Si vous êtes à Serpentard, vous devez aider les Mangemorts qui ont tenté d’envahir Poudlard. \n" +
                        "Sinon Vous devez éliminer les Mangemorts qui ont tenté d’envahir Poudlard.");
                EnemyName = "DeathEaters";
                break;
            case 7:
                System.out.println("Vous êtes arrivés au niveau 7\n" +
                        "Vous êtes à Poudlard. \n" +
                        "Vous devez mettre hors d'état de nuire Voldemort et Bellatrix Lestrange. ");
                EnemyName = "Lestrange";
                break;
        }
    }
   // public String getEnemyName() {return EnemyName;}
}