package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAL.DataAccess;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EmployeeAdd extends JFrame {

	private JPanel contentPane;
	private JTextField tfEmployeeID;
	private JTextField tfName;
	private JTextField tfEmail;
	private JTextField tfPassword;

	
	public EmployeeAdd() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 579, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfEmployeeID = new JTextField();
		tfEmployeeID.setBounds(164, 108, 307, 22);
		contentPane.add(tfEmployeeID);
		tfEmployeeID.setColumns(10);
		
		tfName = new JTextField();
		tfName.setBounds(164, 143, 307, 22);
		contentPane.add(tfName);
		tfName.setColumns(10);
		
		tfEmail = new JTextField();
		tfEmail.setBounds(164, 178, 307, 22);
		contentPane.add(tfEmail);
		tfEmail.setColumns(10);
		
		tfPassword = new JTextField();
		tfPassword.setBounds(164, 213, 307, 22);
		contentPane.add(tfPassword);
		tfPassword.setColumns(10);
		
		JLabel lblMessage = new JLabel("");
		lblMessage.setBounds(164, 82, 307, 16);
		contentPane.add(lblMessage);
		
		JButton btnAddEmployee = new JButton("Add Employee");
		btnAddEmployee.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
				
				String empID = tfEmployeeID.getText();
				String name =  tfName.getText();
				String email = tfEmail.getText();
				String pwd = tfPassword.getText();
				
				String sql = "insert into sms.employee(employeeid, name, email, password) values("
						+empID +",'"+ name+"','"+ email+"','"+pwd+ "')";
				
				DataAccess da = new DataAccess();
				
					int result =  da.ExecuteUpdate(sql);
					if(result>0)
					{
					lblMessage.setText("Employee Added.");	
					}
					else
					{
						lblMessage.setText("Failed to add employee.");
					}
				} catch (Exception e1) {
					lblMessage.setText(e1.getMessage());
				}
				
			}
		});
		btnAddEmployee.setBounds(161, 248, 129, 25);
		contentPane.add(btnAddEmployee);
		
		JButton btnCancel = new JButton("Close");
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				
			}
		});
		btnCancel.setBounds(322, 248, 149, 25);
		contentPane.add(btnCancel);
		
		JLabel lblEmployeeid = new JLabel("EmployeeID");
		lblEmployeeid.setBounds(68, 111, 72, 16);
		contentPane.add(lblEmployeeid);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(68, 146, 56, 16);
		contentPane.add(lblName);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(68, 181, 56, 16);
		contentPane.add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(68, 216, 56, 16);
		contentPane.add(lblPassword);
		
		
	}

}
