import com.sun.jdi.IntegerType;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String knockKnock = "Тук-Тук", whoIs = "\tКто там";

        while (true) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                int outerCycle = scanner.nextInt(), innerCycle = scanner.nextInt();
                for (int i = 0; i < outerCycle; i++) {
                    System.out.println(knockKnock);

                    for (int j = 0; j < innerCycle; j++) {
                        System.out.println(whoIs);
                    }
                }
                break;


            } else {
                System.out.println("must be digit");
            }
        }

    }
}


