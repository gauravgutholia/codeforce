import java.util.Scanner;
public  class Codeforce1
{
	public static void main(String [] args)
	{
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		if(a%2==0 && a>2)
		{
			System.out.println("YES");

		}
		else{
			System.out.println("NO");
		}
	}
}