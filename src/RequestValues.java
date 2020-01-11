public class RequestValues {
    private String requestType;
    private String values;

    public RequestValues(String request, String values){
        this.requestType = request;
        this.values = values;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }
}
