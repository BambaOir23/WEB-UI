package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        options.addArguments("disable-popup-blocking");


        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.madin.ru/");

        driver.findElement(By.linkText("Информация")).click();
        driver.findElement(By.cssSelector(".information__btn:nth-child(2)")).click();
        driver.findElement(By.id("info-search-common-document")).click();
        driver.findElement(By.id("info-search-common-document")).sendKeys("приказ");
        driver.findElement(By.xpath("//div[3]/div/button")).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        driver.quit();
    }
}
