interface IPrinter
    {
        int Add();
    }
    interface IScanner
    {
        int multiply();
    }
    public class P3_2  implements IPrinter,IScanner
    {
        public int Add()
    {
        int sum=45+23;
        return sum;
    }
        public int multiply()
        {
            int result=45*78;
            return result;
        }
        public static void main(String[] args) {
            P3_2 obj1=new P3_2();
            System.out.println(obj1.Add());
            System.out.println(obj1.multiply());

        }
    }


