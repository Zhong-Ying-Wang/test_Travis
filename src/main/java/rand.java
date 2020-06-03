package sign_in_system;

import java.util.Random;

public class rand {

	int number;
	Random ran = new Random();
	
	public rand(){
		
		number = new_rand_number();
		//System.out.println(number);
	}
	
	public int new_rand_number(){
		
		int get;
		
		get = ran.nextInt(8999)+1000;
		
		return get;
	}
}
