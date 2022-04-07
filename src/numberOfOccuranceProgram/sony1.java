package numberOfOccuranceProgram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class sony1 
{
	public static void main(String[] args) 
	{
		String s="malayalam";	
		//LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		TreeSet<Character> set = new TreeSet<Character>();
		//HashSet<Character> set = new HashSet<Character>();
		for (int i = 0; i < s.length(); i++) 
		{
			set.add(s.charAt(i));
		}
		for (Character ch : set) 
		{
			int count=0;
			for (int i = 0; i < s.length(); i++) 
			{
				if (ch==s.charAt(i)) 
				{
				count++;	
				}
			}
			System.out.print(ch+" :"+""+count+" ");
		}
	}
}
