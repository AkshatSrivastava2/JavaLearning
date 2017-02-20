import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Welcome extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome frame = new Welcome();
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
	public Welcome() {
		//this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(328, 127, 102, 25);
		contentPane.add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 137, 26);
		contentPane.add(menuBar);
		
		JMenu mnFile = new JMenu("File");
		mnFile.setFont(new Font("Segoe UI", Font.BOLD, 18));
		menuBar.add(mnFile);
		
		JMenuItem mntmGameOne = new JMenuItem("Game One");
		mntmGameOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				startGameOne();
			}

			private void startGameOne() {
				// TODO Auto-generated method stub
				GameOne gameOne=new GameOne();
				gameOne.setVisible(true);
			}
		});
		mntmGameOne.setBounds(0, 26, 137, 24);
		contentPane.add(mntmGameOne);
		
		JMenuItem mntmGameTwo = new JMenuItem("Game Two");
		mntmGameTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			startGameTwo();
			}

			private void startGameTwo() {
				// TODO Auto-generated method stub
				
			}
		});
		mntmGameTwo.setBounds(0, 47, 151, 24);
		contentPane.add(mntmGameTwo);
	}
}
