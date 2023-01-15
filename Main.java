import myPack.*;
public class Main
{
    public static void main(String[] args)
    {
        //add(int value) to add elements in an array
        //delete(int index) to delete elements at specified index in an array
        ArraysAsList a=new ArraysAsList();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        a.delete(2);
        System.out.println(a);
    }
}