package kg.geektech.game.players;

import kg.geektech.game.boss.Boss;
import kg.geektech.game.general.AbilityType;

public class Magic extends Hero {
    public Magic(int health, int damage) {
        super(health, damage, AbilityType.BOOST, AbilityType.UNIQUE_ABILITY);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        for (int i = 0; i <heroes.length; i++) {
            heroes[i].setDamage(heroes[i].getDamage()+3);


        }

    }
}
