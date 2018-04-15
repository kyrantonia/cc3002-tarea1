package main;

public class Priest extends Human {

    public Priest(String name) {
        super(100, 15, 700, name);
    }

    @Override
    public void attack(IAttacker attacker) {
        if (this.canFight())
            attacker.attackedByPriest(this);
    }

    @Override
    public void attackedByGoblin(Goblin goblin) {
        this.receiveDamage(goblin.calculateDamage(1.0));
    }

    @Override
    public void attackedByKnight(Knight knight) {
    }



}
