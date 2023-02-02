package tests.day18_htmlReports;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.QualityDemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C03_DataProviderIleNegatifLoginTesti {


    // QualityDemy anasayfaya gidin
    // verilen yanlis kullanici adi ve password kombinasyonlari icin giris yapilamadigini test edin
    // username     password
    // A11         A12345
    // B12         B12345
    // C13         C12345
    // D14         D12345
    // E15         E12345

    @DataProvider
    public static Object[][] kullaniciBilgileri() {

        Object[][] kullaniciBilgileriArr ={{"A11","A12345"},{"B12","B12345"},{"C13","C12345"},{"D14","D12345"},{"E15","E12345"}};

        return kullaniciBilgileriArr;
    }

    @Test (dataProvider = "kullaniciBilgileri")

    public void negativeLoginTest(String username, String password){


        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

        QualityDemyPage qualityDemyPage=new QualityDemyPage();

        qualityDemyPage.ilkLoginLinki.click();

        if (qualityDemyPage.cookiesAcceptButton.isDisplayed()){
            qualityDemyPage.cookiesAcceptButton.click();
        }
        ReusableMethods.bekle(2);

        qualityDemyPage.kullaniciEmailKutusu.sendKeys(username);
        qualityDemyPage.passwordKutusu.sendKeys(password);
        qualityDemyPage.loginButonu.click();

        Assert.assertTrue(qualityDemyPage.kullaniciEmailKutusu.isDisplayed());

    }


}
