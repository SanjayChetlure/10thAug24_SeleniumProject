package Excel;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ex1_getNumericData
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\10th Aug 2024\\10thAug24.xlsx");
	
		double value = WorkbookFactory.create(file).getSheet("Sheet2").getRow(1).getCell(0).getNumericCellValue();
		System.out.println(value);
	}
}
