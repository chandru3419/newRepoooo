package numberOfOccuranceProgram;

public class duplicateWordInArray
{
	public static void main(String[] args) 
	{
		String a[]={"Test", "MyTester", "IsteSTing", "India", "Delhi", "Test", "SmartTEst"};
		int count=0;
		
		for (int i = 0; i < a.length; i++)
		{
			if (a[i].toLowerCase().contains("test")) 
			{
			count++;	
			System.out.println(a[i]);
			}
		}
		System.out.println(count);
	}
}
