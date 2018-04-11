public abstract class Human extends Attacker implements IAttacker {

    Human(){
        super(200,45,600);
    }


    @Override
    public void attack(IAttacker attacker) {
        attackHuman(this);
    }

    @Override
    public abstract void attackHuman(Human human);

    @Override
    public abstract void attackGoblin(Goblin goblin);

    @Override
    public abstract void attackIceGolem(IceGolem iceGolem);
}
