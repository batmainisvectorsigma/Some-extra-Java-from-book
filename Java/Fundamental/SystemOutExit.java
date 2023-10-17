//Problem 
/*
You need to use for loop that is going to print numbers from 1 to 10 
and exit the program when i becomes equal to 0 using System.exit Method

*/
public class Main{
    public static void main(String args[]){
        for(int i=0;i<10;i+=1){
            System.out.println(i);
            if(i==5){
                System.exit(0);
            }
        }
    }
}
