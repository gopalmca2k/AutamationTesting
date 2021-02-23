/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newproject;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
import java.awt.Robot;
import java.awt.event.KeyEvent;
public class First {  
    public static void main(String[] args) {    
    // declaration and instantiation of objects/variables  
    System.setProperty("webdriver.chrome.driver", "/home/mu/Gopal/chromedriver/chromedriver");  
    WebDriver driver=new ChromeDriver();  
      
// Launch website  
    driver.navigate().to("http://www.google.com/");  
          
    // Click on the search text box and send value  
    driver.findElement(By.name("q")).sendKeys("javatpoint tutorials");  
          
    // Click on the search button  
   // driver.findElement(By.name("btnK")).click();  
     try {
    Robot robot = new Robot();
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
    robot.delay(200);
   }catch(Exception e){
       
   } 
    }
}