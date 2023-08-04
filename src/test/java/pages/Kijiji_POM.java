package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

public class Kijiji_POM extends MyMethods {
    public Kijiji_POM() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href=\"/h-ontario/9004\"]")
    private WebElement ontario;
    @FindBy(xpath = "//a[@href=\"/h-hamilton/80014\"]")
    private WebElement hamilton;
    @FindBy(xpath = "//a[@class=\"button-open next\" and @id=\"LocUpdate\"]")
    private WebElement goButton;
    @FindBy(xpath = "//a[@id='cat-menu-item-27']")
    private WebElement carsAndVehicles;
    @FindBy(xpath = "//span[normalize-space()='Cars & Trucks']")
    private WebElement carsAndTrucks;
    @FindBy(xpath = "//input[@id='minPrice']")
    private WebElement price1;
    @FindBy(xpath = "//input[@id='maxPrice']")
    private WebElement price2;
    @FindBy(xpath = "//button[contains(text(),'Search')]")
    private WebElement searchVehicles;
    @FindBy(xpath = "//a[normalize-space()='2007 Volkswagen Golf City 2.0']")
    private WebElement car;
    @FindBy(xpath = "//button[@title='Click to add to My Favourites']")
    private WebElement addFavourites;
    @FindBy(xpath = "//a[@title='Post to Facebook']")
    private WebElement postFacebook;
    @FindBy(xpath = "//a[@title='Share with Facebook Messenger']")
    private WebElement shareWithFacebookMessenger;
    @FindBy(xpath = "//a[@title='Post to Twitter']")
    private WebElement postTwitter;
    @FindBy(xpath = "//a[@title='Post to Pinterest']")
    private WebElement postPinterest;
    @FindBy(xpath = "//a[@title='Email a Friend']")
    private WebElement mailFriend;
    @FindBy(xpath = "//button[@aria-label='Print this ad']")
    private WebElement print;
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Send message']")
    private WebElement sendMessage;
    @FindBy (xpath = "//input[@name='ogrenimLisansBolum']")
    private WebElement bolumLisans;
    @FindBy(xpath = "//input[@name='ogrenimLisansTarih']")
    private WebElement baslamaBitisTarihiLisans;

    public WebElement getOntario() {
        return ontario;
    }

    public WebElement getHamilton() {
        return hamilton;
    }

    public WebElement getGoButton() {
        return goButton;
    }

    public WebElement getCarsAndVehicles() {
        return carsAndVehicles;
    }

    public WebElement getCarsAndTrucks() {
        return carsAndTrucks;
    }


    public WebElement getPrice1() {
        return price1;
    }

    public WebElement getPrice2() {
        return price2;
    }

    public WebElement getSearchVehicles() {
        return searchVehicles;
    }

    public WebElement getCar() {
        return car;
    }

    public WebElement getAddFavourites() {
        return addFavourites;
    }

    public WebElement getPostFacebook() {
        return postFacebook;
    }

    public WebElement getShareWithFacebookMessenger() {
        return shareWithFacebookMessenger;
    }

    public WebElement getPostTwitter() {
        return postTwitter;
    }

    public WebElement getPostPinterest() {
        return postPinterest;
    }

    public WebElement getMailFriend() {
        return mailFriend;
    }

    public WebElement getPrint() {
        return print;
    }

    public WebElement getSendMessage() {
        return sendMessage;
    }


}
