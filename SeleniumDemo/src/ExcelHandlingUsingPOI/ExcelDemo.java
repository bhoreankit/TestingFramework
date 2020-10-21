package ExcelHandlingUsingPOI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//to read .xls file
public class ExcelDemo {
	
	public static void main(String[] args) {
		try {
			FileInputStream file=new FileInputStream("input/Testx.xls");
				Workbook book=new HSSFWorkbook(file);
				HSSFSheet sheet=(HSSFSheet) book.getSheet("Test");
				int rows=sheet.getLastRowNum(); 		
				System.out.println("Total number of rows: "+rows);
				for (int i = 0; i < rows; i++) {
					Row row=sheet.getRow(i);
					int cells=row.getLastCellNum();
					for (int j = 0; j < cells; j++) {
						Cell cell=row.getCell(j);
						try {
						System.out.println(cell.getStringCellValue()+"\t");	
						}catch(IllegalStateException e){
							System.out.print("* \t");
						}
						if(cell.getCellType().name().equals("NUMERIC")) {
							System.out.print(cell.getNumericCellValue()+"\t");
						}else if(cell.getCellType().name().equals("STRING")){
							System.out.print(cell.getStringCellValue()+"\t");
						}
					}
					System.out.println();
				}
				
			} catch (IOException e) {
				System.out.println("file not found");				
				e.printStackTrace();
			}
		
		/*try {
			FileInputStream file=new FileInputStream("input/TestPOIJXL.xlsx");
			XSSFWorkbook book=new XSSFWorkbook();
			XSSFSheet sheet=book.getSheet("Test");
			int rows=sheet.getLastRowNum();
			Row row;
			for (int i = 0; i <=rows; i++) {
				row=sheet.getRow(i);
				int cells=row.getLastCellNum();
				for (int j = 0; j < cells; j++) {
					Cell cell=row.getCell(j);
					if(cell.getCellType().name().equals("NUMERIC")) {
						System.out.print(cell.getNumericCellValue()+"\t");
					}else if(cell.getCellType().name().equals("STRING")){
						System.out.print(cell.getStringCellValue()+"\t");
					}
					System.out.println();
				}
			}
		} catch (IOException e) {
			System.out.println("file not found");
			e.printStackTrace();
		}*/
	
		
		
		
	}
	
}
