
import java.io.Serializable;
import java.util.ArrayList;
import java.util.RandomAccess; 
import java.lang.Cloneable;
 

public class Nongen {
     public static  void  main(String[]args){
         ArrayList al=new ArrayList();
          al.add("Abdulla");
        al.add(20);
         al.add(90);
         al.add('A');
          al.add("fowl");
          System.out.println(al);
          System.out.println(al instanceof RandomAccess);
          System.out.println(al instanceof Serializable);
          System.out.println(al instanceof Cloneable);
     }
    
}
