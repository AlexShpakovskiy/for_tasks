import com.sun.jdi.IntegerType;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String knockKnock = "Тук-Тук";
        String whoIs = "\tКто там";
        int outerCycle = input();
        int innerCycle = input();

        for (int i = 0; i < outerCycle; i++) {
            System.out.println(knockKnock);

            for (int j = 0; j < innerCycle; j++) {
                System.out.println(whoIs); //update_tst_br1
            }
        }

    }

    public static int input() {
        int inputData = -1;

        while (inputData == -1) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                inputData = scanner.nextInt();
            } else {
                System.out.println("Expected two digits on input. Received letter or negative value. Try again.");
            }
        }

        return inputData;
    }

}


