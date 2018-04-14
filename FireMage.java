public class FireMage extends Human  {

    FireMage(String name) {
        super(350, 80, 650, name);
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
    public void attackedByIceGolem(IceGolem iceGolem) {
        this.receiveDamage(iceGolem.calculateDamage(2.0));
    }

    @Override
    public void attackedByKnight(Knight knight) {
        this.receiveDamage(knight.calculateDamage(1.5));
    }



}
