public class DogAgeCalculator {
   static final int ageConvFactor = 7;

   public static void main(String args[]) {
	String name;
	int dogYears, humanYears;

	name = Console.readLine("Dog's Name: ");
	dogYears = Console.readInt(name + "'s age: ");
	humanYears = dogToHumanYears(dogYears);
	System.out.println(name + "'s age in human years: " + humanYears);
   }

   static int dogToHumanYears(int dogYears) {
	return(dogYears * ageConvFactor);
   }
}
