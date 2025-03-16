package testng;

import org.testng.annotations.Test;

public class GroupingDemo2 {
	
	@Test(priority = 1,groups = {"sanity","regression","functional"})
	public void payInINR() {
		System.out.println("pay in rupees");
	}
	
	@Test(priority = 2,groups = {"sanity","regression","functional"})
	public void payInDollar() {
		System.out.println("pay in dollar");
	}

}
