import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import algorithms.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        RequestValuesParserFromFile requestValuesParserFromFile = new RequestValuesParserFromFile("test.txt");
        requestValuesParserFromFile.convertToRequestValueList();
        ArrayList<RequestValues> requestValues = new ArrayList<>(requestValuesParserFromFile.getRequestValues());
        requestValues.forEach(element -> {
        });
        String values = requestValuesParserFromFile.getRequestValues().get(0).getValues();
        Sort sort = new Sort(values);
        System.out.println(sort.process());
        String values2 = requestValuesParserFromFile.getRequestValues().get(3).getValues();
        Reverse reverse = new Reverse(values2);
        System.out.println(reverse.process());

    }
}
