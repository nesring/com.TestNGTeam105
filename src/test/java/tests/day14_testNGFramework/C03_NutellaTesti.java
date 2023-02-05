package tests.day14_testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

public class C03_NutellaTesti {

    @Test(groups ={ "minireg1","minireg2","smoke"})
    public void test01(){
        // amazon anasayfaya gidin

        ReusableMethods.bekle(3);
        Driver.getDriver().get("https://www.amazon.com");

        // nutella icin arama yapin

        WebElement aramaKutusu = Driver.getDriver().findElement(By.id("twotabsearchtextbox"));

        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        // sonuclarin Nutella icerdigini test edin

        WebElement aramaSonucuElementi = Driver.getDriver().findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));

        String expectedKelime = "Nutella";
        String actualAramaSonucu = aramaSonucuElementi.getText();

        Assert.assertTrue(actualAramaSonucu.contains(expectedKelime));

        Driver.closeDriver();


        //bu testi yapabilmek icin oncelikle driver olusturaiz gerek
        // bunu da utilities altinda Driver class'inda yapacagiz
        // TestBase sadece 1 clasaa extends edebildigimiz icin yeterli degil
        // artik driver. calismayacak, onun yerine
        // Driver.getDriver().


    }
}
