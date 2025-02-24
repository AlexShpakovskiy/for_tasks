import com.sun.jdi.IntegerType;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String knockKnock = "Тук-Тук";
        String whoIs = "\tКто там";

        Scanner scanner = new Scanner(System.in);
        int outerCycle = input(scanner);
        int innerCycle = input(scanner);


        for (int i = 0; i < outerCycle; i++) {
            System.out.println(knockKnock);

            for (int j = 0; j < innerCycle; j++) {
                System.out.println(whoIs); //update_tst_br1
            }
        }

    }

    public static int input(Scanner scanner) {

        while (true) {
            if (scanner.hasNextInt()) {
                int inputData = scanner.nextInt();
                return inputData;
            } else {
                System.out.println("Expected two digits on input. Received letter or negative value. Try again.");
            }
        }

    }

}


