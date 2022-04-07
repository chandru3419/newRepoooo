package reversePrograms;

public class reverseCharacterNotPosition
{
	public static void main(String[] args) 
	{
		String s="hi hello how are you";
		String[] s1 = s.split(" ");
		for (int i = 0; i < s1.length; i++) 
		{
			String wr = s1[i];
			for (int j =wr.length()-1; j>=0; j--)
			{
				System.out.print(wr.charAt(j));
			}
			System.out.print(" ");
		}

	}
}
