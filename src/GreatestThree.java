import java.util.Scanner;

public class GreatestThree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the three numbers a,b,c");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && a>c) {
			System.out.println("a is the greatest");
		}
		else if(b>c) {
			System.out.println("b is the greatest");
		}
		else
			System.out.println("c is the greatest");
		sc.close();
	}

}
