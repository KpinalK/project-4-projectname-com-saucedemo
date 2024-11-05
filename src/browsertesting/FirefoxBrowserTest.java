package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

/**
 * BaseUrl = https://www.saucedemo.com/
 * 1. Set up Firefox browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current URL.
 * 5. Print the page source.
 * 6. Enter the email in the email field.
 * 7. Enter the password in the password field.
 * 8. Click on the Login Button.
 * 9. Print the current URL.
 * 10. Navigate to baseUrl
 * 11. Refresh the page.
 * 12. Close the browser.
 */

public class FirefoxBrowserTest {

    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";

        //1.Set up Firefox browser
        WebDriver driver = new FirefoxDriver();

        //2.Open the URL
        driver.get(baseUrl);
        //Maximise the Browser window
        driver.manage().window().maximize();
        //We give implicit wait to the driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //3.Print the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        //4.Print the current URL
        String currentUrl = driver.getCurrentUrl();
        System.out.println("The Current URL " + currentUrl);

        //5.Print the page source
        System.out.println("The page source : " + driver.getPageSource());

        //6.Enter the email in the email field
        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("pinal");

        //7.Enter the password in the password field
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("12345");

        //8.Click on the Login Button
        WebElement loginButton = driver.findElement(By.name("login-button"));
        loginButton.click();

        //9.Print the current URL
        System.out.println("The Current URL " + driver.getCurrentUrl());

        //10.Navigate to baseUrl
        driver.navigate().to(baseUrl);

        //11.Refresh the page
        driver.navigate().refresh();

        //12.Close the browser
        driver.quit();


    }
}
