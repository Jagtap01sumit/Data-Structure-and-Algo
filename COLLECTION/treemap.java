package COLLECTION;

import java.util.Map;
import java.util.TreeMap;

public class treemap {
    public static void main(String[] args) {
        Map<Integer,String> c=new TreeMap<>();
        c.put(3,"a");  //3 is key and a is value
        c.put(4,"sumit");
        c.put(2,"b");
        c.put(1,"kamothe");
        c.put(6,"college");
        System.out.println(c); //sorted form
    }


}
