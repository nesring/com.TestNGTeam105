package tests.day16_SmokeTests;

import org.checkerframework.checker.units.qual.C;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import pages.QualityDemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ResourceBundle;

public class C02_NegatifLoginTesti {
    // 3 test metodu olusturun.
    // 1. de yanlis e mail dogru sifre"
    //2.de dogru email yanlis sifre
    // 3. yanlis email yanlis sifre ile giris yapmayi deneyin.
    // giris yapilamadigini test edin

    QualityDemyPage qualityDemyPage =new QualityDemyPage();

    @Test
    public void yanlisEmailTesti(){

        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        qualityDemyPage.cookiesAcceptButton.click();
        qualityDemyPage.ilkLoginLinki.click();
        qualityDemyPage.kullaniciEmailKutusu.sendKeys(ConfigReader.getProperty("qdGecersizUsername"));
        qualityDemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        qualityDemyPage.loginButonu.click();

        Assert.assertTrue(qualityDemyPage.kullaniciEmailKutusu.isDisplayed());

        ReusableMethods.bekle(2);
        Driver.closeDriver();

          }


    @Test
    public void yanlisPasswordTesti(){

        qualityDemyPage= new QualityDemyPage();

        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        qualityDemyPage.cookiesAcceptButton.click();
        qualityDemyPage.ilkLoginLinki.click();
        qualityDemyPage.kullaniciEmailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        qualityDemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecersizPassword"));
        qualityDemyPage.loginButonu.click();

        Assert.assertTrue(qualityDemyPage.kullaniciEmailKutusu.isDisplayed());

        ReusableMethods.bekle(2);
        Driver.closeDriver();

   }

   @Test
    public void yanlisUsernameYanlisPasswordTesti(){
    qualityDemyPage =new QualityDemyPage();
    Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
       qualityDemyPage.cookiesAcceptButton.click();
    qualityDemyPage.ilkLoginLinki.click();
    qualityDemyPage.kullaniciEmailKutusu.sendKeys(ConfigReader.getProperty("qdGecersizUsername"));
    qualityDemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecersizPassword"));
    qualityDemyPage.loginButonu.click();

       Assert.assertTrue(qualityDemyPage.kullaniciEmailKutusu.isDisplayed());

       ReusableMethods.bekle(2);
       Driver.closeDriver();


   }
}
