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
    interface Greeting{
        void sayHello(String name);
    }
    static Greeting greetWithLambda=name -> System.out.println(name);
    public static void main(String args[]){
        greetWithLambda.sayHello("Sita");
    }
}

//OUTPUT: Sita
