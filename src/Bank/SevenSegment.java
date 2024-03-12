package Bank;

import java.util.Scanner;

public class SevenSegment {
    public static int[][] segment = new int[5][4];

    public static void fillA() {
        segment[0][0] = 1;
        segment[0][1] = 1;
        segment[0][2] = 1;
        segment[0][3] = 1;
    }

    public static void fillB() {
        segment[0][3] = 1;
        segment[1][3] = 1;
        segment[2][3] = 1;
    }

    public static void fillC() {
        segment[2][3] = 1;
        segment[3][3] = 1;
        segment[4][3] = 1;
    }

    public static void fillD() {
        segment[4][0] = 1;
        segment[4][1] = 1;
        segment[4][2] = 1;
        segment[4][3] = 1;
    }

    public static void fillE() {
        segment[2][0] = 1;
        segment[3][0] = 1;
        segment[4][0] = 1;
    }

    public static void fillF() {
        segment[0][0] = 1;
        segment[1][0] = 1;
        segment[2][0] = 1;
    }

    public static void fillG() {
        segment[2][0] = 1;
        segment[2][1] = 1;
        segment[2][2] = 1;
        segment[2][3] = 1;
    }

    public static void display() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (segment[i][j] == 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void inputValue(String value) {
        if (value.length() > 7) {
            value = value.substring(0, 7);
        }

        for (int i = 0; i < value.length(); i++) {
            char bit = value.charAt(i);
            if (bit != '0' && bit != '1') {
                throw new IllegalArgumentException("Input must be 0 or 1");
            }

            if (bit == '1') {
                if (i == 0) {
                    fillA();
                } else if (i == 1) {
                    fillB();
                } else if (i == 2) {
                    fillC();
                } else if (i == 3) {
                    fillD();
                } else if (i == 4) {
                    fillE();
                } else if (i == 5) {
                    fillF();
                } else if (i == 6) {
                    fillG();
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SevenSegment display = new SevenSegment();
        System.out.print("Enter binary number (up to 7 bits): ");
        String value = scanner.nextLine();
        inputValue(value);
        display();
        scanner.close();
    }
}

