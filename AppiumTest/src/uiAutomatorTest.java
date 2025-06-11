import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import java.time.Duration;

public class uiAutomatorTest extends base {

    public static void main(String[] args) throws MalformedURLException {
        // TODO Auto-generated method stub

        AndroidDriver<AndroidElement> driver = capabilities();

        /*
         * 4. androidUIAutomator
         * 
         * "attribute(\"value\")"
         */

        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

        driver.findElementByAndroidUIAutomator(
            "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Expandable Lists\"));"
        );

        driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")").click();
        driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")").click();

        AndroidElement peopleNames = driver.findElementByAndroidUIAutomator("text(\"People Names\")");

        TouchAction<?> action = new TouchAction<>(driver);

        // Long press di People Names
        action.longPress(
            LongPressOptions.longPressOptions()
                .withElement(ElementOption.element(peopleNames))
                .withDuration(Duration.ofSeconds(2))
        ).release().perform();

        System.out.println("Sukses: Long press di People Names!");

        // Klik opsi "Sample action" setelah muncul popup
        driver.findElementByXPath("//android.widget.TextView[@text='Sample action']").click();

        System.out.println("Sukses: Klik Sample Action setelah long press!");

        // Swipe layar ke atas
        action.press(ElementOption.point(500, 1500))
              .waitAction(WaitOptions.waitOptions(Duration.ofMillis(800)))
              .moveTo(ElementOption.point(500, 500))
              .release()
              .perform();

        System.out.println("Sukses: Swipe layar ke atas!");

        // Drag and Drop
        driver.navigate().back();
        driver.navigate().back();

        driver.findElementByAndroidUIAutomator(
            "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Drag and Drop\"));"
        ).click();

        AndroidElement dragDot1 = driver.findElementById("io.appium.android.apis:id/drag_dot_1");
        AndroidElement dragDot2 = driver.findElementById("io.appium.android.apis:id/drag_dot_2");

        action.longPress(ElementOption.element(dragDot1))
              .moveTo(ElementOption.element(dragDot2))
              .release()
              .perform();

        System.out.println("Sukses: Drag and Drop berhasil!");
    }
}
