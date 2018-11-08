package UI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import DAL.DataAccess;
import Model.*;

public class Login {

	private JFrame frame;
	private JTextField tfEmail;
	private JPasswordField tfPassword;
 
	
 
 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Student std = new Student();
					Employee employee = new Employee();
					
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 646, 421);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tfEmail = new JTextField();
		tfEmail.setBounds(142, 140, 331, 22);
		frame.getContentPane().add(tfEmail);
		tfEmail.setColumns(10);
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(56, 143, 56, 16);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(74, 190, 56, 16);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblMessage = new JLabel("New label");
		lblMessage.setBounds(142, 114, 240, 16);
		frame.getContentPane().add(lblMessage);
		
		tfPassword = new JPasswordField();
		tfPassword.setBounds(142, 187, 331, 22);
		frame.getContentPane().add(tfPassword);
		
		JButton btnLogin = new JButton("Log In");
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				//1. Connecction
				 
				try {
					
					
					String email = tfEmail.getText().trim();
					String password = new String(tfPassword.getPassword());
					
					String sql ="SELECT * FROM sms.employee "
							+ "where email= '"+ email + "' and password='" + password+ "';";
					
					DataAccess da = new DataAccess();
					ResultSet rs= da.ExecuteQuery(sql);
			
					if(rs.next())
					{
						EmployeeHome eh = new EmployeeHome();
						eh.setVisible(true);
						frame.setVisible(false);
					}
					else
					{
						lblMessage.setText("Yanlis username or pasword");
					}
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		btnLogin.setBounds(143, 240, 128, 25);
		frame.getContentPane().add(btnLogin);
		
		
	}
}
