class Rock implements IAttackable {

    @Override
    public void attackedByGoblin(Goblin goblin) {
    }

    @Override
    public void attackedByHuman(Human human) {
        human.attackRock();
    }


}
