package comp1110.ass2;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

// should add more tests more general. and messages should better for user.
public class ValidPieceStringTest {
    @Test
    public void testCorrectString() {
        assertTrue("Test1",StepsGame.isValidPieceString("BBB"));
        assertTrue("Test2",StepsGame.isValidPieceString("BEo"));
        assertTrue("Test3",StepsGame.isValidPieceString("EBr"));
        assertTrue("Test4",StepsGame.isValidPieceString("EEU"));
    }

    @Test
    public void testWrongString() {
        assertFalse("Test5",StepsGame.isValidPieceString("BCB"));
        assertFalse("Test6",StepsGame.isValidPieceString("DEo"));
        assertFalse("Test7",StepsGame.isValidPieceString("CHr"));
        assertFalse("Test8",StepsGame.isValidPieceString("AAU"));
    }
}
