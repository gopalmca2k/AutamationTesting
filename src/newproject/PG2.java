import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class PG2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
        //WebDriver driver = new FirefoxDriver();
        WebDriver driver = new ChromeDriver();
		String baseUrl = "http://www.facebook.com";
        String tagName = "";
        driver.get(baseUrl);
        tagName = driver.findElement(By.id("email")).getTagName();
        System.out.println(tagName);
        driver.close();
        System.exit(0);
}
}
