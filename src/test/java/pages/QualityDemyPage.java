package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.logging.XMLFormatter;

public class QualityDemyPage {

    public QualityDemyPage() {

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (xpath = "//*[text()='Accept']")
    public WebElement cookiesAcceptButton;

    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement ilkLoginLinki;

    @FindBy (id="login-email")
    public WebElement kullaniciEmailKutusu;

    @FindBy (id="login-password")
    public WebElement passwordKutusu;

@FindBy (xpath ="//button[text()='Login']")
public WebElement loginButonu;

@FindBy (linkText = "My courses")
public WebElement basariliGirisCoursesLinki;



}
