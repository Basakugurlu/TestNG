package gun01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utility.BaseDriver;
import utility.tools;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class _03_Enable extends BaseDriver {
    @Test
    void Test1(){
        System.out.println("test 1");
    }
    @Test(enabled = false)
    void test2(){
        System.out.println("test 2");
    }
    @Test
    void test3(){
        System.out.println("test 3");
    }

    public static WebDriver driver;

        public static WebDriverWait wait;
        void baslangicislemleri(){




            Logger logger=Logger.getLogger("");
            logger.setLevel(Level.SEVERE);

            //ilk calisan kisim
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
            driver = new ChromeDriver();

            driver.manage().window().maximize(); //ekrani max yapiyor.
            driver.manage().deleteAllCookies();

            Duration dr=Duration.ofSeconds(30);
            driver.manage().timeouts().pageLoadTimeout(dr);

            driver.manage().timeouts().implicitlyWait(dr);//butun elementlerin element bazinda elemente ozel
            //islem yapilmadan once hazir hale gelmesi verilen muhlet sure.
            // wait=new WebDriver(driver,Duration.ofSeconds(10));
        }
        void bitisislemleri() {
            tools.Bekle(3);
            driver.quit();
        }

        //public static void ClosetoPreviousPage() {
         //   try {
          //      Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        //    } catch (Exception ignored) {

         //   }


    }



