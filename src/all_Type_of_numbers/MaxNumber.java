package all_Type_of_numbers;

public class MaxNumber 
{
public static void main(String[] args) 
{
	int no=123456789;
	int max=0;
	while(no!=0)
	{
		int rem = no%10;
		if(rem>max)
		{
			max=rem;
		}
		no=no/10;
	}
	System.out.println(max);
}
}
