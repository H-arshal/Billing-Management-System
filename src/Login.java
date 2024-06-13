import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import SQL_Connection.SqlConnection;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Label;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import java.awt.ComponentOrientation;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1365, 756);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton(" New Admin?");
		btnNewButton_1.setIcon(new ImageIcon("D:\\Final Project\\Billing_System_Management\\Icons\\Lock.png"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new New_Login().setVisible(true);
			}
			
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(911, 549, 152, 29);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(703, 333, 96, 31);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(703, 375, 96, 31);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(817, 331, 249, 31);
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(817, 375, 249, 33);
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(passwordField);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show Password");
		chckbxNewCheckBox.setBackground(new Color(249, 253, 147));
		chckbxNewCheckBox.setBounds(817, 428, 152, 35);
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(chckbxNewCheckBox);
		chckbxNewCheckBox.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(chckbxNewCheckBox.isSelected())
				{
					passwordField.setEchoChar((char)0);
				}
				else
				{
					passwordField.setEchoChar('*');
				}
			}
		});

		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=textField.getText();
				String password=passwordField.getText();
				try 
				{
					
					Connection con=SqlConnection.getCon();
					Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
					ResultSet rs=st.executeQuery("select username,AES_DECRYPT(password,'PASS') from admin;");
					int flag=1;
					while(rs.next()) 
					{
						int i=1;
						String um=rs.getString(i);
						String pw=rs.getString(i+1);
			
						if(um.equals(username)&&pw.equals(password))
						{
							flag=0;
							setVisible(false);
							new home().setVisible(true);
						}
						
					}
					if(flag==1)
					{
						JOptionPane.showMessageDialog(null, "Username or Password incorrect!!!");
					}
					
				}
				catch(Exception e1) 
				{
					JOptionPane.showMessageDialog(null, e1);
					
				}
			}
		});		
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(817, 484, 118, 35);
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setIcon(new ImageIcon("D:\\Final Project\\Billing_System_Management\\Icons\\Login.jpg"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(btnNewButton);
		
		JButton btnClose = new JButton("Close");
		btnClose.setBackground(new Color(255, 255, 255));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(null, "Do you really want to Quit","Select",JOptionPane.YES_NO_OPTION);
				if(a==0)
				{
					System.exit(0);
				}
			}
		});
		btnClose.setBounds(945, 484, 118, 35);
		btnClose.setHorizontalAlignment(SwingConstants.LEFT);
		btnClose.setIcon(new ImageIcon("D:\\Final Project\\Billing_System_Management\\Icons\\close.jpg"));
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(btnClose);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\Final Project\\Billing_System_Management\\Icons\\Bill management system in shop.png"));
		lblNewLabel_1.setBounds(0, 0, 1364, 756);
		contentPane.add(lblNewLabel_1);
	}
}
