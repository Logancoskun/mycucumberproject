package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.CommonPageElements;
import pages.UserManagementPage;
import utilities.Driver;

public class NewUserStepDefs {

    CommonPageElements commonPageElements = new CommonPageElements();
    UserManagementPage userManagementPage = new UserManagementPage();


    @Given("user clicks on Administration")
    public void user_clicks_on_administration() {
        Driver.waitAndClick(commonPageElements.administrationDropdown);

    }
    @Given("user clicks User management")
    public void user_clicks_user_management() {
        Driver.waitAndClick(commonPageElements.userManagementButton);

    }
    @Given("user clicks create a new user")
    public void user_clicks_create_a_new_user() {
        Driver.waitAndClick(userManagementPage.createNewUserButton);

    }
    @Given("user send Login  as {string}")
    public void user_send_login_as(String string) {
        Driver.waitAndSendText(userManagementPage.loginId,"Cihann");
    }
    @Given("user provides Firstname as {string}")
    public void user_provides_firstname_as(String string) {
        Driver.waitAndSendText(userManagementPage.firstName,"Jhons");

    }
    @Given("user provides Lastname as {string}")
    public void user_provides_lastname_as(String string) {
        Driver.waitAndSendText(userManagementPage.lastName,"Arzu");
    }
    @Given("user enters email as {string}")
    public void user_enters_email_as(String string) {
        Driver.waitAndSendText(userManagementPage.email,"cb123@gmail.ccm");

    }
    @Given("user select the Language")
    public void user_select_the_language() {
        Driver.selectByIndex(userManagementPage.language,1);
    }

    @Then("verify the new user creation is successful")
    public void verify_the_new_user_creation_is_successful() {
        Assert.assertTrue(userManagementPage.successmessage.isDisplayed());
    }


    @And("user enters {string} and {string}")
    public void userEntersAnd(String arg0, String arg1) {
    }

    @Given("user clicks on administration dropdown")
    public void userClicksOnAdministrationDropdown() {
    }

    @And("user clicks on user management button")
    public void userClicksOnUserManagementButton() {
    }

    @And("user clicks on create a new user button")
    public void userClicksOnCreateANewUserButton() {
    }

    @And("user provides login as {string}")
    public void userProvidesLoginAs(String arg0) {
    }

    @And("user enters firstname as {string} and")
    public void userEntersFirstnameAsAnd(String arg0) {
    }

    @And("user enters lastname as {string}")
    public void userEntersLastnameAs(String arg0) {
    }

    @And("user enters email {string}")
    public void userEntersEmail(String arg0) {
    }

    @And("user clicks on language dropdown")
    public void userClicksOnLanguageDropdown() {
    }

    @And("user selects {string}")
    public void userSelects(String arg0) {
    }

    @And("user clicks on profiles dropdown {string}")
    public void userClicksOnProfilesDropdown(String arg0) {
        Driver.selectByVisibleText(userManagementPage.profiles,"ROLE_MANAGER");
    }

    @And("user clicks on save button")
    public void userClicksOnSaveButton() {
        Driver.waitAndClick(userManagementPage.saveButton);
    }
}