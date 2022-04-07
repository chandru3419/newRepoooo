package all_Type_of_numbers;

public class PrimeNumbersInRange 
{
	public static void main(String[] args) 
	{
		for (int j = 2; j <=100; j++)
		{
			int no=j;
			int i=2;
			while(i<=no)
			{
				if(no%i==0)
				{
					break;
				}
				else
				{
					i++;
				}


				if(i==no)
				{
					System.out.println(no+" its a prime number");
				}

			}


		}
	}
}

