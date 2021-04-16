package com.maven.tommyhilfiger.utils;

import com.maven.tommyhilfiger.driver.DriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class Help extends DriverFactory{
   //to hover elements we use actions
    public void action(WebElement item){
        Actions actions = new Actions(driver);
        actions.moveToElement(item).build().perform();
    }
    //to select product randomly we write random
    public int random(int size){
        Random random = new Random();
        return random.nextInt(size-1);
    }
    //webDriverWait
    public void waitMethod(WebElement item){
        WebDriverWait wait = new WebDriverWait(driver,60);
        wait.until(ExpectedConditions.elementToBeClickable(item));
    }
    //jse
    public void jse(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,600)");
    }
    //alert
    public void alt(){
        Alert alert = driver.switchTo().alert();
        alert.dismiss();//or
        alert.accept();
    }
}



