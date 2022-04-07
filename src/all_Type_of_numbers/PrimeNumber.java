package all_Type_of_numbers;

public class PrimeNumber 
{
	public static void main(String[] args)
	{
		int no=5;
		int i=2;
		while (i<=no)
		{
			if (no%i==0)
			{
				break;
			}
			else
			{
			i++;	
			}
		}
		if (no==i) 
		{
			System.out.println(no+" its a prime number");
		}
		else
		{
			System.out.println(no+" its not a prime");
		}
	}
}
