package test;
import main.*;
import org.junit.*;
import static org.junit.Assert.*;
public class TestingFireMage {
    private FireMage fireMage1;
    private Attacker fireMage2;
    private Human fireMage3;
    private Human knight2;

    private static  Attacker attackedUndead;
    private static FireMage fireMageAttackAttacker;

    private static Goblin goblin;
    private static FireMage fireMageAttackedByGoblin;

    private static Knight knight;
    private static FireMage fireMageAttackedByKnight;

    @BeforeClass
    public static void beforeTests() {
        attackedUndead =new Undead();
        fireMageAttackAttacker =new FireMage("Juan");
        fireMageAttackAttacker.attack(attackedUndead);

        fireMageAttackedByGoblin =new FireMage("Carlos");
        goblin=new Goblin();
        fireMageAttackedByGoblin.attackedByGoblin(goblin);

        fireMageAttackedByKnight =new FireMage("Anita");
        knight=new Knight("Panchito");
        fireMageAttackedByKnight.attackedByKnight(knight);

    }
    @Before
    public void setup(){
        fireMage1 =new FireMage("Juana");
        fireMage2 =new FireMage("Mary");
        fireMage3=new FireMage("Pedro");
        knight2=new Knight("Jose");
    }
    @Test
    public void testNotNull(){
        assertNotNull(fireMage1);
        assertNotNull(fireMage2);

    }
    @Test
    public void testEqualsClass(){
        assertEquals(fireMage1.getClass(), fireMage2.getClass());
        assertEquals(fireMage1.getClass(),(new FireMage("Sofia")).getClass());
        assertEquals(fireMage1.getClass(),fireMage3.getClass());
        assertNotEquals(fireMage1.getClass(),knight2.getClass());
    }

    @Test
    public void testAttack() {
        double expected=400-0.5*10;
        assertEquals(expected, attackedUndead.getHP(),0.1);
        assertEquals(395.0, attackedUndead.getHP(),0.1);
    }

    @Test
    public void testAttackedByGoblin() {
        double expected=350-30*1.5;
        assertEquals(expected, fireMageAttackedByGoblin.getHP(),0.1);
        assertEquals(305, fireMageAttackedByGoblin.getHP(),0.1);
    }

    @Test
    public void testAttackedByKnight() {
        double expected=350-35*1.5;
        assertEquals(expected, fireMageAttackedByKnight.getHP(),0.1);
        assertEquals(297.5, fireMageAttackedByKnight.getHP(),0.1);
    }


}
