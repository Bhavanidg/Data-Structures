import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Array extends JFrame {

	private static final long serialVersionUID = 1L;
	protected static final Component contentPan = null;
	private JPanel length;
	private JTextField element;
	private JTextField deletepos;
	private JTextField Length;
	private JTextField Insertpos;
	private JTextField Displaybox;
	private int arr[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 583, 444);
		length = new JPanel();
		length.setForeground(new Color(153, 204, 0));
		length.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(length);
		length.setLayout(null);

		JLabel iblArrayDAtaStructure = new JLabel("Array Data Structure");
		iblArrayDAtaStructure.setForeground(new Color(0, 0, 204));
		iblArrayDAtaStructure.setFont(new Font("Algerian", Font.BOLD, 14));
		iblArrayDAtaStructure.setBounds(225, 27, 181, 19);
		length.add(iblArrayDAtaStructure);

		JLabel lblEnterArrayLength = new JLabel("Enter array length");
		lblEnterArrayLength.setForeground(new Color(255, 51, 102));
		lblEnterArrayLength.setFont(new Font("Constantia", Font.BOLD, 12));
		lblEnterArrayLength.setBounds(131, 87, 106, 38);
		length.add(lblEnterArrayLength);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(50, 112, 45, 13);
		length.add(lblNewLabel_2);

		JLabel lblInsertAnInteger = new JLabel("Insert an integer element");
		lblInsertAnInteger.setForeground(new Color(0, 255, 255));
		lblInsertAnInteger.setFont(new Font("Constantia", Font.BOLD, 12));
		lblInsertAnInteger.setBounds(13, 231, 148, 15);
		length.add(lblInsertAnInteger);

		element = new JTextField();
		element.setBounds(171, 227, 96, 19);
		length.add(element);
		element.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Delete Position");
		lblNewLabel_4.setForeground(new Color(255, 102, 51));
		lblNewLabel_4.setBackground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Constantia", Font.BOLD, 12));
		lblNewLabel_4.setBounds(50, 272, 90, 15);
		length.add(lblNewLabel_4);

		deletepos = new JTextField();
		deletepos.setBounds(171, 268, 96, 19);
		length.add(deletepos);
		deletepos.setColumns(10);

		Length = new JTextField();
		Length.setBounds(294, 95, 96, 19);
		length.add(Length);
		Length.setColumns(10);

		JButton CREATE = new JButton("Create Array");
		CREATE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Code for creating an array
				String leun = Length.getText();
				int l = Integer.valueOf(leun);
				int len = Integer.valueOf(Length.getText());
				arr = new int[len];
				String message = "Array of length" + len + "Created";
				JOptionPane.showMessageDialog(contentPan, message);

			}
		});
		CREATE.setForeground(new Color(204, 204, 0));
		CREATE.setFont(new Font("Constantia", Font.BOLD, 12));
		CREATE.setBounds(254, 141, 105, 23);
		length.add(CREATE);

		JButton Insert = new JButton("INSERT");
		Insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for insertion
				int ele = Integer.valueOf(element.getText());
				int pos = Integer.valueOf(Insertpos.getText());
				arr[pos] = ele;
				String message = "Element" + ele + " Inserted at position" + pos;
				JOptionPane.showMessageDialog(contentPan, message);
				element.setText("");
				Insertpos.setText("");
			}
		});
		Insert.setForeground(new Color(51, 51, 153));
		Insert.setFont(new Font("Constantia", Font.BOLD, 12));
		Insert.setBounds(443, 219, 116, 39);
		length.add(Insert);

		Insertpos = new JTextField();
		Insertpos.setBounds(337, 227, 96, 19);
		length.add(Insertpos);
		Insertpos.setColumns(10);

		JLabel Position = new JLabel("Position");
		Position.setForeground(new Color(255, 153, 102));
		Position.setFont(new Font("Constantia", Font.BOLD, 12));
		Position.setBounds(277, 232, 49, 15);
		length.add(Position);

		JButton Delete = new JButton("DELETE");
		Delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for deletion
				int pos = Integer.valueOf(deletepos.getText());
				arr[pos] = 0;
				String message = "ElementDeleted @ position " + pos;
				JOptionPane.showMessageDialog(contentPan, message);
				deletepos.setText("");
			}
		});
		Delete.setFont(new Font("Tahoma", Font.BOLD, 12));
		Delete.setBounds(305, 267, 85, 21);
		length.add(Delete);

		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// code for display
				String message = "";
				for (int i = 0; i <= arr.length - 1; i++) {
					message = message + " " + arr[i];
				}
				Displaybox.setText(message);
				
			}
		});
		display.setForeground(new Color(51, 153, 255));
		display.setBounds(241, 325, 85, 21);
		length.add(display);

		Displaybox = new JTextField();
		Displaybox.setBackground(new Color(204, 204, 255));
		Displaybox.setBounds(171, 367, 219, 19);
		length.add(Displaybox);
		Displaybox.setColumns(10);
	}
}
