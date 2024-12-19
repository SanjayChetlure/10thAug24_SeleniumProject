package Excel;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ex1_getStringData
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\10th Aug 2024\\10thAug24.xlsx");
	
		String value = WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
				
		
//		Workbook s1 = WorkbookFactory.create(file);
//		
//		Sheet sh = s1.getSheet("Sheet2");
//		Row rw = sh.getRow(0);
//		Cell cl = rw.getCell(0);
//		
//		String value1 = cl.getStringCellValue();
//		System.out.println(value1);		
	}
}
