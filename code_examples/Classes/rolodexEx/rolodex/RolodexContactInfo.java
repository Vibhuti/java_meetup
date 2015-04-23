package rolodex;

public class RolodexContactInfo {
   private final String workPhone;
   private final String homePhone;
   private final String emailAddress;
   private final String faxNumber;

   public RolodexContactInfo(String workPhone, String homePhone, String emailAddress, 
                      String faxNumber) 
   {
      this.workPhone = workPhone;
      this.homePhone = homePhone;
      this.emailAddress = emailAddress;
      this.faxNumber = faxNumber;
   }

   public String getWorkPhone() {
      return(workPhone);
   }

   public String getHomePhone() {
      return(homePhone);
   }

   public String getEmailAddress() {
      return(emailAddress);
   }

   public String getFaxNumber() {
      return(faxNumber);
   }
  
   public void print() {
      System.out.println("Work Phone:\t" + workPhone);
      System.out.println("Home Phone:\t" + homePhone);
      System.out.println("Email Addr:\t" + emailAddress);
      System.out.println("FAX:\t" + faxNumber);
   }

}