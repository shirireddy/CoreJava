import java.util.Scanner;

public class DemoDoWhile1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int number=0;
		do {
			sum+=number;
			System.out.println("enter a number");
			number=sc.nextInt();
			
		} while(number>=0); 
		System.out.println("SUM: "+sum);
		sc.close();
	}

}
