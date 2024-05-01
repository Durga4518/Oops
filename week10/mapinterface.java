import java.util.HashMap;
import java.util.Map;

public class mapInterface {
    public static void main(String[] args) {
        Map<String,Integer> obj=new HashMap<String,Integer>();
        obj.put("Rutu", 1);
        obj.put("king", 2);
        obj.put("hitman", 3);
        obj.put("mahi", 4);
        for(Map.Entry<String,Integer> m:obj.entrySet()){
            System.out.println(m.getKey()+" = "+m.getValue());
        }
    }
}
