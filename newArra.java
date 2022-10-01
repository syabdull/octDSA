
import java.util.ArrayList;
import java.util.LinkedList;

public class newArra {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add("Hello");
        ll.add("summer");
        ArrayList al = new ArrayList();
        al.add("Abdulla");
        al.add(new Student(100, 200));
        al.add("foul");
        al.add(ll);

        System.out.println(al);
    }

}

class Student {
    int id;
    int roll;

    public Student(int id, int roll) {

        this.id = id;
        this.roll = roll;

    }

     public String toString(){

      return this.id+" "+this.roll;

     }
}
