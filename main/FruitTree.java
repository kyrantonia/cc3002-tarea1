package main;

/**
 * Clase que implementa la interfaz IAttackable.
 * Pertenecen a esta clase objetos (fruitTree) que al ser atacados por
 * un goblin o un human botan una fruta, con lo que aumentan los puntos de vida de quien los atacó.
 * @author Kyra
 */

public class FruitTree implements IAttackable {

    @Override
    public void attackedByGoblin(Goblin goblin) {
        goblin.attackFruitTree();
    }

    @Override
    public void attackedByHuman(Human human) {
        human.attackFruitTree();
    }

}
