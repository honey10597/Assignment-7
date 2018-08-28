import java.util.*;
public class string_to_int3
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String k=sc.next();
		int a=Integer.parseInt(s);
		int b=Integer.parseInt(k);
		System.out.println("first no. is : "+a);
		System.out.println("second no. is : "+b);
		base z=new base();
		z.great(a,b);
		int p=z.great(a,b);
		System.out.println(p+" is greater");
	}
}
class base
{
	public int great(int a,int b)
	{
		if(a>b)
			return a;
		else
			return b;
	}
}