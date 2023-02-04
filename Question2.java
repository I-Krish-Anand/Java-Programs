import java.util.Scanner;
class Question2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[]arr=new int[N];
        for(int i=0;i<N;i++)
            arr[i]=sc.nextInt();
        int X=sc.nextInt();
        int Y=sc.nextInt();
        for(int i:arr)
        {
            if(i>X && i<Y)
                System.out.print(i+" ");
        }
    }
}
