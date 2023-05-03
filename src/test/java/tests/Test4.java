package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Test4 {
    public static void main(String[] args){
        //todo demoqa textBox

        // driver ekleme ve belirli siteye ulaşma
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ozany\\IdeaProjects\\selenium_sunum\\drivers\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.get("https://demoqa.com/buttons");

        // tam ekran yapmak için
        driver.manage().window().maximize();
        WebElement doubleClickMe= driver.findElement(By.id("doubleClickBtn"));
        WebElement rightClickMe= driver.findElement(By.id("rightClickBtn"));

        Actions action=new Actions(driver);
        action.doubleClick(doubleClickMe).perform();
        action.contextClick(rightClickMe).perform();



        //! dinamik elementler için :
        WebElement clickDynamic= driver.findElement(By.xpath("//div[last()]/button"));
        clickDynamic.click();


    }

}
