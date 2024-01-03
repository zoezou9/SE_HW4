import org.junit.*;
import static org.junit.Assert.*;

public class scoreTransTest {
    @Test
    public void testGradeBoundary() {
        // letterGrade s = new letterGrade();
        assertEquals('A', scoreTrans.letterGrade(90));
        assertEquals('A', scoreTrans.letterGrade(100));
        assertEquals('B', scoreTrans.letterGrade(80));
        assertEquals('B', scoreTrans.letterGrade(89));
        assertEquals('C', scoreTrans.letterGrade(70));
        assertEquals('C', scoreTrans.letterGrade(79));
        assertEquals('D', scoreTrans.letterGrade(60));
        assertEquals('D', scoreTrans.letterGrade(69));
        assertEquals('F', scoreTrans.letterGrade(0));
        assertEquals('F', scoreTrans.letterGrade(59));
        assertEquals('X', scoreTrans.letterGrade(101));
        assertEquals('X', scoreTrans.letterGrade(-1));
    }

    @Test
    public void testGrade() {
        assertEquals('A', scoreTrans.letterGrade(95));
        assertEquals('B', scoreTrans.letterGrade(85));
        assertEquals('C', scoreTrans.letterGrade(75));
        assertEquals('D', scoreTrans.letterGrade(65));
        assertEquals('F', scoreTrans.letterGrade(55));
        assertEquals('X', scoreTrans.letterGrade(105));
        assertEquals('X', scoreTrans.letterGrade(-5));
    }

}

