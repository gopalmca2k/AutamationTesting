package testng;

import java.text.ParseException;
import java.util.List;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.text.NumberFormat;
 
 
public class PG13 {
    public static void main(String[] args) throws ParseException {
    	WebDriver wd;
		 System.setProperty("webdriver.chrome.driver","/home/mu/driver/chromedriver");
		 wd= new ChromeDriver();
		 wd.get("http://demo.guru99.com/test/web-table-element.php"); 
		 String max;
	     double m=0,r=0;
		 
	       //No. of Columns
	        List<WebElement>  col = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
	        System.out.println("Total No of columns are : " +col.size());
	        //No.of rows
	        List<WebElement>  rows = wd.findElements(By.xpath (".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
	        System.out.println("Total No of rows are : " + rows.size());
	        for (int i =1;i<rows.size();i++)
	        {    
	            max= wd.findElement(By.xpath("//table/tbody/tr["+(i+1)+"]/td[4]")).getText();
	            NumberFormat f = NumberFormat.getNumberInstance(); 
	            Number num = f.parse(max);
	            max = num.toString();
	            m = Double.parseDouble(max);
	            if(m>r)
	             {    
	                r=m;
	             }
	        }
	       JOptionPane.showMessageDialog(null, "Maximum Price od the Column" + r);
    }
}
