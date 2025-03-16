package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyDEmo {
	
	
	@Test(priority = 1)
	public void openApp() {
		Assert.assertTrue(false);
	}
	
	@Test(priority = 2, dependsOnMethods = {"openApp"})
	public void login() {
		Assert.assertTrue(true);
	}
	
	@Test(priority = 3,dependsOnMethods = {"login"})
	public void search() {
		Assert.assertTrue(true);
	}
	
	@Test(priority = 4,dependsOnMethods = {"search"})
	public void logout() {
		Assert.assertTrue(true);
	}

}
