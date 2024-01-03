import org.junit.*;
import static org.junit.Assert.*;

public class scoreTransTest {
    @Test
    public void testGradeBoundary() {
        letterGrade s = new letterGrade();
        assertEquals('A', s.letterGrade(90));
        assertEquals('A', s.letterGrade(100));
        assertEquals('B', s.letterGrade(80));
        assertEquals('B', s.letterGrade(89));
        assertEquals('C', s.letterGrade(70));
        assertEquals('C', s.letterGrade(79));
        assertEquals('D', s.letterGrade(60));
        assertEquals('D', s.letterGrade(69));
        assertEquals('F', s.letterGrade(0));
        assertEquals('F', s.letterGrade(59));
        assertEquals('X', s.letterGrade(101));
        assertEquals('X', s.letterGrade(-1));
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

