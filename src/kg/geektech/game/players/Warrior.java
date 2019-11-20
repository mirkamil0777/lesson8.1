package kg.geektech.game.players;

import kg.geektech.game.boss.Boss;
import kg.geektech.game.general.AbilityType;

public class Warrior extends Hero {
    public Warrior(int health, int damage) {

        super(health, damage, AbilityType.SAVE_DAMAGE_AND_REVERT, AbilityType.UNIQUE_ABILITY);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        heroes[0].setDamage(10+boss.getDamage());

    }
}
