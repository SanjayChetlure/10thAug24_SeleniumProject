package Excel;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ex66_getAllDataInSheet
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\10th Aug 2024\\10thAug24.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");
		
		int lastRowIndex = sh.getLastRowNum();   
		
		for(int i=0; i<=lastRowIndex; i++)        
		{                             
			int lastCellIndex = sh.getRow(i).getLastCellNum()-1;   
			         
			for(int j=0; j<=lastCellIndex; j++)   
			{  
				Cell s1 = sh.getRow(i).getCell(j);
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
			System.out.println();
		}
	}
}
