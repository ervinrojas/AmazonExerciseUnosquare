package Pages;

import Base.Setup;
import Locators.Identifiers;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondTestCase extends ParentsPages implements Amazon {

    @BeforeTest
    public void Connection(){
        Setup connect = new Setup();
        connect.driver = connect.CreateDriver();
    }

    @Test
    public void firstTest() throws InterruptedException {
        Setup setup = new Setup();
        Identifiers locators = new Identifiers();
        WebElement element;

        Setup.WaitHelper(setup.driver, locators.getSearchTextbox());
        element = setup.findElement(locators.getSearchTextbox());
        setup.type("Galaxy S20 FE 5G", locators.getSearchTextbox());
        element.submit();

        findPrice(setup, locators.getSpfirstprice(), "This is the first price: ");

        ClickOnElement(setup, locators.getSpfirstResult());

        findPrice(setup, locators.getSpsecondPrice(), "This is the second price: ");

        ClickOnElement(setup, locators.getAddCartBtn());

        ClickOnElement(setup, locators.getGoCart());

        findPrice(setup, locators.getThirdPrice(), "This is the third price: ");

        ClickOnElement(setup, locators.getRemove());

        Setup.WaitHelper(setup.driver, locators.getTextEmptyCart());
        Assert.assertEquals(setup.getText(locators.getTextEmptyCart()), "Subtotal (0 items):");

    }
}
