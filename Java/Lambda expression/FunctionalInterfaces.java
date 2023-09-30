//  EXAMPLE NO: 1
//FUNCTIONAL INTERFACES
@FunctionalInterface
interface Greeting{
    void sayhello(String name);
}
public class Main implements Greeting{
    public void sayhello(String name){
        System.out.println(name);
    }
    public static void main(String args[]){
        Main object=new Main();
        object.sayhello("sita");
    }
}
//output:Sita

//  EXAMPLE NO: 2
//before we used to use functional interfaces, we would often use anonymnous class
public class Main {
    @FunctionalInterface
    interface Greeting {
        void sayHello(String name);
    }

    static Greeting greetWithAnonymousClass = new Greeting() {
        @Override
        public void sayHello(String name) {
            System.out.println(name);
        }
    };

    public static void main(String[] args) {
        greetWithAnonymousClass.sayHello("Sita");
    }
}
//output:Sita

//EXAMPLE NO:3
//    HERE WE ARE USING THE LAMBDA EXPRESSION ON SOLVING THE PROGRAM WITHOUT MAKING THE FUNCTION STATTIC

public class Main {
    @FunctionalInterface
    interface Greeting {
        void sayHello(String name);
    }
    Greeting greetWithLambda = name -> System.out.println(name);

    public static void main(String args[]){
        Main mainInstance = new Main();
        mainInstance.greetWithLambda.sayHello("Sita");
    }
}

//output: Sita


//EXAMPLE NO: 4
//     HERE WE ARE USING THE LAMBDA EXPRESUION ON SOLVING THE PRPOGRAM WITH USING THE FUNCTION STATIC 


public class Main{
    @FunctionalInterface
    interface Greeting{
        void sayHello(String name);
    }
    static Greeting greetWithLambda=name -> System.out.println(name);
    public static void main(String args[]){
        greetWithLambda.sayHello("Sita");
    }
}

//OUTPUT: Sita

//SOME MORE EXAMPLES
//EXAMPLE NO: 5
//LAMBDA WITH 'Comparator': SORTING A LIST OF STRING BE LENGTH:
import java.util.*;
public class Main{
    public static void main(String args[]){
        List<String> words=Arrays.asList("apple","banana","cherry","data");
        Collections.sort(words,(first,second) -> first.length()-second.length());
        System.out.println(words);
    }
}
// Output: [date, apple, cherry, banana]


//EXAMPLE NO:6
//LAMBDA WITH 'Timer': PRINTING CURRENT TIME EVERY SECOND
import javax.swing.*;
import java.awt.*;
import java.util.Date;
public class Main{
    public static void main(String args[]){
        Timer t=new Timer(10000,event -> {
           System.out.println("Current time is: "+new Date());
           Toolkit.getDefaultToolkit().beep();
        });
        t.start();
        JOptionPane.showMessageDialog(null,"Check OK to exit the program");
        System.out.println();


        System.out.println();
    }
}


//EXAMPLE NO:7
//USING 'Predicate' to filter a List
import java.util.*;
import java.util.function.Predicate;

public class Main{
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("apple", null, "banana", "cherry", null));
        
        Predicate<String> nonNullPredicate = e -> e != null;
        words.removeIf(nonNullPredicate.negate()); // Removing all null values
        
        System.out.println(words); // Output: [apple, banana, cherry]
    }
}


//EXAMPLE NO:8
//USING BiFunction to concatenate two Strings
import java.util.function.BiFunction;
public class Main{
    public static void main(String args[]){
        BiFunction<String,String,String> concatFunction=(first,second) -> first+second;
        String result=concatFunction.apply("Hello,","World!");
        System.out.println(result);
    }
}
//output: Hello,World!

//example
