package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class App2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        options.addArguments("disable-popup-blocking");


        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.madin.ru/");

        driver.findElement(By.cssSelector(".header__btn")).click();
        driver.findElement(By.name("name")).click();
        driver.findElement(By.name("name")).sendKeys("AAAA");

        driver.findElement(By.xpath("//div[3]/input")).click();
        driver.findElement(By.xpath("//div[3]/input")).sendKeys("BBBB");

        driver.findElement(By.name("city")).click();
        driver.findElement(By.name("city")).sendKeys("CCCC");

        driver.findElement(By.name("message")).click();
        driver.findElement(By.name("message")).sendKeys("Почем опиум для народа?");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        driver.findElement(By.id("modal_form_call_button")).click();

        driver.findElement(By.cssSelector(".modal_call .modal__close > img")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        driver.quit();
    }
}
