package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_COOKIE = "//div[@class=\"_9xo5\"]/button[1]";
    public static final String XPATH_CREATE_NEW_ACCOUNT = "//div[@class=\"_6ltg\"]/a";
    public static final String XPATH_WAIT_FOR = "//div[@class=\"_8ien\"]";
    public static final String XPATH_SELECT_DAY = "//div[@class=\"_5k_5\"]/span/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "//div[@class=\"_5k_5\"]/span/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//div[@class=\"_5k_5\"]/span/span/select[3]";


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        driver.findElement(By.xpath(XPATH_COOKIE)).click();

        driver.findElement(By.xpath(XPATH_CREATE_NEW_ACCOUNT)).click();

        Thread.sleep(5000);


        WebElement selectBDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectDay = new Select(selectBDay);
        selectDay.selectByIndex(4);

        WebElement selectBMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonth = new Select(selectBMonth);
        selectMonth.selectByIndex(9);

        WebElement selectBYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYear = new Select(selectBYear);
        selectYear.selectByIndex(26);
    }
}
