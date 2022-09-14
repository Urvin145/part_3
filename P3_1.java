import java.util.Scanner;

public class P3_1 {
    public static void main(String [] args) {

        System.out.println("enter the radius :");
        Geometricobject objCircle = new Circle();

        System.out.println("enter the width and height :");
        Geometricobject objRect = new Rectangle();


        if( objCircle.getArea() > objRect.getArea())
        {
            System.out.println(objCircle.getArea());
            System.out.println("Circle area is Greater");
        }
       else{
            System.out.println(objRect.getArea());
            System.out.println("Rectangle area is Greater");
        }

        if( objCircle.getPerimeter() > objRect.getPerimeter())
        {
            System.out.println(objCircle.getPerimeter());
            System.out.println("Circle Perimeter is Greater");
        }
        else{
            System.out.println(objRect.getPerimeter());
            System.out.println("Rectangle Perimeter is Greater");
        }
    }
}
