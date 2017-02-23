import java.util.Scanner;

public class stringReplace {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		//sc.nextLine();
		System.out.println("Enter Replaced String ");
		String replaced=sc.nextLine();
		System.out.println(s.replaceAll(replaced, ""));
	//	for()
	}
}
