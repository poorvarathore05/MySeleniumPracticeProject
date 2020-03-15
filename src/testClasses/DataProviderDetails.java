package testClasses;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDetails{

	

	@DataProvider(name ="loginProvider")
	public static Object[][] customerdata() {

		Object[][] data = new Object[3][3];

		data[0][0] = "poorvarathore@gmail.com";
		data[0][1] = "rathore";
		data[0][2] =  true;
		data[1][0] = "poorvarathore02@gmail.com";
		data[1][1] = "rathore";
		data[1][2] =  true;
		data[2][0] = "poorvarathore02@gmail.com";
		data[2][1] = "rathore";
		data[2][2] =  false;

		return data;
	}

}
