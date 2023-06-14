//Here T means of any type
public class Printer<T>{
 T thingToPrint;
  public Printer(T thingToPrint){
    this.thingToPrint=thingToPrint;
  }
  public void print(){
    System.out.println(thingToPrint);
  }
}
public class GenericsExamnple{
  public static void main(String args[]){
    Printer<Integer> printer=new Printer<>(23);
    printer.print();
  }
}

//The rest of the program is same over here
public class Printer<T>{
 T thingToPrint;
  public Printer(T thingToPrint){
    this.thingToPrint=thingToPrint;
  }
  public void print(){
    System.out.println(thingToPrint);
  }
}
public class GenericsExamnple{
  public static void main(String args[]){
    Printer<Integer> printer=new Printer<>(23);
    printer.print();      //output 23
    Printer<Double> doublePrinter=new Printer<>(23.5);
    doublePrinter.print();  //output 23.5
  }
}
