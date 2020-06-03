package sign_in_system;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class registered implements ActionListener{			//註冊介面
	
	JFrame r = new JFrame();
	JTextField account_new_input = new JTextField();
	JTextField password_new_input = new JTextField();
	JTextField password_new_input_retry = new JTextField();
	JTextField email_new_input = new JTextField();
	JTextField Verification_code_input = new JTextField();
	
	JButton new_a_rand_1 = new JButton();
	rand get_rand_numner = new rand();
	int get_it;
	
	String new_number;

	public registered(){
		this.registered_interface();
	}
	
	public void registered_interface(){
		r.setTitle("註冊");
		r.setSize(600,200);
		r.setResizable(false);
		r.setDefaultCloseOperation(3);
		r.setLocationRelativeTo(null);
		r.setLayout(null);
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r.setVisible(true);
		
		/*---------------註冊欄位---------------------------*/
		JPanel new_account = new JPanel();
		
		r.add(new_account);
		
		new_account.setLayout(new GridLayout(5,1));
		new_account.setBounds(0, 0, 100, 125);
		
		JLabel account_show = new JLabel("帳號 :",SwingConstants.RIGHT);			//SwingConstants 字的位子設定
		account_show.setFont(new Font("",Font.BOLD,15));
		
		JLabel password_show = new JLabel("密碼 :",SwingConstants.RIGHT);
		password_show .setFont(new Font("",Font.BOLD,15));
		
		JLabel password_compare = new JLabel("密碼驗證 :",SwingConstants.RIGHT);
		password_show.setFont(new Font("",Font.BOLD,15));
			
		JLabel email_compare = new JLabel("email :",SwingConstants.RIGHT);
		email_compare.setFont(new Font("",Font.BOLD,15));
		
		JLabel Verification_code = new JLabel("驗證碼 :",SwingConstants.RIGHT);
		Verification_code.setFont(new Font("",Font.BOLD,15));
		
		new_account.add(account_show);
		new_account.add(password_show);
		new_account.add(password_compare);
		new_account.add(email_compare);
		new_account.add(Verification_code);
		
		/*------------------註冊輸入框--------------------------------*/
		
		JPanel new_account_input = new JPanel();
		
		r.add(new_account_input);
		
		new_account_input.setLayout(new GridLayout(5,1));
		new_account_input.setBounds(100, 0, 300,125);
		
		new_account_input.add(account_new_input);
		new_account_input.add(password_new_input);
		new_account_input.add(password_new_input_retry);
		new_account_input.add(email_new_input);
		new_account_input.add(Verification_code_input);
		
		/*---------------------------驗證button----------------------------------*/
		
		JPanel new_rand = new JPanel();
		
		r.add(new_rand);
		
		new_rand.setBounds(400, 0, 80, 125);getClass();
		new_rand.setLayout(new GridLayout(5,1));
		
		JLabel new_a_label_1 = new JLabel("");
		new_rand.add(new_a_label_1);
		
		JLabel new_a_label_2 = new JLabel("");
		new_rand.add(new_a_label_2);
		
		JLabel new_a_label_3 = new JLabel("");
		new_rand.add(new_a_label_3);
		
		JLabel new_a_label_4 = new JLabel("");
		new_rand.add(new_a_label_4);
		
		//rand new_rand_numner = new rand();
		//get_it = get_rand_numner.new_rand_number();
		
		new_number = String.valueOf(get_rand_numner.number);	// int 轉 string 
		//System.out.println(new_rand_numner.number+"   "+new_number);
		
		new_a_rand_1.setText(new_number);//亂數生成使用
		new_rand.add(new_a_rand_1);
		System.out.println(get_rand_numner.number+"   "+new_number);
		/*------------------------送出--------------------------------------*/
		
		JPanel out_put = new JPanel();
		
		r.add(out_put);
		
		out_put.setBounds(250, 125, 100, 50);
		out_put.setLayout(null);
		
		JButton out = new JButton("送出");
		out.setSize(100, 50);
		
		out_put.add(out,BorderLayout.CENTER);
		
		/*--------------button觸發-------------------------------------------*/
		//System.out.println(new_number);
		//new_a_rand_1.setActionCommand(new_number);
		new_a_rand_1.addActionListener(this);
		
		out.setActionCommand("送出");
		out.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getActionCommand().equals(new_number)){
			
			String n;
			
			System.out.println(new_number+"/");
			//rand newnumber = new rand();
			get_it = get_rand_numner.new_rand_number();
			
			new_number = String.valueOf(get_it);	//
			
			//n = new_number;
			System.out.println(new_number);
			new_a_rand_1.setText(new_number);
		}
		
		if(e.getActionCommand().equals("送出")){
			
			String new_a;
			String new_b;
			String new_b_check;
			String new_c;
			String new_v;
			
			new_a = account_new_input.getText();
			new_b = password_new_input.getText();
			new_b_check = password_new_input_retry.getText();
			new_c = email_new_input.getText();
			new_v = Verification_code_input.getText();
			
			if(new_b.equals(new_b_check)==false){
				System.out.println("password error");
			}
			if(new_v.equals(new_number)==false){
				System.out.println("number error");
			}
			else{
				compare comp = new compare() ;
				try {
					comp.compare_item(new_a,new_b, new_c);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println(comp.last_x);
				
				if(comp.last_x==false){
					write_a_file wf = new write_a_file();
					try {
						wf.write_item(new_a, new_b, new_c);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					yes right_account = new yes();
				}
				else if(comp.last_x==true){
					System.out.println("this account have be make before");
				}
			}

		}
		
	}

}
