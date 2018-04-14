 abstract class Human extends Attacker {
    private double HP;
    private double AP;
    private double HPMax;
    private String name;
    private Human(){
        super(350, 80, 650);
    }
    Human(String name) {
         this(350, 80, 650,"Juan");
     }
    Human(double HP, double AP, double HPMax, String name ){
        this();
        this.HP=HP;
        this.AP=AP;
        this.HPMax=HPMax;
        this.name=name;
    }

     @Override
     public void attack(IAttackable attackable) {
         if (this.canFight()){
             attackable.attackedByHuman(this);
         }

     }

     public String get_name() {
        return this.name;
    }

     void attackRock() {
         this.receiveDamage(calculateDamage(1));
     }
     void attackFruitTree() {
        this.increaseHP(calculateIncrement(0.3));
     }

 }
