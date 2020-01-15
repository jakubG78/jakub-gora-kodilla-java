package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> tempOddNumbers = new ArrayList<>();
        Integer tempValue = 0;
        for (int n=0; n<numbers.size(); n++){
            tempValue = numbers.get(n);
            if(tempValue % 2 == 0){
                tempOddNumbers.add(tempValue);
            }
        }
        return tempOddNumbers;
    }
}
