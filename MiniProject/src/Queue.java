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

public class Queue extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField length;
	private JTextField ele;
	private JTextField text;
	private int a[];
	private int n;
	private int r = -1;
	private int f = 0;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 656, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("QUEUE DATASTRUCTURE");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 16));
		lblNewLabel.setBounds(196, 22, 192, 22);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Enter the length of the Queue");
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setBounds(101, 95, 203, 18);
		contentPane.add(lblNewLabel_1);

		length = new JTextField();
		length.setBackground(new Color(255, 240, 245));
		length.setForeground(Color.BLACK);
		length.setBounds(331, 81, 96, 36);
		contentPane.add(length);
		length.setColumns(10);

		JButton createQueue = new JButton("CREATE QUEUE");
		createQueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n = Integer.valueOf(length.getText());
				a = new int[n];
				String message = "Queue of size " + n + " created";
				JOptionPane.showMessageDialog(contentPane, message);

			}
		});
		createQueue.setFont(new Font("Constantia", Font.BOLD, 14));
		createQueue.setForeground(new Color(128, 0, 128));
		createQueue.setBounds(226, 133, 143, 36);
		contentPane.add(createQueue);

		JLabel lblNewLabel_2 = new JLabel("Enter Element  : ");
		lblNewLabel_2.setForeground(new Color(139, 69, 19));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_2.setBounds(101, 194, 114, 18);
		contentPane.add(lblNewLabel_2);

		ele = new JTextField();
		ele.setBackground(Color.WHITE);
		ele.setForeground(Color.DARK_GRAY);
		ele.setBounds(242, 189, 127, 32);
		contentPane.add(ele);
		ele.setColumns(10);

		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int element;
				if (r == n - 1 ) {
					String message = "Insertion not possible";
					JOptionPane.showMessageDialog(contentPane, message);
				}
				else {
					element = Integer.valueOf(ele.getText());
					++r;
					a[r] = element;
					String message = "Element" + " " + element + " inserted";
					JOptionPane.showMessageDialog(contentPane, message);
					ele.setText("");
				}

			}
		});
		insert.setVerticalAlignment(SwingConstants.BOTTOM);
		insert.setForeground(new Color(65, 105, 225));
		insert.setFont(new Font("Constantia", Font.BOLD, 14));
		insert.setBounds(405, 189, 85, 27);
		contentPane.add(insert);

		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(r==-1 || f>r)
				{
					String message = "Delete not possible";
					JOptionPane.showMessageDialog(contentPane, message);
				}
				else
				{
					String message = "Element deleted is "+ a[f];
					JOptionPane.showMessageDialog(contentPane, message);
					++f;
				}
			}
		});
		delete.setFont(new Font("Constantia", Font.BOLD, 14));
		delete.setForeground(new Color(139, 0, 139));
		delete.setBounds(263, 242, 87, 27);
		contentPane.add(delete);

		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = "";
				for(int i=f;i<=r;i++)
				{
					s = s+a[i]+" ";
				}
				text.setText(s);
			}
		});
		display.setForeground(new Color(255, 20, 147));
		display.setFont(new Font("Constantia", Font.BOLD, 14));
		display.setBounds(263, 290, 93, 27);
		contentPane.add(display);

		text = new JTextField();
		text.setBackground(new Color(255, 255, 255));
		text.setForeground(Color.BLACK);
		text.setBounds(196, 348, 270, 19);
		contentPane.add(text);
		text.setColumns(10);
	}
}
