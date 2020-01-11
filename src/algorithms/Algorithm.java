package algorithms;

import java.util.ArrayList;

public abstract class Algorithm<T> {
    public abstract T process();

    public ArrayList<Integer> convertValuesToListOfIntegers(String valuesInLine){
        String[] splitedValues = valuesInLine.split(" ");
        ArrayList<Integer> values = new ArrayList<>();
        for(int i = 0; i < splitedValues.length; i++){
            values.add(Integer.valueOf(splitedValues[i]));
        }
        return values;
    }
}
