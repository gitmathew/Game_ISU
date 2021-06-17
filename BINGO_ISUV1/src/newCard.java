
import javax.swing.JFrame;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.Color;

/*
* This is a newCard Class, it will initialize a new GUI card and will update with Client data.
* Date Started: 06/06/2021
* Date Ended: 15/06/2021
* Jonathan M.
*/

public class newCard {

	private JFrame frame;
	private static JLabel lbl_1;
	private static JLabel lbl_2;
	private static JLabel lbl_3;
	private static JLabel lbl_4;
	private static JLabel lbl_5;
	private static JLabel lbl_6;
	private static JLabel lbl_7;
	private static JLabel lbl_8;
	private static JLabel lbl_9;
	private static JLabel lbl_10;
	private static JLabel lbl_11;
	private static JLabel lbl_12;
	private static JLabel lbl_13;
	private static JLabel lbl_14;
	private static JLabel lbl_15;
	private static JLabel lbl_16;
	private static JLabel lbl_17;
	private static JLabel lbl_18;
	private static JLabel lbl_19;
	private static JLabel lbl_20;
	private static JLabel lbl_21;
	private static JLabel lbl_22;
	private static JLabel lbl_23;
	private static JLabel lbl_24;
	private static JLabel lbl_25;

	
	/*closeFrame method
	*Method that destroys frame instances
	*/
	public void closeFrame() {
        frame.setVisible(false); //Sets JFrame invisible
    	frame.dispose(); //Destroy the JFrame object
    }

	/*checkBool method
	*Method that updates labels with bool data
	*Parameter: [1|boolean] val [2|JLabel] lbl
	*returns void
	*/
	public static void checkBool (boolean val, JLabel lbl) {
		if (val == true) {
			lbl.setFont(new Font("Berlin Sans FB", Font.BOLD, 40));
			lbl.setForeground(new Color(44,122,182));
		} else {
			lbl.setFont(new Font("Berlin Sans FB", Font.PLAIN, 40));
			lbl.setForeground(new Color(244, 243, 244));
		}
	}

	/*changeWin method
	*Method that updates gui label colour if user wins
	*Parameter: [1|JLabel] lbl
	*returns void
	*/
	public static void changeWin (JLabel lbl) {
			lbl.setForeground(new Color(240,46,58));
	}

	/*checkVal method
	*Method that updates gui label to according value
	*Parameter: (1|int[]) val [2|JLabel] lbl
	*returns void
	*/
	public static void checkVal (int val, JLabel lbl) {
		lbl.setText("" + val + "");
	}


	/*updateWin method
	*Method that updates gui labels if user wins
	*Parameter: [1|int[]] correct_Data
	*returns void
	*/
	public static void updateWin (int[] correct_Data) {
		for (int i = 0; i < correct_Data.length; i++) {
			int val = correct_Data[i];
			if (val == 1) {
				changeWin(lbl_1);
			} else if (val == 2) {
				changeWin(lbl_2);
			} else if (val == 3) {
				changeWin(lbl_3);
			} else if (val == 4) {
				changeWin(lbl_4);
			} else if (val == 5) {
				changeWin(lbl_5);
			} else if (val == 6) {
				changeWin(lbl_6);
			} else if (val == 7) {
				changeWin(lbl_7);
			} else if (val == 8) {
				changeWin(lbl_8);
			} else if (val == 9) {
				changeWin(lbl_9);
			} else if (val == 10) {
				changeWin(lbl_10);
			} else if (val == 11) {
				changeWin(lbl_11);
			} else if (val == 12) {
				changeWin(lbl_12);
			} else if (val == 13) {
				changeWin(lbl_13); //FREE SPACE
			} else if (val == 14) {
				changeWin(lbl_14);
			} else if (val == 15) {
				changeWin(lbl_15);
			} else if (val == 16) {
				changeWin(lbl_16);
			} else if (val == 17) {
				changeWin(lbl_17);
			} else if (val == 18) {
				changeWin(lbl_18);
			} else if (val == 19) {
				changeWin(lbl_19);
			} else if (val == 20) {
				changeWin(lbl_20);
			} else if (val == 21) {
				changeWin(lbl_21);
			} else if (val == 22) {
				changeWin(lbl_22);
			} else if (val == 23) {
				changeWin(lbl_23);
			} else if (val == 24) {
				changeWin(lbl_24);
			} else if (val == 25) {
				changeWin(lbl_25);
			}
		}
	}

	/*updateNumbers method
	*Method that updates gui number lables to game card data
	*Parameter: [1|Map<Integer, Integer>] game_Card
	*returns void
	*/
	public static void updateNumbers (Map<Integer, Integer> game_Card) {
		for (Map.Entry<Integer,Integer> entry : game_Card.entrySet()) {
			int index = entry.getKey();
			int val = entry.getValue();
			if (index == 1) {
				checkVal(val, lbl_1);
			} else if (index == 2) {
				checkVal(val, lbl_2);
			} else if (index == 3) {
				checkVal(val, lbl_3);
			} else if (index == 4) {
				checkVal(val, lbl_4);
			} else if (index == 5) {
				checkVal(val, lbl_5);
			} else if (index == 6) {
				checkVal(val, lbl_6);
			} else if (index == 7) {
				checkVal(val, lbl_7);
			} else if (index == 8) {
				checkVal(val, lbl_8);
			} else if (index == 9) {
				checkVal(val, lbl_9);
			} else if (index == 10) {
				checkVal(val, lbl_10);
			} else if (index == 11) {
				checkVal(val, lbl_11);
			} else if (index == 12) {
				checkVal(val, lbl_12);
			} else if (index == 13) {
				//checkVal(val, lbl_13); FREE SPACE
			} else if (index == 14) {
				checkVal(val, lbl_14);
			} else if (index == 15) {
				checkVal(val, lbl_15);
			} else if (index == 16) {
				checkVal(val, lbl_16);
			} else if (index == 17) {
				checkVal(val, lbl_17);
			} else if (index == 18) {
				checkVal(val, lbl_18);
			} else if (index == 19) {
				checkVal(val, lbl_19);
			} else if (index == 20) {
				checkVal(val, lbl_20);
			} else if (index == 21) {
				checkVal(val, lbl_21);
			} else if (index == 22) {
				checkVal(val, lbl_22);
			} else if (index == 23) {
				checkVal(val, lbl_23);
			} else if (index == 24) {
				checkVal(val, lbl_24);
			} else if (index == 25) {
				checkVal(val, lbl_25);
			}
		}
	}

	/*updateGUI method
	*Method that updates gui to game data
	*Parameter: [1|Map<Integer, Boolean> game_Data] game_Data
	*returns void
	*/
	public static void updateGUI (Map<Integer, Boolean> game_Data) {
		for (Map.Entry<Integer,Boolean> entry : game_Data.entrySet()) {
			//System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
			int index = entry.getKey();
			boolean val = entry.getValue();
			if (index == 1) {
				checkBool(val, lbl_1);
			} else if (index == 2) {
				checkBool(val, lbl_2);
			} else if (index == 3) {
				checkBool(val, lbl_3);
			} else if (index == 4) {
				checkBool(val, lbl_4);
			} else if (index == 5) {
				checkBool(val, lbl_5);
			} else if (index == 6) {
				checkBool(val, lbl_6);
			} else if (index == 7) {
				checkBool(val, lbl_7);
			} else if (index == 8) {
				checkBool(val, lbl_8);
			} else if (index == 9) {
				checkBool(val, lbl_9);
			} else if (index == 10) {
				checkBool(val, lbl_10);
			} else if (index == 11) {
				checkBool(val, lbl_11);
			} else if (index == 12) {
				checkBool(val, lbl_12);
			} else if (index == 13) {
				checkBool(val, lbl_13); //FREE SPACE
			} else if (index == 14) {
				checkBool(val, lbl_14);
			} else if (index == 15) {
				checkBool(val, lbl_15);
			} else if (index == 16) {
				checkBool(val, lbl_16);
			} else if (index == 17) {
				checkBool(val, lbl_17);
			} else if (index == 18) {
				checkBool(val, lbl_18);
			} else if (index == 19) {
				checkBool(val, lbl_19);
			} else if (index == 20) {
				checkBool(val, lbl_20);
			} else if (index == 21) {
				checkBool(val, lbl_21);
			} else if (index == 22) {
				checkBool(val, lbl_22);
			} else if (index == 23) {
				checkBool(val, lbl_23);
			} else if (index == 24) {
				checkBool(val, lbl_24);
			} else if (index == 25) {
				checkBool(val, lbl_25);
			}
		}
	}

	/**
	 * Create the application.
	 */
	public newCard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setTitle("Bingo Card");
		frame.getContentPane().setBackground(new Color(30, 71, 112));
		frame.getContentPane().setForeground(new Color(255, 255, 255));
		frame.setBounds(500, 200, 600, 580);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbl_W = new JLabel("Welcome to Bingo!\r\n");
		lbl_W.setForeground(new Color(132,188,237));
		lbl_W.setFont(new Font("Berlin Sans FB", Font.PLAIN, 40));
		lbl_W.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_W.setBounds(0, 11, 584, 54);
		frame.getContentPane().add(lbl_W);
		
		JLabel lbl_B = new JLabel("B");
		lbl_B.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_B.setForeground(new Color(26,34,91));
		lbl_B.setFont(new Font("Berlin Sans FB", Font.PLAIN, 40));
		lbl_B.setBounds(22, 77, 100, 54);
		frame.getContentPane().add(lbl_B);
		
		JLabel lbl_I = new JLabel("I");
		lbl_I.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_I.setForeground(new Color(26,34,91));
		lbl_I.setFont(new Font("Berlin Sans FB", Font.PLAIN, 40));
		lbl_I.setBounds(132, 77, 100, 54);
		frame.getContentPane().add(lbl_I);
		
		JLabel lbl_N = new JLabel("N");
		lbl_N.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_N.setForeground(new Color(26,34,91));
		lbl_N.setFont(new Font("Berlin Sans FB", Font.PLAIN, 40));
		lbl_N.setBounds(242, 77, 100, 54);
		frame.getContentPane().add(lbl_N);
		
		JLabel lblG = new JLabel("G");
		lblG.setHorizontalAlignment(SwingConstants.CENTER);
		lblG.setForeground(new Color(26,34,91));
		lblG.setFont(new Font("Berlin Sans FB", Font.PLAIN, 40));
		lblG.setBounds(352, 77, 100, 54);
		frame.getContentPane().add(lblG);
		
		JLabel lbl_O = new JLabel("O");
		lbl_O.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_O.setForeground(new Color(26,34,91));
		lbl_O.setFont(new Font("Berlin Sans FB", Font.PLAIN, 40));
		lbl_O.setBounds(462, 77, 100, 54);
		frame.getContentPane().add(lbl_O);
		
		lbl_1 = new JLabel("1");
		lbl_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_1.setForeground(new Color(244, 243, 244));
		lbl_1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 40));
		lbl_1.setBounds(22, 142, 100, 54);
		frame.getContentPane().add(lbl_1);
		
		lbl_6 = new JLabel("6");
		lbl_6.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_6.setForeground(new Color(244, 243, 244));
		lbl_6.setFont(new Font("Berlin Sans FB", Font.PLAIN, 40));
		lbl_6.setBounds(132, 142, 100, 54);
		frame.getContentPane().add(lbl_6);
		
		lbl_11 = new JLabel("11");
		lbl_11.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_11.setForeground(new Color(244, 243, 244));
		lbl_11.setFont(new Font("Berlin Sans FB", Font.PLAIN, 40));
		lbl_11.setBounds(242, 142, 100, 54);
		frame.getContentPane().add(lbl_11);
		
		lbl_16 = new JLabel("16");
		lbl_16.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_16.setForeground(new Color(244, 243, 244));
		lbl_16.setFont(new Font("Berlin Sans FB", Font.PLAIN, 40));
		lbl_16.setBounds(352, 142, 100, 54);
		frame.getContentPane().add(lbl_16);
		
		lbl_21 = new JLabel("21");
		lbl_21.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_21.setForeground(new Color(244, 243, 244));
		lbl_21.setFont(new Font("Berlin Sans FB", Font.PLAIN, 40));
		lbl_21.setBounds(462, 142, 100, 54);
		frame.getContentPane().add(lbl_21);
		
		lbl_2 = new JLabel("2");
		lbl_2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_2.setForeground(new Color(244, 243, 244));
		lbl_2.setFont(new Font("Berlin Sans FB", Font.PLAIN, 40));
		lbl_2.setBounds(22, 207, 100, 54);
		frame.getContentPane().add(lbl_2);
		
		lbl_7 = new JLabel("7");
		lbl_7.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_7.setForeground(new Color(244, 243, 244));
		lbl_7.setFont(new Font("Berlin Sans FB", Font.PLAIN, 40));
		lbl_7.setBounds(132, 207, 100, 54);
		frame.getContentPane().add(lbl_7);
		
		lbl_12 = new JLabel("12");
		lbl_12.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_12.setForeground(new Color(244, 243, 244));
		lbl_12.setFont(new Font("Berlin Sans FB", Font.PLAIN, 40));
		lbl_12.setBounds(242, 207, 100, 54);
		frame.getContentPane().add(lbl_12);
		
		lbl_17 = new JLabel("17");
		lbl_17.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_17.setForeground(new Color(244, 243, 244));
		lbl_17.setFont(new Font("Berlin Sans FB", Font.PLAIN, 40));
		lbl_17.setBounds(352, 207, 100, 54);
		frame.getContentPane().add(lbl_17);
		
		lbl_22 = new JLabel("22");
		lbl_22.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_22.setForeground(new Color(244, 243, 244));
		lbl_22.setFont(new Font("Berlin Sans FB", Font.PLAIN, 40));
		lbl_22.setBounds(462, 207, 100, 54);
		frame.getContentPane().add(lbl_22);
		
		lbl_3 = new JLabel("3");
		lbl_3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_3.setForeground(new Color(244, 243, 244));
		lbl_3.setFont(new Font("Berlin Sans FB", Font.PLAIN, 40));
		lbl_3.setBounds(22, 272, 100, 54);
		frame.getContentPane().add(lbl_3);
		
		lbl_8 = new JLabel("8");
		lbl_8.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_8.setForeground(new Color(244, 243, 244));
		lbl_8.setFont(new Font("Berlin Sans FB", Font.PLAIN, 40));
		lbl_8.setBounds(132, 272, 100, 54);
		frame.getContentPane().add(lbl_8);
		
		lbl_13 = new JLabel("FREE");
		lbl_13.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_13.setForeground(new Color(244, 243, 244));
		lbl_13.setFont(new Font("Berlin Sans FB", Font.PLAIN, 40));
		lbl_13.setBounds(242, 272, 100, 54);
		frame.getContentPane().add(lbl_13);
		
		lbl_18 = new JLabel("18");
		lbl_18.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_18.setForeground(new Color(244, 243, 244));
		lbl_18.setFont(new Font("Berlin Sans FB", Font.PLAIN, 40));
		lbl_18.setBounds(352, 272, 100, 54);
		frame.getContentPane().add(lbl_18);
		
		lbl_23 = new JLabel("23");
		lbl_23.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_23.setForeground(new Color(244, 243, 244));
		lbl_23.setFont(new Font("Berlin Sans FB", Font.PLAIN, 40));
		lbl_23.setBounds(462, 272, 100, 54);
		frame.getContentPane().add(lbl_23);
		
		lbl_4 = new JLabel("4");
		lbl_4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_4.setForeground(new Color(244, 243, 244));
		lbl_4.setFont(new Font("Berlin Sans FB", Font.PLAIN, 40));
		lbl_4.setBounds(22, 337, 100, 54);
		frame.getContentPane().add(lbl_4);
		
		lbl_9 = new JLabel("9");
		lbl_9.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_9.setForeground(new Color(244, 243, 244));
		lbl_9.setFont(new Font("Berlin Sans FB", Font.PLAIN, 40));
		lbl_9.setBounds(132, 337, 100, 54);
		frame.getContentPane().add(lbl_9);
		
		lbl_14 = new JLabel("14");
		lbl_14.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_14.setForeground(new Color(244, 243, 244));
		lbl_14.setFont(new Font("Berlin Sans FB", Font.PLAIN, 40));
		lbl_14.setBounds(242, 337, 100, 54);
		frame.getContentPane().add(lbl_14);
		
		lbl_19 = new JLabel("19");
		lbl_19.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_19.setForeground(new Color(244, 243, 244));
		lbl_19.setFont(new Font("Berlin Sans FB", Font.PLAIN, 40));
		lbl_19.setBounds(352, 337, 100, 54);
		frame.getContentPane().add(lbl_19);
		
		lbl_24 = new JLabel("24");
		lbl_24.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_24.setForeground(new Color(244, 243, 244));
		lbl_24.setFont(new Font("Berlin Sans FB", Font.PLAIN, 40));
		lbl_24.setBounds(462, 337, 100, 54);
		frame.getContentPane().add(lbl_24);
		
		lbl_5 = new JLabel("5");
		lbl_5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_5.setForeground(new Color(244, 243, 244));
		lbl_5.setFont(new Font("Berlin Sans FB", Font.PLAIN, 40));
		lbl_5.setBounds(22, 402, 100, 54);
		frame.getContentPane().add(lbl_5);
		
		lbl_10 = new JLabel("10");
		lbl_10.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_10.setForeground(new Color(244, 243, 244));
		lbl_10.setFont(new Font("Berlin Sans FB", Font.PLAIN, 40));
		lbl_10.setBounds(132, 402, 100, 54);
		frame.getContentPane().add(lbl_10);
		
		lbl_15 = new JLabel("15");
		lbl_15.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_15.setForeground(new Color(244, 243, 244));
		lbl_15.setFont(new Font("Berlin Sans FB", Font.PLAIN, 40));
		lbl_15.setBounds(242, 402, 100, 54);
		frame.getContentPane().add(lbl_15);
		
		lbl_20 = new JLabel("20");
		lbl_20.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_20.setForeground(new Color(244, 243, 244));
		lbl_20.setFont(new Font("Berlin Sans FB", Font.PLAIN, 40));
		lbl_20.setBounds(352, 402, 100, 54);
		frame.getContentPane().add(lbl_20);
		
		lbl_25 = new JLabel("25");
		lbl_25.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_25.setForeground(new Color(244, 243, 244));
		lbl_25.setFont(new Font("Berlin Sans FB", Font.PLAIN, 40));
		lbl_25.setBounds(462, 402, 100, 54);
		frame.getContentPane().add(lbl_25);

	
	}
	
}
