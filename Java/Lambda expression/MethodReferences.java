//EXMAPLE NO : 1
//Showing the difference between using lambda expression and method references
import java.util.List;
import java.util.Arrays;

public class Main{
	public static void main(String args[]){
		List<String> names=Arrays.asList("Alice","Bob","Charlie");
		//Using Lambda:
		System.out.println("Using Lambda");
		names.forEach(name -> System.out.println(name));
		//Using Method References:
		System.out.println("\n Using method Reference:");
		names.forEach(System.out::println);
	}
}

/*
Using Lambda
Alice
Bob
Charlie

 Using method Reference:
Alice
Bob
Charlie
*/
// more examples will be added todayl
