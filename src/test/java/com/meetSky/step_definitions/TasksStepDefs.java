package com.meetSky.step_definitions;

import com.meetSky.pages.TasksPage;
import com.meetSky.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class TasksStepDefs {

    @Then("the user should see all tasks list under Task module")
    public void the_user_should_see_all_tasks_list_under_Task_module() {

        List<WebElement> allTalkConversationList = new TasksPage().tasksList;
        for (WebElement webElement : allTalkConversationList) {

            Assert.assertTrue(webElement.isDisplayed());
        }
        BrowserUtils.waitFor(2);

    }

    @Then("user can add a sub-task to any selected task")
    public void user_can_add_a_sub_task_to_any_selected_task() {
        TasksPage tasksPage = new TasksPage();
        List<WebElement> anyTaskChangeList = tasksPage.anyTaskChangeList;
        int numberOfTasksBefore= tasksPage.tasksList.size();
        Random random = new Random();
        int rand = random.nextInt(tasksPage.anyTaskChangeList.size());
        String subTaskName = tasksPage.tasksList.get(rand).getText()+"subTask";
        tasksPage.anyTaskChangeList.get(rand).click();
        BrowserUtils.waitFor(2);
        tasksPage.addSubTask.click();
        BrowserUtils.waitFor(2);

        tasksPage.inputSubTask.sendKeys(subTaskName+ Keys.ENTER);
        BrowserUtils.waitFor(3);
        int numberOfTasksAfter= tasksPage.tasksList.size();
        Assert.assertTrue(numberOfTasksAfter-numberOfTasksBefore==2);
 }

    @Then("User can delete any selected task")
    public void user_can_delete_any_selected_task() {
        TasksPage tasksPage = new TasksPage();
        List<WebElement> anyTaskChangeList = tasksPage.anyTaskChangeList;
        int numberOfTasksBefore= tasksPage.tasksList.size();
        Random random = new Random();
        int rand = random.nextInt(tasksPage.anyTaskChangeList.size());
        tasksPage.anyTaskChangeList.get(rand).click();
        BrowserUtils.waitFor(2);
        tasksPage.deleteTask.click();
        BrowserUtils.waitFor(10);
        int numberOfTasksAfter= tasksPage.tasksList.size();
        Assert.assertTrue(numberOfTasksBefore-numberOfTasksAfter==1);
    }

}
