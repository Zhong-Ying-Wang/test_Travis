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
	           //br.readLine()�O��Ū��txt�ɪ��C�@����,��Ū�쪺��Ʀs��line
	           //�A�Nline�ᵹtempstring�h�x�s
	             tempstring = line; 
	             
	          //�]���ڳo��test�ɪ���Ʈ榡�O-->�@�榳3�Ӧr��A�Ψ�Ӫť���j�}�A
	          //tempstring.split("\\s") �|�̷Ӫť���Ӥ���,��n���T��,�ҥH�o��ڪ�tempArray���j�p�~�|�ŧi3
	             tempArray[count] = tempstring.split("\\t");
	             
	             //�o��N�O���Ӷ���,�@��@�檺�x�s��ʺA�}�C�̭�
//	              for(i=0;i< tempArray.length;i++)
//	              {          
//	                  myList.add(tempArray[i]);
//	              }
	             //System.out.println(tempArray[count][0].toString()+"  "+count);
	             
	             count++;
	        }
	        
	        fr.close();
	        br.close();
	        
	        //�o�䪺��3,�M�x�}���ݧi�j�p,���N�O�W������ "tempArray.length"�o�ӭȨӰ��M�w��
	        //y�p��3,�]�O�q"tempArray.length"�������Ӫ�
//	         int k = myList.size()/2;
//	         int count=0;
//	         double[][] trans_array = new double[k][3];
//	         
//	         for(int x=0;x<myList.size()/2;x++)
//	         {
//	             for(int y=0;y<2;y++)
//	             {
//	                 trans_array[x][y]=Double.parseDouble((String) myList.get(count));
//	                 count++; //�@��index�ӨM�wmyListŪ���Ȫ���m
//	             }
//	         }
//	         //�o��ڥΪ��o�k�O�G���}�C�Ӧs�����A�]�i�H�Τ@���}�C�s��
//	         //��o�䬰��A�ڭ̤w�g���\���N��r�ɪ���Ʀs���@��Double�G���}�C�W�F
//	         
	 }
			
	 
}


