import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
* This is a tableSorting Class, this class has a series of algorithms to check table equality and convert tables.
* Date Started: 06/06/2021
* Date Ended: 15/06/2021
* Jonathan M.
*/

public class tableSorting {

    /*convertIntegers method
	*Method that converts Arraylist to int[] array
	*Parameter: [1|ArrayList<Integer>] integers
	*returns returns int[] array from ArrayList
	*/
    public int[] convertIntegers(ArrayList<Integer> integers) {
        int[] ret = new int[integers.size()];
        for (int i=0; i < ret.length; i++) {
            ret[i] = integers.get(i).intValue();
        }
        return ret;
    }
    
    /*has_value method
	*Method that check if array has certain value
	*Parameter: [1|int[]] tab [2|int] val
	*returns boolean of outcome
	*/
    public boolean has_value (int[] tab, int val) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == val) {
                return true;
            }
        }
        return false;
    }

    /*checkTableAgain method
	*Method that checks if arrays are equal to each other
	*Parameter: [1|int[]] t1 [2|int[]] t2
	*returns boolean of outcome
	*/
    public boolean checkTableAgain(int[] t1, int[] t2) {
        boolean result = Arrays.equals(t1, t2);
        return result;
    }


    /*checkTableEquality method
	*Method that makes and sorts an array comparing if two arrays are equal, and checks again.
	*Parameter: (1|int[]) t1 (2|int[]) t2
	*returns boolean of outcome
	*/
    public boolean checkTableEquality(int[] t1, int t2[]) {
        ArrayList<Integer> c_List = new ArrayList<Integer>();
        for (int i = 0; i < t1.length; i++) {
            int t1val = t1[i];
            if (has_value(t2, t1val)) {
                c_List.add(t1val);
            }
        }

        if (c_List.size() > 0) {
            Collections.sort(c_List);
            int[] c_Array = convertIntegers(c_List);
            if (checkTableAgain(c_Array, t2) == true) {
                return true;
            }
        }

        return false;

    }

}
