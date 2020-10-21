package ExcelHandlingUsingPOI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Practice1 {
	
	@Test(dataProvider="LoginData")
	public void test(int sr, String name, double phone, String city) {
		System.out.println(sr+" "+name+" "+phone+" "+city);

	}
	
	@DataProvider(name="LoginData")
	public Object[][] LoginData() throws IOException  {
		//Object[][] values=null; 
		FileInputStream file=new FileInputStream("input/TestPOIJXL.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet sheet=book.getSheet("Test");
		int rows=sheet.getLastRowNum();
		Row r=sheet.getRow(0);
		Object[][] values=new Object[rows][r.getLastCellNum()];
		for (int i = 0; i <= rows; i++) {
			Row row=sheet.getRow(i);
			int cells=row.getLastCellNum();
			for (int j = 0; j < cells; j++) {
				Cell cell=row.getCell(j);
				switch(cell.getCellType()){
					case NUMERIC:
					System.out.print(cell.getNumericCellValue()+"  ");
					break;
					case STRING:
						System.out.print(cell.getStringCellValue()+"  ");
						break;
					default:System.out.print("Invalid input");	
					
				}
			}
			System.out.println();
		}
		return values;
		
	}
}