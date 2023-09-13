import java.util.Scanner;
public class EnumTest {
    public static void main(String args[]){
      Scanner input=new Scanner(System.in);
      System.out.println("Enter a size:\n(SMALL),(MEDIUM),(LARGE),(EXTRA_LARGE)");
      String s=input.next().toUpperCase();
      Size size=Enum.valueOf(Size.class, s);
     System.out.println("Size="+size);
     System.out.println("abbreviation="+size.getAbbreviation());
     if(size==Size.EXTRA_LARGE){
        System.out.println("Are you a fat person lol");
     }
    }
}
enum Size{
    SMALL("S"),MEDUIM("M"),LARGE("L"),EXTRA_LARGE("XL");
    private Size(String abbreviation){
        this.abbreviation=abbreviation;
    }
    public String getAbbreviation(){
        return abbreviation;
    }
    private String abbreviation;
}
