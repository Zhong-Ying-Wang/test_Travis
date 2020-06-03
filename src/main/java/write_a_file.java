package sign_in_system;

import java.io.FileWriter;
import java.io.IOException;


public class write_a_file {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	
	public write_a_file(){
		
	}
	
	public void write_item( String a, String b,String c) throws IOException{
		
		int i=0;
		
		read_a_file getarray = new read_a_file();
		
		getarray.read_item();
		
		//System.out.println(a+" "+b);
		
		FileWriter fw = new FileWriter("src/sign_in_system/data.txt");
		
		
		
		for(i=0;i<getarray.count/2;i++){
			
			//System.out.println(getarray.tempArray[i][0].toString()+"  "+getarray.count/2);
			
			fw.write(getarray.tempArray[i][0]);
			fw.write("\t");
			fw.write(getarray.tempArray[i][1]);
			fw.write("\t");
			fw.write(getarray.tempArray[i][2]);
			fw.write("\r\n");		
		}
		
		fw.write(a);
		fw.write("\t");
		fw.write(b);
		fw.write("\t");
		fw.write(c);
		fw.write("\r\n");
		
		fw.close();
	}

}
