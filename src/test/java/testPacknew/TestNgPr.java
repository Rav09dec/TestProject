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
	
	
	@Test(priority=3)
	public void ThirdTest() {
		System.out.println("Third Test");
	}
	
	@Test(priority=4)
	public void FourthTest() {
		System.out.println("Fourth Test");
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
