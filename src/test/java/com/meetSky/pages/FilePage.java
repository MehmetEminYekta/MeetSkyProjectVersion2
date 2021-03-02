package com.meetSky.pages;

import com.meetSky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilePage {

    public FilePage(){
        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(xpath = "((//div[@id='controls'])/div/a/span)[1]")
    public WebElement addFileButton;

    @FindBy(xpath = "(//label[@class='menuitem']/span)[1]")
    public WebElement UploadFileButton;
    @FindBy(xpath = "//label[@for='select-files-3399']")
    public WebElement selectedChechboxButton;
    @FindBy(xpath = "(//a[@class='actions-selected'])[1]")
    public WebElement ActionsTab;
    @FindBy(xpath = "//li[@class='item-delete']")
    public  WebElement DeleteItem;
    @FindBy(xpath = "//a[text()='Deleted files']")
    public  WebElement DeletedFilesButton;
    @FindBy(xpath = "//span[text()='Çankaya']")
    public  WebElement CankayaFile;
    @FindBy(xpath = "//tr[@data-file='Talk']/td/label")
    public WebElement TalkFileCheckBox;
    @FindBy(xpath = "//li[@class='item-copyMove']")
    public WebElement CopyMoveItem;
    @FindBy(xpath = "//div[@id='oc-dialog-filepicker-content']/span/span/a")
    public WebElement ChooseTargetFolderAddButton;
    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement FileNemeInputBox;
    @FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement NewFolderConfirmButton;
    @FindBy(xpath = "//button[@class='primary']")
    public WebElement CopyToButton;
    @FindBy(xpath = "((//tbody[@id='fileList']/tr[@data-file='Talk']/td/a/span)[1])/span")
    public WebElement TalkFileText;
    @FindBy(tagName = "(((//tbody/tr)[5])/td)[2]")
    public  WebElement EminFile;
    @FindBy(xpath = "//a[@id='nextcloud']")
    public  WebElement MeetSky;
    @FindBy(xpath = "(//td[@class='filename'])[2]")
    public  WebElement NotesFile;
    @FindBy(xpath = "//tbody[@id='fileList']/tr[@data-file='Notes']")
    public WebElement NotesFileDashboard;
    @FindBy(xpath = "(//div[@class='oc-dialog']/div/button)[2]")
    public WebElement MoveTO;




}
