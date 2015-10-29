
public class RandomNumber
{
	public int GetANumber(int high)
	{
		int number;
		number = (int)(Math.random() * high ) + 1;
		return number;
	}
}
