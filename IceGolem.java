class IceGolem extends Attacker implements IAttacker {

    IceGolem() {
        super(250, 50, 800);
    }

    @Override
    public void attack(IAttacker attacker) {
        if (this.canFight())
            attackedByIceGolem(this);
    }

    @Override
    public void attackedByFireMage(FireMage fireMage) {
        this.receiveDamage(fireMage.calculateDamage(5.0));
    }

    @Override
    public void attackedByGoblin(Goblin goblin) {

    }

    @Override
    public void attackedByIceGolem(IceGolem iceGolem) {
        this.receiveDamage(iceGolem.calculateDamage(1.0));
    }

    @Override
    public void attackedByKnight(Knight knight) {
        this.receiveDamage(knight.calculateDamage(0.5));
    }

    @Override
    public void attackedByUndead(Undead undead) {

    }
}
