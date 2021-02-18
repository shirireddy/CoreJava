
public class DemoBreak {

	public static void main(String[] args) {
		int i;
		for(i=0;i<=10;i++) {
			if(i==5) {
				break; //it will not display 5
				//continue; it will skip 5 and print till 10
			}
			System.out.println(i);
		}

	}

}
