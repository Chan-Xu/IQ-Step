package comp1110.ass2;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GetPositionTest {
    @Test
    public void testCorrectPosition(){
        assertTrue("test1",StepsGame.getPosition("AFM").toString().equals("[2, 12, 13, 21, 22, 23]"));
        assertTrue("test2",StepsGame.getPosition("BDk").toString().equals("[25, 26, 34, 35, 36]"));
        assertTrue("test3",StepsGame.getPosition("DFi").toString().equals("[22, 32, 33, 34, 43]"));
    }

    @Test
    public void testWrongPosition(){
        assertFalse("test4",StepsGame.getPosition("HDY").toString().equals("[13, 15, 23, 24, 25, 37]"));
        assertFalse("test5",StepsGame.getPosition("CBL").toString().equals("[0, 10, 11, 12, 20]"));
        assertFalse("test6",StepsGame.getPosition("FAc").toString().equals("[18, 27, 28, 35, 36]"));
    }

}
