package SEE;

import CIE.Persnal;

public class External extends Persnal {
    public int[] seeMarks = new int[5];

    public External(String usn, String name, int sem, int[] marks) {
        super(usn, name, sem);
        for (int i = 0; i < 5; i++) {
            this.seeMarks[i] = marks[i];
        }
    }

    public void display() {
        super.display();
        System.out.print("SEE Marks: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(seeMarks[i] + " ");
        }
        System.out.println();
    }
}