package csci1010.cadenaassign1;
import java.util.Scanner;
/**
 *
 * @author Adrian Cadena
 */
public class CadenaAssign1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to Adrian's geometry calculator.");//Welcome Message
        
        System.out.print("Enter the side of the square:"); //Message to ask for input for the square
        double squareSide = scanner.nextDouble();            //Will declare user input for squareSide
        //
        double squareArea = squareSide * squareSide; //Formula for area of a square
        double squarePerimeter = squareSide * 4 ; // Formula for square perimeter but instead of writing squareSide four times a (* 4) is added. 4= 4 square sides
        //
        System.out.println ("Area of the square: " + squareArea ); // Will print out results for area of the square
        System.out.println ("Perimeter of the square: " + squarePerimeter); //Will print out results for area of the square
        //
        System.out.print("Enter the length of the rectangle: "); // Message for length input for rectangle
        double rectangleLength = scanner.nextDouble();        // Will declare the user input to rectangleLength 
        //
        System.out.print("Enter the width of the rectangle: "); //message for input for width of rectangle
        double rectangleWidth = scanner.nextDouble();            // Will declare the user input for rectangleWidth
        //
        double rectangleArea = rectangleLength * rectangleWidth ; // Area formula for rectangle
        double rectanglePerimeter = (rectangleLength + rectangleWidth) * 2 ; // Perimeter for rectangle 
        System.out.println("Area of the rectangle: " +rectangleArea);        //Message with area displayed
        System.out.println("Perimeter of the rectangle: " + rectanglePerimeter);     // Message with perimeter displayed
        //
        System.out.print("Enter the base of the triangle: ");   // Message for triangle base 
        double triangleBase = scanner.nextDouble();           //Will declare input for triangleBase
        //
        System.out.print("Enter the height of the triangle: ");
        double triangleHeight = scanner.nextDouble ();         // Will declare input for triangleHeight
        //
        double triangleArea = (triangleBase * triangleHeight)/ 2; // Formula for triangleArea
        System.out.println("Area of the triangle: " + triangleArea);   // Will dispay the are of the triangle
        //
        scanner.close();
        
    }
}
