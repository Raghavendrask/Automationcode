package pages;

import com.bookmyshow.qa.ConfigConstants;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Conatactdetails extends ConfigConstants {

    private AppiumDriver<MobileElement> driver;

    public Conatactdetails(AppiumDriver<MobileElement> driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath="//android.widget.EditText[@text='Email Address']")
    private AndroidElement email;
    @AndroidFindBy(xpath="//android.widget.EditText[@text='Phone']")
    private AndroidElement phone;
    @AndroidFindBy(xpath="//android.widget.Button[@text='Update Details']")
    private AndroidElement update;


    public void detailing(){
        email.sendKeys(UserEmailID);
        phone.sendKeys(UserPhoneNumber);
        update.click();

    }
}
