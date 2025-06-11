import java.net.MalformedURLException;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class scrollDemo extends base {

    public static void main(String[] args) throws MalformedURLException {
        // TODO Auto-generated method stub

        AndroidDriver<AndroidElement> driver = capabilities();

        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();

        // scroll
        // driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(attribute(\"value\"));");
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");
    }
}
