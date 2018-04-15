package main;

/**
 * Clase que implementa la interfaz IAttacker,
 * pertenecen a esta clase los objetos que
 * pueden atacar y ser atacados (attacker)
 * @author Kyra
 */
public abstract class Attacker implements IAttacker {
    private double AP;
    private double maxHP;
    private double HP;

    public Attacker(double HP, double AP, double maxHP){
        this.AP=AP;
        this.maxHP =maxHP;
        this.HP =HP;
    }

    /**
     * Método que entrega el puntaje máximo de vida que puede tener un attacker
     * @return puntaje de vida máximo permitido para un attacker
     */
    public double getMaxHP() {
        return this.maxHP;
    }

    /**
     * Método que entrega el puntaje de vida actual (HP) de un attacker
     * @return puntaje de vida actual de un attacker
     */
    public double getHP(){
        return this.HP;
    }

    /**
     * Método que entrega los puntos de ataque de un attacker
     * @return puntos de ataque de un attacker
     */
    public double getAP() {
        return this.AP;
    }

    /**
     * Método que disminuye los puntos de vida de un attacker
     * según el daño recibido. Si el daño recibido es mayor o igual al
     * puntaje de vida del attacker, este quedará con un puntaje de vida cero,
     * con lo que ya no podrá volver a atacar.
     * @param damage daño recibido por el attacker
     */
    public void receiveDamage(double damage){
        this.HP =Math.max(this.getHP()-damage,0);
    }

    /**
     * Método que calcula el daño que realiza un attacker
     * @param factor factor por el que se multiplican los puntos de ataque del attacker
     * @return daño que realizado por un attacker
     */


    public double calculateDamage(double factor){
        return this.getAP()*factor;
    }

    /**
     * Método que aumenta los puntos de vida de un attacker
     * según la cantidad de puntos de vida ganados al comer una fruta.
     * Sólo se aumentan los puntos de vida del attacker si al hacerlo,
     * no se sobrepasa el puntaje de vida máximo permitido
     * para el attacker, de lo contrario, se mantiene el puntaje actual del attacker.
     * @param increment
     */
    public void increaseHP(double increment){
        this.HP =Math.min(this.getHP() +increment, getMaxHP());
    }

    /**
     * Método que calcula los puntos de vida ganados por un attacker al comer una fruta
     * @param factor factor por el que se multiplica el HP máximo del attacker para calcular los puntos que ganará
     * @return puntos de vida ganados por el attacker
     */
    public double calculateIncrement( double factor){
        return factor* getMaxHP();
    }
    public boolean canFight(){
        return this.getHP()>0;
    }

    @Override
    public void attack(IAttackable attackable) {
    }

    @Override
    public void attackedByUndead(Undead undead) {
        this.receiveDamage(undead.calculateDamage(1.0));
    }

    @Override
    public void attackedByPriest(Priest priest) {
    }

    @Override
    public void attackedByFireMage(FireMage fireMage) {
        this.receiveDamage(fireMage.calculateDamage(2.0));
    }
    @Override
    public void attackedByIceGolem(IceGolem iceGolem) {
        this.receiveDamage(iceGolem.calculateDamage(2.0));
    }

}
