import java.util.Scanner;

public class Student {
    private String FirstName;
    private String LastName;
    private int Year;
    private String Courses ="";
    private int TuitionFees;
    private String studentID ;
    private static int costOfCourse = 600;
    private static int ID = 1000;

    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Student first Name: ");
        this.FirstName = in.nextLine();

        System.out.println("Enter Student last Name: ");
        this.LastName = in.nextLine();

        System.out.println("1 - Fresher\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter Student class level: ");
        this.Year = in.nextInt();
        setStudentID();

        System.out.println(FirstName+" "+LastName+" "+Year+" "+studentID);

    }

    private void setStudentID(){
        ID++;
       this.studentID = Year+""+ID;
    }

    public void enroll(){
        do {
            System.out.print("Enter course to enroll (Q to quite): ");
            Scanner in = new Scanner(System.in);
            String Course = in.nextLine();
            if (!Course.equals("Q")) {
                Courses = Courses + "\n  " + Course;
                TuitionFees =TuitionFees+costOfCourse;
            }
            else {
                break ;
            }
        } while (1 != 0);
    }

    public void viewBalance(){
        System.out.println("Your balance is : $"+TuitionFees);
    }

    public void payTution(){
        viewBalance();
        System.out.println("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        TuitionFees = payment-TuitionFees;
        System.out.println("Thank you for your payment $"+payment);
        viewBalance();
    }

    public String toString(){
        return "Name: "+FirstName+" "+LastName+
                "\nGrade Level: "+Year+
                "\nStudent ID: "+studentID+
                "\nCourses Enrolled: "+Courses+
                "\nBalance: $"+TuitionFees;
    }
}
