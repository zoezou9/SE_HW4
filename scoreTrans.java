import java.util.Scanner;


public class scoreTrans {
    public static char letterGrade(int score) {
        char grade;
        if (score <0 || score > 100) grade = 'X';
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

}

