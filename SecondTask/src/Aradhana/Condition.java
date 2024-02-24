package Aradhana;

public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 0;
		int c = a%2;
		System.out.println("Remainder is  "+c);
		
		if(a==0) {
			System.out.println("A is neither odd nor even");
		}
		else if(c==0)  {
			System.out.println("A is even" );
		}
		else {
			System.out.println("A is odd");
		}

	}

}
