import java.util.*;
public class gcd{
	public static void main(String[] args)
	{
		Scanner c = new Scanner(System.in);
		int one = c.nextInt();
		int two = c.nextInt();
		int min=two;
		int gcd=-1;
		if(one<two)
		{
			min=one;
		}
		for(int i=1;i<=min;i++)
		{
			if((one%i)==0 && (two%i)==0)
			{
				if(i>gcd)
				{
					gcd=i;
				}
			}
		}

		System.out.println("("+one+","+two+")=>"+gcd);
	}
}


/*
Question:

GCD(2, 4) => 2

GCD(1, 5) => 1

GCD(3, 6) => 3

GCD(4, 12) => 4

GCD(6, 14) => 2

*/