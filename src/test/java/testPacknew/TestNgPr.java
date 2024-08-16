package testPacknew;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgPr {
	@Test(priority=2)
	public void FirstTest() {
		System.out.println("First Test");
	}
	
	@Test(priority=1)
	public void SecondTest() {
		System.out.println("Second Test");
	}
	
	@BeforeTest
	public void NormalTest() {
		System.out.println("normal");
	}
	
	@AfterTest
	public void LastTest() {
		System.out.println("last test");
	}

}
