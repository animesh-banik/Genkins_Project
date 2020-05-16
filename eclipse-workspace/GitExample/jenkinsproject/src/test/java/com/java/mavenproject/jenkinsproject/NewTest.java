package com.java.mavenproject.jenkinsproject;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;


public class NewTest {
  @Test
  public void test11() {
	  System.out.println("Run Testcase:" + "test11");
	  
  }
  @Test
  public void test12() {
	  System.out.println("Run Testcase:" + "test12");
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test");
  }

}
