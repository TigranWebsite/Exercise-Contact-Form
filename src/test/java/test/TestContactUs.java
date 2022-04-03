package test;

import base.Base;
import org.testng.annotations.Test;
import page.ContactUsPage;

public class TestContactUs extends Base {
    ContactUsPage contactUsPage;

    @Test(priority = 1)
    public void contactUs() {
        contactUsPage = new ContactUsPage(driver);
        driver.get("https://automationexercise.com/");
        contactUsPage.setContact();
        contactUsPage.setName();
        contactUsPage.setEmail();
        contactUsPage.setSubject();
        contactUsPage.setMessage();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        contactUsPage.setFileUploader();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        contactUsPage.setSubmit();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        contactUsPage.alert();


    }
}
