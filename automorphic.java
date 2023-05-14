import java.util.*;
import java.lang.*;
public class automorphic{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		long input=c.nextInt();
		if((input*input)%Math.pow(10,String.valueOf(input).length())==input)
		{
			System.out.println("The number is automorphic");
		}
		else
		{
			System.out.println("The number is not automorphic");
		}
	}
}


/*

A number is called an automorphic number if and only if the square of the given number ends with the same number itself. For example, 25, 76 are automorphic numbers because their square is 625 and 5776, respectively and the last two digits of the square represent the number itself. Some other automorphic numbers are 5, 6, 890625, etc

*/