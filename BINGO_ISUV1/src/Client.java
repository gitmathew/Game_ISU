import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/*
* This is a Client Class, all bingo card logic and data is handled here.
* Date Started: 06/06/2021
* Date Ended: 15/06/2021
* Jonathan M.
*/

public class Client {

    //Global Variables
    public int currentPick = 0;
    private static boolean initlaized = false;
    private static boolean hasWon = false;
    public static newCard currentCard = new newCard();
    public static bingoWinGUI winFrame;

    //Game Data
    public static Map<Integer, Boolean> game_Data = new HashMap<>();
    static {
        game_Data.put(1, false);
        game_Data.put(2, false);
        game_Data.put(3, false);
        game_Data.put(4, false);
        game_Data.put(5, false);
        game_Data.put(6, false);
        game_Data.put(7, false);
        game_Data.put(8, false);
        game_Data.put(9, false);
        game_Data.put(10, false);
        game_Data.put(11, false);
        game_Data.put(12, false);
        game_Data.put(13, false);
        game_Data.put(14, false);
        game_Data.put(15, false);
        game_Data.put(16, false);
        game_Data.put(17, false);
        game_Data.put(18, false);
        game_Data.put(19, false);
        game_Data.put(20, false);
        game_Data.put(21, false);
        game_Data.put(22, false);
        game_Data.put(23, false);
        game_Data.put(24, false);
        game_Data.put(25, false);
    }

    //Card Data
    public static Map<Integer, Integer> card_Data = new HashMap<>();
    static {
        card_Data.put(1, 0);
        card_Data.put(2, 0);
        card_Data.put(3, 0);
        card_Data.put(4, 0);
        card_Data.put(5, 0);
        card_Data.put(6, 0);
        card_Data.put(7, 0);
        card_Data.put(8, 0);
        card_Data.put(9, 0);
        card_Data.put(10, 0);
        card_Data.put(11, 0);
        card_Data.put(12, 0);
        card_Data.put(13, 0);
        card_Data.put(14, 0);
        card_Data.put(15, 0);
        card_Data.put(16, 0);
        card_Data.put(17, 0);
        card_Data.put(18, 0);
        card_Data.put(19, 0);
        card_Data.put(20, 0);
        card_Data.put(21, 0);
        card_Data.put(22, 0);
        card_Data.put(23, 0);
        card_Data.put(24, 0);
        card_Data.put(25, 0);
    }
    

    //BINGO WIN Card Data
    public static int[] currentCorrect;
    public static int[] p1 = {1,6,11,16,21};
    public static int[] p2 = {2,7,12,17,22};
    public static int[] p3 = {3,8,13,18,23};
    public static int[] p4 = {4,9,14,19,24};
    public static int[] p5 = {5,10,15,20,25};
    public static int[] p6 = {1,2,3,4,5};
    public static int[] p7 = {6,7,8,9,10};
    public static int[] p8 = {11,12,13,14,15};
    public static int[] p9 = {16,17,18,19,20};
    public static int[] p10 = {21,22,23,24,25};
    public static int[] p11 = {1,7,13,19,25};
    public static int[] p12 = {5,9,13,17,21};
    
    /**
     * Initialize
     */
    public Client() {
        randomizeCard();
        newCard.updateNumbers(card_Data);
        initlaized = true;
    }

    /*destroyFrameClasses method
	*Method that calls to destroys frame instances
	*/
    public void destroyFrameClasses() {
        currentCard.closeFrame();
        if (winFrame != null){
            winFrame.closeFrame();
        }
    }

    /*getRandomInt method
	*Method that returns random integer
	*Parameter: [1|int] maxNum
	*returns Random Int from 1-maxNum
	*/
	public static int getRandomInt(int maxNum) {
		int rng = new Random().nextInt((maxNum - 1) + 1) + 1;
		return rng;
	}

    /*checkCard method
	*Method that checks card data for win
	*/
    public static void checkCard() {
            tableSorting moduleSort = new tableSorting();
            ArrayList<Integer> t_List = new ArrayList<Integer>();
            for (Map.Entry<Integer,Boolean> entry : game_Data.entrySet()) {
                if (entry.getValue() == true) {
                    t_List.add(entry.getKey());
                }
            }

            int[] t_Array = moduleSort.convertIntegers(t_List);

            if (moduleSort.checkTableEquality(t_Array, p1) == true) {hasWon = true; currentCorrect = p1;}
            if (moduleSort.checkTableEquality(t_Array, p2) == true) {hasWon = true; currentCorrect = p2;}
            if (moduleSort.checkTableEquality(t_Array, p3) == true) {hasWon = true; currentCorrect = p3;}
            if (moduleSort.checkTableEquality(t_Array, p4) == true) {hasWon = true; currentCorrect = p4;}
            if (moduleSort.checkTableEquality(t_Array, p5) == true) {hasWon = true; currentCorrect = p5;}
            if (moduleSort.checkTableEquality(t_Array, p6) == true) {hasWon = true; currentCorrect = p6;}
            if (moduleSort.checkTableEquality(t_Array, p7) == true) {hasWon = true; currentCorrect = p7;}
            if (moduleSort.checkTableEquality(t_Array, p8) == true) {hasWon = true; currentCorrect = p8;}
            if (moduleSort.checkTableEquality(t_Array, p9) == true) {hasWon = true; currentCorrect = p9;}
            if (moduleSort.checkTableEquality(t_Array, p10) == true) {hasWon = true; currentCorrect = p10;}
            if (moduleSort.checkTableEquality(t_Array, p11) == true) {hasWon = true; currentCorrect = p11;}
            if (moduleSort.checkTableEquality(t_Array, p12) == true) {hasWon = true; currentCorrect = p12;}

    }

    /*clearCard method
	*Method that clears card data
	*/
    public void clearCard() {
        for (Map.Entry<Integer,Boolean> entry : game_Data.entrySet()) {
            if (entry.getValue() == true) {
                game_Data.replace(entry.getKey(), false);
            }
        }
    }
    
    /*updateCard method
	*Method that updates card with data
	*/
    public void updateCard() {
        int pick = currentPick;
        for (Map.Entry<Integer,Integer> entry : card_Data.entrySet()) {
           int number = entry.getValue();
           int index = entry.getKey();
           game_Data.replace(13, true);
           if (number == pick) {
               if (index == 1) {game_Data.replace(1, true);}
               else if (index == 2) {game_Data.replace(2, true);}
               else if (index == 3) {game_Data.replace(3, true);}
               else if (index == 4) {game_Data.replace(4, true);}
               else if (index == 5) {game_Data.replace(5, true);}
               else if (index == 6) {game_Data.replace(6, true);}
               else if (index == 7) {game_Data.replace(7, true);}
               else if (index == 8) {game_Data.replace(8, true);}
               else if (index == 9) {game_Data.replace(9, true);}
               else if (index == 10) {game_Data.replace(10, true);}
               else if (index == 11) {game_Data.replace(11, true);}
               else if (index == 12) {game_Data.replace(12, true);}
               else if (index == 13) {game_Data.replace(13, true);}
               else if (index == 14) {game_Data.replace(14, true);}
               else if (index == 15) {game_Data.replace(15, true);}
               else if (index == 16) {game_Data.replace(16, true);}
               else if (index == 17) {game_Data.replace(17, true);}
               else if (index == 18) {game_Data.replace(18, true);}
               else if (index == 19) {game_Data.replace(19, true);}
               else if (index == 20) {game_Data.replace(20, true);}
               else if (index == 21) {game_Data.replace(21, true);}
               else if (index == 22) {game_Data.replace(22, true);}
               else if (index == 23) {game_Data.replace(23, true);}
               else if (index == 24) {game_Data.replace(24, true);}
               else if (index == 25) {game_Data.replace(25, true);}
           }
        }
        newCard.updateGUI(game_Data);
    }

    /*randomizeCard method
	*Method that randomizes game and card data
	*/
    public void randomizeCard() {
        //Declare Arrays
        ArrayList<Integer> randomSamples1 = new ArrayList<Integer>();
        ArrayList<Integer> randomSamples2 = new ArrayList<Integer>();
        ArrayList<Integer> randomSamples3 = new ArrayList<Integer>();
        ArrayList<Integer> randomSamples4 = new ArrayList<Integer>();
        ArrayList<Integer> randomSamples5 = new ArrayList<Integer>();
        
        //Initlialize each array
        for (int i = 1; i <=20; i++) {
            randomSamples1.add(i);
        }
        for (int i = 1; i <=20; i++) {
            randomSamples2.add(i+20);
        }
        for (int i = 1; i <=20; i++) {
            randomSamples3.add(i+40);
        }
        for (int i = 1; i <=20; i++) {
            randomSamples4.add(i+60);
        }
        for (int i = 1; i <=20; i++) {
            randomSamples5.add(i+80);
        }

        //Get random data, update card
        for (Map.Entry<Integer,Integer> entry : card_Data.entrySet()) {
            int number = entry.getKey();
            if (number >= 1 && number <= 5) {
                int rng = randomSamples1.remove(getRandomInt(randomSamples1.size()-1));
                card_Data.replace(entry.getKey(), rng);
            }
            if (number >= 6 && number <= 10) {
                int rng = randomSamples2.remove(getRandomInt(randomSamples2.size()-1));
                card_Data.replace(entry.getKey(), rng);
            }
            if (number >= 11 && number <= 15) {
                int rng = randomSamples3.remove(getRandomInt(randomSamples3.size()-1));
                card_Data.replace(entry.getKey(), rng);
            }
            if (number >= 16 && number <= 20) {
                int rng = randomSamples4.remove(getRandomInt(randomSamples4.size()-1));
                card_Data.replace(entry.getKey(), rng);
            }
            if (number >= 21 && number <= 25) {
                int rng = randomSamples5.remove(getRandomInt(randomSamples5.size()-1));
                card_Data.replace(entry.getKey(), rng);
            }
        }

    }

    /*hasWon method
	*Method checks and prompts if user has won
	*/
    public void hasWon() {
        if (hasWon == true) {
            winFrame = new bingoWinGUI();
            newCard.updateWin(currentCorrect);
        }
    }

    /*runMainLogic method
	*Method that runs the main source logic for the bingo card that updates the card from server chosen data
	*Parameter: [1|int] currentpick
	*returns void
	*/
    public void runMainLogic(int currentPick) {
        this.currentPick = currentPick;
        if (initlaized == true) {
            if (hasWon == false) {
                updateCard();
                checkCard();
                if (hasWon == true) {
                    hasWon();
                }
            } else {
                winFrame.closeFrame();
                winFrame = null;
                clearCard();
                randomizeCard();
                hasWon = false;
                newCard.updateNumbers(card_Data);
                newCard.updateGUI(game_Data);
            }
        }
    }
    
}