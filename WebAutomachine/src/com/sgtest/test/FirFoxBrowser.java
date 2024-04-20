package com.sgtest.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirFoxBrowser {
	private static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchBrowser();
		openBrowser();
		quitBrowser();

	}
	
	private static void launchBrowser() {
		try {
			oBrowser=new FirefoxDriver();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void openBrowser() {
		try {
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(4000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void quitBrowser() {
		try {
			oBrowser.quit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
