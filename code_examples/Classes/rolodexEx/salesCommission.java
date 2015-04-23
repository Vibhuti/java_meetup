import rolodex.*;

class SalesCommission {
   static final double commissionRate = 0.15;

   static public void main(String args[]) {
       RolodexName salesPerson = new RolodexName("Joe", "Salesman");
       RolodexName custName = new RolodexName("Bill", "Engineer");
       RolodexAddress custAddr = new RolodexAddress("12 First St.", "San Jose", "CA", "94032");
       RolodexCard customer = new RolodexCard(custName,custAddr);

       double totalSale = 1000.0;
       double commission = 0.0;

      commission = totalSale * commissionRate;

      System.out.println("Commission For: " + salesPerson.getFullName() +
                         " is: " + commission);
      System.out.println("\nCustomer: ");
      customer.print();
   }
}
      
