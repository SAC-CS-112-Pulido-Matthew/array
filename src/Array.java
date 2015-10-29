import java.util.Scanner;
public class Array
{
	public static void main (String[] args)
	{
		int sizeGame = 10;
		int win = 0;
		int odd = 0;
		int even = 0;
		int [] oddCount =  new int [sizeGame];
		int [] evenCount = new int [sizeGame];
		int [] wins = new int [sizeGame];
		int [] computerNumber = new int [sizeGame];
		Scanner input = new Scanner (System.in);
		int [] guess = new int [sizeGame];
		int count = 0;
		RandomNumber set = new RandomNumber();
		int high = 0;
		int low = 0;
		high = set.SetHighNumber(high);
		low = set.SetLowNumber(low);
		for (int i = 0; i < wins.length; i++)
		{
			for (int j = 0; j < computerNumber.length; j++)
				{
					RandomNumber compNum = new RandomNumber();
					computerNumber[i] = compNum.GetANumber(high, low);	
				}
				count ++;
				//System.out.print(roll);	
				
				System.out.printf("You rolled a dice. Did the dice land on an odd or even number? '0' for odd '1' for even: ");
				guess[i] = input.nextInt();
				
				switch(guess[i])
				{
					case 0:
					{
						if (computerNumber[i] % 2 == 0)
						{
							System.out.printf("You guessed odd and the roll was %d. Fail.\n", computerNumber[i]);
							oddCount[i]++;
							wins[i] = 0;
							evenCount[i] = 0;
						}
						else
						{
							System.out.printf("You guessed odd and the roll was %d. Win.\n", computerNumber[i]);
							wins[i]++;
							oddCount[i]++;
							evenCount[i] = 0;
						}
						break;
					}
					case 1:
					{
						if (computerNumber[i] % 2 == 0)
						{
							System.out.printf("You guessed even and the roll was %d. Win.\n", computerNumber[i]);
							wins[i]++;
							evenCount[i]++;
							oddCount[i] = 0;
						}
						else
						{
							System.out.printf("You guessed even and the roll was %d. Fail.\n", computerNumber[i]);
							evenCount[i]++;
							wins[i] = 0;
							oddCount[i] = 0;
						}
						break;
					}
		
				}
				System.out.print("\n\n");
				
		}
		for (int i = 0; i < oddCount.length; i++)
		{
			if(wins[i] == 1)
				win++;
			if(oddCount[i] == 1)
				odd++;
			if (evenCount[i] == 1)
				even++;
		}
		System.out.printf("You won %d times out of 10.\n", win);
		System.out.printf("You guessed even %d time(s). And guessed odd %d time(s).\n", even, odd);
		
		for (int i = 0; i < evenCount.length; i++)
		{
			System.out.printf("(%d)" , (i + 1));
			System.out.printf("The computer guessed %d.", computerNumber[i]);
			if (guess[i] == 0)
			{
				System.out.print("You guessed odd.\n");
			}
			if (guess[i] == 1)
			{
				System.out.print("You guessed even.\n");
			}
		}
		System.out.printf("You played this game %d times!", count);
	}
}