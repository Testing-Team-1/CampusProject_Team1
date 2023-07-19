package StepDefinitions;

import Pages.Objects;
import Utilities.GWD;
import com.github.javafaker.Faker;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CreateAttachSteps {
    Objects objects=new Objects();
    Faker faker1=new Faker();

        //objects.clickFunction(objects.assignments);
    @And("Click on the element in page")
        public void clickOnTheElementInPage(DataTable items) {

        List<String> strButtons=items.asList();
        for(String strButton:strButtons)
        {
            WebElement element=objects.getWebElement(strButton);
            objects.clickFunction(element);
        }

        }
 //deneme1...
    @Then("Create a Homework")
    public void createAHomework() {
        objects.clickFunction(objects.homework);
        int b = 0;
        objects.clickFunction(objects.typeSelect.get(b));
        objects.sendKeysFunction(objects.nameInputAttach,faker1.animal().name());
        objects.clickFunction(objects.courseClick);
        int a=(int)(Math.random()*(objects.typeSelect.size()-1)+1);
        objects.clickFunction(objects.typeSelect.get(a));
        GWD.getDriver().switchTo().frame(objects.iframe);
        objects.sendKeysFunction(objects.textDescription,"ödevler yapilmali");
        GWD.getDriver().switchTo().parentFrame();
        objects.clickFunction(objects.addButton);

        objects.clickFunction(objects.fromMyFiles);
        int c = 0;
        for (int i = 0; i < objects.fileNames.size(); i++) {
            String filename=objects.fileNames.get(i).getText();
            int uzunlk=filename.indexOf(".");
            if(filename.substring((uzunlk+1)).equals("pdf")) {
                c = i;break;
            }
        }
        objects.clickFunction(objects.matCheckbox.get(c));

        objects.clickFunction(objects.select);
    }

    @Then("Click on the Save Button")
    public void clickOnTheSaveButton() {
        objects.clickFunction(objects.save);
    }

    @Then("Click on the Apply Button")
    public void clickOnTheApplyButton() {
        objects.clickFunction(objects.apply);
    }

    @And("Click on the Save&Publish Button")
    public void clickOnTheSavePublishButton() {
        objects.clickFunction(objects.saveAndPublish);
    }
    @And("Click on the ConfirmYes Button")
    public void clickOnTheConfirmYesButton() {
        objects.clickFunction(objects.yes);
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        objects.verifyContainsTextFunction(objects.success,"success");
    }


    @Then("Create a Project")
    public void createAProject() {
        objects.clickFunction(objects.homework);
        int b = 1;
        objects.clickFunction(objects.typeSelect.get(b));
        objects.sendKeysFunction(objects.nameInputAttach,faker1.animal().name());
        objects.clickFunction(objects.courseClick);
        int a=(int)(Math.random()*(objects.typeSelect.size()-1)+1);
        objects.clickFunction(objects.typeSelect.get(a));
        GWD.getDriver().switchTo().frame(objects.iframe);
        objects.sendKeysFunction(objects.textDescription,"Projeler yapilmali");
        GWD.getDriver().switchTo().parentFrame();
        objects.clickFunction(objects.addButton);

        objects.clickFunction(objects.fromMyFiles);
        int c = 0;
        for (int i = 0; i < objects.fileNames.size(); i++) {
            String filename=objects.fileNames.get(i).getText();
            int uzunlk=filename.indexOf(".");
            if(filename.substring((uzunlk+1)).equals("png")) {
                c = i;break;
            }
        }
        objects.clickFunction(objects.matCheckbox.get(c));

        objects.clickFunction(objects.select);
    }

    @Then("Create an Other")
    public void createAnOther() {
        objects.clickFunction(objects.homework);
        int b = 3;
        objects.clickFunction(objects.typeSelect.get(b));
        objects.sendKeysFunction(objects.nameInputAttach,faker1.animal().name());
        objects.clickFunction(objects.courseClick);
        int a=(int)(Math.random()*(objects.typeSelect.size()-1)+1);
        objects.clickFunction(objects.typeSelect.get(a));
        GWD.getDriver().switchTo().frame(objects.iframe);
        objects.sendKeysFunction(objects.textDescription,"Calisma yapragi");
        GWD.getDriver().switchTo().parentFrame();
        objects.clickFunction(objects.addButton);

        objects.clickFunction(objects.fromMyFiles);
        int c = 0;
        for (int i = 0; i < objects.fileNames.size(); i++) {
            String filename=objects.fileNames.get(i).getText();
            int uzunlk=filename.indexOf(".");
            if(filename.substring((uzunlk+1)).equals("xlsx")) {
                c = i;break;
            }
        }
        objects.clickFunction(objects.matCheckbox.get(c));

        objects.clickFunction(objects.select);

    }
}
