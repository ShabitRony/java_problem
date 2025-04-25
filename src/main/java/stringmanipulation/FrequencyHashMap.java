package stringmanipulation;

import java.util.LinkedHashMap;

public class FrequencyHashMap {
    public static void main(String[] args) {
        String st = "programming";
        char [] ch = st.toCharArray();
        LinkedHashMap<Character , Integer> hashMap = new LinkedHashMap<>();
        for(char c : ch){
            hashMap.put(c,hashMap.getOrDefault(c,0)+1);
        }
        System.out.println(hashMap);
    }
}
