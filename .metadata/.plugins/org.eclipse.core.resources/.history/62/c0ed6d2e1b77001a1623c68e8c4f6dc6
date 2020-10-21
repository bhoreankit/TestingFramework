package ExcelHandlingUsingPOI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Practice {

	public static void main(String[] args) throws IOException {	
		FileInputStream file=new FileInputStream("input/TestPOIJXL.xlsx");  //file object
		XSSFWorkbook workbook=new XSSFWorkbook(file);   
		XSSFSheet sheet=workbook.getSheet("Test");
		int rowcount=sheet.getLastRowNum();// returns row count
		System.out.println(rowcount);
		int colcount=sheet.getRow(0).getLastCellNum(); //returns column/cell count
		System.out.println(colcount);
		for (int i = 0; i < rowcount; i++) {
			XSSFRow currentrow=sheet.getRow(i);        //focus on current Row and (XSSFRow we are storing row type variable)
			for (int j = 0; j < colcount; j++) {  
				String value=currentrow.getCell(j).toString();   //read value from cell value.  //getStringcellValue,getNumericCellValue,getBooleanCellValue
				System.out.print(value +"\t");
			}
			System.out.println();
		}
		
	}

}
