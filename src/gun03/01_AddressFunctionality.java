package gun03;

import utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utility.BaseDriver;

import java.util.List;

/*
       Senaryo;
       1- Siteyi açınız.
       2- Adress Ekleyiniz.
       3- En son adresi edit yaparak ad ve soyadı değiştirip kaydediniz.
       4- En son adresi siliniz.
 */
 class _01_AddressFunctionality extends BaseDriver {

    @Test(priority = 1)
    void addAddress (){

        WebElement myAccount = driver.findElement(By.linkText("Address Book"));
        myAccount.click();

        WebElement newAddressBtn = driver.findElement(By.linkText("New Address"));
        newAddressBtn.click();



        WebElement addressFirstName = driver.findElement(By.id("input-firstname"));
        //addressFirstName.clear();
        addressFirstName.sendKeys("asdasd");

        WebElement addressLastName = driver.findElement(By.id("input-lastname"));
        //addressLastName.clear();
        addressLastName.sendKeys("asdwqexzc");

        WebElement address1 = driver.findElement(By.id("input-address-1"));
        address1.sendKeys("Kasasdk");

        WebElement city = driver.findElement(By.id("input-city"));
        city.sendKeys("Mmmannn");

        WebElement postCode = driver.findElement(By.id("input-postcode"));
        postCode.sendKeys("21W2");

        WebElement countryMenu = driver.findElement(By.id("input-country"));

        Select dbMenu = new Select(countryMenu);
        dbMenu.selectByValue("222"); // stane element hatası selectByIndex de karşılaşabiliyoruz.
        //bu durumda aşağıda ki gibi bir drum eklememiz gerekiyor.
        //selectByVisibleText,selectValue implicity wait ile çalıştı
        //selectByIndex implicity wait ile çalışmıyor
        //selectByVisibleText select value il sorunsuz çalışır ve beklemeye ihtiyacı olmaz

        wait.until(ExpectedConditions.elementToBeClickable(countryMenu));
        // wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.cssSelector("select[id='input-zone']>option"))));
        //bu elemanın bayatlamış hali gidene kadar bekle

        WebElement zoneMenu = driver.findElement(By.id("input-zone"));

        dbMenu = new Select(zoneMenu);
        dbMenu.selectByValue("3513");

        WebElement defaultAddress = driver.findElement(By.cssSelector("input[type='radio'][value='1']"));
        defaultAddress.click();

        WebElement submitBtn = driver.findElement(By.cssSelector("input[type='submit']"));
        submitBtn.click();



    }
    
    @Test(dependsOnMethods = {"addAddress"})
    void  editAddress (){

        WebElement myAccount = driver.findElement(By.linkText("Address Book"));
        myAccount.click();

        List<WebElement> edit = driver.findElements(By.linkText("Edit"));

        WebElement sonEdit = edit.get(edit.size()-1);//son edit
        sonEdit.click();

        WebElement addressFirstName = driver.findElement(By.id("input-firstname"));
        addressFirstName.clear();
        addressFirstName.sendKeys("Şevket");

        WebElement addressLastName = driver.findElement(By.id("input-lastname"));
        addressLastName.clear();
        addressLastName.sendKeys("Yıldırım");

        WebElement defaultAddress = driver.findElement(By.cssSelector("input[type='radio'][value='0']"));
        defaultAddress.click();

        WebElement submitBtn = driver.findElement(By.cssSelector("input[type='submit']"));
        submitBtn.click();


    }

    @Test(dependsOnMethods = {"editAddress"})
    void deleteAddress(){
        WebElement myAccount = driver.findElement(By.linkText("Address Book"));
        myAccount.click();

        List<WebElement> deleteAll = driver.findElements(By.linkText("Delete"));
        WebElement silinebilirAdres = deleteAll.get(deleteAll.size()-2);
        silinebilirAdres.click();
    }


//    public void EditAddressName (String ad, String soyad){
//
//        WebElement addressFirstName = driver.findElement(By.id("input-firstname"));
//        addressFirstName.clear();
//        addressFirstName.sendKeys(ad);
//
//
//        WebElement addressLastName = driver.findElement(By.id("input-lastname"));
//        addressLastName.clear();
//        addressLastName.sendKeys(soyad);
//
//    }
}
