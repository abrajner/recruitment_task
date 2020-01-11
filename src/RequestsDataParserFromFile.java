import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RequestsDataParserFromFile {
    private List<RequestValuesDataType> requestData;
    private String fileName;

    public RequestsDataParserFromFile(String fileName){
        this.fileName = fileName;
    }

    public List<RequestValuesDataType> getRequestData() {
        return requestData;
    }

    public void setRequestData(List<RequestValuesDataType> requestData) {
        this.requestData = requestData;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public List<String> readFromFile() throws IOException {
        Reader reader = new FileReader(new File(this.fileName));
        BufferedReader buff = new BufferedReader(reader);
        List<String> collectedLines = buff.lines().collect(Collectors.toList());
        buff.close();

        return collectedLines;
    }

    public List<String> separateValuesInLine (String lineFromFile){
        List<String> values = new ArrayList<>();
        Pattern compiledPattern = Pattern.compile("(\\w)*\\s+");
        Matcher matcher = compiledPattern.matcher(lineFromFile);

        matcher.matches();
        for(int i = 1; i < matcher.groupCount(); i++){
            values.add(matcher.group(i));
        }

        return values;
    }
}
