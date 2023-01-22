package tests.day15;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualityDemyPage;
import utilities.Driver;

public class C04_NegatifLoginTesti {

    // 3 test metodu olusturun.
    // 1. de yanlis e mail dogru sifre"
    //2.de dogru email yanlis sifre
    // 3. yanlis email yanlis sifre ile giris yapmayi deneyin.
    // giris yapilamadigini test edin

    QualityDemyPage qualityDemyPage = new QualityDemyPage();

    @Test
    public void yanlisEmailTesti(){

        Driver.getDriver().get("https://www.qualitydemy.com/");
        qualityDemyPage.cookiesAcceptButton.click();
        qualityDemyPage.ilkLoginLinki.click();
        qualityDemyPage.kullaniciEmailKutusu.sendKeys("mehmet@abc.com");
        qualityDemyPage.passwordKutusu.sendKeys("31488081");
        qualityDemyPage.loginButonu.click();

        Assert.assertTrue(qualityDemyPage.kullaniciEmailKutusu.isDisplayed());

        Driver.closeDriver();


        }

        @Test

        public void yanlisPasswordTesti(){

            Driver.getDriver().get("https://www.qualitydemy.com/");
            qualityDemyPage.cookiesAcceptButton.click();
            qualityDemyPage.ilkLoginLinki.click();
                        qualityDemyPage.kullaniciEmailKutusu.sendKeys("user_1106147@login.com");
            qualityDemyPage.passwordKutusu.sendKeys("123456");
            qualityDemyPage.loginButonu.click();

            Assert.assertTrue(qualityDemyPage.kullaniciEmailKutusu.isDisplayed());

            Driver.closeDriver();


        }

        @Test
    public void yanlisEmailYanlisPasswordTest(){

            Driver.getDriver().get("https://www.qualitydemy.com/");
            qualityDemyPage.cookiesAcceptButton.click();
            qualityDemyPage.ilkLoginLinki.click();
            qualityDemyPage.kullaniciEmailKutusu.sendKeys("mehmet@abc.com");
            qualityDemyPage.passwordKutusu.sendKeys("123456");
            qualityDemyPage.loginButonu.click();

            Assert.assertTrue(qualityDemyPage.kullaniciEmailKutusu.isDisplayed());

            Driver.closeDriver();

        }


}
