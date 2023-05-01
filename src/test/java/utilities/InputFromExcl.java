package utilities;

import java.io.IOException;
import java.util.*;

public class InputFromExcl {
	public List<Map<String, String>> readingEXL(String path, String sheetName) throws IOException{
		List<Map<String, String>> list = new ArrayList<>();
		ExcelUtility exobj=new ExcelUtility (path);
		for(int i=1; i<exobj.getRowCount(sheetName);i++) {
			Map<String, String> mMap=new LinkedHashMap<>();
			for(int j=0; j<exobj.getCellCount(sheetName, j); j++) {
				mMap.put(exobj.getCellData(sheetName, 0, j), exobj.getCellData(sheetName, i, j));
			}
			list.add( mMap);
		}
		return list;
	}

}
