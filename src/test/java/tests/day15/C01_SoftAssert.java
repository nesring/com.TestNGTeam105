package tests.day15;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Arrays;

public class C01_SoftAssert {

    @Test
    public void test01() {

        // amazon anasayfaya gidin

        Driver.getDriver().get("https://www.amazon.com");

        // amazon anasayfaya gittiginizi dogrulayin

        SoftAssert softAssert= new SoftAssert();

        String expectedUrlKelime = "amazon";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains(expectedUrlKelime));

        // nutella aratin

        AmazonPage amazonPage = new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        // arama sonuclarinin nutella icerdigini dogrulayin

        String aramaSonucYazisi =amazonPage.aramaSonucuElementi.getText();
        softAssert.assertTrue(aramaSonucYazisi.contains("Nutella"));

        // java aratin
        amazonPage.amazonAramaKutusu.clear();
        amazonPage.amazonAramaKutusu.sendKeys("Java"+Keys.ENTER);

        ReusableMethods.bekle(10);

        // arama sonuclarinin 1000 den fazla oldugunu dogrulayin

        // 1-48 of over 7,000 results for "Java"

        aramaSonucYazisi= amazonPage.aramaSonucuElementi.getText();
        String[] sonucArr=aramaSonucYazisi.split(" ");
        // [1-48, of, over, 7,000, results, for, "Java"]

        String javaSonucsayisiStr = sonucArr[3]; //7,000

        javaSonucsayisiStr=javaSonucsayisiStr.replaceAll("\\W",""); // 7000
        int sonucSayisiInt= Integer.parseInt(javaSonucsayisiStr);

        softAssert.assertTrue(sonucSayisiInt>1000);


        softAssert.assertAll();
        Driver.closeDriver();

    }
}
