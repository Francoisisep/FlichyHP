package House_Wand_Pet_Test;
import Player_Enemy.House_Wand_Pet.SortingHat;
import org.junit.Test;
import static org.junit.Assert.*;
public class SortingHatTest {
    @Test
    public void testHouseAssigned() {
        // Vérifie que le trieur assigne une maison valide
        SortingHat sortingHat = new SortingHat();
        String house = sortingHat.getHouseWizard();
        assertNotNull(house);
        assertTrue(house.equals("Poufsouffle") ||
                house.equals("Serpentard") ||
                house.equals("Gryffondor") ||
                house.equals("Serdaigle"));
    }
}
