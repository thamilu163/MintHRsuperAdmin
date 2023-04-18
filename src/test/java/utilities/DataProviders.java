package utilities;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import org.testng.annotations.DataProvider;

public class DataProviders {
	public static ResourceBundle ra; // to read
	// DataProvider 1

	@DataProvider(name = "LoginData")
	public static Object[][] getData() throws IOException {
		ra = ResourceBundle.getBundle("excelpath");
		String path = ra.getString("loginxl");// taking xl file from testData
		InputFromExcl ife = new InputFromExcl();
		List<Map<String, String>> maze = ife.readingEXL(path, "Sheet1");
		Object logindata[][] = new Object[maze.size()][1];// created for two dimension array which can store the
		HashMap<String, String> map; // = null; // data user and password
		int i = 0;
		for (Map<String, String> mmap : maze) {

			logindata[i][0] = mmap;
			i++;
		}
		return logindata;// returning two dimension array

	}

	// DataProvider 2
	@DataProvider(name="BasicDataOrg")
	public static Object[][] getOrgBasicData() throws IOException {
		ra=ResourceBundle.getBundle("excelpath");
		String path=ra.getString("addOrgBasicData"); //taking xl file from testData
		InputFromExcl ife=new InputFromExcl();
		List<Map<String,String>> lmss=ife.readingEXL(path,"basicdata");
		Object basicdata[][]=new Object[lmss.size()][1];
		HashMap<String, String> map;
		int i=0;
		for (Map<String, String>obd:lmss ) {
			basicdata[i][0]=obd;
			i++;
		}
		return basicdata;

	}
	// DataProvider 3

	// DataProvider 4
}
