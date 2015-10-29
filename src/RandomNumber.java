import java.util.Scanner;
public class RandomNumber
{
	Scanner input = new Scanner(System.in);
	public int GetANumber()
	{
		int number;
		number = (int)(Math.random() * 10 ) + 1;
		return number;
	}
	
	public int GetANumber(int high)
	{
		int number;
		number = (int)(Math.random() * high ) + 1;
		return number;
	}
	
	public int GetANumber(int high, int low)
	{
		int range = (high - low) + 1;     
		return (int)(Math.random() * range) + low;
	}
	
	public int SetLowNumber(int low)
	{
		int number1;
		System.out.print("Enter a lower limit: ");
		number1 = input.nextInt();
		return number1;
	}
	
	public int SetHighNumber(int high)
	{
		int number2;
		System.out.print("Enter a higher limit: ");
		number2 = input.nextInt();
		return number2;
	}

}
