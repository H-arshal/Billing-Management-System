import java.awt.EventQueue;
import java.io.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import SQL_Connection.SqlConnection;
import java.sql.*;
import java.awt.Point;
import javax.swing.SwingConstants;
public class Buyer_New extends JFrame {

	private JPanel contentPane;
	private JTextField txtEnterName;
	private JTextField txtEnterContactNumber;
	private JTextField txtEnterEmailAddress;
	private JTextField txtEnterResidenceAddress;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Buyer_New frame = new Buyer_New();
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
	public Buyer_New() {
		setLocation(new Point(380, 160));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 756);
		contentPane = new JPanel();
		contentPane.setLocation(new Point(380, 160));
		contentPane.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
			}
		});
		contentPane.setMinimumSize(new Dimension(0, 0));
		contentPane.setMaximumSize(new Dimension(1366, 756));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\harsh\\OneDrive\\Desktop\\DBMS_Project\\Billing_System_Management\\Icons\\New Buyer Main Frame.png"));
		lblNewLabel_1.setBounds(464, 22, 473, 80);
		contentPane.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 123, 1332, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_2.setBounds(439, 171, 150, 37);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Contact No.");
		lblNewLabel_2_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(439, 244, 150, 37);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Email");
		lblNewLabel_2_1_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_2_1_1.setBounds(439, 318, 150, 37);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Address");
		lblNewLabel_2_1_1_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_2_1_1_1.setBounds(439, 393, 150, 37);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Gender");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_2_1_1_1_1.setBounds(439, 462, 150, 37);
		contentPane.add(lblNewLabel_2_1_1_1_1);
		
		txtEnterName = new JTextField();
		txtEnterName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtEnterName.getText().equals("Enter Name"))
				{
					txtEnterName.setText("");
					txtEnterName.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtEnterName.getText().equals(""))
				{
					txtEnterName.setText("Enter Name");
					txtEnterName.setForeground(new Color(153,153,153));
				}
			}
		});
		txtEnterName.setForeground(Color.LIGHT_GRAY);
		txtEnterName.setText("Enter Name");
		txtEnterName.setFont(new Font("Dialog", Font.BOLD, 20));
		txtEnterName.setBounds(641, 171, 310, 37);
		contentPane.add(txtEnterName);
		txtEnterName.setColumns(10);
		
		txtEnterContactNumber = new JTextField();
		txtEnterContactNumber.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtEnterContactNumber.getText().equals("Enter Contact Number"))
				{
					txtEnterContactNumber.setText("");
					txtEnterContactNumber.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtEnterContactNumber.getText().equals(""))
				{
					txtEnterContactNumber.setText("Enter Contact Number");
					txtEnterContactNumber.setForeground(new Color(153,153,153));
				}

			}
		});
		txtEnterContactNumber.setForeground(Color.LIGHT_GRAY);
		txtEnterContactNumber.setText("Enter Contact Number");
		txtEnterContactNumber.setFont(new Font("Dialog", Font.BOLD, 20));
		txtEnterContactNumber.setColumns(10);
		txtEnterContactNumber.setBounds(641, 244, 310, 37);
		contentPane.add(txtEnterContactNumber);
		
		txtEnterEmailAddress = new JTextField();
		txtEnterEmailAddress.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtEnterEmailAddress.getText().equals("Enter email Address"))
				{
					txtEnterEmailAddress.setText("");
					txtEnterEmailAddress.setForeground(new Color(0,0,0));
				}

			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtEnterEmailAddress.getText().equals(""))
				{
					txtEnterEmailAddress.setText("Enter email Address");
					txtEnterEmailAddress.setForeground(new Color(153,153,153));
				}
			}
		});
		txtEnterEmailAddress.setForeground(Color.LIGHT_GRAY);
		txtEnterEmailAddress.setText("Enter email Address");
		txtEnterEmailAddress.setFont(new Font("Dialog", Font.BOLD, 20));
		txtEnterEmailAddress.setColumns(10);
		txtEnterEmailAddress.setBounds(641, 318, 310, 37);
		contentPane.add(txtEnterEmailAddress);
		
		txtEnterResidenceAddress = new JTextField();
		txtEnterResidenceAddress.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtEnterResidenceAddress.getText().equals("Enter residence Address"))
				{
					txtEnterResidenceAddress.setText("");
					txtEnterResidenceAddress.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtEnterResidenceAddress.getText().equals(""))
				{
					txtEnterResidenceAddress.setText("Enter residence Address");
					txtEnterResidenceAddress.setForeground(new Color(153,153,153));
				}
			}
		});
		txtEnterResidenceAddress.setForeground(Color.LIGHT_GRAY);
		txtEnterResidenceAddress.setText("Enter residence Address");
		txtEnterResidenceAddress.setFont(new Font("Dialog", Font.BOLD, 20));
		txtEnterResidenceAddress.setColumns(10);
		txtEnterResidenceAddress.setBounds(641, 393, 310, 37);
		contentPane.add(txtEnterResidenceAddress);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female", "Others"}));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox.setBounds(641, 462, 310, 37);
		contentPane.add(comboBox);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 561, 1332, 2);
		contentPane.add(separator_1);
		
		JButton btnSave = new JButton(" Save");
		btnSave.setIcon(new ImageIcon("C:\\Users\\harsh\\OneDrive\\Desktop\\DBMS_Project\\Billing_System_Management\\Icons\\save.png"));
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=txtEnterName.getText();
				String contactNo=txtEnterContactNumber.getText();
				String email=txtEnterEmailAddress.getText();
				String address=txtEnterResidenceAddress.getText();
				String gender=(String)comboBox.getSelectedItem();
				try {
					Connection con=SqlConnection.getCon();
					Statement st=con.createStatement();
					
					st.executeUpdate("insert into buyer values('"+name+"','"+contactNo+"','"+email+"','"+address+"','"+gender+"')");
					
					JOptionPane.showMessageDialog(null,"Successfully Added!!!");
					setVisible(false);
					new Buyer_New().setVisible(true);
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, "This Mobile Number is already taken!!!");
				}
				}
		});
		btnSave.setBounds(439, 624, 121, 33);
		contentPane.add(btnSave);
		
		JButton btnReset = new JButton(" Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Buyer_New().setVisible(true);
			}
		});
		btnReset.setIcon(new ImageIcon("C:\\Users\\harsh\\OneDrive\\Desktop\\DBMS_Project\\Billing_System_Management\\Icons\\Reset.png"));
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnReset.setBounds(641, 624, 121, 33);
		contentPane.add(btnReset);
		
		JButton btnClose = new JButton(" Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnClose.setIcon(new ImageIcon("C:\\Users\\harsh\\OneDrive\\Desktop\\DBMS_Project\\Billing_System_Management\\Icons\\close Jframe.png"));
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClose.setBounds(834, 624, 117, 33);
		contentPane.add(btnClose);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new home().setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\harsh\\OneDrive\\Desktop\\DBMS_Project\\Billing_System_Management\\Icons\\Back Button.png"));
		btnNewButton.setBounds(10, 13, 117, 89);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\harsh\\OneDrive\\Desktop\\DBMS_Project\\Billing_System_Management\\Icons\\Frame1.png"));
		lblNewLabel.setBounds(0, 0, 1366, 756);
		contentPane.add(lblNewLabel);
	}
}
