package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class Numberofseats {
    private AppiumDriver<MobileElement> driver;

    public Numberofseats(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath ="//android.widget.SeekBar")
    private AndroidElement sample;

    public void Demo() {
        Dimension dimension = sample.getSize();

        int Anchor = sample.getSize().getHeight()/2;
        Double widthstart = dimension.getWidth()*0.2;
        int start = widthstart.intValue();
        Double widthend = dimension.getWidth()*(-0.1);
        int end = widthend.intValue();
        new AndroidTouchAction(driver).tap(PointOption.point(start,Anchor)).
                waitAction(WaitOptions.waitOptions(Duration.ofSeconds(50))).
                moveTo(PointOption.point(end,Anchor)).release().perform();

    }

}
