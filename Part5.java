import java.util.Scanner;

public class Part5 {

	public void partfive( ) {
		System.out.println("The coffee, which has now grown arms and legs and has grown to the size of King Kong, is now climbing up the side of the buliding.");
		System.out.println("(1) You say 'Fuck it' and fly to Starbucks to get a new coffee       (2) Fly after the massive coffee and strike it down saving the world.");
		
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		System.out.println("");
		Part6 part = new Part6();
		
		
		if (a == 1) {
			part.partsix();
		}
		
		else if (a == 2) {
			part.part6v2();
		}
	}

	public void part5v3() {
		System.out.println("You strike down the monstrous coffee and save the world.");
		System.out.println("");
		Part6 part = new Part6();
		part.part6v2();
		
	}
}
