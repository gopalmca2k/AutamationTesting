package newproject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class PG3 {
public static void main(String[] args) 
{   
	//System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
	System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
	//WebDriver driver = new FirefoxDriver();       
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.popuptest.com/popuptest2.html");
	driver.quit();  // using QUIT all windows will close
}
}
