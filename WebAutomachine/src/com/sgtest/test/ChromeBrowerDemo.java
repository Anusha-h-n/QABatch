package com.sgtest.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowerDemo {
	
	//WebDriver is interface
	public static WebDriver oBrowser=null;
	public static void main(String args[]) {
		luanchBrower();
		navigateUrl();
		closeApplication();
	}
	
	private static void luanchBrower() {
		try {
			//ChromeDriver is a class that implements WebDriver interface
			oBrowser=new ChromeDriver();

		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void navigateUrl() {
		try {
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(5000);
			
		}catch (Exception e) {
		e.printStackTrace();
		
		}
		
	}
	private static void closeApplication() {
		try {
			oBrowser.quit();
			
		} catch (Exception e) {
		e.printStackTrace();
		}
	}

}
