package Pages;

import Utilities.GWD;
import jdk.dynalink.linker.LinkerServices;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class Objects extends Parent {

    public Objects(){
        PageFactory.initElements(GWD.getDriver(),this);
    }

   // @FindBy(xpath="//ms-add-button[contains(@tooltip,'ADD')]//button")
   // public WebElement addButton;

    @FindBy(css = "input[formcontrolname='username']")
    public WebElement username;
    @FindBy(css = "input[formcontrolname='password']")
    public WebElement password;
    @FindBy(css = "span[class='logo-text ng-star-inserted']")
    public WebElement textTechnoStudy;
    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginButton;


    @FindBy(xpath = "//*[@icon='tasks']")
    public WebElement assignments;
    @FindBy(xpath = "//ms-add-button//button")
    public WebElement addButton;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    public WebElement nameInputAttach;
    @FindBy(xpath = "(//span[text()='Course'])[1]")
    public WebElement courseClick;
    @FindBy(xpath = "//span[text()='Homework']")
    public WebElement homework;
    @FindBy(xpath = "(//div[@class='cdk-overlay-pane'])[2]//mat-option")
    public List<WebElement> typeSelect;
    @FindBy(xpath = "//iframe[@class='tox-edit-area__iframe']")
    public WebElement iframe;
    @FindBy(xpath = "//*[@id='tinymce']/p")
    public WebElement textDescription;
    @FindBy(xpath = "(//*[@role='menu']//ms-standard-button)[2]")
    public WebElement fromMyFiles;
    @FindBy(xpath = "(//tbody[@role='rowgroup'])[2]//tr")
    public List<WebElement> myDriverList;
    @FindBy(xpath = "(//tbody[@role='rowgroup'])[2]//tr//mat-checkbox")
    public List<WebElement> matCheckbox;
    @FindBy(xpath = "(//tbody[@role='rowgroup'])[2]//tr//span[@class='mat-tooltip-trigger ng-star-inserted']")
    public List<WebElement> fileNames;
    @FindBy(xpath = "//ms-button//span[text()='Select']")
    public WebElement select;
    @FindBy(xpath = "//button//span[text()='Save']")
    public WebElement save;
    @FindBy(xpath = "//button//span[text()='Apply']")
    public WebElement apply;
    @FindBy(xpath = "//button//span[text()='Save & Publish']")
    public WebElement saveAndPublish;
    @FindBy(xpath = "//button//span[text()=' Yes ']")
    public WebElement yes;

    // Success Message
    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement success;

















    public WebElement getWebElement(String strButton){
        switch (strButton)
        {
            //case "addButton" : return addButton;
            case "username": return username;
            case "password": return password;
            case "textTechnoStudy": return textTechnoStudy;
            case "assignments": return assignments;
            case "add Button" : return addButton;
            case "Save": return save;
            case "Apply": return apply;
            case "Save&Publish": return saveAndPublish;
            case "ConfirmYes" : return yes;



        }
        return null;
    }

    public void deleteItem(String searchText){
        //sendKeysFunction(searchInput,searchText);
        //clickFunction(searchButton);

       /* wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*") , 0));

        clickFunction(deleteImageBtn);
        clickFunction(deleteDialogBtn);  */

    }


}
