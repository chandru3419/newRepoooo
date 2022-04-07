package reversePrograms;

public class reversOnlyLastAndFirst
{
public static void main(String[] args) 
{
	
	String s="hi hello how are you ";//you hello how are hi
	String[] s1 = s.split(" ");
	//int  a=s1.length-1;
	for (int j = 0; j < s1.length; j++) 
	{
		String temp=s1[0];
		s1[0]=s1[s1.length-1];
		s1[s1.length-1]=temp;
		System.out.print(s1[j]+" ");	
	}
	
}
}
