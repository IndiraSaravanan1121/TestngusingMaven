package TestNgSetup.TestngAttributeUsingMaven;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	@Test(dataProvider="DataProviderMethod")
	public void getDetail(String value) {
		System.out.println("name:" + value);
	}
	
	@DataProvider
	public Object[][] DataProviderMethod() {
		return new Object[][] {{"one"},{"two"}};
		
	}

}
