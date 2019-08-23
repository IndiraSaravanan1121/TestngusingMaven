package TestNgSetup.TestngAttributeUsingMaven;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Factory {
	@BeforeTest
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@Test
	public void testOne() {
		System.out.println("TestCaseOne");
	}
	
	@Test
	public void testTwo() {
		System.out.println("TestCaseTwo");
	}
	
	@org.testng.annotations.Factory
	public Object[] factoryMethod() {
		return new Object[] {};
	}
}
