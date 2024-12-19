package Excel;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ex44_getAllDataInARow
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\10th Aug 2024\\10thAug24.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");
		
		int lastCellIndex = sh.getRow(0).getLastCellNum()-1;  //4-1=3
		
		//           0<=3
		for(int i=0; i<=lastCellIndex; i++)
		{                //     1          0                   
			Cell s1 = sh.getRow(0).getCell(i);
			CellType type = s1.getCellType();
			
			if(type==CellType.STRING)
			{
				System.out.print(s1.getStringCellValue()+" ");
			}
			else if(type==CellType.NUMERIC)
			{
				System.out.print(s1.getNumericCellValue()+" ");
			}
			else if(type==CellType.BOOLEAN)
			{
				System.out.print(s1.getBooleanCellValue()+" ");
			}
		}
	}
}
