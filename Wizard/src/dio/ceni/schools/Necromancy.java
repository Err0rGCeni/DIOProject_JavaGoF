package dio.ceni.schools;

import java.util.ArrayList;
import java.util.List;

public class Necromancy implements School {
    private String name;
    private String description;
    private List<Spell> attackSpells;
    private List<Spell> defenseSpells;
    private List<Spell> supportSpells;

    public Necromancy() {
        this.name = "Necromancy";
        this.description = "This school focuses on manipulating the power of life and death. Spells of this school can heal their target, drain life from the victim to the caster and allow for the summoning of undead minions.";
        this.attackSpells = new ArrayList<>();
        this.defenseSpells = new ArrayList<>();
        this.supportSpells = new ArrayList<>();

        // Adding spells to the appropriate lists
        addAttackSpells();
        addDefenseSpells();
        addSupportSpells();
    }

    private void addAttackSpells() {
        attackSpells.add(new Spell("Larloch's Minor Drain", "Drains life energy from the target to the caster."));
        attackSpells.add(new Spell("Ghoul Touch", "Paralyzes the target and causes them to emit a foul stench."));
        attackSpells.add(new Spell("Horror", "Fills the targets with a sense of dread and fear."));
        attackSpells.add(new Spell("Skull Trap", "Creates a floating skull that explodes when triggered."));
        attackSpells.add(new Spell("Contagion", "Inflicts the target with a debilitating disease."));
    }

    private void addDefenseSpells() {
        supportSpells.add(new Spell("Flesh Wall", "Creates a barrier of undead flesh to block attacks."));
    }

    private void addSupportSpells() {
        supportSpells.add(new Spell("Hold Undead", "Paralyzes undead creatures."));        
        supportSpells.add(new Spell("Animate Dead", "Summons undead minions to fight for the caster."));
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
