package step_definitions;

import io.cucumber.java.en.Then;
import pages.Kijiji_POM;

public class Kijiji8 {

    Kijiji_POM ny = new Kijiji_POM();
    @Then("Açılan sayfadaki yazdırma logosuna tıkla.")
    public void açılanSayfadakiYazdırmaLogosunaTıkla() {
        ny.clickMethod(ny.getPrint());
    }
}
