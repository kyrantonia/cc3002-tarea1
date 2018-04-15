package main;

public interface IAttacker {
    boolean canFight();
    void attack(IAttacker attacker);
    void attack(IAttackable attackable);
    void attackedByFireMage(FireMage fireMage);
    void attackedByGoblin(Goblin goblin);
    void attackedByIceGolem(IceGolem iceGolem);
    void attackedByKnight(Knight knight);
    void attackedByPriest(Priest priest);
    void attackedByUndead(Undead undead);
}
