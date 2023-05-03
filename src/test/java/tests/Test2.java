package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
    public static void main(String[] args){
    //todo demoqa test2

    System.setProperty("webdriver.chrome.driver","C:\\Users\\ozany\\IdeaProjects\\selenium_sunum\\drivers\\chromedriver.exe");

    WebDriver driver= new ChromeDriver();
    driver.get("https://demoqa.com/checkbox");

    driver.manage().window().maximize();
    //todo css selector


    String homeCheckboxCssValue="label[for='tree-node-home'] span.rct-checkbox svg";

        WebElement homeCheck=driver.findElement(By.cssSelector(homeCheckboxCssValue));
        String homeCheckBoxClass= homeCheck.getAttribute("class");

        System.out.println(homeCheckBoxClass);

        homeCheck.click();

        //todo alttan tekrar bulmak lazım
         homeCheck=driver.findElement(By.cssSelector(homeCheckboxCssValue));
         homeCheckBoxClass= homeCheck.getAttribute("class");


        // check uncheck kontrol

        System.out.println(homeCheckBoxClass);








}
}
