package testClasses;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import helperClasses.ButtonHelper;
import helperClasses.ComboBoxHelper;
import helperClasses.TypeInTextBox;
import helperClasses.WindowHelper;
import helperClasses.textBoxHelper;

public class UserRegisterationDummy extends LaunchBrowserTest {

	@Test
	public void registratonPage() {

		driver.get(" http://automationpractice.com/index.php");
		WindowHelper.maximazie();
		ButtonHelper.clickButton(By.className("login"));
		textBoxHelper.typeInTextBox(By.id("email_create"), "poorvarathore02@gmail.com");
		ButtonHelper.clickButton(By.id("SubmitCreate"));
		// System.out.println("Title :"+driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Login - My Store"));
		ButtonHelper.clickButton(By.id("id_gender2"));
		TypeInTextBox textBox = new TypeInTextBox();
		textBox.typeMethod(By.id("customer_firstname"), "poorva");
		textBoxHelper.typeInTextBox(By.id("customer_firstname"), "Poorva");
		textBoxHelper.typeInTextBox(By.id("customer_lastname"), "Rathore");
		textBoxHelper.typeInTextBox(By.id("passwd"), "rathore");
		ComboBoxHelper.select(By.id("days"), 4);
		ComboBoxHelper.select(By.id("months"), 6);
		ComboBoxHelper.select(By.id("years"), 10);
		ButtonHelper.clickButton(By.id("optin"));
		// textBoxHelper.typeInTextBox(By.id("firstname"), "Poorva");
		// textBoxHelper.typeInTextBox(By.id("lastname"), "Rathore");
		textBoxHelper.typeInTextBox(By.id("company"), "XYZ");
		textBoxHelper.typeInTextBox(By.id("address1"), "700 Eaves West valley");
		textBoxHelper.typeInTextBox(By.id("address2"), "#123");
		textBoxHelper.typeInTextBox(By.id("city"), "San Jose");
		ComboBoxHelper.select(By.id("id_state"), 5);
		textBoxHelper.typeInTextBox(By.id("postcode"), "70012");
		textBoxHelper.typeInTextBox(By.id("phone"), "70012456");
		textBoxHelper.typeInTextBox(By.id("phone_mobile"), "70012111");
		textBoxHelper.typeInTextBox(By.id("alias"), "700 west Valley");
		ButtonHelper.clickButton(By.id("submitAccount"));
		// System.out.println("Title :"+driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("My Store"));
		WindowHelper.backward();

	}

}
