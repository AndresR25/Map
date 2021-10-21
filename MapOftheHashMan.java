import java.util.HashMap;

public class MapOftheHashMan {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("AAAAAA", "AAAAAAA");
        map.put("BBBBBBB", "BBBBBBBB");
        map.put("CCCCCC", "CCCCC");
        map.put("DDDDD", "DDDDDDD");

        String val = map.get("CCCCCC");

        for (String key : map.keySet()) {
            System.out.println(String.format("Track: %s: Lyrics: %s", key, map.get(key)));
        }


    }
}