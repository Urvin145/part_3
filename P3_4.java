public class P3_4 {

        //defining a method
        void run(){System.out.println("Vehicle is running");}
    }

    class Bike2 extends P3_4{
        //defining the same method as in the parent class
        void run(){System.out.println("Bike is running safely");}

        public static void main(String args[]){
            Bike2 obj = new Bike2();//creating object of child class
            obj.run();

            P3_4 obj1 =new P3_4(); //creating parent of child class
            obj1.run();
        }
    }

