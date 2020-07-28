package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    private static final String XPATH_DAY_SELECT = "//div[contains(@class, \"5k_5\")]/span/span/select[1]";
    private static final String XPATH_MONTH_SELECT = "//div[contains(@class, \"5k_5\")]/span/span/select[2]";
    private static final String XPATH_YEAR_SELECT = "//div[contains(@class, \"5k_5\")]/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        while (!driver.findElement(By.xpath(XPATH_DAY_SELECT)).isDisplayed()) ;

        WebElement selectDayCombo = driver.findElement(By.xpath(XPATH_DAY_SELECT));
        Select selectDay = new Select(selectDayCombo);
        selectDay.selectByValue("2");

        WebElement selectMonthCombo = driver.findElement(By.xpath(XPATH_MONTH_SELECT));
        Select selectMonth = new Select(selectMonthCombo);
        selectMonth.selectByVisibleText("lis");

        WebElement selectYearCombo = driver.findElement(By.xpath(XPATH_YEAR_SELECT));
        Select selectYear = new Select(selectYearCombo);
        selectYear.selectByIndex(22);
    }
}
