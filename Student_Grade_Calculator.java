import java.util.Scanner;

public class Student_Grade_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Marks Obtained in Physics: ");
        int phys = sc.nextInt();

        System.out.println("Enter The Marks Obtained in Maths: ");
        int maths = sc.nextInt();

        System.out.println("Enter The Marks Obtained in Chemistry: ");
        int chem = sc.nextInt();

        System.out.println("Enter The Marks Obtained in Biology: ");
        int bio = sc.nextInt();

        System.out.println("Enter The Marks Obtained in English: ");
        int eng = sc.nextInt();

        int totalMarks = showTotalMarks(phys, maths, chem, bio, eng);
        System.out.println("The Total Marks is: " + totalMarks);

        double avgPercentage = showAveragePercentage(phys, maths, chem, bio, eng);
        System.out.println("The Average Percentage is: " + avgPercentage + " %");

        char grade = showGrade(avgPercentage);
        System.out.println("Your Grade Is: " + grade);

        sc.close();
    }

    static int showTotalMarks(int phys, int maths, int chem, int bio, int eng) {
        return (phys + maths + chem + bio + eng);
    }

    static double showAveragePercentage(int phys, int maths, int chem, int bio, int eng) {

        return (double) (showTotalMarks(phys, maths, chem, bio, eng)) / 500 * 100;
    }

    static char showGrade(double avgPercentage) {
        if (avgPercentage > 90.0) {
            return 'A';
        } else if (avgPercentage > 80.0 && avgPercentage < 90) {
            return 'B';
        } else if (avgPercentage > 70.0 && avgPercentage < 80) {
            return 'C';
        } else if (avgPercentage > 60 && avgPercentage < 70) {
            return 'D';
        }
        return 'P';
    }
}
