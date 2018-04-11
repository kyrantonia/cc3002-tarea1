public class Goblin extends Attacker{
    Goblin(){
        super(150,30,400);
    }

    @Override
    public void attack(IAttacker attacker) {
        attackGoblin(this);
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
