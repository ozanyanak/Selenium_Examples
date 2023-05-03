package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

    public static void main(String[] args){
        //todo demoqa textBox

        // driver ekleme ve belirli siteye ulaşma
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ozany\\IdeaProjects\\selenium_sunum\\drivers\\chromedriver.exe");

         WebDriver driver= new ChromeDriver();
        // demoqa selenium için yapılmış  bir test pratik sitesidir
        driver.get("https://demoqa.com/text-box");
        //driver.get ile istediğimiz sayfaya gidiyoruz

        // tam ekran yapmak için
        driver.manage().window().maximize();

        //webElementleri eklemek için driver.findElement diyoruz ve içinde ne ile bulacağını belirtiyoruz

        WebElement name= driver.findElement(By.id("userName"));
        name.click();
        name.sendKeys("ozan yanak");


        WebElement eMail=driver.findElement(By.id("userEmail"));
        eMail.click();
        eMail.sendKeys("ozanyanak1@gmail.com");

        WebElement currentAdress=driver.findElement(By.id("currentAddress"));
        currentAdress.click();
        currentAdress.sendKeys("Antalya, Turkey");

        WebElement permanentAdress=driver.findElement(By.id("permanentAddress"));
        permanentAdress .click();
        permanentAdress.sendKeys("Elazığ, Turkey");

        WebElement submit=driver.findElement(By.id("submit"));
        submit.click();


        //todo //////////////////////////////////////
       //todo  xpath ile alma

        WebElement nameText=driver.findElement(By.xpath("//div/p[@id='name']"));
        String userName= nameText.getText();
        System.out.println(userName);


        WebElement eMailText=driver.findElement(By.xpath("//div/p[@id='email']"));
        String userEmail= eMailText.getText();
        System.out.println(userEmail);



        WebElement currentAddressText=driver.findElement(By.xpath("//div/p[@id='currentAddress']"));
        String UserCurrentAddress= currentAddressText.getText();
        System.out.println(UserCurrentAddress);

        WebElement permanentAddressText=driver.findElement(By.xpath("//div/p[@id='permanentAddress']"));
        String userPermanentAddress= permanentAddressText.getText();
        System.out.println(userPermanentAddress);






        // kapatmak için  driver.quit();
    }
}
