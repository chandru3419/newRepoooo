package reversePrograms;

import org.testng.annotations.Test;

public class LargestPalInGivenArray 
{
	@Test
	public void largestPal()
	{
		String [] s={"jaja","malayalam","shekhar","gadag","mom"};
		int maxlength = 0;
		for (int i = 0; i < s.length; i++) 
		{
			String wr = s[i];
			String rev="";
			for (int j = wr.length()-1; j >=0; j--) 
			{
				rev=rev+wr.charAt(j);
				if(rev.equals(wr))
				{
					if(rev.length()>maxlength)
					{
						maxlength=rev.length();
					}
				}
			}
		}
			for (int j = 0; j < s.length; j++) 
			{
				if (maxlength==s[j].length())
				{
				System.out.println(s[j]+" "+maxlength);	
				}
			}
		}
	}

