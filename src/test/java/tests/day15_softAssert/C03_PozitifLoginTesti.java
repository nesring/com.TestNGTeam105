package tests.day15_softAssert;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualityDemyPage;
import utilities.Driver;

public class C03_PozitifLoginTesti {

    @Test(groups = "smoke")

    public void test01() {


        //1- https://www.qualitydemy.com/ anasayfasina gidin

        Driver.getDriver().get("https://www.qualitydemy.com/");

        //2- login linkine basin

        QualityDemyPage qualityDemyPage =new QualityDemyPage();

        qualityDemyPage.cookiesAcceptButton.click();

        qualityDemyPage.ilkLoginLinki.click();

        // 3- Kullanici email’i olarak valid email girin

        qualityDemyPage.kullaniciEmailKutusu.sendKeys("jinoda1750@quamox.com");

        // 4- Kullanici sifresi olarak valid sifre girin

        qualityDemyPage.passwordKutusu.sendKeys("Asd123123");

        // 5- Login butonuna basarak login olun

        qualityDemyPage.loginButonu.click();

        // 6- Basarili olarak giris yapilabildigini test edin

        Assert.assertTrue(qualityDemyPage.basariliGirisCoursesLinki.isDisplayed());

        Driver.closeDriver();




    }
}
