import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import SQL_Connection.SqlConnection;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Product_Update extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Product_Update frame = new Product_Update();
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
	public Product_Update() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 756);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new home().setVisible(true);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\harsh\\OneDrive\\Desktop\\DBMS_Project\\Billing_System_Management\\Icons\\Back Button.png"));
		btnNewButton_1.setBounds(10, 11, 113, 89);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\Final Project\\Billing_System_Management\\Icons\\Update Product Frame.png"));
		lblNewLabel.setBounds(447, 11, 473, 82);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 120, 1346, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 628, 1346, 2);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 232, 1346, 2);
		contentPane.add(separator_2);
		
		JLabel lblNewLabel_1 = new JLabel("Product ID");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(373, 160, 164, 25);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setColumns(10);
		textField.setBounds(574, 158, 190, 29);
		contentPane.add(textField);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pID=textField.getText();
				try
				{
					Connection con=SqlConnection.getCon();
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select * from product where pID = '"+pID+"'");
					if(rs.next())
					{
						textField_1.setText(rs.getString(2));
						textField_2.setText(rs.getString(3));
						textField_3.setText(rs.getString(4));
						textField_4.setText(rs.getString(5));
						textField.setEditable(false);
						
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Product ID does not exist!!!");
					}
					
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon("D:\\Final Project\\Billing_System_Management\\Icons\\search.png"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(814, 156, 128, 31);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("Product Name");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(373, 275, 143, 25);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Rate");
		lblNewLabel_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(373, 357, 117, 25);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Description");
		lblNewLabel_1_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(373, 434, 115, 25);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Activate");
		lblNewLabel_1_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_4.setBounds(373, 517, 82, 25);
		contentPane.add(lblNewLabel_1_4);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(574, 275, 346, 29);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(574, 357, 346, 29);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(574, 434, 346, 29);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(574, 517, 346, 29);
		contentPane.add(textField_4);
		
		JButton btnUpdate = new JButton(" \r\nUpdate");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pID=textField.getText();
				String pName=textField_1.getText();
				String rate=textField_2.getText();
				String description=textField_3.getText();
				String activation=textField_4.getText();
				try
				{
					Connection con=SqlConnection.getCon();
					Statement st=con.createStatement();
					st.executeUpdate("update product set pName='"+pName+"',rate='"+rate+"',description='"+description+"',activation='"+activation+"' where pID='"+pID+"'");	
					JOptionPane.showMessageDialog(null, "Successfully Updated!!!");
					setVisible(false);
					new Product_Update().setVisible(true);
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null,e1);
				}
			}
		});
		btnUpdate.setIcon(new ImageIcon("D:\\Final Project\\Billing_System_Management\\Icons\\Update.png"));
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnUpdate.setBounds(391, 664, 134, 29);
		contentPane.add(btnUpdate);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Product_Update().setVisible(true);
			}
		});
		btnReset.setIcon(new ImageIcon("D:\\Final Project\\Billing_System_Management\\Icons\\Reset.png"));
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnReset.setBounds(574, 664, 117, 29);
		contentPane.add(btnReset);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnClose.setIcon(new ImageIcon("D:\\Final Project\\Billing_System_Management\\Icons\\close Jframe.png"));
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnClose.setBounds(745, 664, 117, 29);
		contentPane.add(btnClose);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\Final Project\\Billing_System_Management\\Icons\\Frame2.jpg"));
		lblNewLabel_2.setBounds(0, 0, 1356, 719);
		contentPane.add(lblNewLabel_2);
	}

}
