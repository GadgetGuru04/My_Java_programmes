import java.util.Scanner;
public class OddEven
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Number:");
	int n = sc.nextInt();
	OddEven(n);
	}
	public static void OddEven(int n)
	{
	if (n%2==0)
	System.out.println("Even");
	else
	System.out.println("Odd");
	}
}