//note that if you are trying to use this program please use make your program as Main.java

class Main extends Object{
    String name,address;
    public Main(String name,String address){
        this.name=name;
        this.address=address;
    }
    void display(){
        System.out.println(name+" "+address);
    }
 public static void main(String args[]){
  Object object=new Main("suresh","india");
  Main object1=(Main) object;
  object1.display();
 }   
}
/*
*Description of the program
Every class in Java extends Object
However you never have to write
means you can even write the program without extending Object class

If no superclass is explicitly mentioned 
The Ultimate superclass object is taken for granted
i.e public class Main extends Object
Object object=new Main("suresh","india");
a variable of type object is only useful as a generic holder for arbitrary values.
To do anything specific with the value, you need to have some knowledge about the original type and apply a cast

*/
                        
