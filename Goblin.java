class Goblin extends Attacker implements IAttacker{
    Goblin(){
        super(150,30,400);
    }

    @Override
    public void attack(IAttacker attacker) {
        attackGoblin(this);
    }

    @Override
    public void attackKnight(Knight knight) {

    }

    @Override
    public void attackGoblin(Goblin goblin) {

    }

    @Override
    public void attackIceGolem(IceGolem iceGolem) {

    }

    @Override
    public void attackUndead(Undead undead) {

    }

    @Override
    public void attackFireMage(FireMage fireMage) {

    }

    @Override
    public void attackPriost(Priost priost) {

    }
}
