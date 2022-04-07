package reversePrograms;

public class csscorp2
{
	public static void main(String[] args) 
	{
		String s="my name is ok";
		/*	String s1 = s.replace(" ", "");
			System.out.println(s1);
			for (int i = s1.length()-1; i >=0; i--) 
			{
				System.out.print(s1.charAt(i));
			}
			*/
		for (int i = s.length()-1; i >=0; i--) 
		{
			System.out.print(s.charAt(i));
		}	
	}
}
