import java.awt.EventQueue;
import java.io.*;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import SQL_Connection.SqlConnection;
public class Billing extends JFrame {

	public int finalTotal=0;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Billing frame = new Billing();
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
	public Billing() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 756);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1_3 = new JButton("");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new home().setVisible(true);
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 459, 736, 249);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Description", "Rate", "Quantity", "Total"
			}
		));
		
		JLabel lblNewLabel_2_2_4 = new JLabel("28 - 11 - 2022");
		lblNewLabel_2_2_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_2_4.setBounds(1031, 11, 167, 25);
		contentPane.add(lblNewLabel_2_2_4);
		
		JLabel lblNewLabel_2_2_3 = new JLabel("Time :");
		lblNewLabel_2_2_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_2_3.setBounds(960, 62, 63, 25);
		contentPane.add(lblNewLabel_2_2_3);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("Date :");
		lblNewLabel_2_2_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_2_2.setBounds(960, 11, 61, 25);
		contentPane.add(lblNewLabel_2_2_2);
		
		JLabel lblNewLabel_2_2_5 = new JLabel("20 : 30 ");
		lblNewLabel_2_2_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_2_5.setBounds(1031, 62, 147, 25);
		contentPane.add(lblNewLabel_2_2_5);
		btnNewButton_1_3.setIcon(new ImageIcon("C:\\Users\\harsh\\OneDrive\\Desktop\\DBMS_Project\\Billing_System_Management\\Icons\\Back Button.png"));
		btnNewButton_1_3.setBounds(10, 4, 113, 89);
		contentPane.add(btnNewButton_1_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\harsh\\Downloads\\image-removebg-preview (7) (1).png"));
		lblNewLabel_4.setBounds(160, 0, 340, 122);
		contentPane.add(lblNewLabel_4);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(new Color(255, 0, 0));
		separator_2.setBounds(0, 277, 1352, 3);
		contentPane.add(separator_2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(255, 0, 0));
		separator_1.setBounds(0, 445, 1352, 3);
		contentPane.add(separator_1);
		
		JLabel lblProductDetails = new JLabel("Product Details :");
		lblProductDetails.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblProductDetails.setBounds(10, 291, 167, 25);
		contentPane.add(lblProductDetails);
		
		JLabel lblNewLabel = new JLabel("Buyer Details :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 118, 147, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(64, 168, 59, 25);
		contentPane.add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(255, 0, 0));
		separator.setBounds(0, 104, 1352, 3);
		contentPane.add(separator);
		
		JLabel lblNewLabel_2_1 = new JLabel("Contact No.");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(730, 168, 117, 25);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Email");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_2.setBounds(64, 223, 55, 25);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Address");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_3.setBounds(730, 223, 80, 25);
		contentPane.add(lblNewLabel_2_3);
		
		SimpleDateFormat dFormat= new SimpleDateFormat("dd-MM-yyyy");
		Date date=new Date();
		lblNewLabel_2_2_4.setText(dFormat.format(date));
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalDateTime now=LocalDateTime.now();
		lblNewLabel_2_2_5.setText(dtf.format(now));
		
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField.getText();
				try
				{
					Connection con=SqlConnection.getCon();
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select *from buyer where name like '"+name+"%'");
					if(rs.next())
					{
						textField.setText(rs.getString(1));
						textField_1.setText(rs.getString(2));
						textField_2.setText(rs.getString(3));
						textField_3.setText(rs.getString(4));
					}
					else
					{
						textField_1.setText("");
						textField_2.setText("");
						textField_3.setText("");
					}
					}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(160, 165, 196, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String contact=textField_1.getText();
				try
				{
					Connection con=SqlConnection.getCon();
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select *from buyer where contactNo like '"+contact+"%'");
					if(rs.next())
					{
						textField.setText(rs.getString(1));
						textField_1.setText(rs.getString(2));
						textField_2.setText(rs.getString(3));
						textField_3.setText(rs.getString(4));
					}
					else
					{
						textField.setText("");
						textField_2.setText("");
						textField_3.setText("");
					}
					}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(886, 165, 167, 31);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String email=textField_2.getText();
				try
				{
					Connection con=SqlConnection.getCon();
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select *from buyer where email like '"+email+"%'");
					if(rs.next())
					{
						textField.setText(rs.getString(1));
						textField_1.setText(rs.getString(2));
						textField_2.setText(rs.getString(3));
						textField_3.setText(rs.getString(4));
					}
					else
					{
						textField.setText("");
						textField_1.setText("");
						textField_3.setText("");
					}
					}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(164, 220, 393, 31);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String address=textField_3.getText();
				try
				{
					Connection con=SqlConnection.getCon();
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select *from buyer where address like '"+address+"%'");
					if(rs.next())
					{
						textField.setText(rs.getString(1));
						textField_1.setText(rs.getString(2));
						textField_2.setText(rs.getString(3));
						textField_3.setText(rs.getString(4));
					}
					else
					{
						textField.setText("");
						textField_1.setText("");
						textField_2.setText("");
					}
					}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(886, 220, 410, 31);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Product ID");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_4.setBounds(10, 340, 110, 25);
		contentPane.add(lblNewLabel_2_4);
		
		textField_4 = new JTextField();
		textField_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pID=textField_4.getText();
				try
				{
					Connection con=SqlConnection.getCon();
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select *from product where pID like '"+pID+"%'");
					if(rs.next())
					{
						textField_4.setText(rs.getString(1));
						textField_5.setText(rs.getString(2));
						textField_6.setText(rs.getString(3));
						textField_7.setText("1");
						textField_8.setText(rs.getString(4));
					}
					else
					{
						textField_5.setText("");
						textField_6.setText("");
						textField_7.setText("");
						textField_8.setText("");
						
					}
					}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(130, 337, 48, 31);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Product Name");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1_1.setBounds(204, 340, 143, 25);
		contentPane.add(lblNewLabel_2_1_1);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_5.setColumns(10);
		textField_5.setBounds(357, 337, 188, 31);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Rate");
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_2_1.setBounds(555, 340, 47, 25);
		contentPane.add(lblNewLabel_2_2_1);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_6.setColumns(10);
		textField_6.setBounds(612, 337, 80, 31);
		contentPane.add(textField_6);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Description");
		lblNewLabel_2_3_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_3_1.setBounds(913, 340, 115, 25);
		contentPane.add(lblNewLabel_2_3_1);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_7.setColumns(10);
		textField_7.setBounds(838, 337, 55, 31);
		contentPane.add(textField_7);
		
		JLabel lblNewLabel_2_4_1 = new JLabel("Quantity");
		lblNewLabel_2_4_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_4_1.setBounds(730, 340, 86, 25);
		contentPane.add(lblNewLabel_2_4_1);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_8.setColumns(10);
		textField_8.setBounds(1047, 337, 295, 31);
		contentPane.add(textField_8);
		
		JButton btnNewButton = new JButton(" Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int price=Integer.parseInt(textField_6.getText());
				int quantity=Integer.parseInt(textField_7.getText());
				int total=price*quantity;
				
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				model.addRow(new Object[] {textField_5.getText(),textField_8.getText(),price,quantity,total});
				finalTotal=finalTotal+total;
				String finalTotal1=String.valueOf(finalTotal);
				textField_9.setText(finalTotal1);
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\harsh\\OneDrive\\Desktop\\DBMS_Project\\Billing_System_Management\\Icons\\add.png"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(1217, 391, 113, 33);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2_3_1_1 = new JLabel("Total");
		lblNewLabel_2_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_3_1_1.setBounds(778, 558, 115, 25);
		contentPane.add(lblNewLabel_2_3_1_1);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_9.setColumns(10);
		textField_9.setBounds(960, 555, 203, 31);
		contentPane.add(textField_9);
		
		JButton btnNewButton_1 = new JButton("Save");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField.getText();
				String contactNo=textField_1.getText();
				String email=textField_2.getText();
				String address=textField_3.getText();
				String path="D:\\DBMS\\Bills\\";
				com.itextpdf.text.Document doc=new com.itextpdf.text.Document();
				try
				{
					PdfWriter.getInstance(doc, new FileOutputStream(path+""+name+" "+lblNewLabel_2_2_4.getText()+".pdf"));
					doc.open();
					Paragraph p0=new Paragraph("____________________________________________________________________________\n------------------------------------------------------DBMS Project------------------------------------------------------\n____________________________________________________________________________\n");
					doc.add(p0);
					
					Paragraph p1=new Paragraph("Buyer Details....\nName - "+name+"                            Contact Number - "+contactNo+"\nEmail - "+email+"                 Address - "+address+"\n____________________________________________________________________________\n\n");
					doc.add(p1);
					PdfPTable tb1=new PdfPTable(5);
					tb1.addCell("Name");
					tb1.addCell("Description");
					tb1.addCell("Rate");
					tb1.addCell("Quantity");
					tb1.addCell("Total");
					for(int i=0;i<table.getRowCount();i++)
					{
						String n=table.getValueAt(i, 0).toString();
						String d=table.getValueAt(i, 1).toString();
						String r=table.getValueAt(i, 2).toString();
						String q=table.getValueAt(i, 3).toString();
						String t=table.getValueAt(i, 4).toString();
						
						tb1.addCell(n);
						tb1.addCell(d);
						tb1.addCell(r);
						tb1.addCell(q);
						tb1.addCell(t);
						
					}
					
					doc.add(tb1);
					Paragraph p2=new Paragraph("____________________________________________________________________________\n\nTotal Amount - "+textField_9.getText()+"Rs\nPaid Amount -"+textField_10.getText()+"Rs\nReturn Amount - "+textField_11.getText()+"Rs\n____________________________________________________________________________\n                                                                                                                            Thank You!!!!");
					doc.add(p2);
					JOptionPane.showMessageDialog(null, "Bill Generated Successfully...");
				}
				catch(Exception e1)
				{
						JOptionPane.showMessageDialog(null, e1);
				}
				doc.close();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\harsh\\OneDrive\\Desktop\\DBMS_Project\\Billing_System_Management\\Icons\\save.png"));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(1207, 554, 120, 33);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2_3_1_1_1 = new JLabel("Paid Amount");
		lblNewLabel_2_3_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_3_1_1_1.setBounds(778, 607, 129, 25);
		contentPane.add(lblNewLabel_2_3_1_1_1);
		
		textField_10 = new JTextField();
		textField_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					String paidAmount=textField_10.getText();
						int z=Integer.parseInt(paidAmount);
						finalTotal=z-finalTotal;
						String finalToatl1=String.valueOf(finalTotal);
						textField_11.setText(finalToatl1);
						textField_11.setEditable(false);
						
						
						
						
					}
		});
		textField_10.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_10.setColumns(10);
		textField_10.setBounds(960, 604, 203, 31);
		contentPane.add(textField_10);
		
		JButton btnNewButton_1_1 = new JButton("Reset");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Billing().setVisible(true);
			}
		});
		btnNewButton_1_1.setIcon(new ImageIcon("C:\\Users\\harsh\\OneDrive\\Desktop\\DBMS_Project\\Billing_System_Management\\Icons\\Reset.png"));
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1.setBounds(1207, 603, 120, 33);
		contentPane.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_2_3_1_1_2 = new JLabel("Return Amount");
		lblNewLabel_2_3_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_3_1_1_2.setBounds(778, 656, 154, 25);
		contentPane.add(lblNewLabel_2_3_1_1_2);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_11.setColumns(10);
		textField_11.setBounds(960, 653, 203, 31);
		contentPane.add(textField_11);
		
		JButton btnNewButton_1_2 = new JButton("Close");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_1_2.setIcon(new ImageIcon("C:\\Users\\harsh\\OneDrive\\Desktop\\DBMS_Project\\Billing_System_Management\\Icons\\close Jframe.png"));
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_2.setBounds(1207, 652, 120, 33);
		contentPane.add(btnNewButton_1_2);
		
		JLabel lblNewLabel_1 = new JLabel("Calculation Details :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(778, 478, 303, 37);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\harsh\\OneDrive\\Desktop\\DBMS_Project\\Billing_System_Management\\Icons\\Frame3.png"));
		lblNewLabel_3.setBounds(0, 0, 1352, 719);
		contentPane.add(lblNewLabel_3);
	}
}
