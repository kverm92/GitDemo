package newpackge;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.chrome.ChromeDriver;
public class Newclass {
	public static void main(String[] args) {
	// declaration and instantiation of objects/variables
	//System.setProperty("webdriver.firefox.marionette","C:\\Users\\admin\\Downloads\\geckodriver.exe");
	//WebDriver driver = new FirefoxDriver();
	//comment the above 2 lines and uncomment below 2 lines to use Chrome
		
		
		
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
    String baseUrl = "https://en-gb.facebook.com/r.php?locale=en_GB";
    
    driver.get(baseUrl);	
   // WebElement email = driver.findElement(By.id("u_0_k"));
    
    driver.manage().window().maximize();
    
    driver.manage().timeouts().implicitlyWait(50000,TimeUnit.MILLISECONDS);
    
    WebElement email= driver.findElement(By.id("u_0_k")) ;
   
    email.sendKeys("komal");
    
    WebElement lastname= driver.findElement(By.id("u_0_m"));
     lastname.sendKeys("verma");
     
     WebElement phoneNumber= driver.findElement(By.id("u_0_p"));
     phoneNumber.sendKeys("7814908202");
     
     WebElement password= driver.findElement(By.id("u_0_w"));
     password.sendKeys("kkllpp@1");
     
     Select day= new Select(driver.findElement(By.id("day")));
      day.selectByVisibleText("1");
     
      Select month= new Select(driver.findElement(By.id("month")));
      month.selectByVisibleText("Nov");
    
      Select year= new Select(driver.findElement(By.id("year")));
      year.selectByVisibleText("1992");
      
      //WebElement gender= driver.findElement(arg0)
      
     // driver.find_elements_by_xpath('//div[contains(text(), "' + text + '")]');
    
      
    //  female= driver.find_elements_by_xpath("//*[contains(text(), 'Female')]")

      //contains(text(),'Female'
      
     WebElement female= driver.findElement(By.xpath("//label[contains(text(), 'Female')]"));
     
     female.click();
     WebElement button = driver.findElement(By.xpath("//button[@id='u_0_12']"));
      button.click();
     
      
    }
   
    //close Fire fox
	 
   
}


