package rolodex;

public class RolodexAddress {
   private final String street;
   private final String city;
   private final String state;
   private final String zipCode;

   public RolodexAddress(String street, String city, String state, String zipCode) {
      this.street = street;
      this.city = city;
      this.state = state;
      this.zipCode = zipCode;
   }

   public String getStreet() {
      return(street);
   }

   public String getCity() {
      return(city);
   }

   public String getState() {
      return(state);
   }

   public String getZipCode() {
      return(zipCode);
   }

   public String getFullAddress() {
      return(street + "\n" + city + ", " + state + "  " + zipCode);
   }

   public void print() {
      System.out.println(street);
      System.out.println(city + ", " + state + "   " + zipCode);
   }
}