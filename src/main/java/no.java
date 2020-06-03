package sign_in_system;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class no {
	private JFrame n = new JFrame();

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	
	public no(){
		this.last_result();
	}
	
	public void last_result(){
		
		n.setTitle("µn¤Jµ²ªG");
		n.setSize(400,400);
		n.setResizable(false);
		n.setDefaultCloseOperation(3);
		n.setLocationRelativeTo(null);
		n.setLayout(null);
		n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		n.setVisible(true);
		
		/*-----------------------------------------------------------*/
		
		JPanel result_ans = new JPanel();
		
		n.add(result_ans);
		
		result_ans.setLayout(new GridLayout(1,1));
		result_ans.setBounds(0, 0, 400, 400);
		result_ans.setBackground(Color.lightGray);
		
		JLabel ans = new JLabel("wrong",SwingConstants.CENTER);
		ans.setFont(new Font("",Font.BOLD,50));
		
		result_ans.add(ans);
	}
	
}
