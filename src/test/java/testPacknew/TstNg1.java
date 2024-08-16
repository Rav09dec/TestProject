package testPacknew;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TstNg1 {
	@Test
	public void SecondTest() {
		SoftAssert SA=new SoftAssert();//next statement will be executed even if there is a failure
		SA.fail();
		System.out.println("Second Test");
		SA.assertAll();//Failure will occur if there is a fail statement
	}

}
