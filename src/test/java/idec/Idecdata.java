package idec;

import org.testng.annotations.DataProvider;

	public class Idecdata {

	@DataProvider (name = "Verification")
	
	public static Object [][] pages(){
		
		return new Object [][]{
			
			{"test@gmail.com","password1"}
		};
		
	}
}
