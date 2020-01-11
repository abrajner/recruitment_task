import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RequestValuesParserFromFile {
    private ArrayList<RequestValues> requestValues;
    private String fileName;

    public RequestValuesParserFromFile(String fileName){
        this.fileName = fileName;
    }

    public ArrayList<RequestValues> getRequestValues() {
        return requestValues;
    }

    public void setRequestValues(ArrayList<RequestValues> requestValues) {
        this.requestValues = requestValues;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    private List<String> readLinesFromFile() throws IOException {
        Reader reader = new FileReader(new File(this.fileName));
        BufferedReader buff = new BufferedReader(reader);
        List<String> collectedLines = buff.lines().collect(Collectors.toList());
        buff.close();
        return collectedLines;
    }

    public void convertToRequestValueList() throws IOException {
        List<String> collectedLines = readLinesFromFile();
        ArrayList<RequestValues> requestValuesTemp = new ArrayList<>();
        for(int i = 0; i < collectedLines.size(); i+=2){
            String requestName = collectedLines.get(i).substring(0,1).toUpperCase() + collectedLines.get(i).substring(1).toLowerCase();
            RequestValues requestValues = new RequestValues(requestName.replace("\\n",""), collectedLines.get(i + 1).replace("\\n",""));
            requestValuesTemp.add(requestValues);
        }
        this.requestValues = requestValuesTemp;
    }

}
