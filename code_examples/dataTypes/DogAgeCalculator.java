import java.util.*;

public class DogAgeCalculator {
	public static final int ageConvFactor = 7;

	public static void main(String args[]) {
                Scanner stdin;
		String name;
		int dogYears, humanYears;

                stdin = new Scanner(System.in);
                System.out.println("Dog's Name: ");
		name = stdin.nextLine();
                System.out.println(name + "'s age: ");
		dogYears = stdin.nextInt();
		humanYears = dogToHumanYears(dogYears);
		System.out.println(name + "'s age in human years: " + 
					humanYears);
                stdin.close();
	}

	static int dogToHumanYears(int dogYears) {
		return(dogYears * ageConvFactor);
	}
}
