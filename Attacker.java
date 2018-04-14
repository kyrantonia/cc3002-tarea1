abstract class Attacker implements IAttacker {
    private double HP;
    private double AP;
    private double HPMax;

    Attacker(double HP, double AP, double HPMax){
        this.HP=HP;
        this.AP=AP;
        this.HPMax=HPMax;
    }
    @Override
    public void attack(IAttackable attackable) {
    }
    double getHP() {
        return this.HP;
    }
    void receiveDamage(double damage){
        this.HP=Math.max(this.HP-damage,0);
    }
    double getHPMax() {
        return this.HPMax;
    }

    double getAP() {
        return this.AP;
    }
    public boolean canFight(){
        return this.getHP()>0;
    }

    double calculateDamage(double factor){
        return this.getAP()*factor;
    }

    void increaseHP(double increment){
        this.HP=Math.min(this.HP+increment,getHPMax());
    }

    double calculateIncrement( double factor){
        return factor*getHPMax();
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
