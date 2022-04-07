package numberOfOccuranceProgram;

import java.util.HashSet;

public class other 
{
	public static void main(String[] args) {
		int a[]={10,20,30,400,50,10,220,30,400,50};
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<a.length;i++){
			set.add(a[i]);
		}
		for(Integer no:set)
		{
			int count=0;
			for (int j = 0; j < a.length; j++) 
			{
				
				if (no==a[j]) 
				{
					count++;
				}
			}
			System.out.println(no+" "+count);
		}
	}
}
