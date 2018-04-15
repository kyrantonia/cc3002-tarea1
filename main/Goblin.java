package main;
/**
 * Subclase de Attacker donde sus objectos (goblin) atacan con un factor 0.5 a knight,
 * 1.5 a fireMage y 1 a priest.
 * Además,quienes pertenecen a esta clase no le hacen daño a goblin, iceGolem, y undead, y
 * aumentan en un factor 0.15 sus puntos de vida al atacar a un fruitTree.
 * @author Kyra
 */



public class Goblin extends Attacker {

    public Goblin(){
        super(150,30,400);
    }

    /**
     * Método con el que el human reciben los puntos de vida
     * ganados al golpear/atacar a un fruitTree.
     * Al golpear a un fruitTree cae una fruta con lo que
     * el human aumenta sus puntos de vida
     */
    public void attackFruitTree() {
        this.increaseHP(calculateIncrement(0.15));
    }
    @Override
    public void attack(IAttacker attacker) {
        if (this.canFight())
            attacker.attackedByGoblin(this);
    }

    @Override
    public void attack(IAttackable attackable) {
        if (this.canFight()){
            attackable.attackedByGoblin(this);
        }

    }

    @Override
    public void attackedByGoblin(Goblin goblin) {
    }

    @Override
    public void attackedByKnight(Knight knight) {
        this.receiveDamage(knight.calculateDamage(1.25));
    }



}
