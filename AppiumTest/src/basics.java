import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import java.net.MalformedURLException;

public class basics extends base {

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver = capabilities();

        /**
         * 1.Xpath
         * syntax
         * //tagname[@attribute='value']
         */

        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();

        // tambahan klik menu lainnya
        driver.navigate().back();
        driver.navigate().back();

        driver.findElementByXPath("//android.widget.TextView[@text='Accessibility']").click();
        driver.navigate().back();

        driver.findElementByXPath("//android.widget.TextView[@text='Animation']").click();
        driver.navigate().back();

        driver.findElementByXPath("//android.widget.TextView[@text='App']").click();
        driver.navigate().back();

        driver.findElementByXPath("//android.widget.TextView[@text='Content']").click();
        driver.navigate().back();

        driver.findElementByXPath("//android.widget.TextView[@text='Graphics']").click();
        driver.navigate().back();

        driver.findElementByXPath("//android.widget.TextView[@text='Media']").click();
        driver.navigate().back();

        driver.findElementByXPath("//android.widget.TextView[@text='NFC']").click();
        driver.navigate().back();

        driver.findElementByXPath("//android.widget.TextView[@text='OS']").click();
        driver.navigate().back();

        driver.findElementByXPath("//android.widget.TextView[@text='Text']").click();
        driver.navigate().back();

        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
        driver.navigate().back();

        /**
         * 2. id dan index
         */

        // id
        driver.findElementById("android:id/checkbox").click();

        // index
        driver.findElementByXPath("//android.widget.LinearLayout[2]").click();

        /**
         * classname
         */

        driver.findElementByClassName("android.widget.EditText").sendKeys("password");

        // classname with index
        driver.findElementsByClassName("android.widget.Button").get(1).click();
    }
}
