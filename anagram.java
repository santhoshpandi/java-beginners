import java.util.*;
public class anagram{
	public static void main(String[] args)
	{
		Scanner c =new Scanner(System.in);
		String i1=c.nextLine().toUpperCase();
		String i2 = c.nextLine().toUpperCase();
		char[] ii1 =i1.toCharArray();
		char[] ii2 = i2.toCharArray();
		Arrays.sort(ii1);
		Arrays.sort(ii2);
		if(String.valueOf(ii1).trim().equals(String.valueOf(ii2).trim()))
		{
			System.out.println("These strings are anagram");
		}
		else
		{
			System.out.println("These strings are not anagram");
		}
	}
}

/*

Question:
Enter first string (empty to exit): silence
Enter second string: license
These strings are anagrams.

Enter first string (empty to exit): licenses
Enter second string: silence
These strings are not anagrams.

Enter first string (empty to exit): William Shakespeare
Enter second string: I am a weakish speller
These strings are anagrams.

*/