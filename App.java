package org.example;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Keys;


public class App {
    public static void main( String[] args ) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        options.addArguments("disable-popup-blocking");


        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.madin.ru/");



        WebElement webElement = driver.findElement(By.className("header__btn-search"));
        webElement.click();
        try {
            Thread.sleep(2000);
        }
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        driver.findElement(By.id("title-search-input")).sendKeys("экзарта");
        driver.findElement(By.id("title-search-input")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("search_button_header")).click();

        try {
            Thread.sleep(3000);
        }
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        driver.quit();
    }
}
