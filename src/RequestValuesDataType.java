import java.util.ArrayList;
import java.util.List;

public class RequestValuesDataType {
    private String request;
    private List<String> values;

    public RequestValuesDataType(String request, List<String> values){
        this.request = request;
        this.values = values;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public List<String> getValuest() {
        return values;
    }

    public void setValuest(List<String> values) {
        this.values = values;
    }

    public static List<Integer> convertValuesToListOfIntegers(List<String> values){
        List<Integer> convertedValues = new ArrayList<>();
        values.forEach((element) -> convertedValues.add(Integer.valueOf(element)));
        return convertedValues;
    }
}
