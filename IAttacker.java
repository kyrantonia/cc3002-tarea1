interface IAttacker {
    boolean canFight();
    void attack(IAttacker attacker);
    void attackKnight(Knight knight);
    void attackGoblin(Goblin goblin);
    void attackIceGolem(IceGolem iceGolem);
    void attackUndead(Undead undead);
    void attackFireMage(FireMage fireMage);
    void attackPriost(Priost priost);
}
