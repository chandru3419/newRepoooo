package numberOfOccuranceProgram;

import java.util.HashSet;
import java.util.Iterator;

public class numbers
{
	public static void main(String[] args) 
	{
		int no=112233;
		int[] a=new int[6];
		int j=5;
		while(no!=0){
			int rem=no%10;
			
				a[j]=rem;
				j--;
			
			no=no/10;
	}
	HashSet<Integer> set = new HashSet<Integer>();
	for (int i = 0; i < a.length; i++) {
		set.add(a[i]);
	}
	for (Integer num : set) {
		int count=0;
		for (int i = 0; i < a.length; i++) {
			if(num==a[i]){
				count++;
			}
			
		}
		System.out.println(num+" "+count);
		
	}
	
		
	}
}
