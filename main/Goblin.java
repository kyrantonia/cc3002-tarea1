package main;

public class Goblin extends Attacker {

    public Goblin(){
        super(150,30,400);
    }

    @Override
    public void attack(IAttacker attacker) {
        if (this.canFight())
            attacker.attackedByGoblin(this);
    }

    @Override
    public void attack(IAttackable attackable) {
        if (this.canFight()){
            attackable.attackedByGoblin(this);
        }

    }

    @Override
    public void attackedByGoblin(Goblin goblin) {
    }

    @Override
    public void attackedByKnight(Knight knight) {
        this.receiveDamage(knight.calculateDamage(1.25));
    }

    public void attackFruitTree() {
        this.increaseHP(calculateIncrement(0.15));
    }

}
