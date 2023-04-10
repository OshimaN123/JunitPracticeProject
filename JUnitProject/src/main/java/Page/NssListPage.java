package Page;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NssListPage extends BasePage {
	WebDriver driver;

	public NssListPage(WebDriver driver2) {
		// Initializing the class variable 'this.driver' by parameter 'driver2'
		this.driver = driver2;

	}

	@FindBy(id = "label-first")
	WebElement Header_Element;

	@FindBy(name = "allbox")
	WebElement Toggle_All_Checkbox;

	@FindBy(css = "[type='checkbox']")
	List<WebElement> checkboxlist;

	@FindBy(name = "data")
	WebElement Insert_Name;

	@FindBy(css = "[value='Add']")
	WebElement click_on_Add_Button;

	@FindBy(css = "[type='checkbox']")
	List<WebElement> click_to_select_Name;

	@FindBy(name = "submit")
	WebElement remove_Button;
	@FindBy(name = "categorydata")
	WebElement insertAddCatagory;
	@FindBy(css = "[value='Add category']")
	WebElement CatButton;

	public void validateNssListPage() {
		//"NSS-TODO List v 1.1"
		
System.out.println("Header_Element");
System.out.println(	Header_Element.getText());
		Assert.assertEquals(Header_Element.getText(), "NSS-TODO List v 1.1");
	}

	public void toogleAllBoxChecked() {
		Toggle_All_Checkbox.click();
		System.out.println("clicked toogle all box");

	}

	public void validateAllCheckBox() {
		System.out.println("Inside : validateAllCheckBox ");

		System.out.println("Checkbox Size :  " + checkboxlist.size());

		for (int index = 0; index < checkboxlist.size(); index++) {

			WebElement checkbox = checkboxlist.get(index);
			System.out.println("Checkbox: " + checkbox.isSelected());

		}

		System.out.println("End : validateAllCheckBox ");

	}

	public void InsertName(String name) throws InterruptedException {

		Insert_Name.sendKeys(name);
		Thread.sleep(2000);

	}

	public void ClickOnAddButton() {
		click_on_Add_Button.click();
	}

	public void clickToselectName() {
		int size = click_to_select_Name.size();
		System.out.println("size: " + size);
		for (int index = 0; index < click_to_select_Name.size(); index++) {
			WebElement checkBox = click_to_select_Name.get(index);
			String name = checkBox.getAttribute("name");
			System.out.println("name:" + name);
			if (name.equalsIgnoreCase("allbox") == false) {
				checkBox.click();

			} // end of if
			break;
		} // end of for loop

	}

	public void clickonRemoveButton() {
		remove_Button.click();
	}

	
}
