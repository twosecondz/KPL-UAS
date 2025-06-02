package com.automation;

import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Alpukat extends Base{

	public static void main(String[] args) throws MalformedURLException, InterruptedException{
		AndroidDriver<AndroidElement> driver = capabilities();
		WebDriverWait wait = new WebDriverWait(driver, 10); // 10 detik
		
		// Klik kategori buah dan sayur
        wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//android.widget.FrameLayout[@resource-id=\"com.pbm.hedelsia:id/buahdansayur\"]/android.widget.LinearLayout")))
            .click();

        // Tunggu FrameLayout muncul dan klik
        wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//android.widget.FrameLayout[1]")))
            .click();

        // Klik tombol alpukat
        wait.until(ExpectedConditions.elementToBeClickable(
            By.id("com.pbm.hedelsia:id/alpukattomb")))
            .click();
        
        Thread.sleep(3000);
        
		// Tombol kembali
		wait.until(ExpectedConditions.elementToBeClickable(
			By.id("com.pbm.hedelsia:id/bektumenubuah")))
			.click();
		
	}
}
