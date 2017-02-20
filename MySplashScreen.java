import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import jaco.mp3.player.MP3Player;

public class MySplashScreen extends JWindow {

	private JPanel contentPane;
	Icon icon=new ImageIcon(MySplashScreen.class.getResource("introscreen.gif"));
	JLabel lblGameOn = new JLabel("Game On");
	JLabel label = new JLabel("");
	JProgressBar progressBar = new JProgressBar();
	boolean isVisible=true;
	int counter=0;
	final int DELAY=100; 
	Timer timer;
	MP3Player player;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
					MySplashScreen frame = new MySplashScreen();
					frame.setVisible(true);
					frame.animation();
					frame.playsongs();
		}

	private void playsongs() {
		// TODO Auto-generated method stub
		player=new MP3Player(MySplashScreen.class.getResource("Darkhaast.mp3"));
		player.play();
	}

	private void animation() {
		// TODO Auto-generated method stub
		ActionListener action = new ActionListener() {
			
			@Override
		
			public void actionPerformed(ActionEvent e) {
				lblGameOn.setVisible(isVisible);
				isVisible=!isVisible;
				progressBar.setValue(counter);
				if(counter==100)
				{
					
					timer.stop();
					MySplashScreen.this.setVisible(false);
					LoginFrame frame=new LoginFrame();
					frame.setVisible(true);
					player.stop();
				}
				counter++;
			}
		}; 
		timer=new Timer(DELAY,action);
		timer.start();
	}

	/**
	 * Create the frame.
	 */
	public MySplashScreen() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(50, 50, 100, 100));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		label.setIcon(icon);
		label.setBounds(0, 0, 450, 241);
		contentPane.add(label);
		
	
		lblGameOn.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblGameOn.setBounds(151, 254, 114, 18);
		contentPane.add(lblGameOn);
		

		progressBar.setFont(new Font("Tahoma", Font.BOLD, 17));
		progressBar.setStringPainted(true);
		progressBar.setBounds(0, 282, 450, 18);
		contentPane.add(progressBar);
	}
}
