import javax.swing.*;   //this line needed to obtain the JOptionPane class

public class GetName {
       public static void main(String[] args) {
               String name = JOptionPane.showInputDialog("Enter your name:");
               System.out.println("You are " + name);
               System.exit(0);
       }
}
