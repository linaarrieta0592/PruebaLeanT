package stepsdefinitions;

import Models.User;
import Questions.UserValidations;
import Tasks.HighestPrice;
import Tasks.LoginUser;
import Tasks.LowerPrice;
import UserInterface.SwaglabsUI;
import Utils.MyDriver;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.List;

public class SwaglabsStepdefinitions {

    @Before
    public void prepararEscenario() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Lina");
    }

    @Given("^the user is on the Web$")
    public void theUserIsOnTheWeb() {
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(MyDriver.chrome()));

    }

    @When("^log in with the information$")
    public void logInWithTheInformation(List<User> listUser) {
        OnStage.theActorInTheSpotlight().attemptsTo(LoginUser.inThePage(listUser));


    }

    @Then("^the user can see the message (.*)$")
    public void theUserCanSeeTheMessagePRODUCTS(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(UserValidations.theMessage
                (SwaglabsUI.MESSAGE_PRODUCTS), Matchers.equalTo(message)));

    }

    @Then("^the user can see failed message (.*)$")
    public void theUserCanSeeFailedMessageERROR(String messageError) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat
                (UserValidations.theMessage(SwaglabsUI.MESSAGE_LOGIN_FAILED), Matchers.equalTo(messageError)));

    }


    @Then("^the user do logout$")
    public void theUserDoLogout() {


    }

    @When("^select the product lower price$")
    public void selectTheProductLowerPrice(List<User> listUser) {
        OnStage.theActorInTheSpotlight().attemptsTo(LowerPrice.thatUserPurchase(listUser));

    }


    @Then("^the user purchase the product with the message (.*)$")
    public void theUserPurchaseTheProductWithTheMessageTHANKYOUFORYOURORDER(String verification) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat
                (UserValidations.theMessage(SwaglabsUI.MESSAGE_FINAL), Matchers.equalTo(verification)));


    }

    @When("^select the product highest price$")
    public void selectTheProductHighestPrice(List<User> listUser) {
        OnStage.theActorInTheSpotlight().attemptsTo(HighestPrice.thatUserPurchase(listUser));

    }

    @Then("^the user purchase the product highest price with the message (.*)$")
    public void theUserPurchaseTheProductHighestPriceWithTheMessageTHANKYOUFORYOURORDER(String validation) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat
                (UserValidations.theMessage(SwaglabsUI.MESSAGE_FINAL), Matchers.equalTo(validation)));


    }


}
