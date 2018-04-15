package test;
import main.*;
import org.junit.*;
import static org.junit.Assert.*;
public class TestingAttacker {
    private static Attacker damagedGoblinWith149;
    private static Attacker damagedGoblinWith150;
    private static Attacker damagedGoblinWith1000;
    private static Attacker damagedGoblinWith0;
    private static Attacker damagedGoblinWith30;

    private static Attacker goblinWithIncreasedHPIn0;
    private static Attacker goblinWithIncreasedHPIn20;
    private static Attacker goblinWithIncreasedHPIn250;
    private static Attacker goblinWithIncreasedHPIn251;
    private static Attacker goblinWithIncreasedHPIn1000;

    private static Undead undead;
    private static Attacker goblinAttackedByUndead;

    private static Priest priest;
    private static Attacker goblinAttackedByPriest;

    private static FireMage fireMage;
    private static Attacker goblinAttackedByFireMage;

    private static IceGolem iceGolem;
    private static Attacker goblinAttackedByIceGolem;

    private Attacker goblin1;
    private Attacker goblin2;
    private Attacker goblin3;
    private Attacker goblin4;

    @BeforeClass
    public static void beforeTests() {

        damagedGoblinWith0 =new Goblin();
        damagedGoblinWith30 =new Goblin();
        damagedGoblinWith149 =new Goblin();
        damagedGoblinWith150 =new Goblin();
        damagedGoblinWith1000 =new Goblin();
        damagedGoblinWith0.receiveDamage(0);
        damagedGoblinWith30.receiveDamage(30);
        damagedGoblinWith149.receiveDamage(149);
        damagedGoblinWith150.receiveDamage(150);
        damagedGoblinWith1000.receiveDamage(1000);


        goblinWithIncreasedHPIn0=new Goblin();
        goblinWithIncreasedHPIn20=new Goblin();
        goblinWithIncreasedHPIn250 =new Goblin();
        goblinWithIncreasedHPIn251 =new Goblin();
        goblinWithIncreasedHPIn1000=new Goblin();
        goblinWithIncreasedHPIn0.increaseHP(0);
        goblinWithIncreasedHPIn20.increaseHP(20);
        goblinWithIncreasedHPIn250.increaseHP(250);
        goblinWithIncreasedHPIn251.increaseHP(251);
        goblinWithIncreasedHPIn1000.increaseHP(1000);

        goblinAttackedByUndead=new Goblin();
        undead=new Undead();
        goblinAttackedByUndead.attackedByUndead(undead);

        goblinAttackedByPriest=new Goblin();
        priest=new Priest("Carlos");
        goblinAttackedByPriest.attackedByPriest(priest);

        goblinAttackedByFireMage=new Goblin();
        fireMage=new FireMage("Anita");
        goblinAttackedByFireMage.attackedByFireMage(fireMage);

        goblinAttackedByIceGolem=new Goblin();
        iceGolem=new IceGolem();
        goblinAttackedByIceGolem.attackedByIceGolem(iceGolem);
    }
    @Before
    public void setup(){
        goblin1 =new Goblin();
        goblin2 =new Goblin();
        goblin3 =new Goblin();
        goblin4=new Goblin();
        fireMage=new FireMage("Carlos");
        iceGolem=new IceGolem();
        undead=new Undead();
    }


    @Test
    public void testGetMaxHP(){
        double expected=400;
        assertEquals(expected, goblin1.getMaxHP(),0.1);
    }
    @Test
    public void testGetHP(){
        double expected=150;
        assertEquals(expected, goblin1.getHP(),0.1);
    }
    @Test
    public void testGetAP(){
        double expected=30;
        assertEquals(expected, goblin1.getAP(),0.1);
    }
    @Test
    public void testReceiveDamage(){
        assertEquals(150, damagedGoblinWith0.getHP(),0.1);
        assertEquals(120, damagedGoblinWith30.getHP(),0.1);
        assertEquals(1, damagedGoblinWith149.getHP(),0.1);
        assertEquals(0, damagedGoblinWith150.getHP(),0.1);
        assertEquals(0,damagedGoblinWith1000.getHP(),0.1);
    }
    @Test
    public void testCanFight(){
        assertTrue(damagedGoblinWith149.canFight());
        assertTrue(damagedGoblinWith30.canFight());
        assertFalse(damagedGoblinWith150.canFight());
        assertFalse(damagedGoblinWith1000.canFight());
        assertTrue(damagedGoblinWith0.canFight());
        assertTrue(goblin1.canFight());
    }
    @Test
    public void testCalculateDamage(){
        double expected=30*0.5;
        assertEquals(15.0, goblin1.calculateDamage(0.5),0.1);
        assertEquals(expected, goblin1.calculateDamage(0.5),0.1);
        assertEquals(30.0, goblin1.calculateDamage(1),0.1);
    }
    @Test
    public void TestIncreaseHP(){
        assertEquals(150,goblinWithIncreasedHPIn0.getHP(),0.1);
        assertEquals(170,goblinWithIncreasedHPIn20.getHP(),0.1);
        assertEquals(400,goblinWithIncreasedHPIn250.getHP(),0.1);
        assertEquals(400,goblinWithIncreasedHPIn251.getHP(),0.1);
        assertEquals(400,goblinWithIncreasedHPIn1000.getHP(),0.1);
    }
    @Test
    public void testCalculateIncrement(){
        double expected=400*0.15;
        assertEquals(60.0, goblin1.calculateIncrement(0.15),0.1);
        assertEquals(expected, goblin1.calculateIncrement(0.15),0.1);
    }
    @Test
    public void testAttackedByUndead(){
        double expected=150-30*1.0;
        assertEquals(120.0,goblinAttackedByUndead.getHP(),0.1);
        assertEquals(expected,goblinAttackedByUndead.getHP(),0.1);
    }
    @Test
    public void testAttackedByPriest(){
        assertEquals(goblin1.getHP(),goblinAttackedByPriest.getHP(),0.1);
        assertEquals(150.0,goblinAttackedByPriest.getHP(),0.1);
    }
    @Test
    public void testAttackedByFireMage(){
        double expected=150-10*2.0;
        assertEquals(130,goblinAttackedByFireMage.getHP(),0.1);
        assertEquals(expected,goblinAttackedByFireMage.getHP(),0.1);
    }
    @Test
    public void testAttackedByIceGolem(){
        double expected=150-30*2.0;
        assertEquals(90,goblinAttackedByIceGolem.getHP(),0.1);
        assertEquals(expected,goblinAttackedByIceGolem.getHP(),0.1);
    }


}
