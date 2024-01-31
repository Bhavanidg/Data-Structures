import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CircularQueue extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField length;
	private JTextField ele;
	private JTextField tex;
	private int a[];
	private int n;
	private int r = -1;
	private int f = 0;
	private int count = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQueue frame = new CircularQueue();
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
	public CircularQueue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 675, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CIRCULAR_QUEUE DATASTRUCTURE");
		lblNewLabel.setBounds(203, 22, 280, 22);
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 16));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter the length of the Circular_Queue");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1.setBounds(123, 73, 266, 18);
		contentPane.add(lblNewLabel_1);
		
		length = new JTextField();
		length.setForeground(Color.BLACK);
		length.setColumns(10);
		length.setBackground(new Color(255, 240, 245));
		length.setBounds(423, 63, 96, 36);
		contentPane.add(length);
		
		JButton create = new JButton("CREATE QUEUE");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n = Integer.valueOf(length.getText());
				a = new int[n];
				JOptionPane.showMessageDialog(contentPane,"Circular Queue Created");
			}
		});
		create.setForeground(new Color(128, 0, 128));
		create.setFont(new Font("Constantia", Font.BOLD, 14));
		create.setBounds(276, 113, 143, 36);
		contentPane.add(create);
		
		JLabel lblNewLabel_2 = new JLabel("Enter Element  : ");
		lblNewLabel_2.setForeground(new Color(139, 69, 19));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_2.setBounds(110, 162, 114, 18);
		contentPane.add(lblNewLabel_2);
		
		ele = new JTextField();
		ele.setForeground(Color.DARK_GRAY);
		ele.setColumns(10);
		ele.setBounds(254, 159, 127, 32);
		contentPane.add(ele);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count==n)
				{
					JOptionPane.showMessageDialog(contentPane, "Insertion not possible");
				}
				else
				{
					int element = Integer.valueOf(ele.getText());
					r=(r+1)%n;
					count=count+1;
					a[r]=element;
					JOptionPane.showMessageDialog(contentPane, "Inserted element : "+a[r]);
					ele.setText("");
				}
			}
		});
		insert.setVerticalAlignment(SwingConstants.BOTTOM);
		insert.setForeground(new Color(65, 105, 225));
		insert.setFont(new Font("Constantia", Font.BOLD, 14));
		insert.setBounds(407, 159, 85, 32);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count==0)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion Not Possible");
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "Deleted element: "+a[f]);
					count=count-1;
					f=(f+1)%n;
				}
			}
		});
		delete.setForeground(new Color(139, 0, 139));
		delete.setFont(new Font("Constantia", Font.BOLD, 14));
		delete.setBounds(268, 211, 87, 36);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = " ";
				if(count==0)
				{
					JOptionPane.showMessageDialog(contentPane, "Circular Queue is Empty");
					tex.setText("");
				}
				else
				{
					int i=f;
					String message = "";
					int num = count;
					while(num!=0)
					{
						message=message+a[i]+" ";
						i=(i+1)%n;
						num--;
					}
					tex.setText(message);
}	
				
				//JOptionPane.showMessageDialog(contentPane, str);
			}
		});
		display.setForeground(new Color(255, 20, 147));
		display.setFont(new Font("Constantia", Font.BOLD, 14));
		display.setBounds(268, 257, 93, 36);
		contentPane.add(display);
		
		tex = new JTextField();
		tex.setForeground(Color.BLACK);
		tex.setColumns(10);
		tex.setBounds(193, 317, 270, 19);
		contentPane.add(tex);
	}
}
