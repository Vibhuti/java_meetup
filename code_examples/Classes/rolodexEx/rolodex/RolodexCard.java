package rolodex;

public class RolodexCard {
   private final RolodexName name;
   private final RolodexAddress address;
   private final RolodexContactInfo contactInfo;

   public RolodexCard(RolodexName name, RolodexAddress address, RolodexContactInfo contactInfo) { 
      this.name = name;
      this.address = address;
      this.contactInfo = contactInfo;
   }

   public RolodexCard(RolodexName name, RolodexAddress address) { 
      this.name = name;
      this.address = address;
      this.contactInfo = null;
   }

   public RolodexName getName() {
      return(name);
   }

   public RolodexAddress getAddress() {
      return(address);
   }

   public RolodexContactInfo getContactInfo() {
      return(contactInfo);
   }

   public void print() {
	System.out.println("Name:");
	name.print();
	System.out.println("Address:");
	address.print();
        if (contactInfo != null) {
	   System.out.println("Contact Info:");
	   contactInfo.print();
        }
   }

}