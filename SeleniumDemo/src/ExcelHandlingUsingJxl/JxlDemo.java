package ExcelHandlingUsingJxl;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class JxlDemo {

	public static String[][] readExcel() {
		File file = new File("input/Testx.xls");
		String[][] content=null;
		try {
			Workbook book = Workbook.getWorkbook(file);
			Sheet sheet = book.getSheet(0);
			// System.out.println(sheet.getCell(0, 0).getContents());
			int rows = sheet.getRows();//get how many active rows
			int clm = sheet.getColumns();
			content=new String[rows][clm];
			System.out.println("Rows: " + rows + " Column: " + clm);
			for (int i = 0; i < rows; i++) {

				for (int j = 0; j < clm; j++) {
					Cell cell = sheet.getCell(j, i);
					content[i][j]=cell.getContents();

				}
				System.out.println();
			}

		} catch (BiffException | IOException e) {
			System.err.println("Unable to open Excel file");
			e.printStackTrace();
		}
		return content;
	}

}
