package Tasks;

import Models.User;
import UserInterface.SwaglabsUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class LowerPrice implements Task {
    private List<User> listUser;

    public LowerPrice(List<User> listUser) {
        this.listUser = listUser;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(SwaglabsUI.ORDER_MENU));
        actor.attemptsTo(Click.on(SwaglabsUI.PRICE_LOW));
        actor.attemptsTo(Click.on(SwaglabsUI.ADD_TO_CART));
        actor.attemptsTo(Click.on(SwaglabsUI.SHOW_CART));
        actor.attemptsTo(Click.on(SwaglabsUI.BUTTON_CHECKOUT));
        actor.attemptsTo(Enter.theValue(listUser.get(0).getName()).into(SwaglabsUI.FIRST_NAME));
        actor.attemptsTo(Enter.theValue(listUser.get(0).getLastname()).into(SwaglabsUI.LAST_NAME));
        actor.attemptsTo(Enter.theValue(listUser.get(0).getPostalcode()).into(SwaglabsUI.POSTAL_CODE));
        actor.attemptsTo(Click.on(SwaglabsUI.BUTTON_CONTINUE));
        actor.attemptsTo(Click.on(SwaglabsUI.BUTTON_FINISH));
    }

    public static LowerPrice thatUserPurchase(List<User> listUser) {

        return new LowerPrice(listUser);
    }

}
