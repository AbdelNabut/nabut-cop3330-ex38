package ex38;

import java.util.ArrayList;

public class ValueFilter {
    public static ArrayList convertToNumArray(String[] stringArray) {
        ArrayList numberArray = new ArrayList();
        for(int i = 0; i < stringArray.length; i++) {
            numberArray.add(Integer.parseInt(stringArray[i]));
        }
        return numberArray;
    }
    public static ArrayList filterEvenNumbers(ArrayList numbers) {
        ArrayList numberArray = new ArrayList();
        for(int i = 0; i < numbers.size(); i++) {
            if((int) numbers.get(i) % 2 == 0)
                numberArray.add(numbers.get(i));
        }
        return numberArray;
    }
}
