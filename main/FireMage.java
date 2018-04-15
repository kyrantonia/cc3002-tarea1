package main;

/**
 * Subclase de Human donde sus objectos (fireMage) atacan con un factor 2 a knight,
 * 2 a fireMage, 2 a priest, 2 a goblin, 5 a iceGolem,
 * y 0.5 a undead.
 * @author Kyra
 */
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
