
import java.util.Scanner;
public class ExamResult {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter your exam score:");
        int examScore=scanner.nextInt();

       
        int passingScore=50;
        
        boolean hasPassed=examScore>=passingScore;

        if (hasPassed) {
            System.out.println("Congratulations!You have passed");}
            else{
            System.out.println("Sorry!you have failed");
        }
    }
    
}
