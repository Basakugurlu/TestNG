package gun02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.BaseDriver;

import java.util.ArrayList;
import java.util.List;



public class _02_ValidateMenu extends BaseDriver {
/*
  Senaryo
  1- Siteyi açınız.
  2- Top Menudeki menu elemanlarının olduğunu doğrulayınız.(menuValidation)
  3- Desktops, Laptops & Notebooks, Components, Tablets, Software, Phones & PDAs, Cameras, MP3 Players
 */
    @Test
     void menuValidation(){
        List<WebElement>menuActuallist=driver.findElements(By.cssSelector("ul[class='nav navbar-nav']>li"));

        //for(WebElement e:menuActuallist)
           // System.out.println(e.getText());

        List<String>menuExpectedList=new ArrayList<>();
        menuExpectedList.add("Desktops");
        menuExpectedList.add("Laptops&Notebooks");
        menuExpectedList.add("Componenets");
        menuExpectedList.add("Tablets1");
        menuExpectedList.add("Software");
        menuExpectedList.add("phones&PDAs");
        menuExpectedList.add("cameras");
        menuExpectedList.add("MP3Players");

        for(int i=0;i<menuExpectedList.size();i++)
            Assert.assertEquals(menuActuallist.get(i).getText(),menuExpectedList.get(i),"Menu Beklenen gibi degil");

    }
}
