package datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataINExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream file = new FileInputStream("D:\\selenium\\seleniuminterview\\src\\main\\java\\datadriven\\testdata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
	    XSSFSheet sheet = 	workbook.getSheet("Sheet1");
	    int row =   sheet.getLastRowNum();
	    int cell= sheet.getRow(1).getLastCellNum();
	    System.out.println("Total rows" +row);
	    System.out.println("total cells" +cell);
	    
	    for(int r=0; r<=row; r++) {
	   XSSFRow currentRow =	sheet.getRow(r);
	    	for(int c=0; c<cell; c++) {
	    	XSSFCell currentCell =	currentRow.getCell(c);
	    		
	    	}
	    }
	    workbook.close();
	    
		
		
	
		
	}

}
