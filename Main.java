import myPack.*;
public class Main
{
    public static void main(String[] args)
    {
        ArraysAsList a=new ArraysAsList();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.display();
        a.delete();
        a.add(7);
        a.add(8);
        a.display();
    }
}