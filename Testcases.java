
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.*;
import java.util.concurrent.TimeUnit;

public class Testcases extends Generic {

    @Test(groups = {"demo"},retryAnalyzer= Analyzer.RetryAnalyzer.class,dataProvider = "create",
    description ="CHECK WEATHER USER ABLE TO BOOK TICKETS FOR TWO DIFFERENT MOVIES FROM BANGALORE CITY")
    public void TESTA(String name) {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        Login ln = new Login(driver);
        ln.skip_button();
        ln.loc();
        ln.citynameA();

        driver.findElement(By.xpath(name)).click();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Bookticket bt = new Bookticket(driver);
        bt.ticket_book();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Info_pop_up in = new Info_pop_up(driver);
        in.info_ok();

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        Select_date da = new Select_date(driver);
        da.date_option();

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Select_showtime tm = new Select_showtime(driver);
        tm.time_option();

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Term_and_Conditon term = new Term_and_Conditon(driver);
        term.accept_button();


//    @Test(enabled=true, priority = 7)
//    public void SAMPLEDEMO() {
//        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//        Numberofseats ns = new Numberofseats(driver);
//        ns.Demo();
//    }
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Selectseat set = new Selectseat(driver);
        set.seatselect();

        try {
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
            SelectseatNumber num = new SelectseatNumber(driver);
            num.settingarragnment(418, 629);
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
            num.settingarragnment(295, 627);
        }
        catch (Exception exp)
        {
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
            SelectseatNumber num = new SelectseatNumber(driver);
            num.settingarragnment(355, 627);
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
            num.settingarragnment(482, 629);
        }

        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        Paypage pp = new Paypage(driver);
        pp.paying();

        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        Skippage sk = new Skippage(driver);
        sk.skipping();


        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        Conatactdetails cd = new Conatactdetails(driver);
        cd.detailing();

        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        Paymentpage pe = new Paymentpage(driver);
        pe.payable();
        Generic g= new Generic();
        g.open_application();


    }
    @DataProvider (name ="create")
    public Object[][] dpMethod() {
    return new Object[][]{{"//android.widget.TextView[@text='Bangarraju']"},
                        {"//android.widget.TextView[@text='Badava Rascal']"}};

    }
    @Test(groups = {"demo01"},retryAnalyzer= Analyzer.RetryAnalyzer.class,dataProvider = "sample",
    description ="CHECK WEATHER USER ABLE TO BOOK TICKETS FOR TWO DIFFERENT MOVIES FROM PUNE CITY")
    public void TESTB(String name) {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        Login ln = new Login(driver);
        ln.skip_button();
        ln.loc();
        ln.citynameB();

        driver.findElement(By.xpath(name)).click();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Bookticket bt = new Bookticket(driver);
        bt.ticket_book();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Info_pop_up in = new Info_pop_up(driver);
        in.info_ok();

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        Select_date da = new Select_date(driver);
        da.date_option();

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Select_showtime tm = new Select_showtime(driver);
        tm.time_optionB();

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Term_and_Conditon term = new Term_and_Conditon(driver);
        term.accept_button();

//    public void SAMPLEDEMO() {
//        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//        Numberofseats ns = new Numberofseats(driver);
//        ns.Demo();
//    }
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Selectseat set = new Selectseat(driver);
        set.seatselect();

        try {
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
            SelectseatNumber num = new SelectseatNumber(driver);
            num.settingarragnment(544, 627);
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
            num.settingarragnment(418, 627);
        }
        catch (Exception exp)
        {
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
            SelectseatNumber num = new SelectseatNumber(driver);
            num.settingarragnment(355, 627);
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
            num.settingarragnment(482, 629);
        }

        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        Paypage pp = new Paypage(driver);
        pp.paying();

        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        Skippage sk = new Skippage(driver);
        sk.skipping();


        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        Conatactdetails cd = new Conatactdetails(driver);
        cd.detailing();

        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        Paymentpage pe = new Paymentpage(driver);
        pe.payable();
        Generic g= new Generic();
        g.open_application();

    }
    @DataProvider (name ="sample")
    public Object[][] Method() {
        return new Object[][]{{"//android.widget.TextView[@text='Pushpa: The Rise - Part 01']"},
                {"//android.widget.TextView[@text='83']"}};

    }

}






