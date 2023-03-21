package Spell_Potions;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Setter
@Getter
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
    //public String getForbiddenSpell(){return forbiddenSpell ;}
}
