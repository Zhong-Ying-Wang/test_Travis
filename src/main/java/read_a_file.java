package sign_in_system;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class read_a_file {
	
	String[][] tempArray= new String[100][3];
	int count=0;
	
	public read_a_file() throws IOException{
		this.read_item();
	}
	
	public void read_item() throws IOException{
		
		 	FileReader fr = new FileReader("src/sign_in_system/data.txt"); 
	        BufferedReader br = new BufferedReader(fr);
	        
	        String line,tempstring;
	        
	        //ArrayList myList = new ArrayList();
	        int i=0;

	        while((line = br.readLine())!=null)
	        {
	           //br.readLine()是指讀取txt檔的每一行資料,把讀到的資料存到line
	           //再將line丟給tempstring去儲存
	             tempstring = line; 
	             
	          //因為我這個test檔的資料格式是-->一行有3個字串，用兩個空白鍵隔開，
	          //tempstring.split("\\s") 會依照空白鍵來切割,剛好切三個,所以這邊我的tempArray的大小才會宣告3
	             tempArray[count] = tempstring.split("\\t");
	             
	             //這邊就是按照順序,一行一行的儲存到動態陣列裡面
//	              for(i=0;i< tempArray.length;i++)
//	              {          
//	                  myList.add(tempArray[i]);
//	              }
	             //System.out.println(tempArray[count][0].toString()+"  "+count);
	             
	             count++;
	        }
	        
	        fr.close();
	        br.close();
	        
	        //這邊的除3,和矩陣的需告大小,其實就是上面講的 "tempArray.length"這個值來做決定的
	        //y小於3,也是從"tempArray.length"的概念來的
//	         int k = myList.size()/2;
//	         int count=0;
//	         double[][] trans_array = new double[k][3];
//	         
//	         for(int x=0;x<myList.size()/2;x++)
//	         {
//	             for(int y=0;y<2;y++)
//	             {
//	                 trans_array[x][y]=Double.parseDouble((String) myList.get(count));
//	                 count++; //一個index來決定myList讀取值的位置
//	             }
//	         }
//	         //這邊我用的發法是二維陣列來存取的，也可以用一維陣列存取
//	         //到這邊為止，我們已經成功的將文字檔的資料存放到一個Double二維陣列上了
//	         
	 }
			
	 
}


