import java.util.Scanner;

public class SingleDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		if(a>=-9 && a<10) {
			System.out.println("the entered number is a single digit number");
		}
		else
			System.out.println("the entered number is not single digit number");
		sc.close();

	}

}
