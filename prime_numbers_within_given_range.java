import java.util.*;
public class prime_numbers_within_given_range{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int start=c.nextInt();
		int end=c.nextInt();
		boolean flag=true; 
		for(int i=start;i<=end;i++)
		{
			flag=true;
			for(int j=2;j<=(i/2);j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag&&i!=1)
			{
				System.out.print(i+", ");
			}
		}
	}
}


/*

Program to print prime numbers in a given range

start=1
end=20

prime numbers within this ranges are  2,3,5,7,11,13,17,19

*/
