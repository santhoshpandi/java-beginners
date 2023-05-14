import java.util.*;
public class swap_two_numbers_without_another_variable{
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int x=c.nextInt(); //x=6
		int y=c.nextInt(); //y=9
		System.out.println("Before swap x => "+x+" , y => "+y);
		x=x*y;  //x=54
		y=x/y;  //y=54/9=6
		x=x/y;  //x=54/6=9
		System.out.println("After swap x => "+x+" , y => "+y);

	}
}