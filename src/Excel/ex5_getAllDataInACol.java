package Excel;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ex5_getAllDataInACol
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\10th Aug 2024\\10thAug24.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
		
		int lastRowIndex = sh.getLastRowNum();
		
		for(int i=0; i<=lastRowIndex; i++)
		{
			String value = sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value);
		}
	}
}
