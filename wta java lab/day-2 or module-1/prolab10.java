
import java.util.Scanner;

class Student {
    private int usn;
    private long phone;
    private String name;
    private String branch;

    Student(int studentUsn, String studentName, String studnetBranch, long studentPhone) {
        usn = studentUsn;
        phone = studentPhone;
        name = studentName;
        branch = studnetBranch;
    }

    void display() {
        System.out.println("usn : " + usn + "\t Name : " + name + "\t branch :" + branch + "\t phone :" + phone);
    }

}

public class prolab10 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int n = cin.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < students.length; i++) {
            System.out.println("enter usn ,name, branch and phone for student " + (i + 1));
            students[i] = new Student(cin.nextInt(), cin.next(), cin.next(), cin.nextLong());
        }

        System.out.println("student details");
        for (Student i : students) {
            i.display();
            System.out.println();
        }
    }
}
