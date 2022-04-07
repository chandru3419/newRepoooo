package reversePrograms;

public class SecondMaxWithoutLoop 
{
	public static void main(String[] args)
	{
		int[] a={8,40,46,78,58,34,19,69};
		int fmax=a[0];
		int smax=0;
		int tmax=0;
		for(int i=1;i<a.length;i++)
		{
			if(fmax<a[i])
			{
				smax=fmax;
				fmax=a[i];
				
			}else{
				if (smax<a[i]) 
				{
					smax=a[i];
				}
			}
		}
		System.out.println(smax);
	}
}
