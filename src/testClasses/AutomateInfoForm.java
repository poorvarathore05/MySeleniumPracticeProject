package testClasses;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import helperClasses.ButtonHelper;
import helperClasses.ComboBoxHelper;
import helperClasses.textBoxHelper;

public class AutomateInfoForm extends LaunchBrowserTest {

	@Test
	public void automateForm() {

		driver.get(" https://www.techlistic.com/p/selenium-practice-form.html");
		textBoxHelper.typeInTextBox("firstname", "poorva");
		textBoxHelper.typeInTextBox("lastname", "rathore");
		ButtonHelper.clickButton(By.id("sex-0"));
		System.out.print("Selected :" + driver.findElement(By.id("sex-1")).isSelected());
		ButtonHelper.clickButton(By.id("sex-1"));
		ButtonHelper.clickButton(By.id("exp-4"));
		textBoxHelper.typeInTextBox("datepicker", "12/02/2020");
		ButtonHelper.clickButton(By.id("profession-1"));
		driver.findElement(By.id("tool-2"));
		ComboBoxHelper.select(By.id("continents"), 0);
		ComboBoxHelper.select(By.id("selenium_commands"), 4);
		ButtonHelper.clickButton(By.id("submit"));

	}

}
