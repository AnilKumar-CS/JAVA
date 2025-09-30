
import java.util.Scanner;

class Student {
    String usn;
    String name;
    int[] credits;
    int[] marks;
    int n;   // number of subjects

    Student(int n) {
        this.n = n;
        credits = new int[n];
        marks = new int[n];
    }

    void details(Scanner sc) {
        System.out.println("Enter the Student details:\n");
        System.out.print("Enter the Student USN: ");
        usn = sc.nextLine();
        System.out.print("Enter the Student Name: ");
        name = sc.nextLine();
        System.out.println("Enter the Student credits and marks:");
        for (int i = 0; i < n; i++) {
            System.out.print("Subject " + (i + 1) + " credits: ");
            credits[i] = sc.nextInt();
            System.out.print("Subject " + (i + 1) + " Marks: ");
            marks[i] = sc.nextInt();
        }
    }

    void display() {
        System.out.println("Student Details:");
        System.out.println("Student USN: " + usn);
        System.out.println("Student Name: " + name);
        for (int i = 0; i < n; i++) {
            System.out.println("Subject " + (i + 1) + " credits: " + credits[i] + " marks: " + marks[i]);
        }
    }

    double calSGPA() {
        int totalCredits = 0;
        int weightcredits = 0;
        for (int i = 0; i < n; i++) {
            int gradepoint = getGradePoints(marks[i]);  // ⚠️ still using marks directly (like your code)
            weightcredits = weightcredits + gradepoint * credits[i];
            totalCredits = totalCredits + credits[i];
        }

        if (totalCredits == 0) return 0;
        return (double) weightcredits / totalCredits;
    }
    private int getGradePoints(int marks){
    if(marks>=90) return 10;
    else if(marks>=80) return 9;
    else if(marks>=70) return 8;
    else if(marks>=60) return 7;
    else if(marks>=50) return 6;
    else if(marks>=40) return 5;
    else return 0;
}
}



public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of Subjects: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.println("Enter the Student Details now:");
        Student s = new Student(n);
        s.details(sc);
        s.display();

        double SGPA = s.calSGPA();
        System.out.printf("SGPA: %.2f", SGPA);


        sc.close();
    }
}