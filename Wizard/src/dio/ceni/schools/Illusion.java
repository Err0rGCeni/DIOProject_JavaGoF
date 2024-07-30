package dio.ceni.schools;

import java.util.ArrayList;
import java.util.List;

public class Illusion implements School {
    private String name;
    private String description;
    private List<Spell> attackSpells;
    private List<Spell> defenseSpells;
    private List<Spell> supportSpells;

    public Illusion() {
        this.name = "Illusion";
        this.description = "This school focuses on spells that alter appearance or deceive the senses or minds of others.";
        this.attackSpells = new ArrayList<>();
        this.defenseSpells = new ArrayList<>();
        this.supportSpells = new ArrayList<>();

        // Adding spells to the appropriate lists
        addSupportSpells();
    }

    private void addSupportSpells() {
        supportSpells.add(new Spell("Blindness", "Causes the target to become blind."));
        supportSpells.add(new Spell("Reflected Image", "Creates illusory duplicates of the caster."));
        supportSpells.add(new Spell("Spook", "Frightens the target, causing them to flee."));
        supportSpells.add(new Spell("Blur", "Causes the caster to become blurred, making them harder to hit."));
        supportSpells.add(new Spell("Deafness", "Causes the target to become deaf."));
        supportSpells.add(new Spell("Invisibility", "Makes the target invisible."));
        supportSpells.add(new Spell("Mirror Image", "Creates multiple illusory duplicates of the caster."));
        supportSpells.add(new Spell("Shadow Door", "Creates an illusory door that conceals the caster."));
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
