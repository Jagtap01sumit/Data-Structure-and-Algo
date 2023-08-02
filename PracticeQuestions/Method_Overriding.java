package PracticeQuestions;

import java.sql.SQLOutput;

class A {

    public void over() {
        System.out.println("from A");

    }

}

class B extends A {
    public void over() {

        System.out.println("from B");
    }
    public void meth3(){
        System.out.println("meth3");
    }

}
class C extends B{
    public void over(){

        System.out.println("from C");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
   A obj=new B();
   obj.over();
    }
}
