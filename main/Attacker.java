package main;

public abstract class Attacker implements IAttacker {
    private double AP;
    private double maxHP;
    private double HP;

    public Attacker(double HP, double AP, double maxHP){
        this.AP=AP;
        this.maxHP =maxHP;
        this.HP =HP;
    }

    public double getMaxHP() {
        return this.maxHP;
    }
    public double getHP(){
        return this.HP;
    }
    public double getAP() {
        return this.AP;
    }

    public void receiveDamage(double damage){
        this.HP =Math.max(this.HP -damage,0);
    }

    public boolean canFight(){
        return this.getHP()>0;
    }

    public double calculateDamage(double factor){
        return this.getAP()*factor;
    }

    public void increaseHP(double increment){
        this.HP =Math.min(this.getHP() +increment, getMaxHP());
    }

    public double calculateIncrement( double factor){
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
    @Override
    public void attackedByIceGolem(IceGolem iceGolem) {
        this.receiveDamage(iceGolem.calculateDamage(2.0));
    }

}
