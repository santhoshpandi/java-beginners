import java.util.*;
public class spiral_matrix{
	public static void main(String[] args) {
		Scanner c= new Scanner(System.in);
		int n=c.nextInt();
		int[][] a = new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				a[i][j]=c.nextInt();
		int cnt=0;
		int rowmin=0,rowmax=n-1,colmin=0,colmax=n-1;
		boolean rowminf=true,colminf=true,rowmaxf=false,colmaxf=false;
		while(cnt!=(n*n))
		{
			if(rowminf&&colminf)
			{
					
					for(int j=colmin;j<=colmax;j++)
					{
						System.out.print(a[rowmin][j]+",");
						cnt+=1;
						
					}
					colminf=false;
					colmaxf=true;
					rowmin+=1;

			}
			else if(rowminf&&colmaxf)
			{

				for(int i=rowmin;i<=rowmax;i++)
				{
					System.out.print(a[i][colmax]+",");
					cnt+=1;
				}
				rowminf=false;
				rowmaxf=true;
				colmax-=1;
			}
			else if(rowmaxf&&colmaxf)
			{
				for(int i=colmax;i>=colmin;i--)
				{
					System.out.print(a[rowmax][i]+",");
					cnt+=1;
				}
				colmaxf=false;
				colminf=true;
				rowmax-=1;
			}
			else
			{
				for(int i=rowmax;i>=rowmin;i--)
				{
					System.out.print(a[i][colmin]+",");
					cnt+=1;
				}
				rowmaxf=false;
				rowminf=true;
				colmin+=1;
			}
		}
	}
}


/*

write a program to print the spiral matrix

Input:
number of dimensions: 4                                                                                                                      

1 2 3 4                                                                                                                
5 6 7 8                                                                                                                
9 10 11 12                                                                                                             
13 14 15 16

output:
1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10,

*/