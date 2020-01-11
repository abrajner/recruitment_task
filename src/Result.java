public class Result {
    private String previousValue;
    private String resultValue;
    private String requestType;

    public Result(String requestType, String previousValue, String resultValue){
        this.requestType = requestType;
        this.previousValue = previousValue;
        this.resultValue = resultValue;
    }

    public String getPreviousValue() {
        return previousValue;
    }

    public void setPreviousValue(String previousValue) {
        this.previousValue = previousValue;
    }

    public String getResultValue() {
        return resultValue;
    }

    public void setResultValue(String resultValue) {
        this.resultValue = resultValue;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }
}
