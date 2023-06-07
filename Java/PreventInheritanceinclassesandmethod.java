public final class PreventInheritanceinclassesandmethod{

}
public class Main extends PreventInheritanceinclassesandmethod{
  //here i am getting some error cause you cannot extends the final classes
}
public final class PreventInheritanceinclassesandmethod{
   public void run(){
     
   }
}
//once the class is made final all the method automtically becomes final and no subclass can override that
//method
//final fields cannot be changed after the object has been constructed

//If I want to prevent others from subclassing the executive class Simply declare the class using the final modifier
/*
*prevent someone to form subclass from one of your classes
*classes that cannot be executed are called final classes
*
*/
