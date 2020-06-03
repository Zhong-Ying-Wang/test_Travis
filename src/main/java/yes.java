package sign_in_system;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class yes {
	
	private JFrame y = new JFrame();

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	
	public yes(){
		this.last_result();
	}
	
	public void last_result(){
		
		y.setTitle("µn¤Jµ²ªG");
		y.setSize(400,400);
		y.setResizable(false);
		y.setDefaultCloseOperation(3);
		y.setLocationRelativeTo(null);
		y.setLayout(null);
		y.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		y.setVisible(true);
		
		/*-----------------------------------------------------------*/
		
		JPanel result_ans = new JPanel();
		
		y.add(result_ans);
		
		result_ans.setLayout(new GridLayout(1,1));
		result_ans.setBounds(0, 0, 400, 400);
		result_ans.setBackground(Color.lightGray);
		
		JLabel ans = new JLabel("right",SwingConstants.CENTER);
		ans.setFont(new Font("",Font.BOLD,50));
		
		result_ans.add(ans);
	}
	
	

}
