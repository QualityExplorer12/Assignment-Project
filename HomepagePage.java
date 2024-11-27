package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomepagePage extends BasePage {

	WebDriver driver;

	public HomepagePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(xpath = "//div[text()='Revenue Calculator']")
	WebElement revenuecalculator;

	@FindBy(xpath = "/html/body/div[2]")
	WebElement scrolldown;

	@FindBy(xpath = "//input[@type='range']")
	WebElement slider;

	@FindBy(xpath = "//*[@id=':r0:']")
	WebElement textbox;

	@FindBy(xpath = "/html/body/div[2]/div[1]/div[2]/div[1]/label/span[1]/input")
	WebElement CPT99091;

	@FindBy(xpath = "/html/body/div[2]/div[1]/div[2]/div[1]/label/span[1]/input")
	WebElement CPT99453;

	@FindBy(xpath = "/html/body/div[2]/div[1]/div[2]/div[3]/label/span[1]/input")
	WebElement CPT99454;

	@FindBy(xpath = "/html/body/div[2]/div[1]/div[2]/div[8]/label/span[1]/input")
	WebElement CPT99474;

	public void RevenueCalculator() 
	{
		revenuecalculator.click();
	}

	public void ScrollDown() {
		Actions actions = new Actions(driver);
		actions.moveToElement(slider).perform();
	}

	public void Slide()
	{
		Actions actions = new Actions(driver);
		 actions.dragAndDropBy(slider, 94, 0).perform();
	}

	public void UpdateTextBox()
	{
		textbox.clear();
		textbox.sendKeys("560");
	}

	public void SelectCPTcodes() {
		CPT99091.click();
		CPT99453.click();
		CPT99454.click();
		CPT99474.click();
	}

}
