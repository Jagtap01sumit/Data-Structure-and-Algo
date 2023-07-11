package COLLECTION;

import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        Map<Integer,String> c=new HashMap<>();
        //it accept key + values and every key is unique

        c.put(3,"a");  //3 is key and a is value
        c.put(4,"sumit");
        c.put(2,"b");
        c.put(1,"kamothe");
        c.put(6,"college");
        System.out.println(c);

        c.putIfAbsent(5,"g");
        System.out.println(c);

        c.remove(3);
        System.out.println(c);

        for(Integer d:c.keySet()){
            System.out.println(d);//print all keys

        } for(String d:c.values()){
            System.out.println(d);//print all keys

        }
    }
}
