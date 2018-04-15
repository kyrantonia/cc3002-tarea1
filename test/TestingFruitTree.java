package test;

import main.*;
        import org.junit.*;
        import static org.junit.Assert.*;

public class TestingFruitTree {

    private static FruitTree fruitTreeAttackedByGoblin;
    private static Goblin goblin;

    private static FruitTree fruitTreeAttackedByKnight;
    private static Human knight;

    @BeforeClass
    public static void beforeTests() {
        fruitTreeAttackedByGoblin=new FruitTree();
        goblin=new Goblin();
        fruitTreeAttackedByGoblin.attackedByGoblin(goblin);

        fruitTreeAttackedByKnight=new FruitTree();
        knight=new Knight("Juanita");
        fruitTreeAttackedByKnight.attackedByHuman(knight);
    }


    @Test
    public void testAttackedByGoblin() {
        double expected=400*0.15+150;;
        assertEquals(expected,goblin.getHP(),0.1);
        assertEquals(210,goblin.getHP(),0.1);
    }

    @Test
    public void testAttackedByHuman() {
        double expected=200+750*0.3;
        assertEquals(expected,knight.getHP(),0.1);
        assertEquals(425,knight.getHP(),0.1);
    }

}