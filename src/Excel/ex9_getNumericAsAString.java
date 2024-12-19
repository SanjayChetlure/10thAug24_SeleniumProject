package Excel;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ex9_getNumericAsAString
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\10th Aug 2024\\10thAug24.xlsx");
	
		 String value = WorkbookFactory.create(file).getSheet("Sheet4").getRow(0).getCell(1).getStringCellValue();
		System.out.println(value);
	}
}
