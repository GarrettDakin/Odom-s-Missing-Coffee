import java.util.Scanner;

public class Part4 {

	public void partfour() {
		System.out.println("You find your window broken, but... you live on the 12th floor!");
		System.out.println("(1) Grab a quidditch broom and chase the bastard who stole your delicious beverage       (2) Jump head first out the window and embrace the sweet kiss of death ");
		
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		System.out.println("");
		Part5 part = new Part5();
		Part6 part2 = new Part6();
		
		if  (a == 1) {
			part.partfive();
		}
		else if (a == 2) {
			part2.part6v3();
		}
	}
	
	public void part4v2() {
		System.out.println("The police are too busy fighting a King Kong-Sized coffee cup with arms and legs climbing up your building.");
		System.out.println("(1) Grab your quidditch broom and prepare for battle       (2) Cower in fear and hope that the police have this under control");
		
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		System.out.println("");
		
		Part5 part = new Part5();
		Part6 part2 = new Part6();
		
		if (a == 1) {
			part.part5v3();
		}
		else if (a == 2 )
			part2.part6v3();
	}
	
}
