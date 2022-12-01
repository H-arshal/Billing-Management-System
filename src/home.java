import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

public class home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home frame = new home();
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
	public home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 756);
		contentPane = new JPanel();
		contentPane.setMinimumSize(new Dimension(0, 0));
		contentPane.setMaximumSize(new Dimension(1366, 756));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Buyer_New().setVisible(true);
				setVisible(false);
				
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\harsh\\OneDrive\\Desktop\\DBMS_Project\\Billing_System_Management\\Icons\\New Buyer.png"));
		btnNewButton_1.setBounds(28, 11, 93, 69);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Product_Details().setVisible(true);
			}
		});
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\harsh\\OneDrive\\Desktop\\DBMS_Project\\Billing_System_Management\\Icons\\Product Details.png"));
		btnNewButton_3.setBounds(633, 11, 93, 69);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\harsh\\OneDrive\\Desktop\\DBMS_Project\\Billing_System_Management\\Icons\\buyer Details.png"));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Buyer_Details().setVisible(true);
			}
		});
		btnNewButton_4.setBounds(151, 11, 93, 69);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Buyer_Delete().setVisible(true);
			}
		});
		btnNewButton_5.setIcon(new ImageIcon("C:\\Users\\harsh\\OneDrive\\Desktop\\DBMS_Project\\Billing_System_Management\\Icons\\Delete Buyer.png"));
		btnNewButton_5.setBounds(391, 11, 93, 69);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Product_New().setVisible(true);
			}
		});
		btnNewButton_6.setIcon(new ImageIcon("C:\\Users\\harsh\\OneDrive\\Desktop\\DBMS_Project\\Billing_System_Management\\Icons\\new product.png"));
		btnNewButton_6.setBounds(512, 11, 93, 69);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Product_Update().setVisible(true);
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\harsh\\OneDrive\\Desktop\\DBMS_Project\\Billing_System_Management\\Icons\\update product.png"));
		btnNewButton.setBounds(754, 11, 93, 69);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New Buyer");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(37, 91, 75, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblDeleteBuyer = new JLabel("Delete Buyer");
		lblDeleteBuyer.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDeleteBuyer.setBounds(393, 91, 89, 17);
		contentPane.add(lblDeleteBuyer);
		
		JLabel lblNewLabel_2 = new JLabel("Update Buyer");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(269, 91, 95, 17);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Product Details");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(626, 91, 107, 17);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Buyer Details");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(151, 91, 93, 17);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New Product");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(513, 91, 90, 17);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Update Product");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(746, 91, 109, 17);
		contentPane.add(lblNewLabel_6);
		
		JButton btnNewButton_5_1 = new JButton("");
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Buyer_Update().setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_5_1.setIcon(new ImageIcon("C:\\Users\\harsh\\OneDrive\\Desktop\\DBMS_Project\\Billing_System_Management\\Icons\\Update Buyer.png"));
		btnNewButton_5_1.setBounds(270, 11, 93, 69);
		contentPane.add(btnNewButton_5_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Product_Delete().setVisible(true);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\harsh\\OneDrive\\Desktop\\DBMS_Project\\Billing_System_Management\\Icons\\delete product.png"));
		btnNewButton_2.setBounds(875, 11, 93, 69);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(null,"Do you really wants to LogOut?","Select",JOptionPane.YES_NO_OPTION);
				{
					if(a==0)
					{
						setVisible(false);
						new Login().setVisible(true);
					}
				}
			}
		});
		btnNewButton_2_1.setIcon(new ImageIcon("C:\\Users\\harsh\\OneDrive\\Desktop\\DBMS_Project\\Billing_System_Management\\Icons\\Log Out.png"));
		btnNewButton_2_1.setBounds(1121, 11, 93, 69);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(null,"Do you really wants to Quit?","Select",JOptionPane.YES_NO_OPTION);
				if(a==0)
				{
					System.exit(0);
				}
			}
		});
		btnNewButton_2_2.setIcon(new ImageIcon("C:\\Users\\harsh\\OneDrive\\Desktop\\DBMS_Project\\Billing_System_Management\\Icons\\Close Application.png"));
		btnNewButton_2_2.setBounds(1242, 11, 93, 69);
		contentPane.add(btnNewButton_2_2);
		
		JLabel lblNewLabel_1 = new JLabel("Delete Product");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(870, 91, 103, 17);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_7 = new JLabel("Log Out");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7.setBounds(1140, 91, 55, 17);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Close App");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_8.setBounds(1254, 91, 68, 17);
		contentPane.add(lblNewLabel_8);
		
		JButton btnNewButton_7 = new JButton("\r\n");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Billing().setVisible(true);
			}
		});
		btnNewButton_7.setIcon(new ImageIcon("C:\\Users\\harsh\\OneDrive\\Desktop\\DBMS_Project\\Billing_System_Management\\Icons\\billing.png"));
		btnNewButton_7.setBounds(996, 11, 103, 69);
		contentPane.add(btnNewButton_7);
		
		JLabel lblNewLabel_8_1 = new JLabel("Billing");
		lblNewLabel_8_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_8_1.setBounds(1020, 91, 49, 19);
		contentPane.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\harsh\\Downloads\\Untitled design (4).png"));
		lblNewLabel_9.setBounds(-14, 0, 1366, 719);
		contentPane.add(lblNewLabel_9);
	}
}
