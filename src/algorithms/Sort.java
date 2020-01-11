package algorithms;

import java.util.ArrayList;
    import java.util.Collections;

public class Sort extends Algorithm {
    private ArrayList inputData;

    public Sort(ArrayList<Integer> inputData){
        this.inputData = inputData;
    }

    public Sort(String inputData) throws NumberFormatException {
        this.inputData = convertValuesToListOfIntegers(inputData);
    }

    @Override
    public ArrayList<Integer> process() {
        ArrayList<Integer> sorted = new ArrayList<>(inputData);
        Collections.sort(sorted);
        return sorted;
    }
}
