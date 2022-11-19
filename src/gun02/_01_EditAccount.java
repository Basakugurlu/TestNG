package gun02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utility.BaseDriver;
import utility.tools;

public class _01_EditAccount extends BaseDriver {

    By editAccount=By.linkText("Edit Account");
    By firstName=By.id("input-firstname");

    By lastName=By.id("input-lastname");
    By submitButton= By.cssSelector("input[type='submit']");

    @Test
    void EditAccount()
    {
        editAccount("Aynur ","KAVAK");
        tools.Bekle(3);
        editAccount("Emin", "KAVAK");
    }
    void editAccount(String ad,String soyad){
        WebElement edit=driver.findElement(editAccount);
        edit.click();

        WebElement textFirstName=driver.findElement(firstName);
        textFirstName.clear();
        textFirstName.sendKeys(ad);

        WebElement textLastName=driver.findElement(lastName);
        textLastName.clear();
        textLastName.sendKeys(soyad);

        WebElement btnSubmit=driver.findElement(submitButton);
        btnSubmit.click();

        tools.successMessageValidation();


    }
}
