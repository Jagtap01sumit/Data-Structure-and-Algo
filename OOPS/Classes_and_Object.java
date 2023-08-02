package OOPS;

class pen {
    String color = "black";
    String type;

    void write() {
        System.out.println("Writting something");
    }

    void penColor() {
        System.out.println(this.color);
    }
}

public class Classes_and_Object {
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.color = "blue";
        pen1.type = "ballpen";
        pen1.penColor();
    }
}
