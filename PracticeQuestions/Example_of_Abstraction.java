package PracticeQuestions;

abstract  class Animal{
    abstract void walk();
}
class Horse extends Animal{
    void walk(){
        System.out.println("walking");
    }

    void make(){
        System.out.println("Walking on 4 legs");
    }
}
class  Chicken extends  Animal{
    void walk(){
        System.out.println("walking on 2 legs");
    }

}



public class Example_of_Abstraction {
    public static void main(String[] args) {
Chicken c=new Chicken();
c.walk();
Horse h=new Horse();
h.walk();



    }
}
