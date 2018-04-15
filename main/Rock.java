package main;
/**
 * Clase que implementa la interfaz IAttackable.
 * Pertenecen a esta clase objetos (rock) que al ser atacados por
 * un human, el golpe que realiza el human se le es devuelto con la misma fuerza con la que atacó a rock.
 * @author Kyra
 */

public class Rock implements IAttackable {

    @Override
    public void attackedByGoblin(Goblin goblin) {
    }

    @Override
    public void attackedByHuman(Human human) {
        human.attackRock();
    }


}
