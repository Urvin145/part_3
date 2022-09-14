
    interface Drawable{
        void draw();
        default void msg(){System.out.println("default method");}
    }
    class Rectangle1 implements Drawable{
        public void draw(){System.out.println("drawing rectangle");}
    }
    public class P3_7 {
        public static void main(String args[]){
            Drawable d=new Rectangle1();
            d.draw();
            d.msg();
        }}

