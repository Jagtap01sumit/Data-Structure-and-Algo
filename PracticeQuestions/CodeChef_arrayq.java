package PracticeQuestions;

import java.util.Scanner;

public class CodeChef_arrayq {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter t");
        int t =sc.nextInt();
        while(t!=0){

            int a=sc.nextInt();
            int b=sc.nextInt();
            int c= sc.nextInt();

                if(c>=a && c<b){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }


            t--;

        }
    }
}
