package rolodex;

public class RolodexTest {
   
   static public void main(String args[]) {
	RolodexName name = new RolodexName("Bill", "Clinton");
	RolodexAddress addr;
	RolodexContactInfo contactInfo;
	RolodexCard businessCard;

	name = new RolodexName("Wyle", "Coyote");
	addr = new RolodexAddress("17 First St.", "San Jose", "CA", "93024");
	contactInfo = new RolodexContactInfo("408-213-7390","408-678-2139",
		"wyle@hotmail.com", "408-456-7890");

	businessCard = new RolodexCard(name,addr,contactInfo);
	businessCard.print();
       
   }
}
      
