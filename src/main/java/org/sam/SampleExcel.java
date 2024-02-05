package org.sam;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SampleExcel {
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\syuva\\eclipse-workspace\\MavenPractice\\Excel\\SampleData.xlsx");
		
		FileInputStream fi = new FileInputStream(f);
		
		Workbook j = new XSSFWorkbook(fi);
		
		Sheet sheet1 = j.getSheet("Datas");
		
		for (int i = 0; i < sheet1.getPhysicalNumberOfRows(); i++) {
			
			Row row = sheet1.getRow(i);
			
			for (int k = 0; k < row.getPhysicalNumberOfCells(); k++) {
				Cell cell = row.getCell(k);
				
				System.out.println(cell);
			}
			
		}
		
		
		
		
		
	}

}
