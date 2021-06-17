import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;

/*
* This is a bingoServerGUI Class, it will initialize the bingoServerGUI GUI components.
* Date Started: 06/06/2021
* Date Ended: 15/06/2021
* Jonathan M.
*/

public class bingoServerGUI {

	private JFrame frame;
    private static JLabel lbl_SERVER;

	/*updateServer method
	*Method that updates server label text
	*/
    public void updateServer(String text) {
        lbl_SERVER.setText(text);
    }

	/**
	 * Create the application.
	 */
	public bingoServerGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
        frame.setVisible(true);
		frame.setTitle("Server");

		frame.getContentPane().setBackground(new Color(30, 71, 112));
		lbl_SERVER = new JLabel("SERVER : Welcome to BINGO!");
		lbl_SERVER.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_SERVER.setForeground(new Color(244, 243, 244));
		lbl_SERVER.setFont(new Font("Berlin Sans FB", Font.PLAIN, 40));
		
		frame.getContentPane().add(lbl_SERVER, BorderLayout.CENTER);
		frame.setBounds(100, 100, 548, 286);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
