package Excel;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ex2_getRowSizeInASheet
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\10th Aug 2024\\10thAug24.xlsx");
		
		int rowSize = WorkbookFactory.create(file).getSheet("Sheet2").getLastRowNum()+1;
		System.out.println(rowSize);
	}
}
