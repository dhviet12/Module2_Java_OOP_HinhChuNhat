import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width");
        double width = scanner.nextDouble();
        System.out.print("Enter the height");
        double height = scanner.nextDouble();
        Rectangle myRectangle = new Rectangle(width,height);
        System.out.println( myRectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ myRectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ myRectangle.getArea());
    }
}
