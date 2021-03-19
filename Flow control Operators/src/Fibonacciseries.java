
public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int b=2;
		System.out.println(a+""+b);
		int c;
		for(int i =1;i<=5;i++)
		{
			c = a+b;
			System.out.println(""+c);
			a=b;
			b=c;
			System.out.println("Fibonacciseries"+c);
		}

	}

}
