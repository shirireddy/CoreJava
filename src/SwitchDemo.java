import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		int a,b,res;
	    String op;
	   Scanner   s=new Scanner(System.in);
	     System.out.println("Enter 2 numbers :");
	     a=s.nextInt();
	     b=s.nextInt();
	     System.out.println("enter the operator");
	     op=s.next();
	     switch(op) {
	     case "+": res=a+b;
	               System.out.println("the sum of a and b is: "+res);
	               break;
	     case "-": res=a-b;
	               System.out.println("the subtraction on a and b is: "+res);
	               break;
	     case "*": res=a*b;
	               System.out.println("the product of a and b is: "+res);
	               break;
	     case "/": res=a/b;
	               System.out.println("the quotient of a and b is: "+res);
	               break;
	     default: System.out.println("invalid data");
	     		  break;
	     }
	     s.close();
	}

}
