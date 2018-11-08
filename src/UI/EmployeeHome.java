package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EmployeeHome extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTable table;

	public EmployeeHome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 691, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeToHome = new JLabel("Welcome to Home");
		lblWelcomeToHome.setBounds(29, 23, 269, 16);
		contentPane.add(lblWelcomeToHome);
		
		JButton btnShowEmployee = new JButton("Show Employee");
		btnShowEmployee.setBounds(23, 52, 123, 25);
		contentPane.add(btnShowEmployee);
		
		JButton btnAddEmployee = new JButton("Add Employee");
		btnAddEmployee.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EmployeeAdd ea = new EmployeeAdd();
				ea.setVisible(true);
				setVisible(false);
			}
		});
		btnAddEmployee.setBounds(188, 52, 123, 25);
		contentPane.add(btnAddEmployee);
		
		table = new JTable();
		table.setBounds(23, 139, 623, 290);
		contentPane.add(table);
	}
}
