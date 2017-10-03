import java.util.Scanner;

public class Part3 {
	
	public void partthree() {
		System.out.println("You hear glass breaking in your kitchen.");
		System.out.println("(1) You go to see what it was       (2) Call the police");
		
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		System.out.println("");
		
		Part4 part = new Part4();
		
		if (a == 1) {
			part.partfour();
		}
		
		else if (a == 2) {
			part.part4v2();
		}
	}
	
	public void part3v2() {
		System.out.println("You stumble across a broken window in your kitchen and hear large footsteps out your window.");
		System.out.println("(1) Grab a quidditch broom and chase the bastard who stole your delicious beverage       (2) Jump head first out the window and embrace the sweet kiss of death ");
		
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		System.out.println("");
		Part5 part = new Part5();
		
		if (a == 1) {
			part.partfive();
		}
		
		else if (a == 2) {
		System.out.println("");	
		System.out.println("You, the world's only saviour die because you never got a cup of coffee...");
		System.out.println("Thanks for Playing!");
		
		}
	}
	
}
