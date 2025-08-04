package javasassignnment.oop;
//Assignment 4 part 1
public class Student {
    private String name;
    private int studentid;
    private String major;
    private double gba = 0.0d;

    public Student (String n,String m,int sid) {
        name = n;
        major = m;
        studentid = sid;

    }

        public void displaystudentinfo(){
            System.out.println("Name : " + name);
            System.out.println("Student ID : " + studentid);
            System.out.println("Major : " + major);
            System.out.println("GBA : " + gba);
    }

    public double getGba(){
     return gba;
    }

    public double ubdateGpa(double newGba){
        System.out.println("Old GBA : " + getGba());
        System.out.println("New GBA : " + newGba);
        return newGba;
    }
}
