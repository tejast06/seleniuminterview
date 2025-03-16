package testng;

import org.testng.annotations.Test;

public class GroupingDemo {
	
	@Test(priority = 1,groups = {"sanity"})
	public void loginByEmail() {
		System.out.println("login by email");
	}
	
	@Test(priority = 2,groups = {"sanity"})
	public void loginByFB() {
		System.out.println("login by FB");
	}
	
	@Test(priority = 3,groups = {"sanity"})
	public void loginByGoogle() {
		System.out.println("login by Google");
	}

}
