 abstract class Human extends Attacker {
    private double currentHP;
    private double initialHP;
    private double AP;
    private double MaxHP;
    private String name;
    private Human(){
        super(350, 80, 650);
    }
    Human(String name) {
         this(350, 80, 650,"Juan");
     }
    Human(double HP, double AP, double HPMax, String name ){
        this();
        this.initialHP =HP;
        this.AP=AP;
        this.MaxHP =HPMax;
        this.name=name;
        this.currentHP=HP;
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
     @Override
     public void attack(IAttackable attackable) {
         if (this.canFight()){
             attackable.attackedByHuman(this);
         }

     }

 }
