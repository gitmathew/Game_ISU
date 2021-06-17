import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Button;

/*
* This is a serverAdminPanel Class, it will initialize the Sever GUI components.
* Date Started: 06/06/2021
* Date Ended: 15/06/2021
* Jonathan M.
*/

public class serverAdminPanel {

	public JFrame frameBingoPanel;
    public Button btn_NEXT;
    public Button btn_END;

	/**
	 * Create the application.
	 */
	public serverAdminPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameBingoPanel = new JFrame();
        frameBingoPanel.setVisible(true);
		frameBingoPanel.setTitle("BINGO_PANEL");
		frameBingoPanel.getContentPane().setBackground(new Color(30, 71, 112));
		frameBingoPanel.getContentPane().setLayout(null);
		
		btn_NEXT = new Button("Next Number");
		btn_NEXT.setForeground(new Color(244, 243, 244));
		btn_NEXT.setBackground(new Color(30, 71, 112));
		btn_NEXT.setFont(new Font("Berlin Sans FB", Font.PLAIN, 30));
		btn_NEXT.setBounds(71, 121, 181, 54);
		frameBingoPanel.getContentPane().add(btn_NEXT);
		
		JLabel lbl_B = new JLabel("Bingo Panel");
		lbl_B.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_B.setForeground(new Color(244, 243, 244));
		lbl_B.setFont(new Font("Berlin Sans FB", Font.PLAIN, 40));
		lbl_B.setBounds(10, 22, 512, 54);
		frameBingoPanel.getContentPane().add(lbl_B);
		
		btn_END = new Button("End Game");
		btn_END.setForeground(new Color(244, 243, 244));
		btn_END.setFont(new Font("Berlin Sans FB", Font.PLAIN, 30));
		btn_END.setBackground(new Color(30, 71, 112));
		btn_END.setBounds(258, 121, 181, 54);
		frameBingoPanel.getContentPane().add(btn_END);
		frameBingoPanel.setBounds(1200, 200, 548, 286);
		frameBingoPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
