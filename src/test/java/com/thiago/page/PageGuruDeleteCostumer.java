package com.thiago.page;

import com.thiago.core.CorePage;
import com.thiago.driver.TLDriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageGuruDeleteCostumer extends CorePage<PageGuruDeleteCostumer> {

    public PageGuruDeleteCostumer(){
        this.driver = TLDriverFactory.getDriver();
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(name = "cusid")
    private WebElement costumerId;

    @FindBy(name = "submit")
    private WebElement button;

    public void deletecostumer(String nome){
        preencherCampo(costumerId, nome);
        click(button);
        acceptAlert();
        acceptAlert();
    }

}
