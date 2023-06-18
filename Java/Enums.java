/**
*Here I am writing programs related to enums
*
*
*
*/
import java.util.*;
enum Size{
  SMALL("S"),MEDIUM("M"),LARGE("L"),EXTRA_LARGE("XL");
  private Size(String abbreviation){
    this.abbreviation=abbreviation;
  }
  public String getAbbreviation(){
    return abbreviation;
  }
  private String abbreviation;
}
public class Practiceone{
  public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    System.out.println("Enter a size :\t(SMALL)(MEDIUM)(LARGE)(EXTRA_LARGE)");
    String input=in.next();
    Size size=Enum.valueOf(Size.class, input);
    System.out.println("abbreviation= "+size.getAbbreviation());
    if(size==Size.EXTRA_LARGE){
      System.out.println("Good job you paid attention to the lecture");
    }
  }
}

/*
Description of the above program
First lets check the Practiceone class
Here programs asks the use to enter a size 
the entered size gets stored to input
and then returns the name of enumerated constant and gets stored to size 
*/
/*
More explaination of the program
Size ---- class
class has exactly four instances
not possible to create object of size
This is the reason we never use equals for values of enumerated types
Simply use == to compare them 
inside the class you can add 
     constructors,methods,fields to an enumerated type
The constructors are only called when the enumerated constants are constructed.
All enumerated types are subclasses of the class Enum
   That is for example For Day, 
                               Sunday,Moday,Tuesday,Wednesday,Thursday,Friday,Saturday
and these classes inherits number of methods from that class.
Most useful is toString, which returns the name of the enumerated constants

For example, Size.SMALL.toString() returns the String "SMALL"
The converse of it is 
The converse of toString is the static valueOf method.                               
The Statement.                               
Size s=Enum.valueOf(Size.class,"SMALL");                               
  Sets s to Size.SMALL


#Return all the value of the enumeration
Size[] values=Size.values();

#Return the position of the enumeration constants
The ordinal method gives the position of an enumerated constant in the enum declaration counting from zero
For example:
Size.MEDIUM.ordinal() returns 1 in our above program 
*/
