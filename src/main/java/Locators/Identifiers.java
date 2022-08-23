package Locators;

import org.openqa.selenium.By;

public class Identifiers {

    String URl = "https://www.amazon.com/";
    By SearchTextbox = By.id("twotabsearchtextbox");
    String text1 = "Galaxy Note 20";
    String text2 = "Samsung Galaxy S20 FE 5G";
    By firstResult = By.xpath("//*[@id='search']/div[1]/div/div/span/div[2]/div[2]/div/div/div/div/div/div[1]/div");
    By firstPrice = By.xpath("//*[@id='search']/div[1]/div/div/span/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[1]/div/a/span[2]/span[2]");
    By secondPrice = By.xpath("//*[@id=\"corePrice_desktop\"]/div/table/tbody/tr[2]/td[2]/span[1]/span[2]");
    By addCartBtn = By.id("add-to-cart-button");
    By thirdPrice= By.xpath("//*[@id=\"sc-subtotal-amount-buybox\"]/span");
    By goCart = By.cssSelector("#sw-gtc > span");
    By remove = By.xpath("//span[@data-action=\"delete\"]/span/input");

    By textEmptyCart = By.xpath("//*[@id=\"sc-subtotal-label-activecart\"]");
    By spfirstResult = By.xpath("//*[@id='search']/div[1]/div/div/span/div[2]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div[1]");
    By spfirstprice = By.xpath("//*[@id='search']/div[1]/div/div/span/div[2]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div[3]/div/div/div/div/a");
    By spsecondPrice = By.xpath("//*[@id=\"corePriceDisplay_desktop_feature_div\"]/div[1]/span/span[2]");

    public By getSearchTextbox(){
        return SearchTextbox;
    }

    public By getFirstResult() {
        return firstResult;
    }

    public By getFirstPrice() {
        return firstPrice;
    }

    public By getSecondPrice() {
        return secondPrice;
    }

    public By getAddCartBtn() {
        return addCartBtn;
    }

    public By getThirdPrice() {
        return thirdPrice;
    }

    public By getGoCart() {
        return goCart;
    }

    public By getRemove() {
        return remove;
    }

    public By getTextEmptyCart() {
        return textEmptyCart;
    }

    public By getSpfirstprice() {
        return spfirstprice;
    }
    public By getSpfirstResult() {
        return spfirstResult;
    }

    public By getSpsecondPrice() {
        return spsecondPrice;
    }
}
