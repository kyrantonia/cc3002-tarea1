package test;

import main.*;
import org.junit.*;
import static org.junit.Assert.*;

public class TestingPriest {
    private Priest priest1;
    private Attacker priest2;
    private Human priest3;
    private Human knight2;

    private static  Attacker attackedUndead;
    private static Priest priestAttackAttacker;

    private static Goblin goblin;
    private static Priest priestAttackedByGoblin;

    private static Knight knight;
    private static Priest priestAttackedByKnight;

    @BeforeClass
    public static void beforeTests() {
        attackedUndead =new Undead();
        priestAttackAttacker=new Priest("Juan");
        priestAttackAttacker.attack(attackedUndead);

        priestAttackedByGoblin =new Priest("Carlos");
        goblin=new Goblin();
        priestAttackedByGoblin.attackedByGoblin(goblin);

        priestAttackedByKnight =new Priest("Anita");
        knight=new Knight("Panchito");
        priestAttackedByKnight.attackedByKnight(knight);

    }
    @Before
    public void setup(){
        priest1 =new Priest("Juana");
        priest2 =new Priest("Mary");
        priest3=new Priest("Pedro");
        knight2=new Knight("Pedro");
    }
    @Test
    public void testNotNull(){
        assertNotNull(priest1);
        assertNotNull(priest2);

    }
    @Test
    public void testEqualsClass(){
        assertEquals(priest1.getClass(), priest2.getClass());
        assertEquals(priest1.getClass(),(new Priest("Sofia")).getClass());
        assertEquals(priest3.getClass(),priest1.getClass());
        assertNotEquals(knight2.getClass(),priest1.getClass());
    }


    @Test
    public void testAttack() {
        double expected=400-5.0*15;
        assertEquals(expected, attackedUndead.getHP(),0.1);
        assertEquals(325.0, attackedUndead.getHP(),0.1);
    }

    @Test
    public void testAttackedByGoblin() {
        double expected=100-1.0*30;
        assertEquals(expected, priestAttackedByGoblin.getHP(),0.1);
        assertEquals(70, priestAttackedByGoblin.getHP(),0.1);
    }

    @Test
    public void testAttackedByKnight() {
        double expected=100;
        assertEquals(expected, priestAttackedByKnight.getHP(),0.1);
        assertEquals(100.0, priestAttackedByKnight.getHP(),0.1);
    }
}
