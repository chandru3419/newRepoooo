package all_Type_of_numbers;

public class SumOfGivenNumber
{
	public static void main(String[] args)
	{
		int no=3419;
		int sum=0;
		while(no!=0)
		{
		int rem = no%10;
		sum=sum+rem;
		no=no/10;
		}
		System.out.println(sum);
	}
	
}
