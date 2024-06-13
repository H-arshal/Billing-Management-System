import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
// import SQL_Connection.SqlConnection;
import java.sql.*;
import SQL_Connection.SqlConnection;
import java.awt.Color;
public class Buyer_Delete extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Buyer_Delete frame = new Buyer_Delete();
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
	public Buyer_Delete() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1367, 756);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1_2 = new JLabel("Contact No.");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(394, 331, 117, 25);
		contentPane.add(lblNewLabel_1_2);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_5.setColumns(10);
		textField_5.setBounds(589, 527, 346, 29);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_1_3 = new JLabel("Email");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(394, 389, 55, 25);
		contentPane.add(lblNewLabel_1_3);
		
		JButton btnUpdate = new JButton(" Delete");
		btnUpdate.setIcon(new ImageIcon("D:\\Final Project\\Billing_System_Management\\Icons\\delete.png"));
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(null,"Do you really want to Delete?","Select",JOptionPane.YES_NO_OPTION);
				if(a==0)
					{
					String contactNo=textField.getText();
					try
					{
						Connection con=SqlConnection.getCon();
						Statement st=con.createStatement();
						st.executeUpdate("delete from buyer where contactNo='"+contactNo+"'");
						JOptionPane.showMessageDialog(null, "Successfully Deleted!!!");
						setVisible(false);
						new Buyer_Delete().setVisible(true);
					}
					
					catch(Exception e1)
					{
						JOptionPane.showMessageDialog(null, e1);
					}
				}
				
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnUpdate.setBounds(482, 666, 117, 29);
		contentPane.add(btnUpdate);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(589, 456, 346, 29);
		contentPane.add(textField_4);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Buyer_Delete().setVisible(true);
			}
		});
		btnReset.setIcon(new ImageIcon("D:\\Final Project\\Billing_System_Management\\Icons\\Reset.png"));
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnReset.setBounds(642, 666, 117, 29);
		contentPane.add(btnReset);
		
		JLabel lblNewLabel_1_5 = new JLabel("Gender");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_5.setBounds(394, 527, 73, 25);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_4 = new JLabel("Address");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_4.setBounds(394, 456, 80, 25);
		contentPane.add(lblNewLabel_1_4);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(589, 277, 346, 29);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(589, 331, 346, 29);
		contentPane.add(textField_2);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setIcon(new ImageIcon("D:\\Final Project\\Billing_System_Management\\Icons\\close.jpg"));
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnClose.setBounds(802, 666, 117, 29);
		contentPane.add(btnClose);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(394, 277, 59, 25);
		contentPane.add(lblNewLabel_1_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(589, 389, 346, 29);
		contentPane.add(textField_3);
		
		JButton btnNewButton_1 = new JButton("Search");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String contactNo=textField.getText();
				try
				{
					Connection con=SqlConnection.getCon();
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select * from buyer where contactNo = '"+contactNo+"'");
					if(rs.next())
					{
						textField_1.setText(rs.getString(1));
						textField_2.setText(rs.getString(2));
						textField_3.setText(rs.getString(3));
						textField_4.setText(rs.getString(4));
						textField_5.setText(rs.getString(5));
						textField.setEditable(false);
						textField_1.setEditable(false);
						textField_2.setEditable(false);
						textField_3.setEditable(false);
						textField_4.setEditable(false);
						textField_5.setEditable(false);
						
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Contact does not exist!!!");
					}
					
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setIcon(new ImageIcon("D:\\Final Project\\Billing_System_Management\\Icons\\search.png"));
		btnNewButton_1.setBounds(802, 163, 143, 33);
		contentPane.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(589, 164, 180, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Contact No.");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(394, 167, 117, 25);
		contentPane.add(lblNewLabel_2);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(20, 226, 1332, 2);
		contentPane.add(separator_2);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new home().setVisible(true);
			}
		});
		btnNewButton.setIcon(new ImageIcon("D:\\Final Project\\Billing_System_Management\\Icons\\Back Button.png"));
		btnNewButton.setBounds(10, 11, 113, 89);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\r\n");
		lblNewLabel.setBounds(442, 15, 477, 96);
		lblNewLabel.setIcon(new ImageIcon("CD:\\Final Project\\Billing_System_Management\\Icons\\Delete Buyer Frame.png"));
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(20, 130, 1332, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(20, 601, 1332, 2);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_1 = new JLabel("\r\n");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\Final Project\\Billing_System_Management\\Icons\\Frame1.png"));
		lblNewLabel_1.setBounds(0, 0, 1352, 719);
		contentPane.add(lblNewLabel_1);
	}
}
