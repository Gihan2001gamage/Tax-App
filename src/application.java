import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.awt.ScrollPane;
import java.awt.Window;

import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class application extends JFrame {

	private static final long serialVersionUID = 1L;
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
	private JTextField textField_12;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					application frame = new application ();
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
	public application () {
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1084, 807);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(139, 0, 0));
		panel.setBounds(0, 0, 1070, 30);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Taxpayer Registration Details");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Poppins SemiBold", Font.BOLD, 14));
		lblNewLabel.setBounds(25, 4, 333, 25);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(245, 245, 220));
		panel_1.setBounds(0, 29, 1070, 40);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Registration Type");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setFont(new Font("Poppins SemiBold", Font.BOLD, 12));
		lblNewLabel_1.setBounds(87, 10, 163, 18);
		panel_1.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"INDIVIDUAL LOCAL", "INDIVIDUAL FOREIGN", "CORPORATE LOCAL", "CORPORATE FOREIGN", "PARTNERSHIP"}));
		comboBox.setSelectedIndex(0);
		comboBox.setFont(new Font("Poppins SemiBold", Font.BOLD, 12));
		comboBox.setBounds(270, 10, 616, 21);
		panel_1.add(comboBox);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(245, 245, 220));
		panel_2.setBounds(0, 80, 1070, 697);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"NIC ", "PASSPORT", "DRIVING LICENSE"}));
		comboBox_1.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
		comboBox_1.setBounds(270, 15, 195, 18);
		panel_2.add(comboBox_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
		textField.setBounds(475, 15, 218, 18);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Applicant Reference No.");
		lblNewLabel_1_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
		lblNewLabel_1_1.setBounds(10, 15, 241, 18);
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Full Name of Applicant");
		lblNewLabel_1_1_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
		lblNewLabel_1_1_1.setBounds(10, 45, 241, 18);
		panel_2.add(lblNewLabel_1_1_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
		textField_1.setColumns(10);
		textField_1.setBounds(270, 45, 616, 18);
		panel_2.add(textField_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("(English)");
		lblNewLabel_1_1_1_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
		lblNewLabel_1_1_1_1.setBounds(10, 57, 241, 18);
		panel_2.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Full Name of Applicant");
		lblNewLabel_1_1_1_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_1_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_2.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
		lblNewLabel_1_1_1_2.setBounds(10, 75, 241, 18);
		panel_2.add(lblNewLabel_1_1_1_2);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("CHAMARA", Font.BOLD, 10));
		textField_2.setColumns(10);
		textField_2.setBounds(270, 75, 616, 18);
		panel_2.add(textField_2);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("(Sinhala)");
		lblNewLabel_1_1_1_1_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
		lblNewLabel_1_1_1_1_1.setBounds(10, 87, 241, 18);
		panel_2.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2_1 = new JLabel("Full Name of Applicant");
		lblNewLabel_1_1_1_2_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_1_1_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_2_1.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
		lblNewLabel_1_1_1_2_1.setBounds(10, 105, 241, 18);
		panel_2.add(lblNewLabel_1_1_1_2_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("(Tamil)");
		lblNewLabel_1_1_1_1_1_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1_1_1_1_1_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
		lblNewLabel_1_1_1_1_1_1.setBounds(10, 117, 241, 18);
		panel_2.add(lblNewLabel_1_1_1_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Kalaham", Font.BOLD, 10));
		textField_3.setColumns(10);
		textField_3.setBounds(270, 105, 616, 18);
		panel_2.add(textField_3);
		
		JLabel lblNewLabel_1_1_1_2_1_1 = new JLabel("Name with Initials");
		lblNewLabel_1_1_1_2_1_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_1_1_2_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_2_1_1.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
		lblNewLabel_1_1_1_2_1_1.setBounds(10, 135, 241, 18);
		panel_2.add(lblNewLabel_1_1_1_2_1_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"<Select a Value>"}));
		comboBox_1_1.setSelectedIndex(0);
		comboBox_1_1.setFont(new Font("Poppins Light", Font.PLAIN, 10));
		comboBox_1_1.setBounds(270, 135, 195, 18);
		panel_2.add(comboBox_1_1);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("(English)");
		lblNewLabel_1_1_1_1_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_1_1_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_2.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
		lblNewLabel_1_1_1_1_2.setBounds(10, 147, 241, 18);
		panel_2.add(lblNewLabel_1_1_1_1_2);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
		textField_4.setColumns(10);
		textField_4.setBounds(475, 135, 411, 18);
		panel_2.add(textField_4);
		
		JLabel lblNewLabel_1_1_1_2_1_1_1 = new JLabel("Name with Initials");
		lblNewLabel_1_1_1_2_1_1_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_1_1_2_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_2_1_1_1.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
		lblNewLabel_1_1_1_2_1_1_1.setBounds(10, 165, 240, 18);
		panel_2.add(lblNewLabel_1_1_1_2_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_2 = new JLabel("(Sinhala)");
		lblNewLabel_1_1_1_1_1_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_1_1_1_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1_2.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
		lblNewLabel_1_1_1_1_1_2.setBounds(10, 177, 241, 18);
		panel_2.add(lblNewLabel_1_1_1_1_1_2);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("CHAMARA", Font.BOLD, 10));
		textField_5.setColumns(10);
		textField_5.setBounds(270, 165, 616, 18);
		panel_2.add(textField_5);
		
		JLabel lblNewLabel_1_1_1_2_1_1_1_1 = new JLabel("Name with Initials(Tamil)");
		lblNewLabel_1_1_1_2_1_1_1_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_1_1_2_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_2_1_1_1_1.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
		lblNewLabel_1_1_1_2_1_1_1_1.setBounds(10, 195, 240, 18);
		panel_2.add(lblNewLabel_1_1_1_2_1_1_1_1);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Kalaham", Font.BOLD, 10));
		textField_6.setColumns(10);
		textField_6.setBounds(270, 195, 616, 18);
		panel_2.add(textField_6);
		
		//JDateChooser dateChooser = new JDateChooser();
		//dateChooser.getSpinner().setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
		//dateChooser).setBounds(270, 220, 195, 18);
		//panel_2.add(dateChooser);
		
		JLabel lblNewLabel_1_1_1_2_1_1_2 = new JLabel("Date of Birth");
		lblNewLabel_1_1_1_2_1_1_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_1_1_2_1_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_2_1_1_2.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
		lblNewLabel_1_1_1_2_1_1_2.setBounds(10, 220, 241, 18);
		panel_2.add(lblNewLabel_1_1_1_2_1_1_2);
		
		JLabel lblNewLabel_1_1_1_2_1_1_2_1 = new JLabel("Country of Birth\r\n");
		lblNewLabel_1_1_1_2_1_1_2_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_1_1_2_1_1_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_2_1_1_2_1.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
		lblNewLabel_1_1_1_2_1_1_2_1.setBounds(488, 220, 180, 18);
		panel_2.add(lblNewLabel_1_1_1_2_1_1_2_1);
		
		JComboBox comboBox_1_1_1 = new JComboBox();
		comboBox_1_1_1.setModel(new DefaultComboBoxModel(new String[] {"<Select a Value>"}));
		comboBox_1_1_1.setSelectedIndex(0);
		comboBox_1_1_1.setFont(new Font("Poppins Light", Font.PLAIN, 10));
		comboBox_1_1_1.setBounds(691, 220, 195, 18);
		panel_2.add(comboBox_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2_1_1_2_2 = new JLabel("Gender");
		lblNewLabel_1_1_1_2_1_1_2_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_1_1_2_1_1_2_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_2_1_1_2_2.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
		lblNewLabel_1_1_1_2_1_1_2_2.setBounds(10, 245, 241, 18);
		panel_2.add(lblNewLabel_1_1_1_2_1_1_2_2);
		
		JComboBox comboBox_1_1_1_1 = new JComboBox();
		comboBox_1_1_1_1.setModel(new DefaultComboBoxModel(new String[] {"<Select a Value>", "Male", "Female", "Other"}));
		comboBox_1_1_1_1.setSelectedIndex(0);
		comboBox_1_1_1_1.setFont(new Font("Poppins Light", Font.PLAIN, 10));
		comboBox_1_1_1_1.setBounds(270, 245, 195, 18);
		panel_2.add(comboBox_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2_1_1_2_1_1 = new JLabel("Nationality");
		lblNewLabel_1_1_1_2_1_1_2_1_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_1_1_2_1_1_2_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_2_1_1_2_1_1.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
		lblNewLabel_1_1_1_2_1_1_2_1_1.setBounds(488, 245, 180, 18);
		panel_2.add(lblNewLabel_1_1_1_2_1_1_2_1_1);
		
		JLabel lblNewLabel_1_1_1_2_1_1_2_1_1_1 = new JLabel("SRI LANKAN");
		lblNewLabel_1_1_1_2_1_1_2_1_1_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_1_1_2_1_1_2_1_1_1.setToolTipText("");
		lblNewLabel_1_1_1_2_1_1_2_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_2_1_1_2_1_1_1.setFont(new Font("Poppins Light", Font.PLAIN, 10));
		lblNewLabel_1_1_1_2_1_1_2_1_1_1.setBounds(691, 245, 180, 18);
		panel_2.add(lblNewLabel_1_1_1_2_1_1_2_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2_1_1_2_2_1 = new JLabel("Preferred Language\r\n");
		lblNewLabel_1_1_1_2_1_1_2_2_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_1_1_2_1_1_2_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_2_1_1_2_2_1.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
		lblNewLabel_1_1_1_2_1_1_2_2_1.setBounds(10, 270, 241, 18);
		panel_2.add(lblNewLabel_1_1_1_2_1_1_2_2_1);
		
		JComboBox comboBox_1_1_1_1_1 = new JComboBox();
		comboBox_1_1_1_1_1.setModel(new DefaultComboBoxModel(new String[] {"<Select a Value>"}));
		comboBox_1_1_1_1_1.setSelectedIndex(0);
		comboBox_1_1_1_1_1.setFont(new Font("Poppins Light", Font.PLAIN, 10));
		comboBox_1_1_1_1_1.setBounds(270, 270, 195, 18);
		panel_2.add(comboBox_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2_1_1_2_1_1_2 = new JLabel("Preferred Mode of\r\n");
		lblNewLabel_1_1_1_2_1_1_2_1_1_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_1_1_2_1_1_2_1_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_2_1_1_2_1_1_2.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
		lblNewLabel_1_1_1_2_1_1_2_1_1_2.setBounds(488, 270, 180, 18);
		panel_2.add(lblNewLabel_1_1_1_2_1_1_2_1_1_2);
		
		JLabel lblNewLabel_1_1_1_2_1_1_2_1_1_3 = new JLabel(" Communication");
		lblNewLabel_1_1_1_2_1_1_2_1_1_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_1_1_2_1_1_2_1_1_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_2_1_1_2_1_1_3.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
		lblNewLabel_1_1_1_2_1_1_2_1_1_3.setBounds(488, 282, 180, 18);
		panel_2.add(lblNewLabel_1_1_1_2_1_1_2_1_1_3);
		
		JComboBox comboBox_1_1_1_2 = new JComboBox();
		comboBox_1_1_1_2.setModel(new DefaultComboBoxModel(new String[] {"<Select a Value>"}));
		comboBox_1_1_1_2.setSelectedIndex(0);
		comboBox_1_1_1_2.setFont(new Font("Poppins Light", Font.PLAIN, 10));
		comboBox_1_1_1_2.setBounds(691, 270, 195, 18);
		panel_2.add(comboBox_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_2_1_1_2_2_1_1 = new JLabel("Website URL");
		lblNewLabel_1_1_1_2_1_1_2_2_1_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_1_1_2_1_1_2_2_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_2_1_1_2_2_1_1.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
		lblNewLabel_1_1_1_2_1_1_2_2_1_1.setBounds(10, 300, 241, 18);
		panel_2.add(lblNewLabel_1_1_1_2_1_1_2_2_1_1);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
		textField_7.setColumns(10);
		textField_7.setBounds(270, 300, 616, 18);
		panel_2.add(textField_7);
		
		JLabel lblNewLabel_1_1_1_2_1_1_2_2_1_1_1 = new JLabel("Resident status");
		lblNewLabel_1_1_1_2_1_1_2_2_1_1_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_1_1_2_1_1_2_2_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_2_1_1_2_2_1_1_1.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
		lblNewLabel_1_1_1_2_1_1_2_2_1_1_1.setBounds(0, 282, 241, 18);
		panel_2.add(lblNewLabel_1_1_1_2_1_1_2_2_1_1_1);
		
		JComboBox comboBox_1_2 = new JComboBox();
		comboBox_1_2.setModel(new DefaultComboBoxModel(new String[] {"RESIDENT", "NONRESIDENT"}));
		comboBox_1_2.setSelectedIndex(0);
		comboBox_1_2.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
		comboBox_1_2.setBounds(270, 325, 195, 18);
		panel_2.add(comboBox_1_2);
		
		JLabel lblNewLabel_1_1_1_2_1_1_2_1_1_4 = new JLabel("Citizenship");
		lblNewLabel_1_1_1_2_1_1_2_1_1_4.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_1_1_2_1_1_2_1_1_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_2_1_1_2_1_1_4.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
		lblNewLabel_1_1_1_2_1_1_2_1_1_4.setBounds(500, 325, 180, 18);
		panel_2.add(lblNewLabel_1_1_1_2_1_1_2_1_1_4);
		
		JComboBox comboBox_1_1_1_2_1 = new JComboBox();
		comboBox_1_1_1_2_1.setModel(new DefaultComboBoxModel(new String[] {"CITIZEN"}));
		comboBox_1_1_1_2_1.setSelectedIndex(0);
		comboBox_1_1_1_2_1.setFont(new Font("Poppins Light", Font.PLAIN, 10));
		comboBox_1_1_1_2_1.setBounds(691, 325, 195, 18);
		panel_2.add(comboBox_1_1_1_2_1);
		
		JLabel lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1 = new JLabel("Dual citizenship");
		lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
		lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1.setBounds(10, 350, 241, 18);
		panel_2.add(lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Yes\r\n");
		rdbtnNewRadioButton.setBackground(new Color(245, 245, 220));
		rdbtnNewRadioButton.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
		rdbtnNewRadioButton.setBounds(270, 350, 50, 21);
		panel_2.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNo = new JRadioButton("No\r\n");
		rdbtnNo.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
		rdbtnNo.setBackground(new Color(245, 245, 220));
		rdbtnNo.setBounds(356, 350, 50, 21);
		panel_2.add(rdbtnNo);
		
		ButtonGroup bg = new ButtonGroup();
        bg.add(rdbtnNewRadioButton);
        bg.add(rdbtnNo);
        
        JLabel lblNewLabel_1_1_1_2_1_1_2_1_1_4_1 = new JLabel("Dual citizenship country");
        lblNewLabel_1_1_1_2_1_1_2_1_1_4_1.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel_1_1_1_2_1_1_2_1_1_4_1.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_1_1_1_2_1_1_2_1_1_4_1.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
        lblNewLabel_1_1_1_2_1_1_2_1_1_4_1.setBounds(500, 350, 180, 18);
        panel_2.add(lblNewLabel_1_1_1_2_1_1_2_1_1_4_1);
        
        JComboBox comboBox_1_1_1_2_2 = new JComboBox();
        comboBox_1_1_1_2_2.setModel(new DefaultComboBoxModel(new String[] {"<Select a Value>"}));
        comboBox_1_1_1_2_2.setSelectedIndex(0);
        comboBox_1_1_1_2_2.setFont(new Font("Poppins Light", Font.PLAIN, 10));
        comboBox_1_1_1_2_2.setBounds(691, 350, 195, 18);
        panel_2.add(comboBox_1_1_1_2_2);
        
        JLabel lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1 = new JLabel("Source of Income\r\n");
        lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
        lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1.setBounds(10, 375, 241, 18);
        panel_2.add(lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1);
        
        JCheckBox chckbxNewCheckBox = new JCheckBox("BUSINESS");
        chckbxNewCheckBox.setBackground(new Color(245, 245, 220));
        chckbxNewCheckBox.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
        chckbxNewCheckBox.setBounds(270, 375, 93, 21);
        panel_2.add(chckbxNewCheckBox);
        
        JCheckBox chckbxEmployment = new JCheckBox("EMPLOYMENT");
        chckbxEmployment.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
        chckbxEmployment.setBackground(new Color(245, 245, 220));
        chckbxEmployment.setBounds(415, 375, 112, 21);
        panel_2.add(chckbxEmployment);
        
        JCheckBox chckbxInvestment = new JCheckBox("INVESTMENT");
        chckbxInvestment.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
        chckbxInvestment.setBackground(new Color(245, 245, 220));
        chckbxInvestment.setBounds(560, 375, 93, 21);
        panel_2.add(chckbxInvestment);
        
        JCheckBox chckbxOthers = new JCheckBox("OTHERS");
        chckbxOthers.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
        chckbxOthers.setBackground(new Color(245, 245, 220));
        chckbxOthers.setBounds(705, 375, 93, 21);
        panel_2.add(chckbxOthers);
        
        JLabel lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_1 = new JLabel("If others, Please specify");
        lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_1.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_1.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
        lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_1.setBounds(10, 400, 241, 18);
        panel_2.add(lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_1);
        
        textField_8 = new JTextField();
        textField_8.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
        textField_8.setColumns(10);
        textField_8.setBounds(270, 400, 616, 18);
        panel_2.add(textField_8);
        
        JLabel lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_1_1 = new JLabel("If others, Please specify");
        lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_1_1.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_1_1.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
        lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_1_1.setBounds(10, 450, 241, 18);
        panel_2.add(lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_1_1);
        
        textField_9 = new JTextField();
        textField_9.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
        textField_9.setColumns(10);
        textField_9.setBounds(270, 450, 616, 18);
        panel_2.add(textField_9);
        
        JLabel lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_2 = new JLabel("Profession");
        lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_2.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_2.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
        lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_2.setBounds(10, 425, 241, 18);
        panel_2.add(lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_2);
        
        JComboBox comboBox_1_1_2 = new JComboBox();
        comboBox_1_1_2.setModel(new DefaultComboBoxModel(new String[] {"<Select a Value>"}));
        comboBox_1_1_2.setSelectedIndex(0);
        comboBox_1_1_2.setFont(new Font("Poppins Light", Font.PLAIN, 10));
        comboBox_1_1_2.setBounds(270, 425, 616, 18);
        panel_2.add(comboBox_1_1_2);
        
        JLabel lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_2_1 = new JLabel("Nearest Regional office");
        lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_2_1.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_2_1.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
        lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_2_1.setBounds(10, 475, 241, 18);
        panel_2.add(lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_2_1);
        
        JComboBox comboBox_1_1_2_1 = new JComboBox();
        comboBox_1_1_2_1.setModel(new DefaultComboBoxModel(new String[] {"<Select a Value>"}));
        comboBox_1_1_2_1.setSelectedIndex(0);
        comboBox_1_1_2_1.setFont(new Font("Poppins Light", Font.PLAIN, 10));
        comboBox_1_1_2_1.setBounds(270, 475, 616, 18);
        panel_2.add(comboBox_1_1_2_1);
        
        JLabel lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_2_1_1 = new JLabel("PERMANENT ADDRESS");
        lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_2_1_1.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_2_1_1.setFont(new Font("Poppins SemiBold", Font.BOLD, 12));
        lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_2_1_1.setBounds(70, 495, 180, 18);
        panel_2.add(lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_2_1_1);
        
        JLabel lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_2_1_2 = new JLabel("Premises No.(English)");
        lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_2_1_2.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_2_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_2_1_2.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
        lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_2_1_2.setBounds(10, 510, 241, 18);
        panel_2.add(lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_2_1_2);
        
        textField_10 = new JTextField();
        textField_10.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
        textField_10.setColumns(10);
        textField_10.setBounds(270, 510, 195, 18);
        panel_2.add(textField_10);
        
        JLabel lblNewLabel_1_1_1_2_1_1_2_1_1_4_2 = new JLabel("Unit No.(English)");
        lblNewLabel_1_1_1_2_1_1_2_1_1_4_2.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel_1_1_1_2_1_1_2_1_1_4_2.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_1_1_1_2_1_1_2_1_1_4_2.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
        lblNewLabel_1_1_1_2_1_1_2_1_1_4_2.setBounds(500, 510, 180, 18);
        panel_2.add(lblNewLabel_1_1_1_2_1_1_2_1_1_4_2);
        
        textField_11 = new JTextField();
        textField_11.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
        textField_11.setColumns(10);
        textField_11.setBounds(691, 510, 195, 18);
        panel_2.add(textField_11);
        
        JLabel lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_2_1_2_1 = new JLabel("Address(English)");
        lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_2_1_2_1.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_2_1_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_2_1_2_1.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
        lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_2_1_2_1.setBounds(10, 535, 241, 18);
        panel_2.add(lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_2_1_2_1);
        
        textField_12 = new JTextField();
        textField_12.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
        textField_12.setColumns(10);
        textField_12.setBounds(270, 535, 616, 18);
        panel_2.add(textField_12);
        
        JLabel lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_2_1_2_2 = new JLabel("Premises No.(Sinhala)");
        lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_2_1_2_2.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_2_1_2_2.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_2_1_2_2.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
        lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_2_1_2_2.setBounds(10, 564, 241, 18);
        panel_2.add(lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_2_1_2_2);
        
        textField_15 = new JTextField();
        textField_15.setFont(new Font("CHAMARA", Font.BOLD, 10));
        textField_15.setColumns(10);
        textField_15.setBounds(270, 564, 195, 18);
        panel_2.add(textField_15);
        
        JLabel lblNewLabel_1_1_1_2_1_1_2_1_1_4_2_1 = new JLabel("Unit No.(Sinhala)");
        lblNewLabel_1_1_1_2_1_1_2_1_1_4_2_1.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel_1_1_1_2_1_1_2_1_1_4_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_1_1_1_2_1_1_2_1_1_4_2_1.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
        lblNewLabel_1_1_1_2_1_1_2_1_1_4_2_1.setBounds(513, 564, 180, 18);
        panel_2.add(lblNewLabel_1_1_1_2_1_1_2_1_1_4_2_1);
        
        textField_16 = new JTextField();
        textField_16.setFont(new Font("CHAMARA", Font.BOLD, 10));
        textField_16.setColumns(10);
        textField_16.setBounds(691, 564, 195, 18);
        panel_2.add(textField_16);
        
        JLabel lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_2_1_2_1_1 = new JLabel("Address(Sinhala)");
        lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_2_1_2_1_1.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_2_1_2_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_2_1_2_1_1.setFont(new Font("Poppins SemiBold", Font.BOLD, 10));
        lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_2_1_2_1_1.setBounds(10, 593, 241, 18);
        panel_2.add(lblNewLabel_1_1_1_2_1_1_2_2_1_1_1_1_1_2_1_2_1_1);
        
        textField_17 = new JTextField();
        textField_17.setFont(new Font("CHAMARA", Font.BOLD, 10));
        textField_17.setColumns(10);
        textField_17.setBounds(270, 593, 616, 18);
        panel_2.add(textField_17);
 
     
            
        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setBounds(270, 223, 175, 19);
        panel_2.add(dateChooser);
        
        JButton btnNewButton_1 = new JButton("Register");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		JOptionPane.showMessageDialog(null,"Registered");
        		
        	}
        });
        btnNewButton_1.setBounds(356, 622, 89, 23);
        panel_2.add(btnNewButton_1);
        
        JButton btnNewButton_1_1 = new JButton("Re-set");
        btnNewButton_1_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		comboBox.setSelectedIndex(0);
        		comboBox_1.setSelectedIndex(0);
        		textField.setText("");
        		textField_1.setText("");
        		textField_2.setText("");
        		textField_3.setText("");
        		textField_4.setText("");
        		textField_5.setText("");
        		textField_6.setText("");
        		textField_7.setText("");
        		textField_8.setText("");
        		textField_9.setText("");
        		textField_10.setText("");
        		textField_11.setText("");
        		textField_12.setText("");
        		//textField_13.setText("");
        		//textField_14.setText("");
        		textField_15.setText("");
        		textField_16.setText("");
        		textField_17.setText("");
        		//textField_18.setText("");
        		//xtField_19.setText("");
        		comboBox_1_1.setSelectedIndex(0);
        		comboBox_1_1_1.setSelectedIndex(0);
        		comboBox_1_1_1_1.setSelectedIndex(0);
        		comboBox_1_1_1_1_1.setSelectedIndex(0);
        		comboBox_1_1_1_2.setSelectedIndex(0);
        		comboBox_1_2.setSelectedIndex(0);
        		comboBox_1_1_1_2_1.setSelectedIndex(0);
        		comboBox_1_1_1_2_2.setSelectedIndex(0);
        		comboBox_1_1_2.setSelectedIndex(0);
        		comboBox_1_1_2_1.setSelectedIndex(0);
        		dateChooser.setDate(null);
        		rdbtnNewRadioButton.setSelected(false);
        		rdbtnNo.setSelected(false);
        		chckbxEmployment .setSelected(false);
        		chckbxInvestment.setSelected(false);
        		chckbxOthers.setSelected(false);
        		chckbxNewCheckBox.setSelected(false);
        		chckbxNewCheckBox.setSelected(false);
        		
        		
        		
        		
        	}
        });
        btnNewButton_1_1.setBounds(512, 622, 89, 23);
        panel_2.add(btnNewButton_1_1);
        
        JButton btnNewButton_1_2 = new JButton("Exit");
        btnNewButton_1_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        	System.exit(ABORT);
        	}
        });
        btnNewButton_1_2.setBounds(679, 622, 89, 23);
        panel_2.add(btnNewButton_1_2);
	}
}
