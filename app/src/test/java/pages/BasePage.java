package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
<<<<<<< HEAD
=======
    
>>>>>>> master
    protected static WebDriver driver;
    private static WebDriverWait wait;

    static {
<<<<<<< HEAD
    //System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32");
    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "src\test\resources");
    ChromeOptions chromeOptions = new ChromeOptions();
    driver = new ChromeDriver(chromeOptions);
    wait = new WebDriverWait(driver,10);
    

    }

    public BasePage(WebDriver driver){
    BasePage.driver = driver;
    wait = new WebDriverWait(driver, 10);

    }

    public static void navigateTo(String url){
        
    driver.get(url);
    }

=======
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, 10);
    }

    public BasePage(WebDriver driver){

    wait = new WebDriverWait(driver, 10);     
    }

    public static void navigateTo(String url){
        driver.get(url);


    }
>>>>>>> master
}
