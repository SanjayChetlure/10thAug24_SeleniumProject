package Excel;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ex1_getBooleanData
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\10th Aug 2024\\10thAug24.xlsx");
	
		 boolean value = WorkbookFactory.create(file).getSheet("Sheet2").getRow(2).getCell(1).getBooleanCellValue();
		System.out.println(value);
	}
}
