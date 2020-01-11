package algorithms;

public class Repeat extends Algorithm {
    private String inputData;

    public Repeat(String inputData){
        this.inputData = inputData;
    }

    @Override
    public String process() {
        char firstLetter = inputData.charAt(0);
        Integer counter = 0;
        for(int i = 0; i < inputData.length(); i++){
            if(inputData.charAt(i) == firstLetter){
                counter++;
            }
        }
        return "\""+firstLetter+"\" repeats " + counter.toString() + " times";
    }
}
