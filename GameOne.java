import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GameOne extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	static final int BOARD_WIDTH=1500;
	static final int BOARD_HEIGHT=1500;
	
	public static void main(String[] args) {
		
					GameOne frame = new GameOne();
					frame.setVisible(true);
				
	}

	private void askForClose(){
		int choice = JOptionPane.showConfirmDialog(this,"Do you really want to close","My Gaming",JOptionPane.YES_NO_OPTION);
		if(choice==JOptionPane.YES_OPTION){
			this.setVisible(false);
			this.dispose();
		}
		else
		{
			return;
		}
	}
	/**
	 * Create the frame.
	 */
	public GameOne() {
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e)
			{
				askForClose();
			}
				
		});
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setTitle("Sky War - 2017");
		this.setSize(BOARD_WIDTH,BOARD_HEIGHT);
		this.setLocationRelativeTo(null);
		//setBounds(100, 100, 450, 300);
		this.getContentPane().setLayout(null);
		Board board=new Board();
		this.getContentPane().add(board);
	}
		
		
	}

