import java.util.Enumeration;
import java.util.Vector;

public class VectorEnumeration {
    public static void main(String args[]){
        Vector v=new Vector();
        v.add(10);
        v.add("d");
        v.add(15.2);
        v.add(15.2);
        Enumeration e=v.elements();
        System.out.println(e.hasMoreElements());
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        
    }
}
/* 
Enumearion cursor can be used only wityh legacy classes
    Vector Stack
Enumeration cursor be used to get value by elements() method
hasMoreElements() returns either true or false as a value in boolean 
Enumeratio cursor can be used to retrive the enumeration only in forward direction 



 */
