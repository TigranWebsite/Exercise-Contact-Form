package page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ContactUsPage {

    WebDriver driver;

    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a[href=\"/contact_us\"]")
    WebElement contact;
    @FindBy(name = "name")
    WebElement name;
    @FindBy(name = "email")
    WebElement email;
    @FindBy(name = "subject")
    WebElement subject;

    public void setSubject() {
        subject.sendKeys("Hello Subject");

    }

    @FindBy(id = "message")
    WebElement message;

    @FindBy(name = "submit")
    WebElement submit;

    @FindBy(name="upload_file")
    WebElement fileUploader;

    public void setFileUploader(){
        fileUploader.sendKeys("C:\\Users\\33tig\\Downloads\\Listam_jmeter-Selenium-java-wd-junit.java");
    }

    public void setSubmit() {
        submit.submit();
    }

    public void setMessage() {
        message.sendKeys("This is message from ACA Tigran");
    }

    public void setEmail() {
        email.sendKeys("tigran@aca.am");
    }

    public void setName() {
        name.sendKeys("Tigran");
    }

    public void setContact() {
        contact.click();
    }

    public void alert() {
        Alert alert = driver.switchTo().alert();
        String str = alert.getText();
        Assert.assertEquals(str, "Press OK to proceed!", "cant  be submitted");
        alert.accept();
    }
}
