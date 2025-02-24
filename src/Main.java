import com.sun.jdi.IntegerType;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String knockKnock = "Тук-Тук";
        String whoIs = "\tКто там";

        int outerCycle = -1;
        int innerCycle = -1;

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            outerCycle = scanner.nextInt();
        }
        if (scanner.hasNextInt()) {
            innerCycle = scanner.nextInt();
        }

        if (outerCycle >= 0 && innerCycle >= 0) {
            while (true) {
                for (int i = 0; i < outerCycle; i++) {
                    System.out.println(knockKnock);

                    for (int j = 0; j < innerCycle; j++) {
                        System.out.println(whoIs); //update_tst_br1
                    }
                }
                break;
            }
        } else {
            System.out.println("Expected two digits on input. Received letter or negative value. Restart required.");
        }


    }
}


