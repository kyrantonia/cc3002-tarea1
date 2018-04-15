package test;

import main.*;
import org.junit.*;
import static org.junit.Assert.*;
public class TestingHuman {
    private Human human1;
    private Knight human2;
    private Human human3;

    private static Human knightAttacksRock;
    private static Human knightAttacksRockTwice;

    private static Human knightAttacksFruitTree;
    private static Human knightAttacksFruitTreeTwice;

    private static Rock rock;
    private static FruitTree fruitTree;
    private static Human knightAttacksAttackableFruitTree;
    private static Human knightAttacksAttackableRock;


    @Before
    public void  setUp() {
        human1 = new Knight("Pedro");
        human2 = new Knight("Pedro");
        human3 = new Knight("Pedrero");
    }
    @BeforeClass
    public static void beforeTests() {

        knightAttacksRock =new Knight("Pedro");
        knightAttacksRock.attackRock();

        knightAttacksRockTwice =new Knight("Pedro");
        knightAttacksRockTwice.attackRock();
        knightAttacksRockTwice.attackRock();

        knightAttacksFruitTree =new Knight("Pedro");
        knightAttacksFruitTree.attackFruitTree();

        knightAttacksFruitTreeTwice =new Knight("Pedro");
        knightAttacksFruitTreeTwice.attackFruitTree();
        knightAttacksFruitTreeTwice.attackFruitTree();

        rock=new Rock();
        fruitTree=new FruitTree();
        knightAttacksAttackableRock=new Knight("Pedrita");
        knightAttacksAttackableFruitTree=new Knight("Pedrito");
        knightAttacksAttackableRock.attack(rock);
        knightAttacksAttackableFruitTree.attack(fruitTree);


    }
    @Test
    public void testesNameNotNull() {
        assertNotNull(human1.getName());
        assertNotNull(human2.getName());
    }
    @Test
    public void testGetName(){
        assertEquals(human1.getName(), human2.getName());
        assertNotEquals(human1.getName(),human3.getName());
    }

    @Test
    public void testAttackRock() {
        double expected1=200-35;
        double expected2=200-35*2;
        assertEquals(expected1,knightAttacksRock.getHP(),0.1);
        assertEquals(165,knightAttacksRock.getHP(),0.1);
        assertEquals(expected2,knightAttacksRockTwice.getHP(),0.1);
        assertEquals(130,knightAttacksRockTwice.getHP(),0.1);
    }

    @Test
    public void testAttackFruitTree() {
        double expected1=200+0.3*750;
        double expected2=200+0.3*750+0.3*750;
        assertEquals(expected1,knightAttacksFruitTree.getHP(),0.1);
        assertEquals(425,knightAttacksFruitTree.getHP(),0.1);
        assertEquals(expected2,knightAttacksFruitTreeTwice.getHP(),0.1);
        assertEquals(650,knightAttacksFruitTreeTwice.getHP(),0.1);

    }

    @Test
    public void testAttackAttackable() {
        double expected1=200-35;
        double expected2=200+0.3*750;
        assertEquals(expected1,knightAttacksAttackableRock.getHP(),0.1);
        assertEquals(165,knightAttacksAttackableRock.getHP(),0.1);
        assertEquals(expected2,knightAttacksAttackableFruitTree.getHP(),0.1);
        assertEquals(425,knightAttacksAttackableFruitTree.getHP(),0.1);
    }
}
