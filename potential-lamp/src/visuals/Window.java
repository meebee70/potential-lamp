package visuals;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;

import greeting_package.GreetingMemberClass;

public class Window extends JFrame {

	private String userName;
	
	private JPanel contentPane;
	public JButton create;
	public JLabel output;
	public Random r = new Random();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window frame = new Window();
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
	public Window() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		output = new JLabel("Output");
		output.setHorizontalAlignment(SwingConstants.CENTER);
		output.setLocation(0, 0);
		output.setSize(450,50);
		contentPane.add(output);
		
		create = new JButton("Create greeting");
		create.setLocation(5, 150);
		create.setSize(424,106);
		create.addActionListener(new Listener());
		contentPane.add(create);
		}
	
	public class Listener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			output.setText(GreetingMemberClass.generateGreeting(userName));
		}
	}
	
	public void setUserName(String name) {
		System.out.println(name);
		userName = name;
	}
}
