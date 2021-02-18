import java.util.Scanner;

public class ForSum {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int k=n;
		for(k=1;k<=n;k++) {
			sum+=k;
		}
		
		System.out.println("sum of first "+n+" numbers is: "+sum);
		sc.close();
	}

}
