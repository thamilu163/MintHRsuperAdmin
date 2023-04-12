package utilities;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


import org.testng.annotations.DataProvider;


public class DataProviders {

	// DataProvider 1

	@DataProvider(name = "LoginData")
	public static Object[][] getData() throws IOException {
		String path = ".\\testData\\loginminthr.xlsx";// taking xl file from testData
		 InputFromExcl ife=new InputFromExcl();
		List <Map<String, String>> maze=ife.readingEXL(path, "Sheet1");
        Object logindata[][] = new Object[maze.size()][1];// created for two dimension array which can store the
		HashMap<String, String> map; // = null; // data user and password
		int i=0;
		for (Map<String, String> mmap :maze) {
			
			logindata[i][0] =mmap;
			i++;
		}
		return logindata;// returning two dimension array

	}

	// DataProvider 2
	@DataProvider(name = "Login")
	public String[][] loginData() throws IOException {
		String path = ".\\testData\\loginminthr.xlsx";// taking xl file from testData

		ExcelUtility xlutil = new ExcelUtility(path);// creating an object for XLUtility

		int totalrows = xlutil.getRowCount("Sheet1");
		int totalcols = xlutil.getCellCount("Sheet1", 1);

		String logindata[][] = new String[totalrows][totalcols];// created for two dimension array which can store the
																// data user and password

		for (int i = 1; i <= totalrows; i++) // 1 //read the data from xl storing in two deminsional array
		{
			for (int j = 0; j < totalcols; j++) // 0 i is rows j is col
			{
				logindata[i - 1][j] = xlutil.getCellData("Sheet1", i, j); // 1,0
			}
		}
		return logindata;// returning two dimension array

	}
	// DataProvider 3

	// DataProvider 4
}
