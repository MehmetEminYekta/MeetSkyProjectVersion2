package com.meetSky.step_definitions;

import com.meetSky.pages.FilePage;
import com.meetSky.utilities.BrowserUtils;
import com.meetSky.utilities.Driver;
import io.cucumber.java.en.*;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class FileStepDefs {
    @When("the user deleted any selected file")
    public void the_user_deleted_any_selected_file() throws InterruptedException {
        FilePage filePage=new FilePage();
        Actions actions=new Actions(Driver.get());
        Thread.sleep(1);
        //Hover over to checkboxButton
        actions.moveToElement(filePage.selectedChechboxButton).perform();
        //Click to checkboxButton
        filePage.selectedChechboxButton.click();
        Thread.sleep(3000);
        //Hover over to Actions
        actions.moveToElement(filePage.ActionsTab).perform();
        //Click to Actions
        filePage.ActionsTab.click();
        //Hover over to DeleteItem
        actions.moveToElement(filePage.DeleteItem).perform();
        Thread.sleep(5000);
        //Click to DeleteItem
        filePage.DeleteItem.click();
        Thread.sleep(5000);

    }

    @Then("verify the file deleted successfully")
    public void verify_the_file_deleted_successfully() throws InterruptedException {
        FilePage filePage=new FilePage();
        //Hover over to DeletedFileButton
        Actions actions=new Actions(Driver.get());
        actions.moveToElement(filePage.DeletedFilesButton).perform();
        filePage.DeletedFilesButton.click();
        Thread.sleep(4000);
        System.out.println(filePage.CankayaFile.getText());
        Assert.assertEquals("verify deleted Cankayafile is under the DeletedFiles ","Çankaya",filePage.CankayaFile.getText());


    }
    @When("the user move or copy any selected item")
    public void the_user_move_or_copy_any_selected_item() throws InterruptedException {
        FilePage filePage=new FilePage();
        Actions actions=new Actions(Driver.get());
        Thread.sleep(1);
        //Hover over to checkboxButton
        actions.moveToElement(filePage.TalkFileCheckBox).perform();
        filePage.TalkFileCheckBox.click();
        actions.moveToElement(filePage.ActionsTab).perform();
        filePage.ActionsTab.click();
        actions.moveToElement(filePage.CopyMoveItem).perform();
        filePage.CopyMoveItem.click();
        Thread.sleep(2000);
        actions.moveToElement(filePage.NotesFile).perform();
        Thread.sleep(2000);
        filePage.NotesFile.click();
        Thread.sleep(2000);
        actions.moveToElement(filePage.CopyToButton).perform();
        Thread.sleep(2000);
        filePage.CopyToButton.click();
        Thread.sleep(2000);


    }

    @Then("verify the file move or copy successfully")
    public void verify_the_file_move_or_copy_successfully() throws InterruptedException {
        FilePage filePage=new FilePage();
        Actions actions=new Actions(Driver.get());
        actions.moveToElement(filePage.MeetSky).perform();
        filePage.MeetSky.click();
        Thread.sleep(2000);
        actions.moveToElement(filePage.NotesFileDashboard).perform();
        filePage.NotesFileDashboard.click();
        Thread.sleep(2000);
        System.out.println("filePage.TalkFileText.getText() = " + filePage.TalkFileText.getText());
        Assert.assertEquals("verify deleted Talkfile is under the NotesFile ","Talk",filePage.TalkFileText.getText());





    }

}
