public class Priest extends Attacker implements IAttacker {

    Priest() {
        super(100, 15, 700);
    }

    @Override
    public void attack(IAttacker attacker) {
        if (this.canFight())
            attacker.attackedByPriest(this);
    }

    @Override
    public void attackedByGoblin(Goblin goblin) {
        this.receiveDamage(goblin.calculateDamage(2.0));
    }

    @Override
    public void attackedByIceGolem(IceGolem iceGolem) {
        this.receiveDamage(iceGolem.calculateDamage(2.0));
    }

    @Override
    public void attackedByKnight(Knight knight) {
    }



}
