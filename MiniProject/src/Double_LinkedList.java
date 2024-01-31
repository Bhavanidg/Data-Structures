import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Double_LinkedList extends JFrame {
	class Node
	{
		Node prelink;
		int data;
		Node nextlink;
	}
	

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField eler;
	private JTextField elef;
	private Node first = null;
	private JTextField tex;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Double_LinkedList frame = new Double_LinkedList();
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
	public Double_LinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 795, 468);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		eler = new JTextField();
		eler.setBounds(244, 112, 96, 25);
		contentPane.add(eler);
		eler.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("DOUBLY LINKEDLIST");
		lblNewLabel.setForeground(new Color(153, 50, 204));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 16));
		lblNewLabel.setBounds(235, 28, 156, 22);
		contentPane.add(lblNewLabel);
		
		JButton insr = new JButton("INSERT REAR");
		insr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					Node temp = first;
					Node newnode = new Node();
					int ele = Integer.valueOf(eler.getText());
					newnode.data = ele;
					if(first==null)
					{
						first = newnode;
					}
					else if(first.nextlink==null)
					{
						first.nextlink=newnode;
						newnode.prelink = first;
					}
					else
					{
						while(temp.nextlink != null)
						{
							temp = temp.nextlink;
						}
						temp.nextlink = newnode;
						newnode.prelink = temp;
					}
					JOptionPane.showMessageDialog(contentPane, "Element inserted at rear end :"+ele);
					eler.setText("");
			}
			
		});
		insr.setFont(new Font("Tahoma", Font.BOLD, 14));
		insr.setForeground(new Color(255, 0, 255));
		insr.setBounds(399, 109, 153, 37);
		contentPane.add(insr);
		
		elef = new JTextField();
		elef.setBounds(244, 155, 96, 25);
		contentPane.add(elef);
		elef.setColumns(10);
		
		JButton insf = new JButton("INSERT FRONT");
		insf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node newnode = new Node();
				int ele = Integer.valueOf(elef.getText());
				newnode.data = ele;
				if(first == null)
				{
					first=newnode;
				}
				else 
				{
					newnode.nextlink=first;
					first.prelink= newnode;
					first=newnode;
				}
				JOptionPane.showMessageDialog(contentPane, "Element inserted at frontend: "+ele);
				elef.setText("");
				
			}
		});
		insf.setFont(new Font("Arial Black", Font.BOLD, 14));
		insf.setForeground(new Color(153, 0, 255));
		insf.setBounds(395, 156, 157, 39);
		contentPane.add(insf);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER THE ELEMENT : ");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_2.setForeground(new Color(50, 205, 50));
		lblNewLabel_2.setBounds(36, 158, 195, 21);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("ENTER THE ELEMENT : ");
		lblNewLabel_3.setForeground(new Color(128, 0, 0));
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_3.setBounds(36, 109, 195, 21);
		contentPane.add(lblNewLabel_3);
		
		JButton delf = new JButton("DELETE FRONT");
		delf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(first == null)
				{
					JOptionPane.showMessageDialog(contentPane, "Nothing to delete");
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane,"Element deleted :"+first.data);
					first = first.nextlink;
					first.prelink = null;
				}
			}
		});
		delf.setForeground(new Color(153, 0, 255));
		delf.setFont(new Font("Arial Black", Font.BOLD, 14));
		delf.setBounds(242, 212, 175, 39);
		contentPane.add(delf);
		
		JButton delr = new JButton("DELETE REAR");
		delr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp =first;
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane,"Nothing to delete");
				}
				else if(first.nextlink==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Element deleted :"+first.data);
					first = null;	
				}
				else
				{
					while(temp.nextlink.nextlink!=null)
					{
						temp = temp.nextlink;
					}
					temp.nextlink=null;
				}
				
			}
		});
		delr.setForeground(new Color(153, 0, 255));
		delr.setFont(new Font("Arial Black", Font.BOLD, 14));
		delr.setBounds(244, 261, 173, 39);
		contentPane.add(delr);
		
		JButton disf = new JButton("DISPLAY FRONT");
		disf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp = first;
				String message="";
				if(first == null)
				{
					JOptionPane.showMessageDialog(contentPane, "Nothing to display");
				}
				else
				{
					while(temp!=null)
					{
						message = message + temp.data + " ";
						temp = temp.nextlink;
						
					}
					tex.setText(message);
				}
				
			}
		});
		disf.setForeground(new Color(153, 0, 255));
		disf.setFont(new Font("Arial Black", Font.BOLD, 14));
		disf.setBounds(131, 310, 181, 51);
		contentPane.add(disf);
		
		JButton disr = new JButton("DISPLAY REVERSE");
		disr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp = first;
				String messae = "";
				if(first == null)
				{
					JOptionPane.showMessageDialog(contentPane, "Nothing to delete");
				}
				else {
				while(temp.nextlink!=null)
				{
					temp = temp.nextlink;
				}
				while(temp!=null)
				{
					messae = messae+temp.data+" ";
					temp = temp.prelink;
				}
				tex.setText(messae);
				}
			}
		});
		disr.setForeground(new Color(153, 0, 255));
		disr.setFont(new Font("Arial Black", Font.BOLD, 14));
		disr.setBounds(379, 315, 200, 46);
		contentPane.add(disr);
		
		tex = new JTextField();
		tex.setBounds(197, 382, 265, 29);
		contentPane.add(tex);
		tex.setColumns(10);
	}
}
