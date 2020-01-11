import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import algorithms.*;

public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<Result> results = new ArrayList<>();

        RequestValuesParserFromFile requestValuesParserFromFile = new RequestValuesParserFromFile("test.txt");
        requestValuesParserFromFile.convertToRequestValueList();

        requestValuesParserFromFile.getRequestValues().forEach(element -> {
            Algorithm algorithm = AlgorithmFactory.getAlgorithm(element.getRequestType(), element.getValues());
            Result result = new Result(element.getRequestType(), element.getValues(), algorithm.process().toString());
            results.add(result);
        });

        PrintResult.print(results);
    }
}
