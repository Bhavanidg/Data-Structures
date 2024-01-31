import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class Home extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 639, 458);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(128, 0, 0));
		contentPane.setBackground(UIManager.getColor("ToolBar.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CHOOSE A DATA SRTUCTUREE");
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 16));
		lblNewLabel.setBounds(226, 28, 208, 19);
		contentPane.add(lblNewLabel);
		
		JButton array = new JButton("ARRAY");
		array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//place Array WindoW opening code here
				//Array a = new Array();
				new Array().setVisible(true);
			}
		});
		array.setForeground(new Color(255, 69, 0));
		array.setFont(new Font("Constantia", Font.BOLD, 12));
		array.setBounds(289, 78, 85, 35);
		contentPane.add(array);
		
		JButton stack = new JButton("STACK");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Stack().setVisible(true);
			}
		});
		stack.setBackground(new Color(255, 255, 255));
		stack.setFont(new Font("Constantia", Font.BOLD, 12));
		stack.setForeground(new Color(139, 0, 0));
		stack.setBounds(305, 211, 85, 33);
		contentPane.add(stack);
		
		JButton button = new JButton("CIRCULAR QUEUE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//place Array WindoW opening code here
			}
		});
		button.setForeground(new Color(85, 107, 47));
		button.setFont(new Font("Constantia", Font.BOLD, 12));
		button.setBounds(37, 156, 143, 42);
		contentPane.add(button);
		
		JButton queue = new JButton("QUEUE");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//place Array WindoW opening code here
			}
		});
		queue.setForeground(new Color(105, 105, 105));
		queue.setBounds(518, 137, 85, 35);
		contentPane.add(queue);
		
		JButton dll = new JButton("DOUBLE LINKEDLIST");
		dll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//place Array WindoW opening code here
			}
		});
		dll.setFont(new Font("Constantia", Font.BOLD, 12));
		dll.setForeground(new Color(0, 255, 153));
		dll.setBounds(113, 310, 159, 42);
		contentPane.add(dll);
		
		JButton sll = new JButton("SINGLY LINKEDLIST");
		sll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//place Array WindoW opening code here
			}
		});
		sll.setFont(new Font("Constantia", Font.BOLD, 12));
		sll.setForeground(new Color(51, 204, 51));
		sll.setBounds(465, 310, 151, 42);
		contentPane.add(sll);
	}
}
