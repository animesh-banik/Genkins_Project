package com.java.mavenproject.jenkinsproject;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest2 {
	@Test
	  public void test21() {
		  System.out.println("Run Testcase:" + "test21");
		  
	  }
	  @Test
	  public void test22() {
		  System.out.println("Run Testcase:" + "test22");
		  
	  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
