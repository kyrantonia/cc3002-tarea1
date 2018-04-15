package test;
import main.*;
import org.junit.*;
import static org.junit.Assert.*;
public class TestingGoblin {
    private Goblin goblin1;
    private Attacker goblin2;
    private Attacker iceGolem;

    private static Attacker attackedKnight;
    private static Goblin goblinAttackAttacker;

    private static IAttackable attackedFruitTree;
    private static Goblin goblinAttackAttackable;

    private static Goblin goblin;
    private static Goblin goblinAttackedByGoblin;

    private static Knight knight;
    private static Goblin goblinAttackedByKnight;

    private static Goblin goblinAttackFruitTree;
    private static Goblin goblinAttackFruitTreeTwice;

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

        goblinAttackFruitTreeTwice=new Goblin();
        goblinAttackFruitTreeTwice.attackFruitTree();
        goblinAttackFruitTreeTwice.attackFruitTree();

    }

    @Before
    public void setup(){
        goblin1=new Goblin();
        goblin2=new Goblin();
        iceGolem=new IceGolem();
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
        assertNotEquals(goblin1.getClass(),iceGolem.getClass());
    }


    @Test
    public void testAttackAttacker() {
        double expected=200-0.5*30;
        assertEquals(185,attackedKnight.getHP(),0.1);
        assertEquals(expected,attackedKnight.getHP(),0.1);
    }

    @Test
    public void testAttackAttackable() {
        double expected=400*0.15+150;
        assertEquals(210.0,goblinAttackAttackable.getHP(),0.1);
        assertEquals(expected,goblinAttackAttackable.getHP(),0.1);
    }

    @Test
    public void testAttackedByGoblin() {
        assertEquals(150.0,goblinAttackedByGoblin.getHP(),0.1);
    }

    @Test
    public void testAttackedByKnight() {
        double expected=150-1.25*35;
        assertEquals(expected,goblinAttackedByKnight.getHP(),0.1);
        assertEquals(106.25,goblinAttackedByKnight.getHP(),0.1);
    }

    @Test
    public void testAttackFruitTree() {
        double expected1=400*0.15+150;
        double expected2=400*0.15+400*0.15+150;
        assertEquals(210.0,goblinAttackFruitTree.getHP(),0.1);
        assertEquals(expected1,goblinAttackFruitTree.getHP(),0.1);
        assertEquals(270.0,goblinAttackFruitTreeTwice.getHP(),0.1);
        assertEquals(expected2,goblinAttackFruitTreeTwice.getHP(),0.1);
    }
}




