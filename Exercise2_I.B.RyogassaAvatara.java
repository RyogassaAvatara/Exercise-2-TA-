import java.util.Scanner;
public class Pattern 
{

	public static void main(String[] args) 
	{
		int Number;
		Scanner input=new Scanner(System.in);
		System.out.print("Height:");
		Number=input.nextInt();
		input.close();
		for(int i=0; i<Number; i++)
		{
			for(int j=0; j>i; j--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}

	}
}
