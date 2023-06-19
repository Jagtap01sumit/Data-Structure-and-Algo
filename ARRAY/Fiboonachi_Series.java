public class Fiboonachi_Series {
    public static void main(String[] args) {
        myfuc(10);
    }

    public static void myfuc(int num) {
        int a1 = 0, a2 = 1, a3;
        System.out.println(a1 + "");
        System.out.println(a2 + "");
        while (num - 2 > 0) {
            a3 = a1 + a2;
            a1 = a2;
            a2 = a3;
            System.out.println(a3 + " ");
            num--;

        }
    }
}