import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.sql.*;

import SQL_Connection.SqlConnection;
public class Product_New extends JFrame {

	private JPanel contentPane;
	private JTextField txtEnterProductName;
	private JTextField txtEnterRateOf;
	private JTextField txtEnterDescriptionOf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Product_New frame = new Product_New();
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
	public Product_New() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 754);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new home().setVisible(true);
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\harsh\\OneDrive\\Desktop\\DBMS_Project\\Billing_System_Management\\Icons\\Back Button.png"));
		btnNewButton.setBounds(10, 21, 113, 89);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(440, 31, 473, 65);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\harsh\\OneDrive\\Desktop\\DBMS_Project\\Billing_System_Management\\Icons\\New Product Frame.png"));
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 121, 1332, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Product ID : ");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(331, 157, 129, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ID");
		lblNewLabel_1_1.setForeground(new Color(255, 223, 45));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(470, 157, 129, 25);
		contentPane.add(lblNewLabel_1_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 205, 1332, 2);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Product Name : ");
		lblNewLabel_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(342, 267, 163, 25);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Rate : ");
		lblNewLabel_1_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(342, 337, 66, 25);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Description :");
		lblNewLabel_1_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_4.setBounds(342, 411, 128, 25);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Activate :");
		lblNewLabel_1_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_5.setBounds(342, 479, 95, 25);
		contentPane.add(lblNewLabel_1_5);
		
		txtEnterProductName = new JTextField();
		txtEnterProductName.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {
				if(txtEnterProductName.getText().equals("Enter Product Name"))
				{
					txtEnterProductName.setText("");
					txtEnterProductName.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtEnterProductName.getText().equals(""))
				{
					txtEnterProductName.setText("Enter Product Name");
					txtEnterProductName.setForeground(new Color(153,153,153));
				}

			}
		});
		txtEnterProductName.setForeground(new Color(153, 153, 153));
		txtEnterProductName.setText("Enter Product Name");
		txtEnterProductName.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtEnterProductName.setBounds(591, 261, 402, 31);
		contentPane.add(txtEnterProductName);
		txtEnterProductName.setColumns(10);
		
		txtEnterRateOf = new JTextField();
		txtEnterRateOf.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtEnterRateOf.getText().equals("Enter Rate of Product"))
				{
					txtEnterRateOf.setText("");
					txtEnterRateOf.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtEnterRateOf.getText().equals(""))
				{
					txtEnterRateOf.setText("Enter Rate of Product");
					txtEnterRateOf.setForeground(new Color(153,153,153));
				}

			}
		});
		txtEnterRateOf.setForeground(new Color(166, 166, 166));
		txtEnterRateOf.setText("Enter Rate of Product");
		txtEnterRateOf.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtEnterRateOf.setColumns(10);
		txtEnterRateOf.setBounds(591, 331, 402, 31);
		contentPane.add(txtEnterRateOf);
		
		txtEnterDescriptionOf = new JTextField();
		txtEnterDescriptionOf.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtEnterDescriptionOf.getText().equals("Enter description of product"))
				{
					txtEnterDescriptionOf.setText("");
					txtEnterDescriptionOf.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtEnterDescriptionOf.getText().equals(""))
				{
					txtEnterDescriptionOf.setText("Enter description of product");
					txtEnterDescriptionOf.setForeground(new Color(153,153,153));
				}

			}
		});
		txtEnterDescriptionOf.setForeground(new Color(166, 166, 166));
		txtEnterDescriptionOf.setText("Enter description of product");
		txtEnterDescriptionOf.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtEnterDescriptionOf.setColumns(10);
		txtEnterDescriptionOf.setBounds(591, 405, 402, 31);
		contentPane.add(txtEnterDescriptionOf);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(new Color(0, 0, 0));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Yes ", "No"}));
		comboBox.setBounds(591, 473, 402, 31);
		contentPane.add(comboBox);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 559, 1332, 2);
		contentPane.add(separator_2);
		
		JButton btnClose = new JButton(" Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnClose.setIcon(new ImageIcon("C:\\Users\\harsh\\OneDrive\\Desktop\\DBMS_Project\\Billing_System_Management\\Icons\\close Jframe.png"));
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClose.setBounds(796, 617, 129, 33);
		contentPane.add(btnClose);
		
		JButton btnReset = new JButton(" Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Product_New().setVisible(true);
			}
		});
		btnReset.setIcon(new ImageIcon("C:\\Users\\harsh\\OneDrive\\Desktop\\DBMS_Project\\Billing_System_Management\\Icons\\Reset.png"));
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnReset.setBounds(603, 617, 129, 33);
		contentPane.add(btnReset);
		
		JButton btnSave = new JButton(" Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pID=lblNewLabel_1_1.getText();
				String pName=txtEnterProductName.getText();
				String rate=txtEnterRateOf.getText();
				String description=txtEnterDescriptionOf.getText();
				String activation=(String)comboBox.getSelectedItem();
				try {
					Connection con=SqlConnection.getCon();
					Statement st=con.createStatement();
					
					st.executeUpdate("insert into product values('"+pID+"','"+pName+"','"+rate+"','"+description+"','"+activation+"')");
					
					JOptionPane.showMessageDialog(null,"Successfully Added!!!");
					setVisible(false);
					new Product_New().setVisible(true);
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null,e1);
				}
				
			}
		});
		btnSave.setIcon(new ImageIcon("C:\\Users\\harsh\\OneDrive\\Desktop\\DBMS_Project\\Billing_System_Management\\Icons\\save.png"));
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSave.setBounds(401, 617, 121, 33);
		contentPane.add(btnSave);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\harsh\\OneDrive\\Desktop\\DBMS_Project\\Billing_System_Management\\Icons\\Frame2.jpg"));
		lblNewLabel_2.setBounds(0, 11, 1366, 706);
		contentPane.add(lblNewLabel_2);
		addComponentListener(new ComponentAdapter() {
			public void componentShown(ComponentEvent e) {
				try 
				{
					Connection con=SqlConnection.getCon();
					Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
					ResultSet rs=st.executeQuery("select max(pID) from product");
					rs.last();
					if(rs.first())
					{
						int id=rs.getInt(1);
						id=id+1;
						String str=String.valueOf(id);
						lblNewLabel_1_1.setText(str);
					}
					else
					{
						lblNewLabel_1_1.setText("1");							
					}
				}
				catch(Exception e1) 
				{
					JOptionPane.showMessageDialog(null, e1);
					
				}
				
			}
	});
		
	}
}
