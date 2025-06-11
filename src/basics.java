import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basics extends base {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        AndroidDriver<AndroidElement> driver = capabilities();
        
        
        // Splash Screen
        WebDriverWait wait = new WebDriverWait(driver, 10);

        
        // Intro Activity -----------------------------------------------------------
        // Tekan tombol Lanjut 3 kali
        for (int i = 0; i < 3; i++) {
            MobileElement btnLanjut = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.id("com.example.sangerfinal:id/btnLanjut")));
            btnLanjut.click();
            Thread.sleep(1000);
        }

        // Tekan tombol Mulai
        MobileElement mulaiBtn = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.example.sangerfinal:id/btnMulai")));
        mulaiBtn.click();
        Thread.sleep(2000);

        // Login Activity -----------------------------------------------------------
        // Menuju halaman register
        MobileElement registerText = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.example.sangerfinal:id/tvRegister']"));
        registerText.click();
        Thread.sleep(2000);
        
        MobileElement backButtonR = (MobileElement) driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id='com.example.sangerfinal:id/btnBack']"));
        backButtonR.click();
        Thread.sleep(1000);
        
        // Input Email
        MobileElement emailField = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.example.sangerfinal:id/etEmail")));
        emailField.clear();
        emailField.sendKeys("syahidala@gmail.com");
        Thread.sleep(1000);

        // Input Password
        MobileElement passField = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.example.sangerfinal:id/etPassword")));
        passField.clear();
        passField.sendKeys("idal12344");
        Thread.sleep(1000);

        // Klik tombol Masuk
        MobileElement masukBtn = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.example.sangerfinal:id/btnLogin")));
        masukBtn.click();
        Thread.sleep(3000);
        
        
        // Main Activity -----------------------------------------------------------------
        // Klik ikon menu setelah login
        try {
        	
        	// Tekan menu icon
            MobileElement menuIcon = (MobileElement) wait.until(
                ExpectedConditions.presenceOfElementLocated(
                    By.id("com.example.sangerfinal:id/menuIcon")
                )
            );
            menuIcon.click();
            System.out.println("Sukses Berhasil ke menu profil.");
            
            MobileElement menuIcon2 = (MobileElement) wait.until(
                    ExpectedConditions.presenceOfElementLocated(
                        By.id("com.example.sangerfinal:id/menuIcon")
                    )
                );
                menuIcon2.click();
                
                Thread.sleep(3000);
            
            // Info Personal
            MobileElement  infoPersonal= (MobileElement) wait.until(
                ExpectedConditions.presenceOfElementLocated(
                    By.id("com.example.sangerfinal:id/layout_info_personal")
                )
            );
            infoPersonal.click();
            

        } catch (Exception e) {
            System.out.println("Gagal login atau elemen halaman utama tidak ditemukan.");
            e.printStackTrace();
        }
        
        
        
        // btn Ubah
        MobileElement ubahBtn = (MobileElement) wait.until(
                ExpectedConditions.presenceOfElementLocated(
                    By.id("com.example.sangerfinal:id/btn_ubah")
                )
            );
        ubahBtn.click();
        Thread.sleep(1000);
        
        
        // Edit info Personal --------
        // Input nama
        MobileElement namaLengkap = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.example.sangerfinal:id/et_nama_lengkap")));
        namaLengkap.clear();
        namaLengkap.sendKeys("AKBAR GANTENG");
        Thread.sleep(1000);

        // Input Biodata
        MobileElement etBio = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.example.sangerfinal:id/et_biodata")));
        etBio.clear();
        etBio.sendKeys("PECINTA SANGER ACEH NIH BOS");
        Thread.sleep(1000);
        
        // btn simpan
        MobileElement simpanBtn = (MobileElement) wait.until(
                ExpectedConditions.presenceOfElementLocated(
                    By.id("com.example.sangerfinal:id/btn_simpan")
                )
            );
        simpanBtn.click();
        Thread.sleep(1000);
        
        MobileElement backButton = (MobileElement) driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Back']"));
        backButton.click();
        Thread.sleep(3000);
        
        
        // Layout Cart ------------------------------------------------
        
        MobileElement cartMenu = (MobileElement) wait.until(
                ExpectedConditions.presenceOfElementLocated(
                    By.id("com.example.sangerfinal:id/layout_cart")
                )
            );
        cartMenu.click();
        Thread.sleep(1000);
        
        MobileElement masukanBtn = (MobileElement) wait.until(
                ExpectedConditions.presenceOfElementLocated(
                    By.id("com.example.sangerfinal:id/btnMasukanPesanan")
                )
            );
        masukanBtn.click();
        Thread.sleep(1000);
        
        MobileElement pesanBtn = (MobileElement) wait.until(
                ExpectedConditions.presenceOfElementLocated(
                    By.id("com.example.sangerfinal:id/btnBayarKonfirmasi")
                )
            );
        pesanBtn.click();
        Thread.sleep(1000);
        
        // btnLacakPesanan
        MobileElement lacakBtn = (MobileElement) wait.until(
                ExpectedConditions.presenceOfElementLocated(
                    By.id("com.example.sangerfinal:id/btnLacakPesanan")
                )
            );
        lacakBtn.click();
        Thread.sleep(2000);
        
        
        // Location------------------------------------------------
        MobileElement locationMenu = (MobileElement) wait.until(
                ExpectedConditions.presenceOfElementLocated(
                    By.id("com.example.sangerfinal:id/layout_location")
                )
            );
        locationMenu.click();
        Thread.sleep(1000);
        
        MobileElement aksesBtn = (MobileElement) wait.until(
                ExpectedConditions.presenceOfElementLocated(
                    By.id("com.example.sangerfinal:id/btnAksesLokasi")
                )
            );
        aksesBtn.click();
        Thread.sleep(2000);
        
      
        MobileElement backButtonL = (MobileElement) new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageButton[@content-desc='Back']")));
        backButtonL.click();
        

        // Keluar Aplikasi --------------------------------
        
        try {
        	
        	// Tekan menu icon
            MobileElement menuIcon = (MobileElement) wait.until(
                ExpectedConditions.presenceOfElementLocated(
                    By.id("com.example.sangerfinal:id/menuIcon")
                )
            );
            menuIcon.click();
            System.out.println("Sukses Berhasil ke menu profil.");
            
            MobileElement menuIcon2 = (MobileElement) wait.until(
                    ExpectedConditions.presenceOfElementLocated(
                        By.id("com.example.sangerfinal:id/menuIcon")
                    )
                );
                menuIcon2.click();
                
                Thread.sleep(2000);
            
        } catch (Exception e) {
            System.out.println("Gagal login atau elemen halaman utama tidak ditemukan.");
            e.printStackTrace();
        }
        
        
        // Log out
        MobileElement keluarLayout = (MobileElement) wait.until(
                ExpectedConditions.presenceOfElementLocated(
                    By.id("com.example.sangerfinal:id/layout_keluar")
                )
            );
        keluarLayout.click();
        Thread.sleep(3000);
    
        // Selesai - tutup sesi
        driver.quit();
    }
}
