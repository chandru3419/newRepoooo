package all_Type_of_numbers;

public class NumberPallendrom 
{
	public static void main(String[] args) 
	{
		int no=1001;
		int temp=no;
		int rev=0;
		while(temp!=0)
		{
			int rem = temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(no==rev)
		{
			System.out.println("its pallendrom");
		}
		else
		{
			System.out.println("its not a pallendrom");
		}
	}
}
