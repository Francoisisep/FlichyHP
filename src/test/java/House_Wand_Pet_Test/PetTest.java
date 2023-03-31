package House_Wand_Pet_Test;
import Player_Enemy.House_Wand_Pet.Pet;
import org.junit.Test;
import static org.junit.Assert.*;
public class PetTest {
    @Test
    public void testEnumValues() {
        // Vérifie que toutes les valeurs de l'énumération sont présentes
        assertEquals(4, Pet.values().length);
        assertTrue(Pet.OWL instanceof Pet);
        assertTrue(Pet.RAT instanceof Pet);
        assertTrue(Pet.CAT instanceof Pet);
        assertTrue(Pet.TOAD instanceof Pet);
    }
    @Test
    public void testEnumToString() {
        // Vérifie que la méthode toString() retourne le nom de l'énumération en minuscules
        assertEquals("owl", Pet.OWL.toString());
        assertEquals("rat", Pet.RAT.toString());
        assertEquals("cat", Pet.CAT.toString());
        assertEquals("toad", Pet.TOAD.toString());
    }
}
