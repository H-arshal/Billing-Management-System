import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import SQL_Connection.SqlConnection;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JPasswordField;

public class New_Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtEnterNewUsername;
	private JPasswordField pwdEnterPassword;
	private JPasswordField pwdConfirmPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					New_Login frame = new New_Login();
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
	public New_Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 756);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		pwdConfirmPassword = new JPasswordField();
		pwdConfirmPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(pwdConfirmPassword.getText().equals("Confirm Password"))
				{
					pwdConfirmPassword.setText("");
					pwdConfirmPassword.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(pwdConfirmPassword.getText().equals(""))
				{
					pwdConfirmPassword.setText("Confirm Password");
					pwdConfirmPassword.setForeground(new Color(153,153,153));
				}
			}
		});
		pwdConfirmPassword.setToolTipText("passwordField");
		pwdConfirmPassword.setText("Confirm Password");
		pwdConfirmPassword.setBounds(641, 448, 310, 37);
		contentPane.add(pwdConfirmPassword);
		
		pwdEnterPassword = new JPasswordField();
		pwdEnterPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(pwdEnterPassword.getText().equals("Enter Password"))
				{
					pwdEnterPassword.setText("");
					pwdEnterPassword.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(pwdEnterPassword.getText().equals(""))
				{
					pwdEnterPassword.setText("Enter Password");
					pwdEnterPassword.setForeground(new Color(153,153,153));
				}
			}
		});
		pwdEnterPassword.setText("Enter Password");
		pwdEnterPassword.setToolTipText("passwordField");
		pwdEnterPassword.setBounds(641, 356, 310, 37);
		contentPane.add(pwdEnterPassword);
		
		JLabel lblNewLabel = new JLabel("New Admin");
		lblNewLabel.setBounds(510, 24, 342, 76);
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD, 60));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_2.setBounds(439, 169, 150, 37);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Username");
		lblNewLabel_2_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(439, 264, 150, 37);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Password");
		lblNewLabel_2_1_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_2_1_1.setBounds(439, 352, 150, 37);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Confirm Password");
		lblNewLabel_2_1_1_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_2_1_1_1.setBounds(439, 459, 177, 26);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		textField = new JTextField();
		textField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(textField.getText().equals("Enter Name"))
				{
					textField.setText("");
					textField.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(textField.getText().equals(""))
				{
					textField.setText("Enter Name");
					textField.setForeground(new Color(153,153,153));
				}
			}
		});
		textField.setText("Enter Name");
		textField.setForeground(Color.LIGHT_GRAY);
		textField.setFont(new Font("Dialog", Font.BOLD, 20));
		textField.setColumns(10);
		textField.setBounds(641, 169, 310, 37);
		contentPane.add(textField);
		
		txtEnterNewUsername = new JTextField();
		txtEnterNewUsername.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtEnterNewUsername.getText().equals("Enter new Username"))
				{
					txtEnterNewUsername.setText("");
					txtEnterNewUsername.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtEnterNewUsername.getText().equals(""))
				{
					txtEnterNewUsername.setText("Enter new Username");
					txtEnterNewUsername.setForeground(new Color(153,153,153));
				}
			}
		});
		txtEnterNewUsername.setText("Enter new Username");
		txtEnterNewUsername.setForeground(Color.LIGHT_GRAY);
		txtEnterNewUsername.setFont(new Font("Dialog", Font.BOLD, 20));
		txtEnterNewUsername.setColumns(10);
		txtEnterNewUsername.setBounds(641, 264, 310, 37);
		contentPane.add(txtEnterNewUsername);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 559, 1332, 2);
		contentPane.add(separator_1);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				String pass=pwdEnterPassword.getText();
				String cpass=pwdConfirmPassword.getText();
				if(pass.equals(cpass))
				{
					String name=textField.getText();
					String username=txtEnterNewUsername.getText();
					String password=pwdEnterPassword.getText();
					try {
						Connection con=SqlConnection.getCon();
						Statement st=con.createStatement();
						
						st.executeUpdate("insert into admin values('"+name+"',AES_ENCRYPT('"+username+"','PASS'),AES_ENCRYPT('"+password+"','PASS'))");
						
						JOptionPane.showMessageDialog(null,"Successfully Added!");
						setVisible(false);
						new Login().setVisible(true);
					}
					catch(Exception e1)
					{
						JOptionPane.showMessageDialog(null, "This Mobile Number is already taken!!!");
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Confirm password mismatch!!!");
					
				}
			}
		});
		btnCreate.setIcon(new ImageIcon("C:\\Users\\harsh\\OneDrive\\Desktop\\DBMS_Project\\Billing_System_Management\\Icons\\add.png"));
		btnCreate.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCreate.setBounds(439, 622, 134, 33);
		contentPane.add(btnCreate);
		
		JButton btnReset = new JButton(" Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new New_Login().setVisible(true);
			}
		});
		btnReset.setIcon(new ImageIcon("C:\\Users\\harsh\\OneDrive\\Desktop\\DBMS_Project\\Billing_System_Management\\Icons\\save.png"));
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnReset.setBounds(641, 622, 123, 33);
		contentPane.add(btnReset);
		
		JButton btnClose = new JButton(" Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnClose.setIcon(new ImageIcon("C:\\Users\\harsh\\OneDrive\\Desktop\\DBMS_Project\\Billing_System_Management\\Icons\\close Jframe.png"));
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClose.setBounds(834, 622, 117, 33);
		contentPane.add(btnClose);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new home().setVisible(true);
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\harsh\\OneDrive\\Desktop\\DBMS_Project\\Billing_System_Management\\Icons\\Back Button.png"));
		btnNewButton.setBounds(10, 11, 117, 89);
		contentPane.add(btnNewButton);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 111, 1322, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\harsh\\OneDrive\\Desktop\\DBMS_Project\\Billing_System_Management\\Icons\\Frame1.png"));
		lblNewLabel_1.setBounds(0, 0, 1352, 719);
		contentPane.add(lblNewLabel_1);
	}
}
