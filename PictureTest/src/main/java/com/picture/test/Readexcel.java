package com.picture.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexcel {
	
	@SuppressWarnings("resource")
	public static String CellData(int RowNum, int ColNum) throws IOException {
		
	File src = new File("D:\\TestData.xlsx");
	FileInputStream fis=new FileInputStream(src);
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);

	XSSFSheet sheet = wb.getSheetAt(0);
	
	DataFormatter formatter = new DataFormatter();
	
	Cell celldata= sheet.getRow(RowNum).getCell(ColNum);
	String data = formatter.formatCellValue(celldata);
	
	return data;
	
	}

}
