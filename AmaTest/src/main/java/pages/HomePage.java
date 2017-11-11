package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import pages.Hooks;

import java.sql.Driver;

public class HomePage extends Hooks {

    public boolean isInHomepage() {
        return driver.findElement(By.tagName("body")).getText().contains("Amazon.co.uk");

    }

    public void clickTheLink(String link) {
        driver.findElement(By.xpath("html/body/div[1]/header/div/div[2]/div[2]/div/a[1]/span[1]")).click();
    }

    public void mousehoversOnTryPrimeBtn() {
        Actions builder = new Actions(driver);
        driver.findElement(By.id("nav-link-prime")).click();
        builder.build().perform();

    }

    public void userShouldseePrimeDetPage() {
        driver.findElement(By.id("nav-link-prime")).isDisplayed();
    }
}
