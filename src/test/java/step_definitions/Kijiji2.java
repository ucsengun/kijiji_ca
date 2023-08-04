package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Kijiji_POM;

public class Kijiji2 {

    Kijiji_POM ny = new Kijiji_POM();

    @Then("Açılan sayfadaki favorilerime ekle butonuna tıkla.")
    public void açılanSayfadakiFavorilerimeEkleButonunaTıkla() {
        ny.clickMethod(ny.getAddFavourites());
    }
}
