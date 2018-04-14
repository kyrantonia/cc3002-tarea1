abstract class Attacker implements IAttacker {
    private double initialHP;
    private double AP;
    private double MaxHP;
    private double currentHP;

    Attacker(double HP, double AP, double HPMax){
        this.initialHP =HP;
        this.AP=AP;
        this.MaxHP =HPMax;
        this.currentHP=HP;
    }

    double getInitialHP() {
        return this.initialHP;
    }
    double getMaxHP() {
        return this.MaxHP;
    }
    double getCurrentHP(){
        return this.currentHP;
    }
    double getAP() {
        return this.AP;
    }

    void receiveDamage(double damage){
        this.currentHP =Math.max(this.currentHP -damage,0);
    }

    public boolean canFight(){
        return this.getCurrentHP()>0;
    }

    double calculateDamage(double factor){
        return this.getAP()*factor;
    }

    void increaseHP(double increment){
        this.currentHP =Math.min(this.initialHP +increment, getMaxHP());
    }

    double calculateIncrement( double factor){
        return factor* getMaxHP();
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

}
