package pages;

import com.bookmyshow.qa.ConfigConstants;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login {
    private AppiumDriver<MobileElement> driver;

    public Login(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath="(//android.widget.TextView)[1]")
    private AndroidElement skip;
    @AndroidFindBy(xpath ="//android.widget.Button[@text='Select Manually']")
    private AndroidElement location;
//   @AndroidFindBy(xpath="(//android.widget.LinearLayout)[5]/android.widget.Button[1]")
//  private AndroidElement deny;
    @AndroidFindBy(xpath="//android.widget.TextView[@text='Bengaluru']")
    private AndroidElement bangaluru;
    @AndroidFindBy(xpath="//android.widget.TextView[@text='Pune']")
    private AndroidElement pune;


    public void skip_button(){

        skip.click();

    }
    public void loc() {
        location.click();

    }

     public void citynameA() {

       bangaluru.click();

}
    public void citynameB() {

        pune.click();

    }


    }

