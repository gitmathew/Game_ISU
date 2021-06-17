import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

/*
* This is a bingoWinGUI Class, it will initialize the bingo Win GUI components.
* Date Started: 06/06/2021
* Date Ended: 15/06/2021
* Jonathan M.
*/

public class bingoWinGUI {

	private JFrame frame;

	/*closeFrame method
	*Method that destroys frame instances
	*/
    public void closeFrame() {
        frame.setVisible(false); //Sets JFrame invisible
    	frame.dispose(); //Destroy the JFrame object
    }
	
	/**
	 * Create the application.
	 */
	public bingoWinGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
        frame.setVisible(true);
		frame.getContentPane().setBackground(new Color(30, 71, 112));
		frame.getContentPane().setLayout(null);
		
		JLabel lbl_1 = new JLabel("");
		lbl_1.setIcon(new ImageIcon(bingoWinGUI.class.getResource("img.gif")));
		lbl_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_1.setForeground(new Color(244, 243, 244));
		lbl_1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 40));
		lbl_1.setBounds(0, 69, 498, 329);
		frame.getContentPane().add(lbl_1);
		
		JLabel lbl_2 = new JLabel("BINGOOOO!!!");
		lbl_2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_2.setForeground(new Color(244, 243, 244));
		lbl_2.setFont(new Font("Berlin Sans FB", Font.PLAIN, 40));
		lbl_2.setBounds(10, 0, 462, 72);
		frame.getContentPane().add(lbl_2);
		frame.setBounds(1200, 200, 500, 440);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
