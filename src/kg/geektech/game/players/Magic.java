package kg.geektech.game.players;

import kg.geektech.game.boss.Boss;
import kg.geektech.game.general.AbilityType;

import java.util.Random;

public class Magic extends Hero {
    public Magic(int health, int damage) {
        super(health, damage, AbilityType.BOOST, AbilityType.UNIQUE_ABILITY);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        for (int i = 0; i <heroes.length; i++) {
            Random random = new Random();
            int x = random.nextInt(4)+2;
            heroes[i].setDamage(heroes[i].getDamage()+3);


        }

    }
}
