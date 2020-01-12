import java.io.IOException;
import java.util.ArrayList;

import dataStructures.RequestValues;
import dataStructures.SingleResult;

public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<RequestValues> requestValues = RequestValuesParserFromFile.convertToRequestValueList("test.txt");
        ArrayList<SingleResult> results = AlgorithmConsumer.getResults(requestValues);
        PrintResult.print(results);
    }
}
