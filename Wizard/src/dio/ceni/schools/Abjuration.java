package dio.ceni.schools;

import java.util.List;
import java.util.ArrayList;

public class Abjuration implements School {
    private String name;
    private String description;
    private List<Spell> attackSpells;
    private List<Spell> defenseSpells;
    private List<Spell> supportSpells;

    public Abjuration() {
        this.name = "Abjuration";
        this.description = "This school focuses on many spells that may protect or offer resistance from all kinds of magical or physical abilities, create physical or magical barriers, enable the banishment of creatures to another plane of existence and spells that alter some status effects.";
        this.attackSpells = new ArrayList<>();
        this.defenseSpells = new ArrayList<>();
        this.supportSpells = new ArrayList<>();

        // Adding spells to the appropriate lists
        addDefenseSpells();
        addSupportSpells();
    }

    private void addDefenseSpells() {
        defenseSpells.add(new Spell("Chaos Shield", "A protective spell that defends against chaotic magic."));
        defenseSpells.add(new Spell("Non-Detection", "Prevents detection by divination spells."));
        defenseSpells.add(new Spell("Minor Globe of Invulnerability", "Creates a barrier against low-level spells."));        
        defenseSpells.add(new Spell("Spell Immunity", "Grants immunity to a specific spell or type of magic."));
        defenseSpells.add(new Spell("Spell Shield", "Provides protection against magical attacks."));
    }

    private void addSupportSpells() {
        defenseSpells.add(new Spell("Breach", "Penetrates magical barriers and protections."));
        defenseSpells.add(new Spell("Minor Spell Turning", "Turns back spells targeted at the caster."));
        defenseSpells.add(new Spell("Remove Magic", "Removes magical effects from an object or person."));
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public List<Spell> getAttackSpells() {
        return attackSpells;
    }

    @Override
    public List<Spell> getDefenseSpells() {
        return defenseSpells;
    }

    @Override
    public List<Spell> getSupportSpells() {
        return supportSpells;
    }
}
