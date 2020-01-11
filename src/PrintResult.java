import java.util.ArrayList;

public class PrintResult {
    String result;
    public PrintResult(ArrayList<Integer> result){
        this.result = result.toString();
    }

    public PrintResult(String result){
        this.result = result;
    }
}
