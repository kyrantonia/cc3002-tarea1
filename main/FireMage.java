package main;

public class FireMage extends Human {

    public FireMage(String name) {
        super(350, 10, 650, name);
    }
    @Override
    public void attack(IAttacker attacker) {
        if (this.canFight())
            attacker.attackedByFireMage(this);
    }

    @Override
    public void attackedByGoblin(Goblin goblin) {
        this.receiveDamage(goblin.calculateDamage(1.5));
    }

    @Override
    public void attackedByKnight(Knight knight) {
        this.receiveDamage(knight.calculateDamage(1.5));
    }



}
