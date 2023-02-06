package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageBase
{
	public HomePage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver; 
		action = new Actions(driver); 
	}
	
	@FindBy(id = "twotabsearchtextbox")
	WebElement searchbar ;

	@FindBy(id = "nav-search-submit-button")
	WebElement submitsearch ;


	@FindBy(xpath = "//img[@src='https://m.media-amazon.com/images/I/517-22CtGVL._AC_UL320_.jpg']")
	WebElement item;

	@FindBy(id = "cartadded")
	WebElement cartadded;

	@FindBy(id = "nav-cart")
	WebElement cart;

//	@FindBy(linkText="Log in")
//	WebElement loginLink;
//
//	@FindBy(linkText="Contact us")
//	WebElement contactUsLink ;
//
//	@FindBy(id="customerCurrency")
//	WebElement currencydrl;
//
//	@FindBy(linkText="Computers")
//	WebElement ComputerMenu;
//
//	@FindBy(linkText="Notebooks")
//	WebElement NotbooksMenu;
//
	
	public void openRegistrationPage() 
	{
//		clickButton(searchbar);
		setTextElementText(searchbar, "car accessories");
		clickButton(submitsearch);
	}

	public void addtocart()
	{
		clickButton(item);
		clickButton(cartadded);
		clickButton(cart);
	}

	public void itemcheck(){


	}
	
	public void openLoginPage()
	{
	//	clickButton(loginLink);
	}

	public void openContactUsPage()

	{
//		scrollToBottom();
//		clickButton(contactUsLink);
	}

	public void changeCurrency()
	{
////		select = new Select(currencydrl);
//		select.selectByVisibleText("Euro");
	}

	public void selectNotebooksMenu()
	{
//		action
//		.moveToElement(ComputerMenu)
//		.moveToElement(NotbooksMenu)
//		.click()
//		.build()
//		.perform();
	}


}
