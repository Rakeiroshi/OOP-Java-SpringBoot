import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        System.out.println("HAshMap");
        Map<Integer,String> caffe = new HashMap<>(); //la mappa può dare gli elementi in modo casuale
        caffe.put(1, "Barbone");
        caffe.put(2, "lavazza");
        caffe.put(3, "Brazil");
        caffe.put(4, "Segafredo");
        System.out.println(caffe);

        System.out.println("TreeMap");
        Map<String,String> caffeb= new TreeMap<>(); //la mappa può dare gli elementi in modo alfabetico
        caffeb.put("Luca", "Barbone");
        caffeb.put("Ezechiel", "lavazza");
        caffeb.put("Matheus", "Brazil");
        caffeb.put("Baraka", "Segafredo");
        System.out.println(caffeb);


    }
}