package sign_in_system;

import java.io.IOException;

public class compare {
	
	boolean last_compare = false;
	boolean last_x = false;
	boolean last_y = false;
	boolean last_z = false;
	
	String email_address;
	String email_password;
	
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	
	public compare(){
		//this.compare_it(a, b);
	}
	
	public void compare_item(String a, String b, String c) throws IOException{
		
		int i=0;
		int j=0;
		
		boolean x = false;
		boolean y = false;
		boolean z = false;
		
		//System.out.println(a+"  "+b);
		read_a_file to_compare = new read_a_file();
		to_compare.read_item();
		//System.out.println(to_compare.tempArray[0][0]+" "+to_compare.tempArray[0][1]);
		
		for(i=0;i<(to_compare.count/2);i++){
			
			x = to_compare.tempArray[i][0].equals(a);	
			y = to_compare.tempArray[i][1].equals(b);
			z = to_compare.tempArray[i][2].equals(c);
			
			if(x == true){
				last_x = true;
				email_address = to_compare.tempArray[i][2];
				email_password = to_compare.tempArray[i][1];
			}
			
			if(x == true && y==true){
				last_compare = true;
				break;
			}
			if(z==true){
				
				last_z = true;
				
				email_address = to_compare.tempArray[i][2];
				
			}
			//System.out.println(last_x+" "+y+"  "+i);
		}
		
		//System.out.println(last_x+" "+last_y+"  "+to_compare.count);
		
	}
	
//	public void compare_item(){
//		
//	}

}
