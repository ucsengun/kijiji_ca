package step_definitions;

import io.cucumber.java.en.Given;
import pages.Kijiji_POM;
import utilities.DriverClass;

public class NobelYayin_Login {
    Kijiji_POM ny =new Kijiji_POM();
    @Given("Nobel Yayin login")
    public void NobelYayinLogin() {
        DriverClass.getDriver().get("https://www.nobelyayin.com/");
       // eu.clickMethod(eu.getLoginButton());
       // eu.sendKeysMethod(eu.getEmailInput(),"qahuntproject@gmail.com");
       // eu.sendKeysMethod(eu.getPasswordInput(),"qahunt123!");
       // eu.clickMethod(eu.getSubmitButton());

    }
}
