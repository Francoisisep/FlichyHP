package Spell_Potions;

import java.util.ArrayList;
import java.util.List;

public class ForbiddenSpell extends AbstractSpell {
    private String forbiddenSpell;
    public ForbiddenSpell(int index) {

        List<String> ForbiddenSpells;
        ForbiddenSpells = new ArrayList<>();
        ForbiddenSpells.add(0, "Avada Kadavra");
        ForbiddenSpells.add(1, "Impero");
        ForbiddenSpells.add(2, "Endoloris");
        forbiddenSpell = ForbiddenSpells.get(index);


    }
    public String getForbiddenSpell(){return forbiddenSpell ;}
}
