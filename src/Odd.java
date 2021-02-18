import java.util.Scanner;

public class Odd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int k=sc.nextInt();
		if(k%2==0) {
			System.out.println("the number is even");
		}
		else
			System.out.println("the number is odd");
		sc.close();
	}

}
