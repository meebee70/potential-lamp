package greeting_package;
import java.util.Random;
import java.util.Scanner;

public class GreetingMemberClass {

	static Random generator = new Random();
	final static int GREETING_COUNT = 4;
	
	/**
	public static void main(String[] args) {
		int seed = generateRandInt();
		String baseGreeting = generateGreeting(seed);
		String name = receiveNameInput();
		System.out.println(baseGreeting.replace("%s", name));
	}
	*/
	
	private static int generateRandInt() {
		Random generator = new Random();
		return generator.nextInt(GREETING_COUNT);
	}
	
	public static String generateGreeting(int seed) {
		String greeting = "";
		switch (seed) {
			case 0 :
				greeting = "Hello, %s.";
				break;
			case 1 :
				greeting = "Yo, what's up &s?";
				break;
			case 2 :
				greeting = "Greeting and salutation oh illustrious %s, monarch of the ages!";
				break;
			case 3 :
				greeting = "Hi &s, how are you?";	
				break;
			default :
				greeting = "Do I know you?";
				break;
		}
		return greeting;
	}
	
	private static String receiveNameInput() {
		String name = "";
		System.out.println("Enter your name: \n");
		Scanner scn = new Scanner(System.in);
		name = scn.nextLine();
		return name;
	}
}
