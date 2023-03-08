package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class FacebookTestingApp {
    public static final String XPATH_COOKIEBUTTON = "//div[3]/button[@class=\"_42ft _4jy0 _9xo7 _4jy3 _4jy1 selected _51sy\"]";
    public static final String XPATH_REGISTRATIONBUTTON = "//div[contains(@class, \"_6ltg\")]/a";
    public static final String XPATH_DAY = "//select[@id=\"day\"]";
    public static final String XPATH_MONTH = "//select[@id=\"month\"]";
    public static final String XPATH_YEAR = "//select[@id=\"year\"]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebDriverWait waitCookieButton = new WebDriverWait(driver, 10);
        waitCookieButton.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XPATH_COOKIEBUTTON)));

        driver.findElement(By.xpath(XPATH_COOKIEBUTTON)).click();

        WebDriverWait waitRegistration = new WebDriverWait(driver, 10);
        waitRegistration.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XPATH_REGISTRATIONBUTTON)));

        driver.findElement(By.xpath(XPATH_REGISTRATIONBUTTON)).click();

        WebDriverWait waitSetUpDate = new WebDriverWait(driver, 10);
        waitSetUpDate.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XPATH_DAY)));

        WebElement selectComboDay = driver.findElement(By.xpath(XPATH_DAY));
        WebElement selectComboMonth = driver.findElement(By.xpath(XPATH_MONTH));
        WebElement selectComboYear = driver.findElement(By.xpath(XPATH_YEAR));
        List<Select> selectBoard = List.of(new Select(selectComboDay), new Select(selectComboMonth), new Select(selectComboYear));
        selectBoard.get(0).selectByValue("8");
        selectBoard.get(1).selectByValue("9");
        selectBoard.get(2).selectByValue("1991");

    }
}
