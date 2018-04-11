abstract class Attacker implements IAttacker {
    private int HP;
    private int AP;
    private int HPMax;

    Attacker(int HP, int AP, int HPMax){
        HP =this.HP;
        AP=this.AP;
        HPMax=this.HPMax;
    }

    int getHP() {
        return HP;
    }

    int getHPMax() {
        return HPMax;
    }

    int getAP() {
        return AP;
    }
    public boolean canFight(){
        return this.getHP()<0;
    }
}
