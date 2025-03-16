package testng;

import org.testng.annotations.Test;

public class GroupingDemo1 {
	
	@Test(priority = 1,groups = {"regression"})
	public void signUpByEmail() {
		System.out.println("sign up by email");
	}
	
	@Test(priority = 2,groups = {"regression"})
	public void signUpByFB() {
		System.out.println("sign up by FB");
	}
	
	@Test(priority = 3,groups = {"regression"})
	public void signUpByGoogle() {
		System.out.println("sign up by google");
	}

}
