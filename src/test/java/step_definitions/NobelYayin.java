package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import pages.NobelYayin_POM;
import utilities.DriverClass;

public class NobelYayin {

    NobelYayin_POM ny = new NobelYayin_POM();

    private JavascriptExecutor jsExecutor;
    //private WebDriver driver;

    @Given("Nobel Yayin websitesine eriş.")
    public void nobelYayinWebsitesineEriş() {
        DriverClass.getDriver().get("https://www.kijiji.ca/");

    }

    @When("Websayfasını aşağıya doğru kaydır.")
    public void websayfasınıAşağıyaDoğruKaydır() {
        ny.clickMethod(ny.getOntario());
        ny.clickMethod(ny.getHamilton());

        ny.clickMethod(ny.getGoButton());
    }

    @And("Ana sayfanın site haritası kısmında yer alan İnsan Kaynakları butonuna tıkla.")
    public void anaSayfanınSiteHaritasıKısmındaYerAlanButonunaTıkla() {
        ny.clickMethod(ny.getCarsAndVehicles());
        ny.clickMethod(ny.getCarsAndTrucks());
    }



    @And("Açılan kayıt formundaki bütün girdileri boş bırak.")
    public void açılanKayıtFormundakiBütünGirdileriBoşBırak() {
        ny.sendKeysMethod(ny.getPrice1(), "5555");
        ny.sendKeysMethod(ny.getPrice2(), "5558");
        ny.clickMethod(ny.getSearchVehicles());
    }

    @And("Kayıt formunun alt kısmında yer alan Gönder butonuna tıkla.")
    public void kayıtFormununAltKısmındaYerAlanGönderButonunaTıkla() {
        ny.clickMethod(ny.getCar());
    }


    @Then("favorilere ekle")
    public void favorilereEkle() {
        ny.clickMethod(ny.getAddFavourites());
    }

}
