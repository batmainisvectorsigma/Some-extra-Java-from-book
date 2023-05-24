//in this program we are trying to find the total amount
public class Main{
  public static void main(String args[]){
    int amount={
      {100},
      {600,100},
      {800,900,60},
      {60,80,90,10}
    };
    int total=0;
    for(int i=0;i<amount.length;i++){
      for(int j=0;j<amount[i].length;j++){
        total+=amount[i][j];
      }
    }
    System.out.println("The total amount is %s.\n",total);
  }
}
