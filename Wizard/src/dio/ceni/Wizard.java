package dio.ceni;

import java.util.ArrayList;
import java.util.List;

import dio.ceni.schools.School;
import dio.ceni.schools.Spell;
import dio.ceni.strategies.AttackStrategy;
import dio.ceni.strategies.DefenseStrategy;
import dio.ceni.strategies.SupportStrategy;

public class Wizard {
    private String name;
    private List<Spell> attackSpells;
    private List<Spell> defenseSpells;
    private List<Spell> supportSpells;
    private int health = 100;

    private AttackStrategy attackStrategy;
    private DefenseStrategy defenseStrategy;
    private SupportStrategy supportStrategy;

    public Wizard(String name) {
        this.name = name;
        this.attackSpells = new ArrayList<>();
        this.defenseSpells = new ArrayList<>();
        this.supportSpells = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void addSchool(School school) {
        attackSpells.addAll(school.getAttackSpells());
        defenseSpells.addAll(school.getDefenseSpells());
        supportSpells.addAll(school.getSupportSpells());
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void setDefenseStrategy(DefenseStrategy defenseStrategy) {
        this.defenseStrategy = defenseStrategy;
    }

    public void setSupportStrategy(SupportStrategy supportStrategy) {
        this.supportStrategy = supportStrategy;
    }

    public void performAttack() {
        attackStrategy.apply(this);
    }

    public void performDefense() {
        defenseStrategy.apply(this);
    }

    public void performSupport() {
        supportStrategy.apply(this);
    }

    public List<Spell> getAttackSpells() {
        return attackSpells;
    }

    public List<Spell> getDefenseSpells() {
        return defenseSpells;
    }

    public List<Spell> getSupportSpells() {
        return supportSpells;
    }

    public List<Spell> getAllSpells() {
        List<Spell> allSpells = new ArrayList<>();
        allSpells.addAll(getAttackSpells());
        allSpells.addAll(getDefenseSpells());
        allSpells.addAll(getSupportSpells());
        return allSpells;
    }

    public void heal(int amount) {
        health += amount;
        System.out.println("Wizard healed by " + amount + " HP. Current HP: " + health);
    }

}
