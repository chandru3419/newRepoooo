package all_Type_of_numbers;

public class PallendromInArray 
{
	public static void main(String[] args)
	{
		int [] a={100,1001,3419,1111,1234};
		for(int i=0;i<a.length;i++)
		{
			int no=a[i];
			int temp=no;
			int rev=0;
			
			while(temp!=0)
			{
				int rem = temp%10;
				rev=rev*10+rem;
				temp=temp/10;
			}
			if(a[i]==rev)
			{
				System.out.println(a[i]+" "+"its pallendrom");
			}
			else
			{
				System.out.println(a[i]+" "+"its not a pallendrom");
			}
		}
	}
}
