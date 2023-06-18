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

//here ... is a elipse convention 
//before our program used to be like this 
