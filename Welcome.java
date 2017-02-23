import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
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
					Welcome frame = new Welcome();
					frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public Welcome() {
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		//Object userid;
		//this.userid = userid;  // Local Userid is set to this.userid (Instance Variable)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel msg = new JLabel("Welcome");
		msg.setForeground(Color.RED);
		msg.setHorizontalAlignment(SwingConstants.CENTER);
		msg.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		msg.setBounds(56, 69, 153, 43);
		contentPane.add(msg);
		
		JMenuBar menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);  // add menubar in frame
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile); // add menu in menubar
		
		JMenuItem mntmGame = new JMenuItem("Game 1");
		mntmGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				startGameOne();
			}

			private void startGameOne(){
				Welcome.this.setVisible(false);
				GameOne gameone=new GameOne();
				gameone.setVisible(true);
			}
		});
		mnFile.add(mntmGame); // add menuitem in menu
		
		JMenuItem mntmGame_1 = new JMenuItem("Game 2");
		mntmGame_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnFile.add(mntmGame_1);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar.add(menuBar_1);
		//menuBar.setBounds(90, 146, 132, 22);
		//contentPane.add(menuBar);

	}
}