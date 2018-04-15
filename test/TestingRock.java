package test;
import main.*;
import org.junit.*;
import static org.junit.Assert.*;

public class TestingRock {

    private static Rock rockAttackedByGoblin;
    private static Goblin goblin;

    private static Rock rockAttackedByKnight;
    private static Human knight;

    @BeforeClass
    public static void beforeTests() {
        rockAttackedByGoblin=new Rock();
        goblin=new Goblin();
        rockAttackedByGoblin.attackedByGoblin(goblin);

        rockAttackedByKnight=new Rock();
        knight=new Knight("Juanita");
        rockAttackedByKnight.attackedByHuman(knight);
    }


    @Test
    public void testAttackedByGoblin() {
        double expected=150;
        assertEquals(expected,goblin.getHP(),0.1);
        assertEquals(150,goblin.getHP(),0.1);
    }

    @Test
    public void testAttackedByHuman() {
        double expected=200-35;
        assertEquals(expected,knight.getHP(),0.1);
        assertEquals(165,knight.getHP(),0.1);
    }

}
