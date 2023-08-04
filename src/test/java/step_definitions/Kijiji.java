package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.Kijiji_POM;
import utilities.DriverClass;

public class Kijiji {

    Kijiji_POM ny = new Kijiji_POM();

    private JavascriptExecutor jsExecutor;
    //private WebDriver driver;


//    @Then("favorilere ekle")
//    public void favorilereEkle() {
//        ny.clickMethod(ny.getAddFavourites());
//
//        ny.clickMethod(ny.getPostFacebook());
//        ny.clickMethod(ny.getPostTwitter());
//        ny.clickMethod(ny.getPostPinterest());
//        ny.clickMethod(ny.getPrint());
//        ny.clickMethod(ny.getMailFriend());
//        ny.clickMethod(ny.getShareWithFacebookMessenger());
//        ny.clickMethod(ny.getSendMessage());
//    }

    @Given("Kijiji websitesine eriş.")
    public void kijijiWebsitesineEriş() {
        DriverClass.getDriver().get("https://www.kijiji.ca/");

    }

    @And("Adres olarak Hamiton seç.")
    public void adresOlarakHamitonSeç() {
        ny.clickMethod(ny.getOntario());
        ny.clickMethod(ny.getHamilton());

        ny.clickMethod(ny.getGoButton());
    }

    @And("Açılan sayfada Cars and vehicles seçeneği başlığındaki Cars and trucks a tıkla.")
    public void açılanSayfadaCarsAndVehiclesSeçeneğiBaşlığındakiCarsAndTrucksATıkla() {
        ny.clickMethod(ny.getCarsAndVehicles());
        ny.clickMethod(ny.getCarsAndTrucks());
    }

    @And("Price aralığını beş bin beş yüz elli beş ile beş bin beş yüz elli dokuz olarak doldur ve ara.")
    public void priceAralığınıBeşBinBeşYüzElliBeşIleBeşBinBeşYüzElliDokuzOlarakDoldurVeAra() {
        ny.sendKeysMethod(ny.getPrice1(), "5555");
        ny.sendKeysMethod(ny.getPrice2(), "5558");
        ny.clickMethod(ny.getSearchVehicles());
    }

    @And("Gelen sonuçlarda en üstteki seçeneğe tıkla.")
    public void gelenSonuçlardaEnÜsttekiSeçeneğeTıkla() {
        ny.clickMethod(ny.getCar());

    }

    @And("Açılan sayfadaki mesaj gönder butonuna tıkla.")
    public void açılanSayfadakiMesajGönderButonunaTıkla() throws InterruptedException {
      //  Thread.sleep(3000);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) DriverClass.getDriver();
        jsExecutor.executeScript("arguments[0].click();", ny.getSendMessage());
        ny.clickMethod(ny.getSendMessage());

    }


    @Then("Giriş penceresinin açıldığını doğrula.")
    public void girişPenceresininAçıldığınıDoğrula() {
        Assert.assertTrue(this.ny.verifyIsDisplayedMethod(this.ny.getSignInWindow()));
    }
}
