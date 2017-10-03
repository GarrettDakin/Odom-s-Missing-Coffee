import java.util.Scanner;

public class Part2 {

	public void parttwo() {
		System.out.println("You see movement from the corner of your crusty morning eyes");
		System.out.println("(1) You go to investigate the movement.       (2) Ignore the movement and continue looking for your ice coffee");
		
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		System.out.println("");
		Part3 part = new Part3();
		
		if (a == 1) {
			part.partthree();
		}
		
		else if (a == 2) {
			part.part3v2();
		}
	}
	
	public void part2v2() {
		System.out.println("You are satisfied with your new coffee, but you will always wonder where your first coffee went.");
		
	}
	
}
