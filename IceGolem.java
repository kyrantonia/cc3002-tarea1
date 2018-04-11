public class IceGolem extends Attacker implements IAttacker {

    IceGolem() {
        super(250, 60, 800);
    }

    @Override
    public void attack(IAttacker attacker) {
        attackIceGolem(this);
    }

    @Override
    public void attackHuman(Human human) {

    }

    @Override
    public void attackGoblin(Goblin goblin) {

    }

    @Override
    public void attackIceGolem(IceGolem iceGolem) {

    }
}
