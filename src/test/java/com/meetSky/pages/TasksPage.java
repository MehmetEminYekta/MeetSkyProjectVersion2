package com.meetSky.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TasksPage extends BasePage{

    @FindBy(xpath = "//div[@class='title']")
    public List<WebElement> tasksList;

    @FindBy (xpath = "//ol//button[@aria-label='Actions']")
    public List<WebElement> anyTaskChangeList;

    @FindBy(xpath = "//span[contains(.,'Delete')]")
    public WebElement deleteTask;

    @FindBy(xpath = "//span[contains(.,'Add subtask')]")
    public WebElement addSubTask;

    @FindBy(xpath = "//input[@placeholder[contains(.,'Add a subtask')]]")
    public WebElement inputSubTask;

}
