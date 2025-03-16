package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//login > BeforeMethod > will execute multiple time depends on the Test
//search> Test
//logout> AfterMethod

//this is login >
//this is advance search
//logout
//this is login
//this is search
//logout

public class AnnotationsDemo {
	
	
	//beforemethod
//	@BeforeMethod
//	public void login() {
//		System.out.println("this is login");
//	}
//	
//	@Test
//	public void search() {
//		System.out.println("this is search");
//	}
//	
//	@Test
//	public void advanceSearch() {
//		System.out.println("this is advance search");
//	}
//	
//	@AfterMethod
//	public void logout() {
//		System.out.println("logout");
//	}
	
	//login > BeforeClass > will execute only once
	//search> Test
	//advanceSearch >Testr
	//logout> AfterMethod
	
	
	
	
	
	
	//before class execute only 1 time
//	this is login
//	this is advance search
//	this is search
//	logout
//	@BeforeClass
//	public void login() {
//		System.out.println("this is login");
//	}
//	
//	@Test
//	public void search() {
//		System.out.println("this is search");
//	}
//	
//	@Test
//	public void advanceSearch() {
//		System.out.println("this is advance search");
//	}
//	
//	@AfterClass
//	public void logout() {
//		System.out.println("logout");
//	}
	
	
	
	//beforetest will execute only 1 time.
	@BeforeTest
	public void login() {
		System.out.println("this is login");
	}
	
	@Test
	public void search() {
		System.out.println("this is search");
	}
	
	@Test
	public void advanceSearch() {
		System.out.println("this is advance search");
	}
	
	@AfterTest
	public void logout() {
		System.out.println("logout");
	}
	
	

}
