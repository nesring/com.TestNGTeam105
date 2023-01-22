package tests.day16_SmokeTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualityDemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C01_PozitifLoginTest {

    @Test
    public void pozitifLoginTest(){
        //qualitydemiy anasayfaya git
        // gitmek icin driver lazim = driver = Driver.getDriver()

        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

        QualityDemyPage qualityDemyPage= new QualityDemyPage();

        qualityDemyPage.cookiesAcceptButton.click();

        qualityDemyPage.ilkLoginLinki.click();

        qualityDemyPage.kullaniciEmailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        qualityDemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));

        qualityDemyPage.loginButonu.click();

        ReusableMethods.bekle(2);

        Assert.assertTrue(qualityDemyPage.basariliGirisCoursesLinki.isDisplayed());

        Driver.closeDriver();
    }

}
