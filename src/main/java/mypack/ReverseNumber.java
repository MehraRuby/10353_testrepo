package mypack;

public class ReverseNumber 
{
	public static long reverse(long num)
	{
		long temp=0,r;
		while(num!=0)
		{
			r = num %10;
			temp = temp*10 + r;
			num = num / 10;							
		}
		return temp;		
	}
}


