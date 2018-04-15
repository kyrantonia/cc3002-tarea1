package test;
import main.*;
import org.junit.*;
import static org.junit.Assert.*;


public class TestingUndead {
    private Undead undead1;
    private Attacker undead2;
    private Attacker iceGolem;

    private static Attacker attackedKnight;
    private static Undead undeadAttackAttacker;

    private static Priest priest;
    private static Attacker undeadAttackedByPriest;

    private static Goblin goblin;
    private static Undead undeadAttackedByGoblin;

    private static Knight knight;
    private static Undead undeadAttackedByKnight;

    private static Undead undead;
    private static Undead undeadAttackedByUndead;

    private static FireMage fireMage;
    private static Undead undeadAttackedByFireMage;

    @BeforeClass
    public static void beforeTests() {

        attackedKnight = new Knight("Juanita");
        undeadAttackAttacker = new Undead();
        undeadAttackAttacker.attack(attackedKnight);

        undeadAttackedByFireMage =new Undead();
        fireMage=new FireMage("Anita");
        undeadAttackedByFireMage.attackedByFireMage(fireMage);

        undeadAttackedByGoblin =new Undead();
        goblin=new Goblin();
        undeadAttackedByGoblin.attackedByGoblin(goblin);

        undeadAttackedByKnight =new Undead();
        knight=new Knight("Panchito");
        undeadAttackedByKnight.attackedByKnight(knight);

        undeadAttackedByPriest =new Undead();
        priest=new Priest("Carlos");
        undeadAttackedByPriest.attackedByPriest(priest);

        undeadAttackedByUndead =new Undead();
        undead=new Undead();
        undeadAttackedByUndead.attackedByUndead(undead);

    }
    @Before
    public void setup(){
        undead1 =new Undead();
        undead2 =new Undead();
        iceGolem=new IceGolem();
    }
    @Test
    public void testNotNull(){
        assertNotNull(undead1);
        assertNotNull(undead2);

    }
    @Test
    public void testEqualsClass(){
        assertEquals(undead1.getClass(),undead2.getClass());
        assertEquals(undead1.getClass(),(new Undead()).getClass());
        assertNotEquals(undead1.getClass(),iceGolem.getClass());
    }


    @Test
    public void testAttack() {
        double expected=200-1.0*30;
        assertEquals(expected,attackedKnight.getHP(),0.1);
        assertEquals(170,attackedKnight.getHP(),0.1);
    }

    @Test
    public void testAttackedByFireMage() {
        double expected=400-0.5*10;
        assertEquals(expected, undeadAttackedByFireMage.getHP(),0.1);
        assertEquals(395, undeadAttackedByFireMage.getHP(),0.1);
    }

    @Test
    public void testAttackedByGoblin() {
        double expected=400;
        assertEquals(expected, undeadAttackedByGoblin.getHP(),0.1);
        assertEquals(400, undeadAttackedByGoblin.getHP(),0.1);
    }

    @Test
    public void testAttackedByKnight() {
        double expected=400-1.0*35;
        assertEquals(expected, undeadAttackedByKnight.getHP(),0.1);
        assertEquals(365.0, undeadAttackedByKnight.getHP(),0.1);
    }

    @Test
    public void testAttackedByPriest() {
        double expected=400-5.0*15;
        assertEquals(expected, undeadAttackedByPriest.getHP(),0.1);
        assertEquals(325.0, undeadAttackedByPriest.getHP(),0.1);
    }

    @Test
    public void testAttackedByUndead() {
        double expected=400;
        assertEquals(expected, undeadAttackedByUndead.getHP(),0.1);
        assertEquals(400, undeadAttackedByUndead.getHP(),0.1);
    }

}
