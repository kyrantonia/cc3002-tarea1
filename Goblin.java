class Goblin extends Attacker {

    Goblin(){
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
    public void attackedByIceGolem(IceGolem iceGolem) {
        this.receiveDamage(iceGolem.calculateDamage(2.0));
    }

    @Override
    public void attackedByKnight(Knight knight) {
        this.receiveDamage(knight.calculateDamage(1.25));
    }

    void attackFruitTree() {
        this.increaseHP(calculateIncrement(0.15));
    }

}
