import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.io.File;


import java.io.File;

public class FitFrame extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtAge;
	private JTextField txtTrackingNum;
	private JTextField txtHeight;
	private JButton btnClear;
	private JRadioButton btnMale, btnFemale;
	private JButton btnClose;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		List<FitPerson> myList = null;
		myList = new LinkedList<FitPerson>();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FitFrame frame = new FitFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		input(myList);
	}

	private static void input(List<FitPerson> myList) {
		String data, record;
		
		Scanner scanner = null;
		
		try {
			scanner = new Scanner(new File("fitperson.dat"));
		} catch (FileNotFoundException e) {
			System.out.println("File error");
		}
		
		scanner.useDelimiter("\r\n");
		while(scanner.hasNext()){
			FitPerson fp = new FitPerson();
			record = scanner.next();
			String iName = record.substring(0, 19);
			fp.setName(iName);
			
			data = record.substring(19, 21);
			int iAge = Integer.parseInt(data.trim());
			fp.setAge(iAge);
			
			String iGender = record.substring(21, 22);	
			fp.setGender(iGender.charAt(0));
			
			data = record.substring(22, 24);		
			int iTrackingNum = Integer.parseInt(data.trim());
			fp.setTrackingNumber(iTrackingNum);
			
			data = record.substring(24, 26);
			int iHeight = Integer.parseInt(data.trim());
			fp.setHeight(iHeight);


			myList.add(fp);
		}
	}

	
	
	

	
	
	
	
	
	
	
	
	
	
	
	/**
	 * Create the frame.
	 */
	public FitFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFitPerson = new JLabel("Fit Person - add a new Fit Person");
		lblFitPerson.setBounds(126, 0, 265, 14);
		contentPane.add(lblFitPerson);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(34, 42, 46, 14);
		contentPane.add(lblName);
		
		txtName = new JTextField();
		txtName.setBounds(10, 56, 86, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Age");
		lblNewLabel.setBounds(137, 42, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtAge = new JTextField();
		txtAge.setBounds(126, 56, 39, 20);
		contentPane.add(txtAge);
		txtAge.setColumns(10);
		
		JLabel lblTrackingNumber = new JLabel("Tracking Number");
		lblTrackingNumber.setBounds(206, 42, 111, 14);
		contentPane.add(lblTrackingNumber);
		
		txtTrackingNum = new JTextField();
		txtTrackingNum.setColumns(10);
		txtTrackingNum.setBounds(228, 56, 39, 20);
		contentPane.add(txtTrackingNum);
		
		JLabel lblHeight = new JLabel("Height");
		lblHeight.setBounds(327, 42, 46, 14);
		contentPane.add(lblHeight);
		
		txtHeight = new JTextField();
		txtHeight.setColumns(10);
		txtHeight.setBounds(327, 56, 39, 20);
		contentPane.add(txtHeight);
		
		btnMale = new JRadioButton("Male");
		btnMale.setBounds(34, 118, 109, 23);
		contentPane.add(btnMale);
		
		btnFemale = new JRadioButton("Female");
		btnFemale.setBounds(34, 144, 109, 23);
		contentPane.add(btnFemale);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(204, 132, 89, 23);
		contentPane.add(btnAdd);
		
		btnClear = new JButton("Clear");
		btnClear.addActionListener(this);
		btnClear.setBounds(204, 166, 89, 23);

		contentPane.add(btnClear);
		
		btnClose = new JButton("Close");
		btnClose.setBounds(204, 196, 89, 23);
		btnClose.addActionListener(this);
		contentPane.add(btnClose);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnClear) {
			txtName.setText("");
			txtHeight.setText("");
			txtTrackingNum.setText("");
			txtAge.setText("");
			btnMale.setSelected(false);
			btnFemale.setSelected(false);
			
			
		}
		
		if (e.getSource() == btnClose) {
			System.exit(0);
		}
		
	}
}
