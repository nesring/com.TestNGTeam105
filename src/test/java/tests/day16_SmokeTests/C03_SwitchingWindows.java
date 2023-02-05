package tests.day16_SmokeTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.print.DocFlavor;

public class C03_SwitchingWindows {

    @Test
    public void test01(){

        ReusableMethods.bekle(3);

        // https://the-internet.herokuapp.com/iframe adresine gidin

        Driver.getDriver().get("https://the-internet.herokuapp.com/iframe");

        // elemenatlseenium linkine tiklayin

        Driver.getDriver().findElement(By.linkText("Elemental Selenium")).click();

        // title'i "Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro"
        // olan yeni window'a gecis yapin

        ReusableMethods.switchToWindow("Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro");

        // ve sayfa uzerinde h1 tag'inda "Elemental Selenium" yazisi oldugunu test edin

        String expectedYazi= "Elemental Selenium";
        String actualYazi = Driver.getDriver().findElement(By.tagName("h1")).getText();

        Assert.assertEquals(actualYazi,expectedYazi);

       // Driver.getDriver().quit();
      //  Driver.closeDriver();

        // xml ile toplu calistirdih+gimizda bundan sonraki test calismadi cunku
        // quit ile sayfayi kapatinca sonraki test driver classindan driver acamadi
        // o yuzden bunu iptal edip close yaptik..7/01/23


        // bunu da iptal edip drivet class ina quit driver metodu ekleyip deriver i close ile degil quit ile kapattik

        Driver.quitDriver();

    }



}
