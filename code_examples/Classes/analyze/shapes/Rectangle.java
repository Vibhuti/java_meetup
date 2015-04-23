package shapes;

public class Rectangle {
    private int length, width;

    public Rectangle() {
         length = 0;
         width = 0;
    }

    public Rectangle(int len, int wid) {
         length = len;
         width = wid;
    }

    public int getArea() {
         return length * width;
    }
}
