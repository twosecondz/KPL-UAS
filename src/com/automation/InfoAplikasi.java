package com.automation;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class InfoAplikasi extends Base{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities();
		WebDriverWait wait = new WebDriverWait(driver, 10);

		// Klik Informasi Aplikasi
		wait.until(ExpectedConditions.elementToBeClickable(
			By.xpath("//android.widget.TextView[@text=\"Info Aplikasi\"]")))
			.click();
		
		Thread.sleep(10000);
				        
		// Tombol kembali
		wait.until(ExpectedConditions.elementToBeClickable(
			By.id("com.pbm.hedelsia:id/bektumen")))
			.click();
	}

}
