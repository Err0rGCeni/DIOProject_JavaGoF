package dio.ceni.schools;

import java.util.List;

public interface School {
    String getName();
    String getDescription();
    List<Spell> getAttackSpells();
    List<Spell> getDefenseSpells();
    List<Spell> getSupportSpells();
}
