package com.meetSky.step_definitions;

import com.meetSky.pages.ContactsPage;
import com.meetSky.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ContactStepDefs {

    @Then("the user should see contact list")
    public void the_user_should_see_contact_list() {
        List<WebElement> contactList = new ContactsPage().contactList;
        for (WebElement webElement : contactList) {
            Assert.assertTrue(webElement.isDisplayed());
        }
        BrowserUtils.waitFor(2);
    }

    @Then("the user click on new contact")
    public void the_user_click_on_new_contact() {
        new ContactsPage().newContactButton.click();
    }

    @Then("the user should be able to fill new contact's information")
    public void the_user_should_be_able_to_fill_new_contact_s_information(List<String> newContactInfo1) {
        new ContactsPage().createdInfoList1(newContactInfo1);
    }

    @Then("the user should be able to fill following information")
    public void the_user_should_be_able_to_fill_following_information(List<String> newContactInfo2) {
        new ContactsPage().createdInfoList2(newContactInfo2);
        BrowserUtils.waitFor(10);
    }

//    @Then("the user should verify new contact's information created")
//    public void the_user_should_verify_new_contact_s_information_created(io.cucumber.datatable.DataTable dataTable) {
//        // Write code here that turns the phrase above into concrete actions
//        // For automatic transformation, change DataTable to one of
//        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
//        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
//        // Double, Byte, Short, Long, BigInteger or BigDecimal.
//        //
//        // For other transformations you can register a DataTableType.
//        throw new io.cucumber.java.PendingException();
//    }
//
//    @Then("the user should verify following  information created")
//    public void the_user_should_verify_following_information_created(io.cucumber.datatable.DataTable dataTable) {
//        // Write code here that turns the phrase above into concrete actions
//        // For automatic transformation, change DataTable to one of
//        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
//        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
//        // Double, Byte, Short, Long, BigInteger or BigDecimal.
//        //
//        // For other transformations you can register a DataTableType.
//        throw new io.cucumber.java.PendingException();
//    }

}

