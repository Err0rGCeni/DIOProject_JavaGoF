package dio.ceni.schools;

import java.util.ArrayList;
import java.util.List;

public class Alteration implements School {
    private String name;
    private String description;
    private List<Spell> attackSpells;
    private List<Spell> defenseSpells;
    private List<Spell> supportSpells;

    public Alteration() {
        this.name = "Alteration";
        this.description = "This school has its focus on spells that alter physical properties of some creature, thing, or condition in many different ways.";
        this.attackSpells = new ArrayList<>();
        this.defenseSpells = new ArrayList<>();
        this.supportSpells = new ArrayList<>();

        // Adding spells to the appropriate lists
        addAttackSpells();
        addSupportSpells();
    }

    private void addAttackSpells() {
        attackSpells.add(new Spell("Burning Hands", "Emits a cone of fire that causes damage to creatures in its area."));
        attackSpells.add(new Spell("Color Spray", "Sends out a spray of colors that can blind or dazzle creatures."));
        attackSpells.add(new Spell("Shocking Grasp", "Deals electric damage to a touched target."));
    }

    private void addSupportSpells() {
        supportSpells.add(new Spell("Haste", "Increases the speed of the target, allowing extra actions."));
        supportSpells.add(new Spell("Slow", "Reduces the speed and actions of targets in an area."));
        supportSpells.add(new Spell("Dimension Door", "Teleports the caster and up to a few others to a destination."));
        supportSpells.add(new Spell("Polymorph Other", "Transforms a target into a different creature or object."));
        supportSpells.add(new Spell("Teleport Field", "Teleports the caster to a random location within a defined area."));
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
