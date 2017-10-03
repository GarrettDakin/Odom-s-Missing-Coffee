import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Odom's Missing Coffee");
        System.out.println("Type (1) to begin and type (2) to end");

        int a = input.nextInt();
        System.out.println("");
        
        Part1 part = new Part1();
        
        if (a == 1) {
        	part.partone();
        }
        else if (a == 2) {
        	part.part1v2();
        }
    }
}