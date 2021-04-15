package testng;

import java.text.ParseException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.swing.JOptionPane;

import org.openqa.selenium.chrome.ChromeDriver;
 
 
public class PG10 {
    public static void main(String[] args) throws ParseException {
    	WebDriver wd;
	  System.setProperty("webdriver.chrome.driver","/home/mu/driver/chromedriver");
	  wd= new ChromeDriver();
        wd.get("http://demo.guru99.com/test/web-table-element.php");         
        //No.of Columns
        List<WebElement>  col = wd.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
        System.out.println("No of cols are : " +col.size()); 
        JOptionPane.showMessageDialog(null,"No of cols are:"+ col.size());
        //No.of rows 
        List<WebElement>  rows = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]")); 
        System.out.println("No of rows are : " + rows.size());
        JOptionPane.showMessageDialog(null,"No of rowss are:"+ rows.size());
        wd.close();
    }
}
