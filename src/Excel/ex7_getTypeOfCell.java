package Excel;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ex7_getTypeOfCell
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\10th Aug 2024\\10thAug24.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");
		
		CellType type = sh.getRow(0).getCell(2).getCellType();
		System.out.println(type);
	}
}
