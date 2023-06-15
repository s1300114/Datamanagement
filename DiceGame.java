import java.util.Random;
import java.util.Scanner;

class DiceGame{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();

	System.out.println("What is your name?");
	String name = sc.nextLine();
	System.out.println("Hello, " + name + "!");
	
	int dice1 = rand.nextInt(7) + 1;
	int dice2 = rand.nextInt(7) + 1;
	int total = dice1 + dice2;

	System.out.println("Rolling dice...");
	System.out.println("Die 1: " + dice1);
	System.out.println("Die 2: " + dice2);
	System.out.println("Total value: " + total);
    }

}
