import java.util.*;
public class pyramid{
	public static void main(String[] args) {
		Scanner c= new Scanner(System.in);
		int n=c.nextInt(); int cnt=0;
		for(int i=1;cnt<n;i=(cnt*2)+1)
		{
			for(int j=0;j<(((n-1)*2)+1-i)/2;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			cnt+=1;
			System.out.println();
		}
	}
}


/*

Program to print pyramid pattern using stars

4

   *
  ***
 *****
*******

*/