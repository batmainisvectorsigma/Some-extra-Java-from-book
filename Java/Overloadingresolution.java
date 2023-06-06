public class Overloadingresolution{
  public void run(int a){
    System.out.println(a);
  }
  public void run(String b){
    System.out.println(b);
  }
  public static void main(String args[]){
  Overloadingresolution object=new Overloadingresolution();
    object.run(10);
    object.run("done");
  }
}

/*compiler checks what type of argument is supplied in the method call.
among all the f method whose parameter are best matched within the supplied arguments,
that method is chosen to be called first
This process is called overloading resolution.
*/
