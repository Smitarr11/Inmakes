package org.en;

import java.io.IOException;

import org.sam.BaseClass;

public class ExcelEntry extends BaseClass{
public static void main(String[] args) throws IOException {
	createNewEcelFile(0, 0, "selenium");
	createCell(0, 1, "java");
	createCell(0, 2, "data driven");
	createCell(0, 2, "POM");
	
	createRow(1, 0, "appium");
	createCell(1, 1, "cucumber");
	createCell(1, 2, "Junit");
	createCell(1, 3, "TestNg");
}
}
