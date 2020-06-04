import java.util.Scanner;
public class Codeforce2
{
	public static void main(String[]args)
	{
         Scanner in=new Scanner(System.in);
         int n = in.nextInt();
         int a=0;
         int b=0;
         for(int i=0; i<=n-1; i++)
         {
            char l =in.next().charAt(0);
            if(l=='A')
            {
               a++;
            }
            else
            {
            	b++;
            }

            
         }
         if(a>b)
         {
         	System.out.println("Anton");
         }
         else if(a==b)
         {
         	System.out.println("Friendship");
         }
         else
         {
         	System.out.println("Danik");
         }

	}
}