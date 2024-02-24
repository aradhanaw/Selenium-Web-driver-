package Me;

import org.testng.annotations.Test;

public class Second {
	public static int a=10;
	
	@Test
	public static void login() {
	System.out.println("This is login funx" );
	System.out.println("The value of a is: " +a);
	
	Testing obj = new Testing();
	obj.Addinfo();
	}

}
