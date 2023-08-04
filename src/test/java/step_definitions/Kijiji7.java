package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Kijiji_POM;
import utilities.DriverClass;

public class Kijiji7 {
    Kijiji_POM ny =new Kijiji_POM();

    @Then("Açılan sayfadaki email butonuna tıkla.")
    public void açılanSayfadakiEmailButonunaTıkla() {
        ny.clickMethod(ny.getMailFriend());
    }
}
