public class StringRev
{
public static void main(String args[])
	{
		String s1="Welcome to Java";
		String rev="";
		int n=s1.length();

		for(int i=n-1; i>=0; i--)
		{
			rev=rev+s1.charAt(i);
		}
		System.out.println(rev);
	}
}