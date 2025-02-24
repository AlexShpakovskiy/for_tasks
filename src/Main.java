import com.sun.jdi.IntegerType;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String knockKnock = "Тук-Тук";
        String whoIs = "\tКто там";
        int[] cycle = new int[2];
        cycle = input();

        for (int i = 0; i < cycle[0]; i++) {
            System.out.println(knockKnock);

            for (int j = 0; j < cycle[1]; j++) {
                System.out.println(whoIs); //update_tst_br1
            }
        }

    }

    public static int[] input() {
        int[] inputData = new int[2];

        for (int i = 0; i < 2; i++) {

            while (true) {
                Scanner scanner = new Scanner(System.in);
                if (scanner.hasNextInt()) {
                    inputData[i] = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Expected two digits on input. Received letter or negative value. Try again.");
                }
            }
        }

        return inputData;
    }

}


