package com.qa.testscripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_Scenario_001 extends TestBase{
	@Test
	public void Scenario1(){
	web.getContact().click();
    Set<String> allTabs = driver.getWindowHandles();    
        for (String tab : allTabs) {
                           driver.switchTo().window(tab);
            }
	
            String newTabTitle = driver.getTitle();
            System.out.println("Title of the new tab: " + newTabTitle);
            
            WebElement iframe2=driver.findElement(By.xpath("//div[@class='container']/iframe"));	
    		driver.switchTo().frame(iframe2); 
    		WebElement image=driver.findElement(By.xpath("//img[@class='slide-image']"));
    		driver.findElement(By.xpath("//*[@class=\"right carousel-control\"]/span")).click();
            
            if (image.isDisplayed()) {
                System.out.println("Image is present.");
            } else {
                System.out.println("Image is not present.");
            }

	}
}
