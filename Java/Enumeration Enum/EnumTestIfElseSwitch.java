//program that let's you give holiday based on your day
import java.util.Scanner;
enum Day{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
}
public class EnumTestIfElseSwitch {
    public static void main(String args[]){
        System.out.println("You are geeting holday only on Satuday \n Enter today's Day");
        Scanner input=new Scanner(System.in);
        String day=input.nextLine().toUpperCase();
        String d1=(Day.SATURDAY).toString();
        if(day.equals((Day.SATURDAY).toString())){
            System.out.println("You got the holiday");
            System.out.println(d1);
            System.out.println(Day.SUNDAY);
        }
        else{
            System.out.println("Wow! Hardworking programmer lets's work");
        }
    }
}
