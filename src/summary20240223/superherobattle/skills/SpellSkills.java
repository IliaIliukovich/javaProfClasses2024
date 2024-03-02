package summary20240223.superherobattle.skills;

import summary20240223.superherobattle.characters.Superhero;

public interface SpellSkills {

    void applySpell(Superhero hero, Spell spell);
    void applySpell(Superhero[] heroes, Spell spell);

}
