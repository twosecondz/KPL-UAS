package com.automation;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Bayam extends Base{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities();
		WebDriverWait wait = new WebDriverWait(driver, 10);
				
		// Klik kategori buah dan sayur
		wait.until(ExpectedConditions.elementToBeClickable(
		        By.xpath("//android.widget.FrameLayout[@resource-id=\"com.pbm.hedelsia:id/buahdansayur\"]/android.widget.LinearLayout")))
		        .click();
		        
		        // Klik kategori Sayuran
		wait.until(ExpectedConditions.elementToBeClickable(
			    By.xpath("//android.widget.TextView[@text=\"Sayuran\"]")))
			    .click();
		        
		// Klik Sayur
		wait.until(ExpectedConditions.elementToBeClickable(
			    By.id("com.pbm.hedelsia:id/btnBayam")))
			    .click();
		
		Thread.sleep(3000);
        
		// Tombol kembali
		wait.until(ExpectedConditions.elementToBeClickable(
			By.id("com.pbm.hedelsia:id/bektumenusayur")))
			.click();

	}

}
