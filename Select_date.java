package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Select_date {
    private AppiumDriver<MobileElement> driver;

    public Select_date(AppiumDriver<MobileElement> driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath="//android.widget.TextView[@text='WED']")
    private AndroidElement date;
//    @AndroidFindBy(xpath="//android.widget.TextView[@text='20']")
//    private AndroidElement datetwo;
    public void date_option(){

        date.click();
    }
//    public void date_option_two(){
//
//        datetwo.click();
//    }
}
