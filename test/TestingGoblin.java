package test;
import main.*;
import org.junit.*;
import static org.junit.Assert.*;
public class TestingGoblin {
    private Goblin goblin1;
    private Attacker goblin2;

    private static Attacker attackedKnight;
    private static Goblin goblinAttackAttacker;

    private static IAttackable attackedFruitTree;
    private static Goblin goblinAttackAttackable;

    private static Goblin goblin;
    private static Goblin goblinAttackedByGoblin;

    private static Knight knight;
    private static Goblin goblinAttackedByKnight;

    private static Goblin goblinAttackFruitTree;

    @BeforeClass
    public static void beforeTests() {
        attackedKnight =new Knight("Juanita");
        goblinAttackAttacker=new Goblin();
        goblinAttackAttacker.attack(attackedKnight);
        
        attackedFruitTree =new FruitTree();
        goblinAttackAttackable=new Goblin();
        goblinAttackAttackable.attack(attackedFruitTree);

        goblin=new Goblin();
        goblinAttackedByGoblin=new Goblin();
        goblinAttackedByGoblin.attackedByGoblin(goblin);

        knight = new Knight("Juanito");
        goblinAttackedByKnight=new Goblin();
        goblinAttackedByKnight.attackedByKnight(knight);

        goblinAttackFruitTree=new Goblin();
        goblinAttackFruitTree.attackFruitTree();

    }

    @Before
    public void setup(){
        goblin1=new Goblin();
        goblin2=new Goblin();
    }
    @Test
    public void testNotNull(){
        assertNotNull(goblin1);
        assertNotNull(goblin2);

    }
    @Test
    public void testEqualsClass(){
        assertEquals(goblin1.getClass(),goblin2.getClass());
        assertEquals(goblin1.getClass(),(new Goblin()).getClass());
    }


    @Test
    public void testAttackAttacker() {
        double expected=200-0.5*30;
        assertEquals(185,attackedKnight.getHP(),0.1);
        assertEquals(expected,attackedKnight.getHP(),0.1);
    }

    @Test
    public void attackAttackable() {
        double expected=400*0.15+150;
        assertEquals(210.0,goblinAttackAttackable.getHP(),0.1);
        assertEquals(expected,goblinAttackAttackable.getHP(),0.1);
    }

    @Test
    public void attackedByGoblin() {
        assertEquals(150.0,goblinAttackedByGoblin.getHP(),0.1);
    }

    @Test
    public void attackedByKnight() {
        double expected=150-1.25*35;
        assertEquals(expected,goblinAttackedByKnight.getHP(),0.1);
        assertEquals(106.25,goblinAttackedByKnight.getHP(),0.1);
    }

    @Test
    public void attackFruitTree() {
        double expected=400*0.15+150;
        assertEquals(210.0,goblinAttackFruitTree.getHP(),0.1);
        assertEquals(expected,goblinAttackFruitTree.getHP(),0.1);
    }
}




