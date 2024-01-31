import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stack extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField length;
	private JTextField ele;
	private JTextField textarray;
	private int a[];
	private int n;
	private int top = -1;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 678, 447);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STACK DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(153, 0, 102));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 16));
		lblNewLabel.setBounds(253, 38, 199, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE STACK SIZE : ");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1.setBounds(131, 99, 203, 18);
		contentPane.add(lblNewLabel_1);
		
		length = new JTextField();
		length.setBounds(326, 80, 126, 36);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton creation = new JButton("CREATE STACK");
		creation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n=Integer.valueOf(length.getText());
				a = new int[n];
				String message = "Stack created of "+ n +" length";
				JOptionPane.showMessageDialog(contentPane,message);
				
				
			}
		});
		creation.setForeground(new Color(51, 102, 255));
		creation.setFont(new Font("Times New Roman", Font.BOLD, 14));
		creation.setBounds(266, 132, 143, 36);
		contentPane.add(creation);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER AN ELEMENT : ");
		lblNewLabel_2.setBackground(new Color(0, 255, 204));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setForeground(new Color(0, 255, 204));
		lblNewLabel_2.setBounds(92, 189, 157, 17);
		contentPane.add(lblNewLabel_2);
		
		ele = new JTextField();
		ele.setBounds(263, 186, 96, 25);
		contentPane.add(ele);
		ele.setColumns(10);
		
		JButton pushing = new JButton("PUSH");
		pushing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int elem;
				if(top == (n-1))
				{
					JOptionPane.showMessageDialog(contentPane, "Push not possible");
				}
				else
				{
					elem = Integer.valueOf(ele.getText());
					++top;
					a[top]=elem;
					JOptionPane.showMessageDialog(contentPane,"Push successful");
					ele.setText("");
				}
				
			}
		});
		pushing.setForeground(new Color(102, 102, 153));
		pushing.setFont(new Font("Times New Roman", Font.BOLD, 14));
		pushing.setBounds(409, 182, 85, 31);
		contentPane.add(pushing);
		
		JButton poping = new JButton("POP");
		poping.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(top == -1)
				{
					JOptionPane.showMessageDialog(contentPane, "Pop not possible");
				}
				else
				{
					String message = "Element deleted" + a[top];
					JOptionPane.showMessageDialog(contentPane, message);
					--top;
				}
			}
		});
		poping.setForeground(new Color(153, 0, 102));
		poping.setFont(new Font("Times New Roman", Font.BOLD, 14));
		poping.setBounds(274, 233, 85, 31);
		contentPane.add(poping);
		
		JButton displaying = new JButton("DISPLAY");
		displaying.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(top == -1)
				{
					JOptionPane.showMessageDialog(contentPane,"Stack is Empty");
					textarray.setText("");
				}
				else {
				String message="";
				for(int i = top;i>=0;i--)
				{
					message = message+a[i]+" ";
				}
				textarray.setText(message);
				}
			}
		});
		displaying.setForeground(new Color(102, 102, 204));
		displaying.setFont(new Font("Times New Roman", Font.BOLD, 14));
		displaying.setBounds(274, 288, 95, 31);
		contentPane.add(displaying);
		
		textarray = new JTextField();
		textarray.setForeground(new Color(255, 204, 255));
		textarray.setBounds(181, 349, 271, 31);
		contentPane.add(textarray);
		textarray.setColumns(10);
	}
}
