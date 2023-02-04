import java.util.Scanner;

class Question4 {
     public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         String a=sc.next();
         String b=sc.next();
         String temp="";
         for(int i=0;i<a.length();i++)
         {
             int asciiSum= ((a.charAt(i)+(b.charAt(i)-96))%122);
             if(asciiSum<97)
                 asciiSum+=96;
             temp+=(char)asciiSum;
         }
         System.out.println(temp);
     }
}
