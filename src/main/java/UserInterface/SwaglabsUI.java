package UserInterface;

import net.serenitybdd.screenplay.targets.Target;

public class SwaglabsUI {

    public static final Target USERNAME = Target.
            the("Username")
            .locatedBy("//input[@id='user-name']");

    public static final Target PASSWORD = Target.
            the("Password")
            .locatedBy("//input[@id='password']");

    public static final Target BUTTON_LOGIN = Target.
            the("Button Login")
            .locatedBy("//input[@id='login-button']");

    public static final Target MESSAGE_PRODUCTS = Target.
            the("Start Message")
            .locatedBy("//span[@class='title']");

    public static final Target MESSAGE_LOGIN_FAILED = Target.
            the("Login Failed Message ")
            .locatedBy("//div[@class='error-message-container error']");

    public static final Target ORDER_MENU = Target.
            the("Product Ordering Menu")
            .locatedBy("//select[@class='product_sort_container']");

    public static final Target PRICE_LOW = Target.
            the("Order for Price Low")
            .locatedBy("//option[@value='lohi']");

    public static final Target PRICE_HIGH = Target.
            the("Order for Price High")
            .locatedBy("//option[@value='hilo']");

    public static final Target ADD_TO_CART = Target.
            the("Add Products to Cart")
            .locatedBy("//div[@class='inventory_item']//div[@class='inventory_item_description']//button");

    public static final Target SHOW_CART = Target.
            the("Show the products in the Cart")
            .locatedBy("//div[@id='shopping_cart_container']");

    public static final Target BUTTON_CHECKOUT = Target.
            the("Checkout Button")
            .locatedBy("//button[@id='checkout']");

    public static final Target FIRST_NAME = Target.
            the("Client First Name")
            .locatedBy("//input[@id='first-name']");

    public static final Target LAST_NAME = Target.
            the("Client last Name")
            .locatedBy("//input[@id='last-name']");

    public static final Target POSTAL_CODE = Target.
            the("Client Postal Code")
            .locatedBy("//input[@id='postal-code']");

    public static final Target BUTTON_CONTINUE = Target.
            the("Continue Button")
            .locatedBy("//input[@id='continue']");

    public static final Target BUTTON_FINISH = Target.
            the("Finish Button")
            .locatedBy("//button[@id='finish']");

    public static final Target MESSAGE_FINAL = Target.
            the("Purchase Completion Message")
            .locatedBy("//div//h2[@class='complete-header']");


}
