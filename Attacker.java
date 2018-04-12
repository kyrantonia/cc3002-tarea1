abstract class Attacker implements IAttacker {
    private double HP;
    private double AP;
    private double HPMax;

    Attacker(double HP, double AP, double HPMax){
        HP =this.HP;
        AP=this.AP;
        HPMax=this.HPMax;
    }

    double getHP() {
        return HP;
    }
    void receiveDamage(double damage){
        this.HP=Math.max(this.HP-damage,0);
    }
    double getHPMax() {
        return HPMax;
    }

    double getAP() {
        return AP;
    }
    public boolean canFight(){
        return this.getHP()>0;
    }

    double calculateDamage(double factor){
        return this.getAP()*factor;
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
