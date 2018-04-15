package main;

/**
 * Subclase de Attacker.
 * Pertenecen a esta clase attackers que tienen nombre(human).
 * Además, quienes pertenecen a esta clase, aumentan en un factor 0.3 sus puntos de vida al atacar a un fruitTree
 * y reciben un daño igual a sus puntos de ataque al golpear a un rock.
 * @author Kyra
 */
public abstract class Human extends Attacker {
    private double HP;
    private double initialHP;
    private double AP;
    private String name;
    public Human(){
        this(350,80,650,"Juan");
    }
    public Human(double HP, double AP, double maxHP, String name ){
        super(HP,AP,maxHP);
        this.name=name;
    }
    public Human(String name){
        this(350,80,650,name);
    }

    /**
     * Método que entrega el nombre del human
     * @return nombre del human
     */
    public String getName() {
        return this.name;
    }

    /**
     * Método con el human recibe el daño povocado al
     * golpear/atacar a un rock.
     * Al golpear a un rock, el human recibe un daño
     * igual a sus puntos de ataque
     */
    public void attackRock() {
     this.receiveDamage(calculateDamage(1));
    }

    /**
     * Método con el que el human reciben los puntos de vida
     * ganados al golpear/atacar a un fruitTree.
     * Al golpear a un fruitTree cae una fruta con lo que
     * el human aumenta sus puntos de vida
     */
    public void attackFruitTree() {
    this.increaseHP(calculateIncrement(0.3));
    }

    @Override
    public void attack(IAttackable attackable) {
     if (this.canFight()){
         attackable.attackedByHuman(this);
     }

    }

 }
