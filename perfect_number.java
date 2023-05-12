import java.util.*;
public class perfect_number{
	public static void main(String[] args)
	{
		Scanner c = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<Integer>();
		int input = c.nextInt();
		int sum=0;
		for(int i=1;i<input;i++)
		{
			if(input%i==0)
			{
				a.add(i);
			}
		}
		for(int i:a)
		{
			sum+=i;
		}
		if(sum==input)
		{
			System.out.println("Perfect number");
		}
		else
		{
			System.out.println("Not a Perfect Number");
		}

	}
}

/*

Question:
Input: n = 15
Output: false
Divisors of 15 are 1, 3 and 5. Sum of 
divisors is 9 which is not equal to 15.

Input: n = 6
Output: true
Divisors of 6 are 1, 2 and 3. Sum of 
divisors is 6.

*/