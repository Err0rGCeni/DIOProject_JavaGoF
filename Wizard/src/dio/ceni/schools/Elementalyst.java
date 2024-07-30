package dio.ceni.schools;
import java.util.ArrayList;
import java.util.List;

public class Elementalyst implements School {
    private String name;
    private String description;
    private List<Spell> attackSpells;
    private List<Spell> defenseSpells;
    private List<Spell> supportSpells;

    public Elementalyst() {
        this.name = "Elementalyst";
        this.description = "This school focuses on harnessing the power of the elements for offensive and defensive purposes.";
        this.attackSpells = new ArrayList<>();
        this.defenseSpells = new ArrayList<>();
        this.supportSpells = new ArrayList<>();

        // Adding spells to the appropriate lists
        addAttackSpells();
        addDefenseSpells();
    }

    private void addAttackSpells() {
        attackSpells.add(new Spell("Fireball", "Hurls a ball of fire that explodes upon impact, causing fire damage."));
        attackSpells.add(new Spell("Ice Spike", "Launches a spike of ice at the target, causing cold damage."));
        attackSpells.add(new Spell("Lightning Bolt", "Strikes the target with a bolt of lightning, causing electric damage."));
        attackSpells.add(new Spell("Earthquake", "Shakes the ground violently, causing damage to all nearby enemies."));
        attackSpells.add(new Spell("Tornado", "Summons a powerful tornado that sweeps up and damages enemies."));
        attackSpells.add(new Spell("Water Surge", "Unleashes a surge of water that knocks back and damages enemies."));
    }

    private void addDefenseSpells() {
        defenseSpells.add(new Spell("Stone Skin", "Hardens the caster's skin, reducing physical damage taken."));
        defenseSpells.add(new Spell("Wind Shield", "Creates a barrier of wind that deflects projectiles and reduces damage."));
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
