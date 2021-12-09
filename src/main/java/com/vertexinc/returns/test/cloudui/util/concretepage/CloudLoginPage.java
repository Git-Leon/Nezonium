package com.vertexinc.returns.test.cloudui.util.concretepage;

import com.vertexinc.returns.test.cloudui.util.DriverHandler;
import com.vertexinc.returns.test.cloudui.util.Page;
import com.vertexinc.returns.test.cloudui.util.pageinterface.CloudLogInPageInterface;


public class CloudLoginPage extends Page implements CloudLogInPageInterface {

    public CloudLoginPage(DriverHandler driverHandler) {
        super(driverHandler);
    }


    public void enterUserName(String usernameInput) {
        getDriverHandler().sendKeys(getUsernameField(), usernameInput);
    }

    public String getUserName() {
        return getDriverHandler().getElement(getUsernameField()).getText();
    }

    public void login(String usernameInput, String passwordInput) {
        getDriverHandler().sendKeys(getUsernameField(), usernameInput);
        getDriverHandler().sendKeys(getPasswordField(), passwordInput);
        getDriverHandler().click(getLogInButton());
//       return new CloudHomePage(getDriverHandler());
    }

}
