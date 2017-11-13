import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;




public class Regstepdef extends Obj
{
    Register step=new Register();
    @Given("^user is on the home page$")
       public void useronhomepage() throws Throwable
    {

    }

    @When("^user searches as a guest for an item$")
    public void userSearchesAsAGuestForAnItem() throws Throwable
    {
    step.search();
    }

    @Then("^the search items are displayed$")
    public void theSearchItemsAreDisplayed() throws Throwable
    {
       // boolean isTextPresent  = driver.getPageSource().contains("baby books");
//        Assert.assertTrue(isTextPresent);
    }
    @When("^user clicks the search link$")
    public void userClicksTheSearchLink() throws Throwable
    {
step.searchlink();
    }

    @When("^user enters user Email$")
    public void userEntersUserEmail() throws Throwable
    {
       step.Entermailid();
    }

    @And("^user enters the password$")
    public void userEntersThePassword() throws Throwable
    {
       step.Enterpassword();
    }

    @And("^user clicks on signin button$")
    public void userClicksOnSigninButton() throws Throwable
    {
        step.submit();
    }

    @Then("^user is on the amazon page$")
    public void userIsOnTheAmazonPage() throws Throwable

    {
        boolean isTextPresent  = driver.getPageSource().contains("shameem's Amazon");
        Assert.assertTrue(isTextPresent);
    }

    @When("^user enters the search item$")
    public void userEntersTheSearchItem() throws Throwable
    {
     step.searchitem();
    }

    @And("^user clicks on search button$")
    public void userClicksOnSearchButton() throws Throwable
    {
        step.searchbutton();
    }

    @Then("^user can view the search item$")
    public void userCanViewTheSearchItem() throws Throwable
    {
       // boolean isTextPresent  = driver.getPageSource().contains("baby monitor");
        Assert.assertTrue(step.isTextPresent());
    }

    @When("^user clicks the \"([^\"]*)\" link$")
    public void userClicksTheLink(String link) throws Throwable {

        step.signIn(link);
    }
}
