package test;
import main.*;
import org.junit.*;
import static org.junit.Assert.*;
public class TestingKnight {
    private Knight knight1;
    private Attacker knight2;
    private Human knight3;
    private Human fireMage;

    private static Attacker attackedKnight;
    private static Knight knightAttackAttacker;

    private static Goblin goblin;
    private static Knight knightAttackedByGoblin;

    private static Knight knight;
    private static Knight knightAttackedByKnight;

    private static IceGolem iceGolem;
    private static Knight knightAttackedByIceGolem;
    @BeforeClass
    public static void beforeTests() {
        attackedKnight =new Knight("Juanita");
        knightAttackAttacker=new Knight("Juan");
        knightAttackAttacker.attack(attackedKnight);

        knightAttackedByGoblin =new Knight("Carlos");
        goblin=new Goblin();
        knightAttackedByGoblin.attackedByGoblin(goblin);

        knightAttackedByIceGolem =new Knight("Carlos");
        iceGolem=new IceGolem();
        knightAttackedByIceGolem.attackedByIceGolem(iceGolem);

        knightAttackedByKnight =new Knight("Anita");
        knight=new Knight("Panchito");
        knightAttackedByKnight.attackedByKnight(knight);
    }
    @Before
    public void setup(){
        knight1 =new Knight("Juana");
        knight2 =new Knight("Mary");
        knight3=new Knight("Mariana");
        fireMage=new FireMage("Pedro");
    }
    @Test
    public void testNotNull(){
        assertNotNull(knight1);
        assertNotNull(knight2);

    }
    @Test
    public void testEqualsClass(){
        assertEquals(knight1.getClass(), knight2.getClass());
        assertEquals(knight1.getClass(),(new Knight("Sofia")).getClass());
        assertEquals(knight1.getClass(),knight3.getClass());
        assertNotEquals(knight1.getClass(),fireMage.getClass());
    }

    @Test
    public void testAttack() {
        double expected=200-1.0*35;
        assertEquals(expected,attackedKnight.getHP(),0.1);
        assertEquals(165.0,attackedKnight.getHP(),0.1);
    }

    @Test
    public void testAttackedByGoblin() {
        double expected=200-0.5*30;
        assertEquals(expected, knightAttackedByGoblin.getHP(),0.1);
        assertEquals(185, knightAttackedByGoblin.getHP(),0.1);
    }

    @Test
    public void testAttackedByIceGolem() {
        double expected=200-30*1.5;
        assertEquals(expected,knightAttackedByIceGolem.getHP(),0.1);
        assertEquals(155,knightAttackedByIceGolem.getHP(),0.1);
    }

    @Test
    public void testAttackedByKnight() {
        double expected=200-1.0*35;
        assertEquals(expected, knightAttackedByKnight.getHP(),0.1);
        assertEquals(165.0, knightAttackedByKnight.getHP(),0.1);
    }
}
