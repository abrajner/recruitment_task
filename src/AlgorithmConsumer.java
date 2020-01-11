import algorithms.*;

import java.util.ArrayList;

public class AlgorithmConsumer {
    public static ArrayList<Result> getResults(ArrayList<RequestValues> requestValues){
        ArrayList<Result> results = new ArrayList<>();

        requestValues.forEach(element -> {
            Algorithm algorithm = AlgorithmFactory.getAlgorithm(element.getRequestType(), element.getValues());
            Result result = new Result(element.getRequestType(), element.getValues(), algorithm.process().toString());
            results.add(result);
        });

        return results;
    }
}
