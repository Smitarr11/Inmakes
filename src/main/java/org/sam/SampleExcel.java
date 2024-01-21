package org.sam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SampleExcel {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\harismita\\eclipse-workspace\\MavenProject\\Excel\\Samplemaven.xlsx");
		FileInputStream fis = new FileInputStream(f);
	    Workbook wb = new XSSFWorkbook(fis);
	    Sheet mysheet = wb.getSheet("Challenge2");
	    
	    for (int i = 0; i < mysheet.getPhysicalNumberOfRows(); i++) {
	    	Row iterateRow = mysheet.getRow(i);
	    	
	    	for (int j = 0; j < iterateRow.getPhysicalNumberOfCells(); j++) {
	    		Cell c = iterateRow.getCell(j);
	    		int cellType = c.getCellType();
	    		if (cellType==1) {
					String value = c.getStringCellValue();
					//System.out.println(value);
				}
	    		else if (DateUtil.isCellDateFormatted(c)) {
	    			Date dd = c.getDateCellValue();
	    			SimpleDateFormat s = new SimpleDateFormat("dd- MMM -yy ");
	    			String value = s.format(dd);
					//System.out.println(value);
	    			
				}
	    		else {
					double d = c.getNumericCellValue();
					long l = (long)d;
					String value = String.valueOf(l);
					System.out.println(value);
					
				}
					
				
	    		
	    	
	    		
				
			}
			
		}
	   
	}

}
