import com.bookmyshow.qa.ConfigConstants;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Bookticket;
import pages.Login;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Generic extends ConfigConstants {
    static AppiumDriver<MobileElement> driver;

    @BeforeTest()
    public void open_application() {

        try {
            DesiredCapabilities caps=new DesiredCapabilities();

            caps.setCapability(MobileCapabilityType.PLATFORM_NAME,Platform);
            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,Automation);
            //caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Redmi Note 5 Pro");
            //	caps.setCapability(MobileCapabilityType.UDID,"1be59027");
            caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,100);
            //caps.setCapability(MobileCapabilityType.APP,"ANDROID");
            //caps.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
            caps.setCapability("appPackage",Apppackage);
            caps.setCapability("appActivity",AppActivity);

            URL url = new URL(SERVER_URL);
            driver = new AppiumDriver<MobileElement>(url,caps);
        }
        catch(Exception exp) {

            System.out.println("Cause is :"+exp.getCause());
            System.out.println("Message is :"+exp.getMessage());
            exp.printStackTrace();
        }
    }

    @AfterTest
    public void close_application() {

        driver.quit();
    }




}

