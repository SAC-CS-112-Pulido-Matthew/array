
public class RandomNumber
{
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
}
