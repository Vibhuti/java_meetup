import ioutils.*;
import shapes.*;

public class Area {
     public static void main(String[] args) {
          int length = Console.readInt("Enter Rectangle Length: ");
          int width = Console.readInt("Enter Rectangle Width: ");
          Rectangle rect = new Rectangle(length, width);
          System.out.println("The area is: " + rect.getArea());
     }
}
