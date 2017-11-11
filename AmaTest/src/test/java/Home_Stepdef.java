import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.*;

public class Home_Stepdef extends Hooks {
    HomePage homePage;
    LoginPage loginpage ;
    SearchPage searchPage;

    @Given("^user is in home page$")
    public void userIsInHomePage() {

        homePage=new HomePage();
        loginpage=new LoginPage();
        Assert.assertTrue(homePage.isInHomepage());

    }

    @When("^user clicks on\"([^\"]*)\"$")
    public void userClicksOn(String link) {
        homePage.clickTheLink(link);

    }

    @And("^I enters data with name as\"([^\"]*)\"  and Password as \"([^\"]*)\"$")
    public void iEntersDataWithNameAsAndPasswordAs(String name, String password) {
        loginpage.entertheemail(name);
        loginpage.enterthepassword(password);



    }

    @And("^I click on \"([^\"]*)\" button$")
    public void iClickOnButton(String button) {
        loginpage.clickingOnSinginButton(button);
    }

    @Then("^user should login successfully with text \"([^\"]*)\"$")
    public void userShouldLoginSuccessfullyWithText(String text) {
        Assert.assertTrue(WebdriverUtil.isTextPresnt(text));

    }

    @When("^user clicks on searchbar$")
    public void userClicksOnSearchbar() {
        searchPage=new SearchPage();
        //Object clickSearchbar;
        searchPage.clickOnSearchbar();

    }

    @When("^user types \"([^\"]*)\" in the search bar$")
    public void userTypesInTheSearchBar(String type){
        searchPage.entersinsearchbar(type);

    }

    @And("^user clicks on \"([^\"]*)\" button$")
    public void userClicksOnButton(String clickbutton) {
        searchPage.clickOnButton(clickbutton);

    }


    @Then("^user should see the product detail page with text \"([^\"]*)\"$")
    public void userShouldSeeTheProductDetailPageWithText(String text) {
        Assert.assertTrue(WebdriverUtil.isTextPresnt(text));


    }

    @And("^user clicks on \"([^\"]*)\" link$")
    public void userClicksOnLink(String link) {
        searchPage.clickOnLink(link);

    }

    @And("^user clicks on \"([^\"]*)\" btn$")
    public void userClicksOnBtn(String btn) {
       // driver.findElement(By.id("add-to-cart-button")).click();
          searchPage.clickOnAddTobasket(btn);
    }

    @Then("^user is able to see the item in the basket as \"([^\"]*)\"$")
    public void userIsAbleToSeeTheItemInTheBasketAs(String text1) {
        Assert.assertTrue(WebdriverUtil.isTextPresnt(text1));

    }

     @When("^user mouse hovers on Try Prime button$")
    public void userMouseHoversOnTryPrimeButton() {
        // Actions builder = new Actions(driver);
         //driver.findElement(By.id("nav-link-prime")).click();
         //builder.build().perform();
         homePage.mousehoversOnTryPrimeBtn();

     }

    @Then("^user should see the Prime detail page successfully$")
    public void userShouldSeeThePrimeDetailPageSuccessfully() {
       // driver.findElement(By.id("nav-link-prime")).getText().contains("Join millions of Amazon Prime members who enjoy");
        homePage.userShouldseePrimeDetPage();
    }
}
