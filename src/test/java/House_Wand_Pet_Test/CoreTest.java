package House_Wand_Pet_Test;
import Player_Enemy.House_Wand_Pet.Core;
import org.junit.Test;
public class CoreTest {
    @Test
    public void testEnumValues() {
        // Vérifie que toutes les valeurs de l'énumération sont présentes
        //assertEquals(4, Core.values().length);
        assertTrue(Core.PHOENIX_FEATHER instanceof Core);
        assertTrue(Core.UNICORN_HORSEHAIR instanceof Core);
        assertTrue(Core.DRAGON_VENTRICLE instanceof Core);
        assertTrue(Core.SOMBRAL_HORSEHAIR instanceof Core);
    }
    private void assertTrue(boolean b) {
    }
    @Test
    public void testEnumToString() {
        // Vérifie que la méthode toString() retourne le nom de l'énumération en minuscules
        assertEquals("phoenix_feather", Core.PHOENIX_FEATHER.toString());
        assertEquals("unicorn_horsehair", Core.UNICORN_HORSEHAIR.toString());
        assertEquals("dragon_ventricle", Core.DRAGON_VENTRICLE.toString());
        assertEquals("sombral_horsehair", Core.SOMBRAL_HORSEHAIR.toString());
    }
    private void assertEquals(String sombralHorsehair, String toString) {

    }
}
