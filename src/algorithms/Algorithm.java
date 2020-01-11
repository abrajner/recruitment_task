package algorithms;

import java.util.ArrayList;

public abstract class Algorithm<T> {
    public abstract T process();

    ArrayList<Integer> convertValuesToListOfIntegers(String valuesInLine) {
        String[] splitedValues = valuesInLine.split(" ");
        ArrayList<Integer> values = new ArrayList<>();
        try{
            for (String splitedValue : splitedValues) {
            values.add(Integer.valueOf(splitedValue));
            }
            return values;
        }catch (NumberFormatException e){}
        return new ArrayList<>();
    }
}
