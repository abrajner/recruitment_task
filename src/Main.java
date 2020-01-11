import java.io.IOException;
import java.util.ArrayList;
import algorithms.*;

public class Main {

    public static void main(String[] args) throws IOException {
        RequestValuesParserFromFile requestValuesParserFromFile = new RequestValuesParserFromFile("test.txt");
        requestValuesParserFromFile.convertToRequestValueList();
        String values = requestValuesParserFromFile.getRequestValues().get(0).getValues();
        Sort sort = new Sort(values);
        System.out.println(sort.process());
    }
}
