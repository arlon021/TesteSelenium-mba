package com.thiago.page;

import com.thiago.core.CorePage;
import com.thiago.driver.TLDriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageGuruDragDrop extends CorePage<PageGuruDragDrop> {

    public PageGuruDragDrop() {
        this.driver = TLDriverFactory.getDriver();
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(id = "fourth")
    private WebElement btn5000;

    @FindBy(id = "credit2")
    private WebElement btnBank;

    @FindBy(id = "credit1")
    private WebElement btnSales;

    @FindBy(id = "bank")
    private WebElement espaco1;

    @FindBy(id = "amt7")
    private WebElement espaco2;

    @FindBy(id = "loan")
    private WebElement espaco3;

    @FindBy(id = "amt8")
    private WebElement espaco4;

    @FindBy(id = "equal")
    private WebElement perfect;

    public void arrastar(){
        dragAndDrop(btnBank, espaco1);
        dragAndDrop(btn5000, espaco2);
        dragAndDrop(btnSales, espaco3);
        dragAndDrop(btn5000, espaco4);

        aguardarElementoVisivel(perfect);
        Assert.assertEquals(getTextElement(perfect), "Perfect!");

    }
}
