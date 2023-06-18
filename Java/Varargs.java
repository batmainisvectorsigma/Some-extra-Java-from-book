
class A{
  void add(int ... arr){
    int sum=0;
    for(int x:arr){
      sum=sum+x;
    }
    System.out.println("The summation of numbers is: "+sum);
  }
}
class Main{
  public static void main(String args[]){
   A r=new A();
    r.add();
    r.add(1,2,3);
    r.add(1,2,3,4);
    r.add(1,2,3,4,5);
  }
}
//Description
//here ... is a elipse convention 
/*
Varagrs also known as variable number of argumnets  methods.//Introduced in JDK 1.5 version
By using this concept we can pass any no of parameters including zero parameters to the calling method
we shoud not make multiple method





*/
//before our program used to be like this 
class A{
  void add(){
    System.out.println("adding two numbers");
  }
  void add(int a,int b){
    System.out.println(a+b);
  }
  void add(int a,int b,int c)[
     System.out.println(a+b+c);
}
void add(int a,int b,int c){
  System.out.println(a+b+c+d);
}
}
class Main{
  public static void main(String args[]){
   A r=new A();
    r.add();
    r.add(1,2,3);
    r.add(1,2,3,4);
    r.add(1,2,3,4,5);
  }
}
