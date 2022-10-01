import java.util.ArrayList;
 import java.util.LinkedList;

 import java.util.Iterator;
public class ExrmAll {

       public static  void main(String[]args){
         ArrayList ar=new ArrayList();
         LinkedList ll=new LinkedList();
           ll.add("Hello");
            ll.add("example");
            ar.add("iam array list");
            ar.add("ar started");
            ar.addAll(ll);
             System.out.println(ar);
             ar.retainAll(ll);
             System.out.println(ar);

              Iterator it=ar.iterator();
                  while(it.hasNext()){
                      System.out.println(it.next());
                  }
         
       }
    
}
