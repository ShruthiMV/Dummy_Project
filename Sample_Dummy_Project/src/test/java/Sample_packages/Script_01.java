package Sample_packages;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Script_01 {

	@Test
	
	public void takesScreenshot() throws InterruptedException, IOException {
		 WebDriver driver =new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);			 
			driver.get("https://www.flipkart.com/");
			Thread.sleep(3000);
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			List<WebElement> elements = driver.findElements(By.xpath("//div[@class='_3sdu8W emupdz']//a"));
			int size=elements.size();
			System.out.println(size);
			
			
			for(int i=0;i<size;i++){
			
			            WebElement ele=elements.get(i);
			            File src = ele.getScreenshotAs(OutputType.FILE);
			           int name=i+1;
			            File dest =new File("../Basic_Selenium/screenshot/pic0_"+name+".png");
			            FileUtils.copyFile(src, dest);
			}
		
	}

}
