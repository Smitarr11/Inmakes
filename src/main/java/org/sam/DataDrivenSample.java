package org.sam;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenSample {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\harismita\\eclipse-workspace\\MavenProject\\Excel\\newfile.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet newsheet = w.createSheet("Data");
	    Row newRow = newsheet.createRow(0);
	    Cell newcell = newRow.createCell(0);
	    newcell.setCellValue("selenium");
	    FileOutputStream fos = new FileOutputStream(f);
	    w.write(fos);
	}

}
