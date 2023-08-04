package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Kijiji_POM;

public class Kijiji6 {
    Kijiji_POM ny = new Kijiji_POM();



    @Then("Açılan sayfadaki pinterest butonuna tıkla.")
    public void açılanSayfadakiPinterestButonunaTıkla() {
        ny.clickMethod(ny.getPostPinterest());
    }
}
