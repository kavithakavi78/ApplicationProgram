package org.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.resources.BaseClass;

public class CartPage extends BaseClass {
	public CartPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//font[text()=' K9-BD-01 ']")
	private WebElement SelectPet;
	@FindBy(xpath="//font[text()=' K9-RT-01 ']")
	private WebElement ChoosePet;
	@FindBy(xpath="(//a[text()='Add to Cart'])[1]")
	private WebElement addtoCart;
	@FindBy(name="updateCartQuantities")
	private WebElement UpdateCart;
	@FindBy(xpath="//a[text()='Return to Main Menu']")
	private WebElement MainMenu;
	@FindBy(xpath="//a[text()='Remove']")
	private WebElement RemoveCart;
	@FindBy(xpath="//a[text()='Proceed to Checkout']")
	private WebElement checkout;
	@FindBy(xpath="(//input[@type='submit'])[2]")
	private WebElement submit;
	@FindBy(xpath="//a[text()='Confirm']")
	private WebElement Confirm;
	public WebElement getSelectPet() {
		return SelectPet;
	}
	public WebElement getChoosePet() {
		return ChoosePet;
	}
	public WebElement getAddtoCart() {
		return addtoCart;
	}
	public WebElement getUpdateCart() {
		return UpdateCart;
	}
	public WebElement getMainMenu() {
		return MainMenu;
	}
	public WebElement getRemoveCart() {
		return RemoveCart;
	}
	public WebElement getCheckout() {
		return checkout;
	}
	public WebElement getSubmit() {
		return submit;
	}
	public WebElement getConfirm() {
		return Confirm;
	}
	
	
	
	
	
	
	

}
