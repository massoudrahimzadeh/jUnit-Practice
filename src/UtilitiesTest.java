import static org.junit.Assert.*;

public class UtilitiesTest {
    private Utilities util;
    @org.junit.Before
    public void setup(){
        util = new Utilities();
    }


    @org.junit.Test
    public void everyNthChar() {
        char[] output = util.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'}, 2);
        assertArrayEquals(new char[] {'e', 'l'}, output);
        char[] output1 = util.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'}, 7);
        assertArrayEquals(new char[] {'h', 'e', 'l', 'l', 'o'}, output1);

    }

    @org.junit.Test
    public void removePairs() {
        assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
        assertEquals("ABCDAEF", util.removePairs("AABCDDAEFF"));
        assertNull("did not get null returned when null was the argument", util.removePairs(null));
        assertEquals("A",util.removePairs("A"));
        assertEquals("",util.removePairs(""));
    }

    @org.junit.Test
    public void converter() {
        assertEquals(300, util.converter(10, 5));
    }

    @org.junit.Test
    public void nullIfOddLength() {
        assertNull(util.nullIfOddLength("odd"));
        assertNotNull(util.nullIfOddLength("even"));
    }
}