import java.io.IOException;
import java.util.ArrayList;
import algorithms.*;

public class Main {

    public static void main(String[] args) throws IOException {

        ArrayList<RequestValues> requestValues = RequestValuesParserFromFile.convertToRequestValueList("test.txt");
        ArrayList<Result> results = AlgorithmConsumer.getResults(requestValues);
        PrintResult.print(results);
    }
}
