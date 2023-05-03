package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
    public static void main(String[] args){
        //todo demoqa test3

        System.setProperty("webdriver.chrome.driver","C:\\Users\\ozany\\IdeaProjects\\selenium_sunum\\drivers\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.get("https://demoqa.com/radio-button");

        driver.manage().window().maximize();
        WebElement yesRadioButton=driver.findElement(By.cssSelector("label[for='yesRadio']"));
        WebElement noRadioButton=driver.findElement(By.id("noRadio"));
         boolean isYesEnable= yesRadioButton.isEnabled();
         boolean isNoRadioEnable= noRadioButton.isEnabled();


         if (isYesEnable){
             yesRadioButton.click();
             System.out.println("clicked radio button");
         }
         else {
             System.out.println("cannot click");
         }

        if (isNoRadioEnable){
            noRadioButton.click();
            System.out.println("clicked radio button");
        }
        else {
            System.out.println("cannot click");
        }










    }

}
