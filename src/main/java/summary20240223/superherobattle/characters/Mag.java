package summary20240223.superherobattle.characters;

import summary20240223.superherobattle.skills.Spell;
import summary20240223.superherobattle.skills.HealingSkills;
import summary20240223.superherobattle.skills.SpellSkills;

public class Mag extends Character implements HealingSkills, SpellSkills {

    private int force;
	private int protection;
    private int level;

    public Mag(String name, int force, int protection, int level) {
        super(name);
        this.force = force;
        this.protection = protection;
        this.level = level;
    }

    @Override
    public int countForce() {
        return this.force;
    }

    @Override
    public int countProtection() {
        return this.protection;
    }

    @Override
    public void heal(Character character) {
        if (character.getHealth() < 100) {
            character.setHealth(100);
            System.out.println(character.getName() + " has been healed by mag " + this.getName());
        }
    }

    @Override
    public void heal(Character[] characters) {
        for (Character character : characters){
            heal(character);
        }
    }

    @Override
    public void applySpell(Superhero hero, Spell spell) {
        switch (spell) {
            case REVIVE -> heal(hero);
            case CURSE -> {
                hero.setHealth((int) (hero.getHealth() * (1 - 0.1 * level)));
                System.out.println(hero.getName() + " was cursed by mag " + getName());
            }
            case INSPIRE -> {
                hero.setForce((int) (hero.getForce() * (1 + 0.1 * level)));
                System.out.println(hero.getName() + " was inspired by mag " + getName());
            }
        }

    }

    @Override
    public void applySpell(Superhero[] heroes, Spell spell) {
        for (Superhero hero : heroes){
            heal(hero);
        }
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getProtection() {
        return protection;
    }

    public void setProtection(int protection) {
        this.protection = protection;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Mag='" + getName() + '\'' +
                ", health=" + getHealth() +
                ", force=" + force +
                ", protection=" + protection +
                ", level=" + level +
                '}';
    }

}
