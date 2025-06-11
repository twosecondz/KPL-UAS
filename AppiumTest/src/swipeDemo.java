import java.net.MalformedURLException;
import org.openqa.selenium.WebElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;

public class swipeDemo extends base {

    public static void main(String[] args) throws MalformedURLException {
        // TODO Auto-generated method stub

        AndroidDriver<AndroidElement> driver = capabilities();

        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();

        driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();

        driver.findElementByXPath("//android.widget.TextView[@text='2. Inline']").click();

        driver.findElementByXPath("//*[@content-desc='9']").click();

        TouchAction t = new TouchAction(driver);

        // t.longPress(LongPressOptions().withElement(element(firstElement)).withDuration(ofSeconds(2))).moveTo(element(secondElement)).release().perform();

        WebElement firstElement = driver.findElementByXPath("//*[@content-desc='15']");

        WebElement secondElement = driver.findElementByXPath("//*[@content-desc='45']");

        t.longPress(longPressOptions()
            .withElement(element(firstElement))
            .withDuration(ofSeconds(3)))
         .moveTo(element(secondElement))
         .release()
         .perform();
    }
}
