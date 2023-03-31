package Player_Enemy_Test;
import Player_Enemy.Wizard;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class WizardTest {
    @Test
    void testWizardCreation() {
        Wizard wizard = new Wizard("Harry");
        assertEquals("Harry", wizard.getNameWizard());
        assertNotNull(wizard.getCore());
        assertEquals(10, wizard.getLivePointsWizard());
        assertEquals(1, wizard.getLevel());
        assertNotNull(wizard.getHouseWizard());
        assertTrue(wizard.getDamageWizard() > 0);
        assertTrue(wizard.getPercentageWizard() > 0);
    }
    @Test
    void testGetString() {
        Wizard wizard = new Wizard("Hermione");
        assertEquals("yes", wizard.getString("yes", "no"));
        assertEquals("no", wizard.getString("yes", "no"));
    }
}

