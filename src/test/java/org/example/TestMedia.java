package org.example;

import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class TestMedia {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://blog.skillfactory.ru/?_gl=1%2Apek9ba%2A_gcl_aw%2AR0NMLjE3MzQxNDM5MzYuQ2owS0NRaUEwLS02QmhDQkFSSXNBRFlxeUxfclYwYW1uaXM4RjMxOE8yRzdKNUpUWVhUcjZhekZ0SlZpalJFME9kdmxBR1dHNzVRSzB0VWFBcU11RUFMd193Y0I.%2A_gcl_au%2ANjM3Njc4ODgyLjE3MzM3ODIwNjI.%2A_ga%2AMTIzMTc1MzM5NC4xNzMzNzgyMDYz%2A_ga_X08SF39ELF%2AMTczNDIxMDE1MC4xMC4xLjE3MzQyMTE2MTMuNTIuMC4w");
            driver.manage().window().maximize();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            driver.findElement(By.cssSelector("body > main.main.front-page-v > div > div.container-stories.selections > div.main-slider > div.selections__slider.selections__slider-nav.slick-initialized.slick-slider > div > div > div.slick-slide.slick-current.slick-active > div > div > div > a > div")).click();
         
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.quit();
        }
    }
}