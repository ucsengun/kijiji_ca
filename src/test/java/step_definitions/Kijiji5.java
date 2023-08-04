package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Kijiji_POM;

public class Kijiji5 {
    Kijiji_POM ny = new Kijiji_POM();



    @Then("Açılan sayfadaki twitter logosuna tıkla.")
    public void açılanSayfadakiTwitterLogosunaTıkla() {
        ny.clickMethod(ny.getPostTwitter());
    }
}
