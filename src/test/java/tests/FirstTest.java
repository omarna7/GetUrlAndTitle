package tests;

import Utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    public static void main(String[] args) {

       WebDriver driver = WebDriverFactory.getBrowser("Chrome");
        driver.get("https://www.google.com/search?ei=gW-zXYz7FoGKgge5m4KQBA&q=Java&oq=Java&gs_l=psy-ab.3..0i67l8j0i10i67j0i67.62512.65343..66161...0.2..1.228.758.6j1j1......0....1..gws-wiz.....6..0i71j0i131j0i362i308i154i357j0.5nXbWjxJ3YU&ved=0ahUKEwjMv7_Bs7jlAhUBheAKHbmNAEIQ4dUDCAs&uact=5");
       WebElement url =  driver.findElement(By.xpath("cite[@class='iUh30']"));
        System.out.println(url.getText());
        //cite[@class='iUh30']
//        System.out.println( driver.getTitle() );
//        String title = driver.getTitle();
//        if(title.equals("Google")   ){
//            System.out.println("Tiltle verification Passed");
//        }else{
//            System.out.println("Tiltle verification Failed");

       // }




//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();





    }
}
