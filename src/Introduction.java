import java.io.File;
import java.io.IOException;
import java.util.*;

public class Introduction {
public static void intro() throws IOException {
	System.out.println("Welcome! Please write your currency.");
	System.out.println("What is the purchase price?");
	Scanner userInput = new Scanner(System.in);
	int price = userInput.nextInt();
	System.out.println("How much money was given?");
	int given=userInput.nextInt();
	Scanner file=new Scanner(new File("Currency.txt"));
	int times=file.nextInt();
	int change= price-given;
	
	
	//often
	
	System.out.println(change);
}
}
