import java.util.*;
public class lcm{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int x=c.nextInt();
		int y=c.nextInt();
		int lcm=0;
		int max=x,temp=x;
		if(y>max)
			max=y;
			temp=y;
		while(true)
		{
			if(max%x==0&&max%y==0)
			{
				lcm=max;
				break;
			}
			else{
				max+=temp;
			}
		}

		System.out.println("Lcm ("+x+","+y+") => "+lcm);

	}
}


/*
	LCM of 15 and 20 is 60, and LCM of 5 and 7 is 35

*/