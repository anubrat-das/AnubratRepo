package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public static void main(String[] args) throws IOException {
		File f = new File("resources/empExcel.xlsx");
		InputStream is = new FileInputStream(f);
		
		
		Workbook wb = new XSSFWorkbook(is);
		
		Sheet sheet = wb.getSheet("empDetails");
		
		/*Row row = sheet.getRow(1);
		
		Cell cell = row.getCell(2);
		
		System.out.println(cell.getNumericCellValue());*/
		
		for(int i=0;i<sheet.getPhysicalNumberOfRows();i++){
			Row currRow = sheet.getRow(i);
			for(int j = 0;j<currRow.getLastCellNum();j++){
				Cell currCell = currRow.getCell(j);
				
				switch(currCell.getCellTypeEnum()){
				case STRING:
					System.out.print(currCell.getStringCellValue());
					break;
				case NUMERIC:
					System.out.print(currCell.getNumericCellValue());
					break;
				case BOOLEAN:
					System.out.print(currCell.getBooleanCellValue());
					break;
				default:
					System.out.print("Not a valid type of data in "+currCell.getAddress());
				}
				System.out.print("\t");
			}
			System.out.println();
		}
		wb.close();
	}

}
