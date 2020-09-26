package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GithubLogin {
    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://github.com/login");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        System.out.println(driver.getTitle());

        //Locate Username field
        driver.findElement(By.id("login_field")).sendKeys("Alola-David");
        //Locate password field
        driver.findElement(By.id("password")).sendKeys("PasswordUiTesting");
        //Click on the Sign in button
        driver.findElement(By.xpath("/html/body/div[3]/main/div/form/div[4]/input[9]")).click();

    }
    //Close the browser after
    public static void main(String args[]){
        GithubLogin test = new GithubLogin();
        test.setUp();
    }

    public void setDriver(WebDriver driver){
        this.driver = driver;
        driver.quit();
    }
}
