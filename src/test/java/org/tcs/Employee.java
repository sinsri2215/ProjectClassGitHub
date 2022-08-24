package org.tcs;

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

public class Employee {
	
	public static void main(String[] args) throws IOException {
		
		//excel location
		File excelLocation = new File("C:\\Users\\sriram\\eclipse-workspace\\MavenClass\\ExcelSheet1\\Book1.xlsx");
		
		//covert file object into java object
		FileInputStream stream = new FileInputStream(excelLocation);
		
		//initialize workbook
		Workbook w = new XSSFWorkbook(stream);
		
		//to get sheet from workbook
		Sheet s = w.getSheet("DATA");
		
		//to iterate rows
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			//to get the row from sheet one by one
			Row r = s.getRow(i);
			//iterate cells
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				//to get cells one by one
				Cell c = r.getCell(j);
				
				// get proper string , no , date
				int cellType = c.getCellType();
				
				//type 1 == string cell
				//type 0 == numeric cell
				
				if (cellType == 1) {
					String cellValue = c.getStringCellValue();
					System.out.println(cellValue);
					
					
				}
				if (cellType == 0) {
					//date cell & numeric cell
					if (DateUtil.isCellDateFormatted(c)) {
						Date dateCellValue = c.getDateCellValue();
						SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-YYYY");
						String dateValue = dateformat.format(dateCellValue);
						System.out.println(dateValue);
						
					} else {
						double cellValue = c.getNumericCellValue();
						//convert double into long
						long l = (long)cellValue;
						//convert long into string
						String valueOf = String.valueOf(l);
                        System.out.println(valueOf);
					}
					
				}
			}
				
				
			}
				
			}
			
	}
	


	
		
		
		
		
		
		
		
	


