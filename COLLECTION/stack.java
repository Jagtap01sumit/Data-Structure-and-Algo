package COLLECTION;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> c=new Stack<>();
        c.push(10);  //index 1
        c.push(20);  //index 2
        c.push(30); //index 3
        c.push(40);//index 4
        c.push(50);//index 5
        System.out.println(c);


        int d=c.peek();
        System.out.println(d);

        c.pop();
        System.out.println(c);
    int  e= c.search(10);
        System.out.println(e);

        if(!c.isEmpty()){
            c.pop();
        }
    }
}
