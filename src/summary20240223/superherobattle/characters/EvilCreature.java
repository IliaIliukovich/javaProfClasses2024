package summary20240223.superherobattle.characters;

import java.util.Random;

public class EvilCreature extends Character {

    private int force;

    private int protection;

    public EvilCreature(String name, int force, int protection) {
        super(name);
        this.force = force;
        this.protection = protection;
    }

    @Override
    public int countForce() {
        return force;
    }

    @Override
    public int countProtection() {
        return protection;
    }

    public static EvilCreature generateRandomEvilCreature() {
        Random random = new Random();
        String[] names = {"Ghost", "Wolf", "Vampire", "Goblin", "Witch"};
        return new EvilCreature(names[random.nextInt(names.length)],
                random.nextInt(10) + 10,
                random.nextInt(5) + 1);
    }

    @Override
    public String toString() {
        return "EvilCreature='" + getName() + '\'' +
                ", health=" + getHealth() +
                ", force=" + force +
                ", protection=" + protection;
    }
}
