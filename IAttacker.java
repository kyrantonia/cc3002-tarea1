interface IAttacker {
    boolean canFight();
    void attack(IAttacker attacker);
    void attackHuman(Human human);
    void attackGoblin(Goblin goblin);
    void attackIceGolem(IceGolem iceGolem);
}
