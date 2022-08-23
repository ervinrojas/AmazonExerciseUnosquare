package Pages;

import Base.Setup;
import org.openqa.selenium.By;

public class ParentsPages {

    protected static void findPrice(Setup setup, By locators, String x) {
        Setup.WaitHelper(setup.driver, locators);
        String firstprice = setup.getText(locators);
        System.out.println(x +firstprice.replace("\n","."));
    }

    protected static void ClickOnElement(Setup setup, By locators) {
        Setup.WaitHelper(setup.driver, locators);
        setup.click(locators);
    }
}
