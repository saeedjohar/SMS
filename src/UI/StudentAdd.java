package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import Model.*;
import javax.swing.JLabel;
public class StudentAdd extends JFrame {

	private JPanel contentPane;
	private JTextField tfID;
	private JTextField tfName;
	private JTextField tfEmail;
	private JTextField tfPassword;
	private JTextField tfAddress;
	private JLabel lblMessage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentAdd frame = new StudentAdd();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StudentAdd() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 749, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfID = new JTextField();
		tfID.setBounds(308, 103, 256, 22);
		contentPane.add(tfID);
		tfID.setColumns(10);
		
		tfName = new JTextField();
		tfName.setColumns(10);
		tfName.setBounds(308, 138, 256, 22);
		contentPane.add(tfName);
		
		tfEmail = new JTextField();
		tfEmail.setColumns(10);
		tfEmail.setBounds(308, 181, 256, 22);
		contentPane.add(tfEmail);
		
		tfPassword = new JTextField();
		tfPassword.setColumns(10);
		tfPassword.setBounds(308, 231, 256, 22);
		contentPane.add(tfPassword);
		
		tfAddress = new JTextField();
		tfAddress.setColumns(10);
		tfAddress.setBounds(308, 266, 256, 22);
		contentPane.add(tfAddress);
		
		JButton btnAddStudent = new JButton("Add Student");
		btnAddStudent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(Utils.Validate(tfID.getText()))
				{
					lblMessage.setText("Enter ID");
					tfID.requestFocus();
					return;
				}
				
				if(Utils.Validate(tfID.getText()))
				{
					lblMessage.setText("Enter ID");
					tfID.requestFocus();
					return;
				}
				
				
				Student s= new Student();
				s.PersonID = Integer.parseInt(tfID.getText().trim());
				
			}
		});
		btnAddStudent.setBounds(318, 313, 160, 25);
		contentPane.add(btnAddStudent);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(163, 106, 56, 16);
		contentPane.add(lblId);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(173, 141, 56, 16);
		contentPane.add(lblName);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(173, 184, 56, 16);
		contentPane.add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(173, 234, 56, 16);
		contentPane.add(lblPassword);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(173, 269, 56, 16);
		contentPane.add(lblAddress);
		
		lblMessage = new JLabel("");
		lblMessage.setBounds(304, 72, 260, 16);
		contentPane.add(lblMessage);
	}
}
