import java.util.*;
public class Circle extends  Geometricobject {
    Scanner sc = new Scanner(System.in);
     //System.out.println("enter the radius :");
    double r = sc.nextInt();

//    public Circle(){}
//    public Circle(double r)
//    {
//
//    }
//    public Circle(double r,String color,boolean filled)
//    {
//
//    }

//    public double getR() {
//        return r;
//    }
//
//    public void  setR(double r) {
//        this.r = r;
//    }
//
//    public double getDiamater()
//    {
//        return 0;
//    }
    public double getArea() {

        return 3.14 *r*r;
    }
     public double getPerimeter()
    {
        return 2*3.14*r;
    }
}
