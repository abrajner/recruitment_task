package algorithms;

public class Reverse extends Algorithm {
    private String inputData;

    public Reverse(String inputData){
        this.inputData = inputData;
    }

    public String getInputData() {
        return inputData;
    }

    public void setInputData(String inputData) {
        this.inputData = inputData;
    }
    @Override
    public String process() {
        String reversed = new StringBuffer(inputData).reverse().toString();
        return reversed;
    }
}
