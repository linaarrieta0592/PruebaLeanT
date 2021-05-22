package Questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;


public class UserValidations implements Question<String> {
    private Target target;

    public UserValidations(Target target) {
        this.target = target;
    }


    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(target, WebElementStateMatchers.isVisible()));
        return Text.of(target).viewedBy(actor).asString();

    }

    public static UserValidations theMessage(Target target) {
        return new UserValidations(target);
    }
}
