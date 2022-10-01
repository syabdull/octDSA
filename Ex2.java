
import java.util.ArrayList;
import java.util.Iterator;
public class Ex2 {
     public static void main(String[]args){
         ArrayList al=new ArrayList();
          al.add(30);
        al.add(30);
        al.add(90);
        Iterator it=al.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }

     }
    } 
    