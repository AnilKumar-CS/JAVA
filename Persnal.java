package CIE;

public class Persnal{
    public String usn;
    public String name;
    public int sem;

    public Persnal(String usn, String name, int sem){
        this.usn=usn;
        this.name=name;
        this.sem=sem;
    }

    public void display(){
        System.out.println("USN : "+ usn);
        System.out.println("Name : "+ name);
        System.out.println("SEM : "+ sem);
    }
}
