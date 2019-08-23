
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.text.SimpleDateFormat;
public class Test {
    public static void main(String[] args) {
		System.out.println();
		Map<String, String> map = new ConcurrentHashMap<>();
		String value = "test";
		map.put(null, "hello");
		map.put("key", value);
		map.put("1", value);
		System.out.println("success");
    }

}    