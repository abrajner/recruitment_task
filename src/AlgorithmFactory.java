import algorithms.*;

public class AlgorithmFactory {
    public static Algorithm getAlgorithm(String type, String values){
        if("Sort".equalsIgnoreCase(type)) {
            return new Sort(values);
        }
        else if("Reverse".equalsIgnoreCase(type)) {
            return new Reverse(values);
        }
        else if("Repeat".equalsIgnoreCase(type)) {
            return new Repeat(values);
        }

        return null;
    }
}
