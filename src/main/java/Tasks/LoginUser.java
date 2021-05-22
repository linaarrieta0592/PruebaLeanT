package Tasks;

import Models.User;
import UserInterface.SwaglabsUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class LoginUser implements Task {
    private List<User> listUser;

    public LoginUser(List<User> listUser) {
        this.listUser = listUser;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(listUser.get(0).getUsername()).into(SwaglabsUI.USERNAME));
        actor.attemptsTo(Enter.theValue(listUser.get(0).getPassword()).into(SwaglabsUI.PASSWORD));
        actor.attemptsTo(Click.on(SwaglabsUI.BUTTON_LOGIN));
    }

    public static LoginUser inThePage(List<User> listUser) {
        return new LoginUser(listUser);
    }
}
