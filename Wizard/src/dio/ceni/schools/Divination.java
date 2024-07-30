package dio.ceni.schools;

import java.util.ArrayList;
import java.util.List;

public class Divination implements School {
    private String name;
    private String description;
    private List<Spell> attackSpells;
    private List<Spell> defenseSpells;
    private List<Spell> supportSpells;

    public Divination() {
        this.name = "Divination";
        this.description = "This school focuses on identifying items of magical nature, finding hidden things, predicting the future, foiling deceptive spells or learning long forgotten secrets.";
        this.attackSpells = new ArrayList<>();
        this.defenseSpells = new ArrayList<>();
        this.supportSpells = new ArrayList<>();

        // Adding spells to the appropriate lists
        addSupportSpells();
    }

    private void addSupportSpells() {
        supportSpells.add(new Spell("Infravision", "Grants the ability to see in the dark."));
        supportSpells.add(new Spell("Detect Evil", "Reveals the presence of evil creatures or objects."));
        supportSpells.add(new Spell("Detect Invisibility", "Allows the caster to see invisible creatures or objects."));
        supportSpells.add(new Spell("Know Alignment", "Reveals the alignment of a creature or object."));
        supportSpells.add(new Spell("Clairvoyance", "Allows the caster to see distant locations as if they were there."));
        supportSpells.add(new Spell("Detect Illusion", "Reveals the presence of illusionary magic."));
        supportSpells.add(new Spell("Farsight", "Enhances the caster's vision, allowing them to see great distances."));
        supportSpells.add(new Spell("Oracle", "Provides prophetic insights or answers to questions."));
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
