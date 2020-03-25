package visuals;

import java.awt.Dialog.ModalityType;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class LoginWindow {

	private JFrame frame;
	private JTextField txtNameInput;
	private JTextField txtNamePrompt;
	private JButton btnLogin;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginWindow window = new LoginWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setAlwaysOnTop(true);
		frame.setBounds(100, 100, 200, 122);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.getContentPane().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setControls();
			}
		});
		
		txtNameInput = new JTextField();
		txtNameInput.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		txtNameInput.setBounds(74, 11, 100, 20);
		txtNameInput.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) 
			{
				setControls();
			}
		});
		frame.getContentPane().add(txtNameInput);
		txtNameInput.setColumns(10);
		
		txtNamePrompt = new JTextField();
		txtNamePrompt.setText("Name:");
		txtNamePrompt.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		txtNamePrompt.setEditable(false);
		txtNamePrompt.setBounds(10, 11, 54, 20);
		frame.getContentPane().add(txtNamePrompt);
		txtNamePrompt.setColumns(10);
		
		btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnLogin.setBounds(74, 45, 100, 23);
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnLogin_mouseClicked(e);
			}
		});
		frame.getContentPane().add(btnLogin);
		setControls();
	}
	
	private void setControls() {
		if (txtNameInput.getText().equals("")){
			btnLogin.setEnabled(false);
		}
		else {
			btnLogin.setEnabled(true);
		}
	}
	
	private void btnLogin_mouseClicked(MouseEvent e) {
		openNewWindow();
	}
	
	private void openNewWindow() {
		Window windowMenu = new Window();
		windowMenu.setUserName(txtNameInput.getText());
		windowMenu.setVisible(true);
		frame.dispose();
	}
}
