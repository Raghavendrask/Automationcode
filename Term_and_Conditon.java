package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.support.PageFactory;

public class Term_and_Conditon {
    private AppiumDriver<MobileElement> driver;

    public Term_and_Conditon(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    @AndroidFindBy(xpath = "(//android.widget.LinearLayout)[4]/android.widget.Button[2]")
    private AndroidElement accept;
//    @AndroidFindBy(xpath = "(//android.widget.LinearLayout)[4]/android.widget.SeekBar")
//    private AndroidElement bar

    public void accept_button() {

        accept.click();

    }

}

//    public  void seekbar(){
//
//        int start=bar.getLocation().getX();
//        int y=bar.getLocation().getY();
//        int moveTo=(int) (start+(bar.getSize().getWidth())*0.30);
//        TouchAction action=new TouchAction(driver);
//        action.press(PointOption.point(start,y)).moveTo(PointOption.point(moveTo,y)).release().perform();






