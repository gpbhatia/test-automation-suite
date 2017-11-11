package pages;

import org.openqa.selenium.By;

public class SearchPage extends Hooks {

    public void clickOnSearchbar() {
        driver.findElement(By.id("twotabsearchtextbox")).click();
    }

    public void entersinsearchbar(String type) {
        driver.findElement(By.xpath("html/body/div[1]/header/div/div[1]/div[3]/div/form/div[3]/div[1]/input")).sendKeys(type);
    }

    public void clickOnButton(String clickbutton) {
      //  driver.findElement(By.id("nav-search-submit-text")).click();
        driver.findElement(By.xpath("//input[@class='nav-input']")).click();
    }

    public void clickOnLink(String link) {
        System.out.println("clicking on link:" + link);
        driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div[2]/div/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div/a/div[2]/span")).click();
    }

    public void clickOnAddTobasket(String btn) {
        driver.findElement(By.id("add-to-cart-button")).click();
    }
}
