package javasassignnment.oop;
//Assignment 1
import java.util.Scanner;
import java.util.Locale;

public class studentmark {


    public static void main(String [] args) {

        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);


        System.out.println("Enter your Name: ");
        String n = in.nextLine();


        int sb1, sb2, sb3;
        System.out.println("Mark of Physics:");
        sb1 = in.nextInt();
        System.out.println("Mark of Chemistry:");
        sb2 = in.nextInt();
        System.out.println("Mark of Mathematics");
        sb3 = in.nextInt();
        int sum = sb1 + sb2 + sb3;
        float sum2 = (float) sum / 3;


        System.out.println("Your name:" + n);
        System.out.println("Total marks:" + sum);
        System.out.println("Average:" + sum2);

        String Grade;

        if (sum2 >= 90 && sum2<= 100) {
            Grade= "A";
        } else if (sum2 >= 80 && sum2 <= 89) {
            Grade= "B";
        } else if (sum2 >= 70 && sum2<= 79) {
            Grade= "C";
        } else if(sum2>=60 && sum2<=69) {
            Grade= "D";
        } else if(sum2<60) {
            Grade= "F";

        } else { Grade = "fail";}

        switch (Grade){
            case  "A":
                System.out.println("Grade:A");
                System.out.println("Excellent work!");
                break;
            case  "B":
                System.out.println("Grade:B");
                System.out.println("Great job");
                break;
            case  "C":
                System.out.println("Grade:C");
                System.out.println("Good effort");
                break;
            case  "D":
                System.out.println("Grade:D");
                System.out.println("You passed, but aim higher");
                break;
            case "fail":
                System.out.println("Grade:F");
                System.out.println("You need to improve");
                break;
            default:
                System.out.println("it is not valid");
        }

    }
}

