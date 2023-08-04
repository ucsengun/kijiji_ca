package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Kijiji_POM;

public class Kijiji3 {

    Kijiji_POM ny = new Kijiji_POM();


    @Then("Açılan sayfadaki facebook logosu butonuna tıkla.")
    public void açılanSayfadakiFacebookLogosuButonunaTıkla() {
        ny.clickMethod(ny.getPostFacebook());
    }
}
