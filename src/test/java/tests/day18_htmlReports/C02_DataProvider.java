package tests.day18_htmlReports;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_DataProvider {
    @DataProvider
    public static Object[][] AmazonAranacakKelimeler() {
        /*
        @DataProvider istedigimiz test method'una test datasi saglamak icin kullanilir
        sadece 1 sarti vardir,
        iki katli bir object array'i dondurmelidir

         */

        Object[][] amazonAranacakKelimelerArrayi ={{"Nutella"},{"Apple"},{"Samsung"},{"Armut"}};
        return amazonAranacakKelimelerArrayi;
    }

    // amazona gidelim
    // Nutella, java, apple, samsung, armut kelimeleri icin arama yapalim
    // sonuclarin bu kelimelri icerdigini test edelim

    // farkli datalar icin ayni test tekra tekra calisacak


    @Test(dataProvider = "AmazonAranacakKelimeler")
    public void aramaTesti(String aranacakKelime){

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys(aranacakKelime+ Keys.ENTER);
        String actualSonucYazisi = amazonPage.aramaSonucuElementi.getText();

        Assert.assertTrue(actualSonucYazisi.contains(aranacakKelime));

    }
}
