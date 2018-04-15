package main;

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
    public String getName() {
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
