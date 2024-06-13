

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.Cursor;
// import javax.swing.JTable;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.sql.*;
import SQL_Connection.SqlConnection;
import net.proteanit.sql.DbUtils;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;
public class Buyer_Details extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Buyer_Details frame = new Buyer_Details();
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
	public Buyer_Details() {
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				try
				{
					Connection con=SqlConnection.getCon();
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select * from buyer");
					table.setModel(DbUtils.resultSetToTableModel(rs));
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 756);
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
		btnNewButton.setIcon(new ImageIcon("D:\\Final Project\\Billing_System_Management\\Icons\\Back Button.png"));
		btnNewButton.setBounds(24, 11, 113, 89);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\r\n");
		lblNewLabel.setIcon(new ImageIcon("D:\\Final Project\\Billing_System_Management\\Icons\\Buyer Details Frame.png"));
		lblNewLabel.setBounds(431, 11, 477, 96);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(24, 120, 1332, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(24, 608, 1332, 2);
		contentPane.add(separator_1);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setIcon(new ImageIcon("D:\\Final Project\\Billing_System_Management\\Icons\\close Jframe.png"));
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnClose.setBounds(1087, 639, 108, 29);
		contentPane.add(btnClose);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					table.print(JTable.PrintMode.NORMAL);
				}
				catch(Exception e1)
				{
					
				}
			}
		});
		btnPrint.setIcon(new ImageIcon("D:\\Final Project\\Billing_System_Management\\Icons\\print.png"));
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPrint.setBounds(134, 639, 113, 29);
		contentPane.add(btnPrint);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(304, 133, 714, 464);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setFillsViewportHeight(true);

		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\Final Project\\Billing_System_Management\\Icons\\Frame1.png"));
		lblNewLabel_1.setBounds(0, 0, 1366, 756);
		contentPane.add(lblNewLabel_1);
	}
}
