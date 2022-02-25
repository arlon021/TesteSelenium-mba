package com.thiago.page;

import com.thiago.core.CorePage;
import com.thiago.driver.TLDriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageGuruRegister extends CorePage<PageGuruRegister> {

    public PageGuruRegister(){
        this.driver = TLDriverFactory.getDriver();
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(name = "firstName")
    private WebElement firstName;

    @FindBy(name = "lastName")
    private WebElement lastName;

    @FindBy(name = "phone")
    private WebElement phone;

    @FindBy(name = "userName")
    private WebElement email;

    @FindBy(name = "address1")
    private WebElement address;

    @FindBy(name = "city")
    private WebElement city;

    @FindBy(name = "state")
    private WebElement state;

    @FindBy(name = "postalCode")
    private WebElement postalCode;

    @FindBy(name = "email")
    private WebElement userName;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(name = "confirmPassword")
    private WebElement confirmPassword;

    @FindBy(name = "submit")
    private WebElement button;

    @FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font/a")
    private WebElement signIn;

    @FindBy(name = "userName")
    private WebElement loginUserName;

    @FindBy(name = "password")
    private WebElement loginPassword;

    @FindBy(name = "submit")
    private WebElement button2;

    public void registrar(String nome){
        preencherCampo(firstName, nome);
        preencherCampo(lastName, nome);
        preencherCampo(phone, nome);
        preencherCampo(email, nome);
        preencherCampo(address, nome);
        preencherCampo(city, nome);
        preencherCampo(state, nome);
        preencherCampo(postalCode, nome);
        preencherCampo(userName, nome);
        preencherCampo(password, nome);
        preencherCampo(confirmPassword, nome);
        click(button);

        click(signIn);

        preencherCampo(loginUserName, nome);
        preencherCampo(loginPassword, nome);
        click(button2);
    }

}
