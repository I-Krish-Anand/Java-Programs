import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int limit=sc.nextInt();
        System.out.println("Multiplication Table\n");
        for(int i=1;i<=limit;i++)
            System.out.println(n+"*"+i+"="+n*i);

        System.out.println("\nSubtraction Table\n");

        for(int i=n;i<=limit;i++)
         System.out.println(i+"-"+n+"="+(i-n));


    }
}