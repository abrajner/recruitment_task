import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RequestValuesParserFromFile {
    private static List<String> readLinesFromFile(String fileName) throws IOException {
        Reader reader = new FileReader(new File(fileName));
        BufferedReader buff = new BufferedReader(reader);
        List<String> collectedLines = buff.lines().collect(Collectors.toList());
        buff.close();
        return collectedLines;
    }

    public static ArrayList<RequestValues> convertToRequestValueList(String fileName) throws IOException {
        List<String> collectedLines = readLinesFromFile(fileName);
        ArrayList<RequestValues> requestValuesTemp = new ArrayList<>();
        for(int i = 0; i < collectedLines.size(); i+=2){
            String requestName = collectedLines.get(i).substring(0,1).toUpperCase() + collectedLines.get(i).substring(1).toLowerCase();
            RequestValues requestValues = new RequestValues(requestName, collectedLines.get(i + 1));
            requestValuesTemp.add(requestValues);
        }
        return requestValuesTemp;
    }

}
