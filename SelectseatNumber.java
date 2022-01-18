package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import io.appium.java_client.android.AndroidTouchAction;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import org.openqa.selenium.support.PageFactory;

import java.time.Duration;


public class SelectseatNumber {

        private AppiumDriver<MobileElement> driver;

        public SelectseatNumber(AppiumDriver<MobileElement> driver){
            this.driver = driver;
            PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        }

        public void settingarragnment(int x,int y){

           new AndroidTouchAction(driver).tap(PointOption.point(x,y)).
                    waitAction(WaitOptions.waitOptions(Duration.ofSeconds(50))).perform();

        }



}
