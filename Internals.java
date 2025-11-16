package CIE;

import java.util.Scanner;

public class Internals {
    Scanner sc=new Scanner(System.in);
    public int n=sc.nextInt();
    public int[] internalMarks = new int[n];

    public Internals(int[] marks) {
        for (int i = 0; i < 5; i++) {
            this.internalMarks[i] = marks[i];
        }
    }

    public void display() {
        System.out.print("Internal Marks: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(internalMarks[i] + " ");
        }
        System.out.println();
    }
}
