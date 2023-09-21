//BEFORE LAMBDA EXPRESSION
interface Greeting{
    public void perform();
}
class HelloWorldGreeting implements Greeting{
    @Override
    public void perform(){
        System.out.println("Hello World");
    }
}
public class Greeter {
    public void greet(Greeting greeting){
        greeting.perform();
    }
    public static void main(String args[]){
        Greeter greeter=new Greeter();
        HelloWorldGreeting helloWorldGreeting=new HelloWorldGreeting();
        greeter.greet(helloWorldGreeting);
    }
}
