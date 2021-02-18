import java.util.Scanner;
public class GreatestTwo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 2 numbers");
		int first=sc.nextInt();
		int second=sc.nextInt();
		if(first>second) 
		{
		System.out.println("the greatest number is: "+first);
	}
		else
			System.out.println("the greatest number is: "+second);
		sc.close();

}
}
