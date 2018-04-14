class FruitTree implements IAttackable{
    @Override
    public void attackedByGoblin(Goblin goblin) {
        goblin.attackFruitTree();
    }

    @Override
    public void attackedByHuman(Human human) {
        human.attackFruitTree();
    }

}
