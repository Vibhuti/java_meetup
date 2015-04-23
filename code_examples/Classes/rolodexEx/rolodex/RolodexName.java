package rolodex;

public class RolodexName {
   private final String firstName;
   private final String lastName;

   public RolodexName(String firstName, String lastName) {
      this.firstName = firstName;
      this.lastName = lastName;
   }

   public String getFirstName() {
      return(firstName);
   }

   public String getLastName() {
      return(lastName);
   }

   public String getFullName() {
      return(firstName + " " + lastName);
   }

   public void print() {
	System.out.println(getFullName());
   }
}