package tests;

import Utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class navigationtest {
    public static void main(String[] args) {
      chrome("chrome");
     edge("edge");
     firefox("firefox");
    }
    public static void chrome(String browser){
        WebDriver driver=WebDriverFactory.getBrowser(browser);
        driver.get("https://www.google.com");
        String title=driver.getTitle();
        driver.get("https://etsy.com");
        String title1=driver.getTitle();
        driver.navigate().back();
        StringUtility.verifyEquals(title, title);
        driver.navigate().forword();
        String title2=driver.getTitle();
        StringUtility.verifyEquals(title1,title2);
        driver.quit();

    }
    public static void edge( String browser){
        WebDriver driver= WebDriverFactory.getBrowser(browser);
        driver.quit();
    }
    public static void firefox( String browser){
        WebDriver driver= WebDriverFactory.getBrowser(browser);
}
