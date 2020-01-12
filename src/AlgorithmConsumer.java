import algorithms.*;
import dataStructures.RequestValues;
import dataStructures.SingleResult;

import java.util.ArrayList;

public class AlgorithmConsumer {
    public static ArrayList<SingleResult> getResults(ArrayList<RequestValues> requestValues){
        ArrayList<SingleResult> results = new ArrayList<>();

        requestValues.forEach(element -> {
            Algorithm algorithm = AlgorithmFactory.getAlgorithm(element.getRequestType(), element.getValues());
            SingleResult result = new SingleResult(element.getRequestType(), element.getValues(), algorithm.process().toString());
            results.add(result);
        });

        return results;
    }
}
