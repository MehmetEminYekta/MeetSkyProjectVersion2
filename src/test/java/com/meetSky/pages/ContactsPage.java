package com.meetSky.pages;

import com.meetSky.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ContactsPage extends BasePage {

    @FindBy(id = "new-contact-button")
    public WebElement newContactButton;

    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement contactEnterName;

//    @FindBy(xpath = "//input[@inputmode='tel']")
//    public WebElement phoneBox;
//
//    @FindBy(xpath = "//input[@inputmode='email']")
//    public WebElement emailBox;

    @FindBy(xpath = "//div[@class='contact-header__infos']//input[@type='text']")
    public List<WebElement> infoContactsBoxes1;

    @FindBy(xpath = "//input[@type='text' and @class='property__value']")
    public List<WebElement> infoContactsBoxes2;


    @FindBy(css = ".app-content-list-item")
    public List<WebElement> contactList;


    public void createdInfoList1(List<String> info) {
        for (int i = 0; i < infoContactsBoxes1.size(); i++) {
            infoContactsBoxes1.get(i).clear();
            infoContactsBoxes1.get(i).click();
            infoContactsBoxes1.get(i).sendKeys(info.get(i));
            BrowserUtils.waitFor(1);
        }

    }

    public void createdInfoList2(List<String> info) {
        for (int i = 0; i <= infoContactsBoxes2.size(); i++) {
            infoContactsBoxes2.get(i).clear();
            infoContactsBoxes2.get(i).click();
            infoContactsBoxes2.get(i).sendKeys(info.get(i));
            BrowserUtils.waitFor(1);
        }

    }


}
