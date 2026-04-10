import java.util.Scanner;

public class ChessboardSum {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            if (!scanner.hasNextInt()) return;
            int n = scanner.nextInt();
            long blackSum = 0;
            long whiteSum = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (scanner.hasNextInt()) {
                        int value = scanner.nextInt();
                        if ((i + j) % 2 == 0) {
                            blackSum += value;
                        } else {
                            whiteSum += value;
                        }
                    }
                }
            }

            System.out.println(blackSum);
            System.out.println(whiteSum);
        }
    }
}
