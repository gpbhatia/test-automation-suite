package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Hooks {
    @FindBy(id = "ap_email")
    private WebElement email;

    @FindBy(xpath = "html/body/div[1]/div[1]/div[3]/div/div/form/div/div/div/div[2]/input")
      private WebElement pwd;

    @FindBy(xpath = "html/body/div[1]/div[1]/div[3]/div/div/form/div/div/div/div[3]/span/span/input")
      private WebElement SignInBtn;


    public LoginPage() {
      //this.driver = driver;
      PageFactory.initElements(driver,this);

    }



    public void entertheemail(String name) {
      // driver.findElement(By.xpath("html/body/div[1]/div[1]/div[3]/div/div/form/div/div/div/div[1]/input")).sendKeys(name);
       email.sendKeys(name);
    }


    public void enterthepassword(String password) {
       // driver.findElement(By.xpath("html/body/div[1]/div[1]/div[3]/div/div/form/div/div/div/div[2]/input")).sendKeys(password);
        pwd.sendKeys(password);
    }

    public void clickingOnSinginButton(String button) {
      // driver.findElement(By.xpath("html/body/div[1]/div[1]/div[3]/div/div/form/div/div/div/div[3]/span/span/input")).click();
        SignInBtn.click();
    }
}
