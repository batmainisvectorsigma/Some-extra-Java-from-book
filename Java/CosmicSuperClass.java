//note that if you are trying are trying to use this program please use make your program as Main.java

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
*Description
Every class in Java extends Object
However you never have to write
means you can even write the program without extending Object class

If no superclass is explicitly mentioned 
The Ultimate superclass object is taken for granted


*/
                        
