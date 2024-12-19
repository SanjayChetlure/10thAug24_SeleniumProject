package Excel;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ex6_getAllDataInSheet
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\10th Aug 2024\\10thAug24.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
		
		int lastRowIndex = sh.getLastRowNum();   //4
		
		//           2<=4
		for(int i=0; i<=lastRowIndex; i++)          //outer for loop -> rows
		{  //                             2
			int lastCellIndex = sh.getRow(i).getLastCellNum()-1;   //2-1=1
			//           
			for(int j=0; j<=lastCellIndex; j++)    //inner for loop -> cols
			{  //                        2          0
				String value = sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
			System.out.println();
		}
	}
}
