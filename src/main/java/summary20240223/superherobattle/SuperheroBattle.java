package summary20240223.superherobattle;

import summary20240223.superherobattle.characters.EvilCreature;
import summary20240223.superherobattle.characters.Mag;
import summary20240223.superherobattle.characters.Superhero;
import summary20240223.superherobattle.items.Protection;
import summary20240223.superherobattle.skills.Spell;
import summary20240223.superherobattle.items.Weapon;

public class SuperheroBattle {

    // Main logic of the battle game
    public static void main(String[] args) {
        Weapon sword = new Weapon("Sword", 20);
        Protection armour = new Protection("Armour", 4);
        Superhero spiderman = new Superhero("Spiderman", 2, sword, armour);

        EvilCreature zombie = new EvilCreature("Zombie", 10, 1);
        EvilCreature randomCreature = EvilCreature.generateRandomEvilCreature();

        spiderman.introduce();
        zombie.introduce();
        randomCreature.introduce();

        spiderman.fight(zombie);
        System.out.println("After fight:");
        System.out.println(spiderman);
        System.out.println(zombie);

        randomCreature.fight(zombie);
        System.out.println("After fight:");
        System.out.println(randomCreature);
        System.out.println(zombie);

        Mag mag = new Mag("Lord Voldemort", 10, 1, 5);
        mag.introduce();
        mag.heal(zombie);
        mag.applySpell(spiderman, Spell.CURSE);
        mag.fight(spiderman);
        System.out.println("After fight:");
        System.out.println(mag);
        System.out.println(spiderman);
    }


}
