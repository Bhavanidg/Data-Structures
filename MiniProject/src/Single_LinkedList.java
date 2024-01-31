import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Single_LinkedList extends JFrame {
	class Node
	{
		int data;
		Node link;
	}

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField elef;
	private JTextField eler;
	private JTextField display;
	private Node first = null;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Single_LinkedList frame = new Single_LinkedList();
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
	public Single_LinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 764, 431);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSinglyLinkedlist = new JLabel("SINGLY  LINKEDLIST");
		lblSinglyLinkedlist.setForeground(new Color(153, 50, 204));
		lblSinglyLinkedlist.setFont(new Font("Algerian", Font.BOLD, 16));
		lblSinglyLinkedlist.setBounds(261, 28, 156, 22);
		contentPane.add(lblSinglyLinkedlist);
		
		JLabel lblNewLabel_3 = new JLabel("ENTER THE ELEMENT : ");
		lblNewLabel_3.setForeground(new Color(128, 0, 0));
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_3.setBounds(45, 85, 195, 21);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("ENTER THE ELEMENT : ");
		lblNewLabel_3_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_3_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_3_1.setBounds(45, 127, 195, 21);
		contentPane.add(lblNewLabel_3_1);
		
		elef = new JTextField();
		elef.setColumns(10);
		elef.setBounds(271, 88, 96, 25);
		contentPane.add(elef);
		
		eler = new JTextField();
		eler.setColumns(10);
		eler.setBounds(271, 130, 96, 25);
		contentPane.add(eler);
		
		JButton insertfront = new JButton("INSERT FRONT");
		insertfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node Temp = first;
				Node newnode = new Node();
				int dataa = Integer.valueOf(elef.getText());
				newnode.data = dataa;
				if(first==null)
				{
					first= newnode;
					
				}
				else
				{
					newnode.link=first;
					first = newnode;
					
				}
				JOptionPane.showMessageDialog(contentPane, "Element inserted :"+dataa);
				elef.setText("");
				
			}
		});
		insertfront.setForeground(Color.MAGENTA);
		insertfront.setFont(new Font("Tahoma", Font.BOLD, 14));
		insertfront.setBounds(454, 77, 153, 37);
		contentPane.add(insertfront);
		
		JButton insertrear = new JButton("INSERT REAR");
		insertrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node Temp = first;
				int dataa = Integer.valueOf(eler.getText());
				Node newnode = new Node();
				newnode.data = dataa;
				if(first == null)
				{
					first = newnode;
				}
				else if(first.link==null)
				{
					
					
					first.link = newnode;
					
				}
				else
				{
					while(Temp.link!=null)
					{
						Temp=Temp.link;
					}
					Temp.link = newnode;
				}
				JOptionPane.showMessageDialog(contentPane, "Element inserted :"+dataa);
				eler.setText("");
			}
		});
		insertrear.setForeground(Color.MAGENTA);
		insertrear.setFont(new Font("Tahoma", Font.BOLD, 14));
		insertrear.setBounds(454, 135, 153, 37);
		contentPane.add(insertrear);
		
		JButton deletefront = new JButton("DELETE FRONT");
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Noting to delete");
				}
				else
				{
					String message = "Element deleted :"+ first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					first = first.link;
				}
				eler.setText("");
			}
		});
		deletefront.setForeground(new Color(153, 0, 255));
		deletefront.setFont(new Font("Arial Black", Font.BOLD, 14));
		deletefront.setBounds(261, 188, 159, 39);
		contentPane.add(deletefront);
		
		JButton deleterear = new JButton("DELETE REAR");
		deleterear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node  Temp=first; 
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "nothing to delete");
				}
				else if(first.link==null)
				{
					
					JOptionPane.showMessageDialog(contentPane, "element deleted :"+ first.data);
					first = null;
				}
				else
				{
					while(Temp.link.link!=null)
					{
						Temp=Temp.link;
					}
					String message = "Element deleted" +Temp.link.data;
					JOptionPane.showMessageDialog(contentPane, message);
					Temp.link = null;
				}
			}
		});
		deleterear.setForeground(new Color(153, 0, 255));
		deleterear.setFont(new Font("Arial Black", Font.BOLD, 14));
		deleterear.setBounds(261, 237, 157, 39);
		contentPane.add(deleterear);
		
	
		display = new JTextField();
		display.setBounds(177, 347, 364, 37);
		contentPane.add(display);
		display.setColumns(10);
		
		JButton showcase = new JButton("Display");
		showcase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String m = "";
				Node Temp = first;
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Nothing to display");
				}
				else {
				while(Temp!=null)
				{
					m = m+Temp.data+" ";
					Temp=Temp.link;
				}}
				display.setText(m);
				
			}
		});
		showcase.setForeground(new Color(153, 0, 255));
		showcase.setFont(new Font("Arial Black", Font.BOLD, 14));
		showcase.setBounds(260, 286, 157, 39);
		contentPane.add(showcase);
	}
}
