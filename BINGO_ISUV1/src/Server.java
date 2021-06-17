//Logic Imports
import java.util.ArrayList;
import java.util.Random;

//Action Imports
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


/*
* This is a Server Class, all game events as well as starting the game will happen here.
* Date Started: 06/06/2021
* Date Ended: 15/06/2021
* Jonathan M.
*/

public class Server {
    
    //Global Variables
    public static int currentPick = 0;
    public static boolean isGameRunning = false;


    /*getRandomInt method
	*Method that returns random integer
	*Parameter: [1|int] maxNum
	*returns Random Int from 1-maxNum
	*/
	public static int getRandomInt(int maxNum) {
		int rng = new Random().nextInt((maxNum - 1) + 1) + 1;
		return rng;
	}

    //Main Method
    public static void main(String[] args) {
        //Local Variables
        ArrayList<Integer> randomSamples = new ArrayList<Integer>();
        currentPick = 0;

        //Custom Classes
        Client bingoCard = new Client();
        bingoServerGUI serverEvent = new bingoServerGUI();
        serverAdminPanel serverPanel = new serverAdminPanel();

        //Initialize Game
        isGameRunning = true;

        //Action Listen Server Panel GUI - Run Next Number
        serverPanel.btn_NEXT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                //Server RNG Bingo Logic
                int randomPick = 0;
                if (isGameRunning == true) { //Check if Game is running
                    //Loop through ING without duplicates Logic
                    if (randomSamples.size() == 0) {
                        for (int i = 1; i <= 100; i++) {
                            randomSamples.add(i);
                        }
                    }
                    if ((randomSamples.size()-1) > 0) {
                        randomPick = randomSamples.remove(getRandomInt(randomSamples.size()-1));
                    } else {
                        randomPick = randomSamples.remove(0);
                    }
                    //Get random pick
                    currentPick = randomPick;
                    
                    /*
                    B I N G O numerator logic
                    B = 1-20
                    I = 21-40
                    N = 41-60
                    G = 61-80
                    O = 18-100
                    */
                    if (currentPick >= 1 && currentPick <= 20) {
                        System.out.println("The next number is B: " + currentPick);
                        serverEvent.updateServer("The next number is B: " + currentPick);
                    } else if (currentPick >= 21 && currentPick <= 40) {
                        System.out.println("The next number is I: " + currentPick);
                        serverEvent.updateServer("The next number is I: " + currentPick);
                    } else if (currentPick >= 41 && currentPick <= 60) {
                        System.out.println("The next number is N: " + currentPick);
                        serverEvent.updateServer("The next number is N: " + currentPick);
                    } else if (currentPick >= 61 && currentPick <= 80) {
                        System.out.println("The next number is G: " + currentPick);
                        serverEvent.updateServer("The next number is G: " + currentPick);
                    } else if (currentPick >= 81 && currentPick <= 100) {
                        System.out.println("The next number is O: " + currentPick);
                        serverEvent.updateServer("The next number is O: " + currentPick);
                    }
                    //Pass current number to Bingo Card
                    bingoCard.runMainLogic(currentPick);
                }
			}
		});

        //Action Listen Server Panel GUI - Close Game
        serverPanel.btn_END.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                serverEvent.updateServer("That concludes the Bingo Game!");
                bingoCard.destroyFrameClasses();
                isGameRunning = false;
			}
		});
        
    }//END OF MAIN
}