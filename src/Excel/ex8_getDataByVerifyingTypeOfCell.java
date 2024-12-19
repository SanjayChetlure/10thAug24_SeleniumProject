package Excel;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ex8_getDataByVerifyingTypeOfCell
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\10th Aug 2024\\10thAug24.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");
		
		 Cell s1 = sh.getRow(0).getCell(2);
		 CellType type = s1.getCellType();
		 
		 if(type==CellType.STRING)
		 {
			 System.out.println(s1.getStringCellValue());
		 }
		 else if(type==CellType.NUMERIC)
		 {
			 System.out.println(s1.getNumericCellValue());
		 }
		 else if(type==CellType.BOOLEAN)
		 {
			 System.out.println(s1.getBooleanCellValue());
		 }	 
	}
}
