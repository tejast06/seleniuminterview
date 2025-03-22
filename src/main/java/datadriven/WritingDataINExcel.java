package datadriven;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataINExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream file = new FileOutputStream("D:\\selenium\\seleniuminterview\\src\\main\\java\\datadriven\\file.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
	    XSSFSheet sheet = 	workbook.createSheet("Data");
	    XSSFRow row =  sheet.createRow(0);
	    row.createCell(0).setCellValue("1");
	    
	    XSSFRow row1 =  sheet.createRow(1);
	    row.createCell(0).setCellValue("2");
	    
	    workbook.write(file);
		
		

	}

}
