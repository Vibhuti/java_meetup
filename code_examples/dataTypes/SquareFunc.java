import javax.swing.*;   //this line needed to obtain the JOptionPane class

public class SquareFunc {
    public static void main(String[] args) {
        double num, result;
        String numStr = JOptionPane.showInputDialog("Enter your number to square:");
 
        num = Double.parseDouble(numStr);
        result = num * num;
        System.out.println(num + " squared = " + result);
        System.exit(0);
    }
}
