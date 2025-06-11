import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumRunner {
    public static void main(String[] args) {
        // Set path geckodriver sesuai lokasi di PC kamu
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\LENOVO\\Videos\\gecko\\geckodriver.exe");

        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--start-maximized");

        WebDriver driver = new FirefoxDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, 10);

        String baseUrl = "http://127.0.0.1:8000";
        
        
        // Isi form pendaftaran dulu
        driver.get(baseUrl + "/#daftar");
 		
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("nama"))).sendKeys("Nama Test");
            driver.findElement(By.name("npm")).sendKeys("123456789");
            driver.findElement(By.name("telepon")).sendKeys("081234567890");
            driver.findElement(By.name("email")).sendKeys("test@example.com");
            driver.findElement(By.name("divisi")).sendKeys("ppm");
            driver.findElement(By.name("alasan")).sendKeys("Saya ingin bergabung.");
            Thread.sleep(5000);
            driver.findElement(By.xpath("//button[@type='submit' and contains(text(),'Kirim')]")).click();
            
            System.out.println("Form pendaftaran sudah di-submit.");
        } catch (Exception e) {
            System.out.println("Gagal isi form pendaftaran: " + e.getMessage());
        }

        
        
        // Data user login
        String[][] users = {
                {"dph@example.com", "password", "/dph/dashboard"},
                {"kadiv@example.com", "password", "/kadiv/dashboard"},
                {"anggota@example.com", "password", "/anggota/dashboard"}
        };

        try {
            for (String[] user : users) {
                driver.get(baseUrl + "/login");

                wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email"))).clear();
                driver.findElement(By.name("email")).sendKeys(user[0]);

                driver.findElement(By.name("password")).clear();
                driver.findElement(By.name("password")).sendKeys(user[1]);

                driver.findElement(By.xpath("//button[@type='submit']")).click();

                // Tunggu sampai URL berubah ke dashboard masing-masing
                wait.until(ExpectedConditions.urlContains(user[2]));

                String currentUrl = driver.getCurrentUrl();
                if (!currentUrl.contains(user[2])) {
                    System.out.println("Login gagal untuk user: " + user[0]);
                    continue;
                } else {
                    System.out.println("Login berhasil untuk user: " + user[0]);
                }

                // Jika user dph, navigasi ke /dph/pendaftar dulu
                if (user[0].equals("dph@example.com")) {
                    try {
                        driver.get(baseUrl + "/dph/pendaftar");
                        Thread.sleep(1500);
                        System.out.println("Navigasi ke /dph/pendaftar berhasil");
                    } catch (Exception e) {
                        System.out.println("Gagal navigasi ke /dph/pendaftar: " + e.getMessage());
                    }
                }

                try {
                    WebElement pengaturanMenu = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Pengaturan")));
                    pengaturanMenu.click();
                    Thread.sleep(1500);
                    System.out.println("Navigasi ke Pengaturan berhasil");
                } catch (Exception e) {
                    System.out.println("Gagal klik menu Pengaturan: " + e.getMessage());
                }

                try {
                    WebElement logoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Keluar')]")));
                    logoutButton.click();
                    System.out.println("Logout berhasil");
                } catch (Exception e) {
                    System.out.println("Gagal logout: " + e.getMessage());
                }

                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
