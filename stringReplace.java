import java.util.Scanner;

public class stringReplace {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		System.out.println(s.replace('a','@'));		
	}
}
