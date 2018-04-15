package main;
/**
* Tipos que pueden atacar y ser atacados
 * @author Kyra
 */
public interface IAttacker {
    /**
     * Revisa si el objeto puede pelear,
     * lo que sucede cuando su HP es mayor a cero
     * @return True si el objeto puede pelear,
     */
    boolean canFight();

    /**
     * Atacar un objeto del tipo IAttacker, es decir,
     * atacar a un objeto que puede atacar y ser atacado
     * @param attacker objeto del tipo IAttacker
     */
    void attack(IAttacker attacker);

    /**
     *  Atacar a un objeto del tipo IAttackable, es decir,
     *  atacar a un objeto que sólo puede recibir ataques
     * @param attackable objeto del tipo IAttackable
     */
    void attack(IAttackable attackable);

    /**
     * Ser atacado por un objeto de la clase Firemage
     * @param fireMage objeto de la clase FireMage
     */
    void attackedByFireMage(FireMage fireMage);

    /**
     * Ser atacado por un objeto de la clase Goblin
     * @param goblin objeto de la clase Goblin
     */
    void attackedByGoblin(Goblin goblin);

    /**
     * Ser atacado por un objeto de la clase IceGolem
     * @param iceGolem objeto de la clase IceGolem
     */
    void attackedByIceGolem(IceGolem iceGolem);

    /**
     * Ser atacado por un objeto de la clase Knight
     * @param knight objeto de la clase Knight
     */
    void attackedByKnight(Knight knight);

    /**
     * Ser atacado por un objeto de la clase Priest
     * @param priest objeto de la clase Priest
     */
    void attackedByPriest(Priest priest);

    /**
     * Ser atacado por un objeto de la clase Undead
     * @param undead objeto de la clase Undead
     */
    void attackedByUndead(Undead undead);
}
