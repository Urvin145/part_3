import java.util.Scanner;

public class Rectangle extends Geometricobject {
    Scanner sc = new Scanner(System.in);
  //  System.out.println("enter the width and height :");
    double  w = sc.nextInt();
    double h = sc.nextInt();

   // Rectangle(){}
//    Rectangle(double w,double h){
//
//    }
//    Rectangle(double w,double h,String color,boolean filled){
//
//    }

//    public double getW() {
//        return w;
//    }
//
//    public void setW(int w) {
//        this.w = w;
//    }
//
//    public double getH() {
//        return h;
//    }
//
//    public void setH(int h) {
//        this.h = h;
//    }
    public double getArea()
    {
       return w * h;
    }
       public  double getPerimeter()
    {
        return 2*(w+h);
    }
}
