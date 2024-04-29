/*  Create a class to print the area of a square and a rectangle. The class has two methods 
with the same name but different number of parameters. The method for printing 
area of a rectangle has two parameters which are length and breadth respectively 
while the other method for printing area of square has one parameter which is side 
of square          */ 




import java.util.Scanner;

public class Q22_SquareAndRectangleExample {

   
    public void calculateArea(int length, int breadth) 
    {
        int area = length * breadth;
        
        System.out.println("Area of rectangle: " + area);
    }

    
    public void calculateArea(int side) {
        int area = side * side;
        System.out.println("Area of square: " + area);
    }

    
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        Q22_SquareAndRectangleExample calculator = new Q22_SquareAndRectangleExample();

        System.out.println("Enter the length and breadth of rectangle: ");
        
        int length = scanner.nextInt();
        int breadth = scanner.nextInt();
        
        calculator.calculateArea(length, breadth); 

        System.out.println("Enter the side of square: ");
        
        int side = scanner.nextInt();
        
        calculator.calculateArea(side); 

       
    }
}
