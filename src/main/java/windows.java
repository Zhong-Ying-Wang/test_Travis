package sign_in_system;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class windows implements ActionListener{			//��l����
	
	private JFrame w = new JFrame();

	public windows(){
		this.system_interface();
	}
	
	public void system_interface(){
		
		w.setTitle("�|���n�J�t��");
		w.setSize(500,500);
		w.setResizable(false);
		w.setDefaultCloseOperation(3);
		w.setLocationRelativeTo(null);
		w.setLayout(null);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		w.setVisible(true);
		
		w.setBackground(Color.BLUE);
		/*-------------Label��r�]�w------------------*/
		
		JPanel system_introduction = new JPanel();
		
		w.add(system_introduction);
		
		system_introduction.setLayout(new GridLayout(1,1));
		system_introduction.setBounds(0, 0, 500, 300);
		system_introduction.setBackground(Color.CYAN);
		
		JLabel system_name = new JLabel("�w��Ө�|���n�J�t��",JLabel.CENTER);
		
		system_name.setFont(new Font("",Font.BOLD,30));
		
		system_introduction.add(system_name);
		
		/*-------------��ܥ\��button-------------------*/
		
		JPanel do_function = new JPanel();
		
		w.add(do_function);
		
		do_function.setLayout(new GridLayout(1,4));
		do_function.setBounds(0, 300, 500,50);
		do_function.setBackground(Color.CYAN);
			
		JLabel blank_one = new JLabel();
		do_function.add(blank_one);
		
		JButton function_one = new JButton("���U");
		do_function.add(function_one);
		
		JButton function_two = new JButton("�n�J");
		do_function.add(function_two);
		
		JLabel blank_two = new JLabel();
		do_function.add(blank_two);
		
		/*---------------�ѤU��frame------------------------------*/
		
		JPanel else_function = new JPanel();
		
		w.add(else_function);
		
		else_function.setLayout(new GridLayout(1,1));
		else_function.setBounds(0, 350, 500,150);
		else_function.setBackground(Color.CYAN);
		
		
		
//		JLabel else_blank = new JLabel();
//		
//		else_blank.setBackground(Color.BLUE);
//		
//		else_function.add(else_blank);
		
		/*--------------------buttonĲ�o---------------------------------*/
		
		function_one.setActionCommand("���U");
		function_one.addActionListener(this);
		
		function_two.setActionCommand("�n�J");
		function_two.addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getActionCommand().equals("�n�J")){
			login a = new login();
		}
		
		if(e.getActionCommand().equals("���U")){
			registered b = new registered();
		}
		
	}
}
