package ex8;

import java.util.Scanner;

public class NumsEndsWith7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(int i = 7; i <= 1000 ; i++){
            if(i % 10 == 7){
                System.out.println(i);
            }
        }
    }
}
