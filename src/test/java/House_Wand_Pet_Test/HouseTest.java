package House_Wand_Pet_Test;
import Player_Enemy.House_Wand_Pet.House;
import org.junit.Test;
import static org.junit.Assert.*;
public class HouseTest {
    @Test
    public void testConstructor() {
        House gryffindor = new House("Gryffondor");
        assertEquals(40, gryffindor.getPercentageWizard());
        assertEquals(0.5, gryffindor.getDamageWizard(), 0.001);

        House slytherin = new House("Serpentard");
        assertEquals(40, slytherin.getPercentageWizard());
        assertEquals(1.0, slytherin.getDamageWizard(), 0.001);

        House hufflepuff = new House("Poufsouffle");
        assertEquals(40, hufflepuff.getPercentageWizard());
        assertEquals(0.5, hufflepuff.getDamageWizard(), 0.001);

        House ravenclaw = new House("Serdaigle");
        assertEquals(50, ravenclaw.getPercentageWizard());
        assertEquals(0.5, ravenclaw.getDamageWizard(), 0.001);
    }
}

