package javasassignnment.oop;
//Assignment 4 part 1
import java.util.Scanner;
import java.util.Locale;

public class universityapp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);

        Student s1 = new Student("ahmed" , "marketing" ,23456);
        s1.displaystudentinfo();

        Student s2 = new Student("farida" ,"testing" ,1234);
        s2.displaystudentinfo();
        s2.ubdateGpa(3.50);

    }
}
