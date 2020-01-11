package algorithms;

import java.util.List;

public class Sort extends Algorithm {
    private List<Integer> inputData;

    public Sort(List inputData){
        if(inputData.get(0) instanceof Integer){
            this.inputData = inputData;
        }
        else if(inputData.get(0) instanceof String){
            this.inputData = convertValuesToListOfIntegers(inputData);
        }
        else
            throw new IllegalArgumentException("Can't resolve type of elements in list");
    }

    public List<Integer> getInputData() {
        return inputData;
    }

    public void setInputData(List<Integer> inputData) {
        this.inputData = inputData;
    }

    @Override
    public void process() {

    }
}
