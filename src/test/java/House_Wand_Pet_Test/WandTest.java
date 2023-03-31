package House_Wand_Pet_Test;

import Player_Enemy.House_Wand_Pet.Wand;
import org.junit.Test;
import static org.junit.Assert.*;

public class WandTest {

    @Test
    public void testSizeInRange() {
        // Vérifie que la taille de la baguette est dans la plage appropriée
        Wand wand = new Wand();
        int size = wand.getSize();
        assertTrue(size >= 16 && size <= 35);
    }

    @Test
    public void testCoreAssigned() {
        // Vérifie que la baguette contient un noyau valide
        Wand wand = new Wand();
        String core = wand.getCore();
        assertNotNull(core);
        assertTrue(core.equals("PHOENIX_FEATHER") ||
                core.equals("UNICORN_HORSEHAIR") ||
                core.equals("DRAGON_VENTRICLE") ||
                core.equals("SOMBRAL_HORSEHAIR"));
    }

}

