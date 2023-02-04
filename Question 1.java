import java.util.Scanner;

class Question1
 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),count=1;
        boolean flag=false;
        for(int i=1;i<=n;i++)
        {
            int temp=i;
            while (temp++<n)
                System.out.print(" ");

            while (count<=i*n)
            {
                flag=true;
                System.out.format("%-4s", count++);
            }

            while (!flag && count>(i-1)*n+1)
            {
                System.out.format("%-4s", --count);
            }

            flag=false;
            count+=n;
            System.out.println();
        }
    }
}