package sample;

import java.util.HashMap;

public class modle {



    static HashMap<String, Integer> map = new HashMap<>();

    public static void insert(String key, int value){
        map.put(key,value);
    }

    public static  int checkPassword(String key){
        // return 0 if key is not in dict
        if (map.containsKey(key)){
            return map.get(key);
        }
        else return 0;
    }

}
