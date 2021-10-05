package ex8;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tabs = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());

        for (int i = 0; i < tabs; i++){

            String website = scanner.nextLine();

            switch (website){

                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;
                    break;

            }

        }

        if (salary <= 0){
            System.out.println("You have lost your salary.");
        }
        else {
            System.out.printf("%.0f", salary);
        }

    }
}
