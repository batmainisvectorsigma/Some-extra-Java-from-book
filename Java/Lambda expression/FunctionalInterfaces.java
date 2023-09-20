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
