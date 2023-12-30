import org.junit.*;
import static org.junit.Assert.*;

public class scoreTransTest {
    @Test
    public void testGradeA() {
        letterGrade s = new letterGrade();
        assertEquals('A', s.letterGrade(90));
        assertEquals('A', s.letterGrade(100));
    }

    @Test
    public void testGradeB() {
        letterGrade s = new letterGrade();
        assertEquals('B', s.letterGrade(80));
        assertEquals('B', s.letterGrade(89));
    }

    @Test
    public void testGradeC() {
        letterGrade s = new letterGrade();
        assertEquals('C', s.letterGrade(70));
        assertEquals('C', s.letterGrade(79));
    }

    @Test
    public void testGradeD() {
        letterGrade s = new letterGrade();
        assertEquals('D', s.letterGrade(60));
        assertEquals('D', s.letterGrade(69));
    }

    @Test
    public void testGradeF() {
        letterGrade s = new letterGrade();
        assertEquals('F', s.letterGrade(0));
        assertEquals('F', s.letterGrade(59));
    }

    @Test
    public void testGradeX() {
        // scoreTrans s = new scoreTrans();
        letterGrade s = new letterGrade();
        assertEquals('X', s.letterGrade(101));
        assertEquals('X', s.letterGrade(-1));
    }

    // @Test
    // public void testGradeA() {
    //     assertEquals('A', scoreTrans.letterGrade(95));
    // }

    // @Test
    // public void testGradeB() {
    //     assertEquals('B', scoreTrans.letterGrade(85));
    // }

    // @Test
    // public void testGradeC() {
    //     assertEquals('C', scoreTrans.letterGrade(75));
    // }

    // @Test
    // public void testGradeD() {
    //     assertEquals('D', scoreTrans.letterGrade(65));
    // }

    // @Test
    // public void testGradeF() {
    //     assertEquals('F', scoreTrans.letterGrade(55));
    // }

    // @Test
    // public void testGradeX() {
    //     assertEquals('X', scoreTrans.letterGrade(105));
    //     assertEquals('X', scoreTrans.letterGrade(-5));
    // }
}

