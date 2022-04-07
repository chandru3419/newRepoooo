package numberOfOccuranceProgram;

import java.util.HashSet;

public class words 
{
public static void main(String[] args) 
	{
	String s="hi hello hello hi";
	String[] s1 = s.split(" ");
	HashSet<String> set = new HashSet<String>();
	
	for(int i=0;i<s1.length;i++)
	{
		set.add(s1[i]);
	}
	for(String word:set)
	{
		int count=0;
		for (int j = 0; j < s1.length; j++) 
		{
			if (word.equals(s1[j]))
			{
				count++;
			}
		}
		System.out.println(word+" "+count);
	}
	
	}
}
