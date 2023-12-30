import java.util.Scanner;
import org.junit.*;
import static org.junit.Assert.*;

public class scoreTrans {
    public static char letterGrade(int score) {
        char grade;if (score <0 || score > 100) grade = 'X';
        else if (score>=90 && score <=100) grade = 'A';
        else if (score>=80 && score <90) grade = 'B';
        else if (score>=70 && score <80) grade = 'C';
        else if (score>=60 && score <70) grade = 'D';
        else grade ='F';
        return grade;
    }

    public static void main(String[] args) {
        int score = 0;
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter a score: ");
            score = input.nextInt();
            System.out.println("The grade is " + letterGrade(score));
        } finally {
            input.close();
        }
    }

    @Test
    public void testGradeA() {
        assertEquals('A', scoreTrans.letterGrade(90));
        assertEquals('A', scoreTrans.letterGrade(100));
    }

    @Test
    public void testGradeB() {
        assertEquals('B', scoreTrans.letterGrade(80));
        assertEquals('B', scoreTrans.letterGrade(89));
    }

    @Test
    public void testGradeC() {
        assertEquals('C', scoreTrans.letterGrade(70));
        assertEquals('C', scoreTrans.letterGrade(79));
    }

    @Test
    public void testGradeD() {
        assertEquals('D', scoreTrans.letterGrade(60));
        assertEquals('D', scoreTrans.letterGrade(69));
    }

    @Test
    public void testGradeF() {
        assertEquals('F', scoreTrans.letterGrade(0));
        assertEquals('F', scoreTrans.letterGrade(59));
    }

    @Test
    public void testGradeX() {
        assertEquals('X', scoreTrans.letterGrade(101));
        assertEquals('X', scoreTrans.letterGrade(-1));
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

