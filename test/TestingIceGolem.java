package test;

import main.*;
import org.junit.*;

import static org.junit.Assert.*;

public class TestingIceGolem {
    private IceGolem iceGolem1;
    private Attacker iceGolem2;
    private Attacker undead2;

    private static Attacker attackedKnight;
    private static IceGolem iceGolemAttackAttacker;

    private static Goblin goblin;
    private static IceGolem iceGolemAttackedByGoblin;

    private static Knight knight;
    private static IceGolem iceGolemAttackedByKnight;

    private static Undead undead;
    private static IceGolem iceGolemAttackedByUndead;

    private static FireMage fireMage;
    private static IceGolem iceGolemAttackedByFireMage;

    private static IceGolem iceGolem;
    private static IceGolem iceGolemAttackedByIceGolem;

    @BeforeClass
    public static void beforeTests() {
        attackedKnight = new Knight("Juanita");
        iceGolemAttackAttacker = new IceGolem();
        iceGolemAttackAttacker.attack(attackedKnight);

        iceGolemAttackedByKnight =new IceGolem();
        knight=new Knight("Panchito");
        iceGolemAttackedByKnight.attackedByKnight(knight);

        iceGolemAttackedByGoblin=new IceGolem();
        goblin=new Goblin();
        iceGolemAttackedByGoblin.attackedByGoblin(goblin);

        iceGolemAttackedByUndead =new IceGolem();
        undead=new Undead();
        iceGolemAttackedByUndead.attackedByUndead(undead);


        iceGolemAttackedByFireMage =new IceGolem();
        fireMage=new FireMage("Anita");
        iceGolemAttackedByFireMage.attackedByFireMage(fireMage);

        iceGolemAttackedByIceGolem =new IceGolem();
        iceGolem=new IceGolem();
        iceGolemAttackedByIceGolem.attackedByIceGolem(iceGolem);
    }
    @Before
    public void setup(){
        iceGolem1=new IceGolem();
        iceGolem2=new IceGolem();
        undead2=new Undead();
    }
    @Test
    public void testNotNull(){
        assertNotNull(iceGolem1);
        assertNotNull(iceGolem2);

    }
    @Test
    public void testEqualsClass(){
        assertEquals(iceGolem1.getClass(),iceGolem2.getClass());
        assertEquals(iceGolem1.getClass(),(new IceGolem()).getClass());
        assertNotEquals(iceGolem1.getClass(),undead2.getClass());
    }

    @Test
    public void testAttack() {
        double expected=200-1.5*30;
        assertEquals(expected,attackedKnight.getHP(),0.1);
        assertEquals(155,attackedKnight.getHP(),0.1);
    }

    @Test
    public void testAttackedByFireMage() {
        double expected=250-5.0*10;
        assertEquals(expected, iceGolemAttackedByFireMage.getHP(),0.1);
        assertEquals(200, iceGolemAttackedByFireMage.getHP(),0.1);
    }

    @Test
    public void testAttackedByGoblin() {
        double expected=250;
        assertEquals(expected, iceGolemAttackedByGoblin.getHP(),0.1);
        assertEquals(250, iceGolemAttackedByGoblin.getHP(),0.1);
    }

    @Test
    public void testAttackedByIceGolem() {
        double expected=250-30*1.0;
        assertEquals(expected,iceGolemAttackedByIceGolem.getHP(),0.1);
        assertEquals(220,iceGolemAttackedByIceGolem.getHP(),0.1);
    }

    @Test
    public void testAttackedByKnight() {
        double expected=250-0.5*35;
        assertEquals(expected,iceGolemAttackedByKnight.getHP(),0.1);
        assertEquals(232.5,iceGolemAttackedByKnight.getHP(),0.1);
    }

    @Test
    public void testAttackedByUndead() {
        double expected=250;
        assertEquals(expected,iceGolemAttackedByUndead.getHP(),0.1);
        assertEquals(250,iceGolemAttackedByUndead.getHP(),0.1);
    }
}
