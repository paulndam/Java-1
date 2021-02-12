import javax.swing.JOptionPane;
import java.util.Scanner;

public class GradeCalc {

    public static void main(String[] args) {

        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the grades of each activity");

        // Get student information
        // Five assignments worth 30 points each.
        // • Three projects worth 100 points each.
        // • Seven quizzes worth 20 points each.
        // • Participation is worth 10 points.

        int assignment = input.nextInt();
        int projects = input.nextInt();
        int quizzes = input.nextInt();
        int participation = input.nextInt();

        studentGradeInfo(assignment, projects, quizzes, participation);

    }

    public static void studentGradeInfo(int asgnmt, int prjct, int qz, int part){
        double Total;
        double Percentage;

        Total = asgnmt + prjct + qz + part;
        Percentage = (Total/500) * 100;

        System.out.println("Total grades  --->" + Total);
        System.out.println("Percentage grades  --->" + Percentage);

        if(Percentage >= 90){
            System.out.println("\n letter grade is A");
        }
        else if(Percentage >= 80){
            System.out.println("\n letter grade is B");
        }
        else if(Percentage >= 70){
            System.out.println("\n letter grade is C");
        }
        else if(Percentage >= 60){
            System.out.println("\n letter grade is D");
        }
        else if(Percentage >= 40){
            System.out.println("\n letter grade is E");
        }
        else{
            System.out.println("\n Fail");
        }





    }

}