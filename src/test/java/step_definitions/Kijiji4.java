package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Kijiji_POM;

public class Kijiji4 {
    Kijiji_POM ny = new Kijiji_POM();



    @Then("Açılan sayfadaki facebook messenger logosuna tıkla.")
    public void açılanSayfadakiFacebookMessengerLogosunaTıkla() {
        ny.clickMethod(ny.getShareWithFacebookMessenger());
    }
}
