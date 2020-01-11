package algorithms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Sort extends Algorithm {
    private ArrayList inputData;

    public Sort(ArrayList<Integer> inputData){
        this.inputData = inputData;
    }

    public Sort(String inputData){
        this.inputData = convertValuesToListOfIntegers(inputData);
    }

    public List<Integer> getInputData() {
        return inputData;
    }

    public void setInputData(ArrayList<Integer> inputData) {
        this.inputData = inputData;
    }

    @Override
    public ArrayList<Integer> process() {
        ArrayList<Integer> sorted = new ArrayList<>(inputData);
        Collections.sort(sorted);
        return sorted;
    }
}
