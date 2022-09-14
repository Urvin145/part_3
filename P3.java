
interface p {

    int id = 17;
    void printid(int x);
}
interface p1 extends  p{
    int rollno = 38;
    void printrollno(int y);

}

interface p2 extends p{
    int blockno = 50;
    void printblockno(int z );

}

interface p12 extends p1,p2{
    String name = "UrvinThummar";
    void printname( String w);
    void showid();
    void showrollno();
    void showblockno();

}

public class P3 implements  p12 {

    int a = 44, b = 22, c = 33;
    String n = "UrvinUrvin";

    public void printid(int x) {
        a = x;
        //System.out.println(x);
    }

    public void printrollno(int y) {
        b = y;
    }

    public void printblockno(int z) {
        c = z;
    }

    public void printname(String w) {
        n = w;
    }

    public void showid() {
        System.out.println("Using The Method ");
        System.out.println(a);
    }

    public void showrollno() {
        System.out.println(b);
    }

    public void showblockno() {
        System.out.println(c);
    }

    public void showname() {
        System.out.println(n);
    }

    public static void main(String[] args) {
        P3 obj = new P3();
        obj.printid(4);
        obj.printrollno(2);
        obj.printblockno(3);
        obj.printname("Urvin");
        obj.showid();
        obj.showrollno();
        obj.showblockno();
        obj.showname();
        System.out.println("Using The Constant ");
        System.out.println(id);
        System.out.println(rollno);
        System.out.println(blockno);
        System.out.println(blockno);
        System.out.println(name);
    }
}
