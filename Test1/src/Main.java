import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter Number of new Students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        for (int i=0;i<numOfStudents;i++){
            students[i] = new Student();
            students[i].enroll();
            students[i].payTution();
            System.out.println(students[i].toString());
        }
    }
}
