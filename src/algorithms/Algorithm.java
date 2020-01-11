package algorithms;

import java.util.ArrayList;
import java.util.List;

public abstract class Algorithm {
    public abstract void process();

    public static List<Integer> convertValuesToListOfIntegers(List<String> values){
        List<Integer> convertedValues = new ArrayList<>();
        values.forEach((element) -> convertedValues.add(Integer.valueOf(element)));
        return convertedValues;
    }
}
