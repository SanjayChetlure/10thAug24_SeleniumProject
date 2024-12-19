package Excel;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ex4_getAllDataInARow
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\10th Aug 2024\\10thAug24.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
		
		int lastCellIndex = sh.getRow(1).getLastCellNum()-1;  //3-1=2
		
		//           4<=3
		for(int i=0; i<=lastCellIndex; i++)
		{  //                                   3
			String value = sh.getRow(1).getCell(i).getStringCellValue();
			System.out.print(value+" ");
		}
	}
}
