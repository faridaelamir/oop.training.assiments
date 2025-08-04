package javasassignnment.oop;
//Assignment 2
import java.util.Scanner;
import java.util.Locale;

public class studentaccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);


        String email;
        String password;
        int c=0;
        float average;
        String grade="A";

        do {
            System.out.println("Email: ");
            email=input.nextLine();
            System.out.println("Password: ");
            password= input.nextLine();

            if (email.equals("mohamed@intrast.com") && password.equals("mohamed123")){
                System.out.println("you are in");
                break;}

            c++;
        }while (c!=3);
        if (c ==3) {
            System.out.println("Your account locked!");
            return;
        }



        final int ccode;
        System.out.println("Enter a constsnt code");
        ccode= input.nextInt();
        int rccode;
        System.out.println("please enter your code again : ");
        rccode= input.nextInt();


        if (ccode==rccode) {

            float mark=0,r;

            String name;
            int age;
            System.out.println("Enter your name : ");
            name = input.nextLine();
            input.nextLine();

            System.out.println("Enter your age : ");
            age = input.nextInt();

            for (int m=1; m <= 6; m++){
                System.out.println("Enter your marks");
                r= input.nextFloat();
                mark+=r;
            }

            System.out.println("Total Mark : "+ mark);

            average=mark/6;
            System.out.println("Average : "+average);




            System.out.println("Name : "+name);
            System.out.println("Age : "+age);

            if ( average>= 90 &&average<= 100) {
                grade= "A";
            } else if (average >= 80 && average <= 89) {
                grade= "B";
            } else if (average >= 70 && average<= 79) {
                grade= "C";
            } else if(average>=60 && average<=69) {
                grade= "D";
            } else if(average<60) {
                grade= "F";

            } else {
                System.out.println("It is not valid");
            }

            switch (grade){
                case  "A":
                    System.out.println("Grade:A");
                    break;
                case  "B":
                    System.out.println("Grade:B");
                    break;
                case  "C":
                    System.out.println("Grade:C");
                    break;
                case  "D":
                    System.out.println("Grade:D");
                    break;
                case "F":
                default:
                    System.out.println("it is not valid");
            }



        }else {
            System.out.println("your code is'nt true");
        }











    }
}


