package dio.ceni.schools;

import java.util.ArrayList;
import java.util.List;

public class Conjuration implements School {
    private String name;
    private String description;
    private List<Spell> attackSpells;
    private List<Spell> defenseSpells;
    private List<Spell> supportSpells;

    public Conjuration() {
        this.name = "Conjuration";
        this.description = "This school focuses on the conjuration of items, creatures not related to the undead, or calling forth energies to serve the caster. It also enables a caster to send creatures to other places, either over long distances or even to a whole different plane.";
        this.attackSpells = new ArrayList<>();
        this.defenseSpells = new ArrayList<>();
        this.supportSpells = new ArrayList<>();

        // Adding spells to the appropriate lists
        addAttackSpells();
        addDefenseSpells();
        addSupportSpells();
    }

    private void addAttackSpells() {
        attackSpells.add(new Spell("Melf's Acid Arrow", "Fires a magical acid arrow that deals damage over time."));
        attackSpells.add(new Spell("Flame Arrow", "Conjures arrows that deal fire damage when they hit."));
    }

    private void addDefenseSpells() {
        supportSpells.add(new Spell("Armor", "Creates a magical armor to protect the caster."));
        supportSpells.add(new Spell("Ghost Armor", "Creates a shimmering force field around the caster."));
    }

    private void addSupportSpells() {
        supportSpells.add(new Spell("Find Familiar", "Summons a small creature to serve as a familiar."));
        supportSpells.add(new Spell("Grease", "Creates a slippery surface that can cause creatures to fall."));
        supportSpells.add(new Spell("Glitterdust", "Coats an area in glittering dust that blinds and reveals invisible creatures."));
        supportSpells.add(new Spell("Monster Summoning", "Conjures a creature to fight for the caster."));
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
