package Package1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.File;


public class Logic  {

	public Variables Var1 = new Variables();
	static XSSFWorkbook workbook = new XSSFWorkbook(); 
	static XSSFSheet sheet = workbook.createSheet("Expense Report");
	static XSSFRow rowhead = sheet.createRow((short)0);
	public static int col = 0;
	
	public void Headers() throws Exception {
		
	 int i = 0, loc1 = 0, mon = 0,loc2 = 0, loop1 = 0,loop2 = 0,loop3 = 0, day = 0, loop4 = 0, year = 0;

		rowhead.createCell(0).setCellValue("Date");  
		rowhead.createCell(1).setCellValue("KM Start");  
		rowhead.createCell(2).setCellValue("KM End");  
		rowhead.createCell(3).setCellValue("KM Total");  
		rowhead.createCell(4).setCellValue("Business Purpose"); 
		rowhead.createCell(5).setCellValue("Km @ $0.55"); 
		
		ColAdjust ();

		
		
 		while (i < Var1.LDS.size() ) { 
 		    loop1 = 0; loop2= 0; loop3 = 0;  loop4 = 0; 
 		   XSSFRow row = sheet.createRow(col+1);
 	
  		while ( loop1 < 7) {
  			System.out.println("location loop hit" + i+1);
	
  			if(Var1.LDS.get(i)[0].getSelectedItem() == Var1.Locations[loop1]) {
  				System.out.println("box one hit " + loop1);
  				row.createCell(1).setCellValue(Var1.Locations[loop1]);
  				loc1 = loop1;
  				
  			}
  			
  			if(Var1.LDS.get(i)[1].getSelectedItem() == Var1.Locations[loop1]) {
  				System.out.println("box two hit " + loop1);
  				row.createCell(2).setCellValue(Var1.Locations[loop1]);
  				loc2 = loop1;
  			}
  			loop1++;
  			
 		row.createCell(3).setCellValue(Var1.Distances[loc1][loc2]*2);
 		row.createCell(4).setCellValue("0");
 		row.createCell(5).setCellValue( (Var1.Distances[loc1][loc2]*2)*0.55 );	
  		
  		}
  		
  		
  		while ( loop2 < 7) {
 			
 			if (Var1.DDS.get(i)[2].getSelectedItem() == Var1.Years[loop2]) {
 				year = loop2;
 				System.out.println(Var1.DDS.get(i)[2].getSelectedItem());
 		
 			}	
 			loop2++;
 		}
  		
  		
  		while (loop3 < 12 ) {
 			if (Var1.DDS.get(i)[1].getSelectedItem() == Var1.Months[loop3]) {
 				System.out.println(Var1.DDS.get(i)[1].getSelectedItem());
 				mon = loop3;
 				
 			}
 			loop3++;
 		}
  		
  		
  		 while (loop4 < 31 )  {
 			 if (Var1.DDS.get(i)[0].getSelectedItem() == Var1.Days[loop4]) {
 				 System.out.println(Var1.DDS.get(i)[0].getSelectedItem());
 				 day = loop4;
 			 }
 			 loop4++;
 		 }
  		
  		row.createCell(0).setCellValue( Var1.Months[mon] + "/"  +Var1.Days[day] +"/" + Var1.Years[year]);
  		
  		i++;
  		col++;
 		ColAdjust();			
  	}
	
 		
  		FileOutputStream fileOut = new FileOutputStream("C:\\Users\\slawrence\\eclipse-workspace\\MilageTraker1.0\\Excel Storage\\Milage Tracker1.xlsx");
 		workbook.write(fileOut);
 		workbook.close();
		
		
	}
	
	public static void ColAdjust () {
		int i = 0;
		while (i <= 5 ) {
			sheet.autoSizeColumn(i);
			i++;
		}
	}
	
	

	
	
	
}
