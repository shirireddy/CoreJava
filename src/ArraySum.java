import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int[] array_sum=new int[size];
		System.out.println("enter the array elements");
		for(int i=0;i<array_sum.length;i++) {
			array_sum[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<array_sum.length;i++) {
			sum+=array_sum[i];
		}
		System.out.println("The sum of array elements is: "+sum);
		sc.close();
	}

}
