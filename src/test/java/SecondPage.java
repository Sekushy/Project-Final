import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecondPage extends PageObject {
    @FindBy(xpath = "/html/body/div/div[3]/main/div[2]/div[1]/div[1]/h1")
    private WebElement resultsHeader;

    public SecondPage(WebDriver driver) { super(driver); }

    public String getResultsHeader() {return this.resultsHeader.getText(); }
}
