package kg.geektech.game.players;

import kg.geektech.game.boss.Boss;
import kg.geektech.game.general.AbilityType;

import java.util.Random;

public class Hunter extends Hero {
    public Hunter(int health, int damage) {
        super(health, damage, AbilityType.CRITICAL_DAMAGE,AbilityType.UNIQUE_ABILITY);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        Random random = new Random();
        int x = random.nextInt(4)+2;
        heroes[2].setDamage(heroes[2].getDamage()*x);

    }
}
