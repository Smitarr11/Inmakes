package org.sam;
import java.awt.dnd.DragSourceDropEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BaseClass {
	public static WebDriver driver;
	
	
	public static void launchBrowser() {
		WebDriverManager.ChromeDriver().setup();
		 driver = new ChromeDriver();
			

	}
	public static void windowMaximize() {
	   driver.manage().window().maximize();
	}
	public static void launchUrl(String url){
		driver.get(url);
	}
	public static void pageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public static void pageUrl(){
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
		
	public static void passText(String txt,WebElement ele) {
		ele.sendKeys(txt);
    }
	public static void closeEntireBrowser() {
		driver.quit();
	}
	public static void clickBtn(WebElement ele) {
		ele.click();
	}
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
	    		
	    			public static void createCell(int rowNum,int cellNum,String newData)  throws IOException {
	    				File f = new File("C:\\Users\\harismita\\eclipse-workspace\\MavenProject\\Excel\\newfile.xlsx");
	    				FileInputSream fis = new FileInputStream(f);
	    				Workbook w = new XSSFWorkbook();
	    				Sheet s = w.createSheet("Data");
	    			    Row r = s.createRow(0);
	    			    Cell c  = r.createCell(0);
	    			    c.setCellValue(newData);
	    			    FileOutputStream fos = new FileOutputStream(f);
	    			    w.write(fos);
	    			}
	    			public static void createRow(int creNum,int creCell,String newData)  throws IOException {
	    				File f = new File("C:\\Users\\harismita\\eclipse-workspace\\MavenProject\\Excel\\newfile.xlsx");
	    				FileInputSream fis = new FileInputStream(f);
	    				Workbook w = new XSSFWorkbook();
	    				Sheet s = w.createSheet("Data");
	    			    Row r = s.createRow(0);
	    			    Cell c  = r.createCell(0);
	    			    c.setCellValue(newData);
	    			    FileOutputStream fos = new FileOutputStream(f);
	    			    w.write(fos);
	    			}
	    			public static void createNewExcelFile(int rowNum,int cellNum,String newData)  throws IOException {
	    				File f = new File("C:\\Users\\harismita\\eclipse-workspace\\MavenProject\\Excel\\newfile.xlsx");
	    			    Workbook w = new XSSFWorkbook();
	    				Sheet newSheet = w.createSheet("Data");
	    			    Row newRow = newSheet.createRow(0);
	    			    Cell newCell = newRow.createCell(0);
	    			    newCell.setCellValue(newData);
	    			    FileOutputStream fos = new FileOutputStream(f);
	    			    w.write(fos);
	    			
						

					}



