import java.util.ArrayList;

public class PrintResult {
    public static void print(ArrayList<Result> result){
        result.forEach(element -> {System.out.println(element.getRequestType()+"\n"+"Previous value: \n"+element.getPreviousValue()+
                "\n"+"Converted value: \n"+element.getResultValue());});
    }
}
