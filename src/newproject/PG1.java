package newproject;
import javax.swing.JOptionPane;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;  
public class PG1 {
    String driverFinal;
    String urlFinal;

    PG1(String d,String url){
        driverFinal = d;
        urlFinal = url;
    }
    public void runTest()throws InterruptedException {
        // declaration and instantiation of objects/variables
    	//System.setProperty("webdriver.gecko.driver","/home/mu/Gopal/gekodriver/geckodriver");
	//WebDriver driver = new FirefoxDriver();
	//comment the above 2 lines and uncomment below 2 lines to use Chrome
	System.setProperty(driverFinal,urlFinal);
	WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            JOptionPane.showMessageDialog(null,"Test Passed");
        } else {
            JOptionPane.showMessageDialog(null,"Test Failed");
        }
       
        //close Fire fox
        driver.close();
       
    }

}