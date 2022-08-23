package Pages;

import Base.Setup;
import Locators.Identifiers;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestCase extends ParentsPages implements Amazon  {

    @BeforeTest
    public void Connection(){
        Setup connect = new Setup();
        connect.driver = connect.CreateDriver();
    }

    @Override
    @Test
    public void firstTest() throws InterruptedException{
        Setup setup = new Setup();
        Identifiers locators = new Identifiers();
        WebElement element;

        Setup.WaitHelper(setup.driver, locators.getSearchTextbox());
        element = setup.findElement(locators.getSearchTextbox());
        setup.type("Samsung Galaxy Note 20 5G N981 Verizon, Mystic Gray 128 GB (Renewed)", locators.getSearchTextbox());
        element.submit();

        findPrice(setup, locators.getFirstPrice(), "This is the first price: ");

        ClickOnElement(setup, locators.getFirstResult());

        findPrice(setup, locators.getSecondPrice(), "This is the second price: ");

        ClickOnElement(setup, locators.getAddCartBtn());

        ClickOnElement(setup, locators.getGoCart());

        findPrice(setup, locators.getThirdPrice(), "This is the third price: ");

        ClickOnElement(setup, locators.getRemove());

        Setup.WaitHelper2(setup.driver, locators.getTextEmptyCart());
        Assert.assertEquals(setup.getText(locators.getTextEmptyCart()), "Subtotal (0 items):");

    }




}
