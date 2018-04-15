package main;
/**
 * Tipos que sólo pueden recibir ataques
 * @author Kyra
 */
public interface IAttackable{

    /**
     * Ser atacado por un objeto de la clase Goblin
     * @param goblin objeto de la clase Goblin
     */
    void attackedByGoblin(Goblin goblin);

    /**
     * Ser atacado por un objeto de la clase Human
     * @param human objeto de la clase Human
     */
    void attackedByHuman(Human human);
}
