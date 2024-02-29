package Week_3;

import java.util.Scanner;

public class NestedLoopsExercise {
    public static void main(String[] args) {
        Scanner inpScanner = new Scanner(System.in);
        // 2.1 SquarePattern
        squarePattern(inpScanner);
        // 2.2 CheckerPattern
        testCheckerPattern(inpScanner);
        // 2.3 TimeTable
        testTimeTable(inpScanner);
        // 2.4 TriangularPattern
        testTriangularPattern(inpScanner);
        // 2.5 BoxPattern
        testBoxPattern(inpScanner);
        // 2.6 HillPattern
        testHillPatternX(inpScanner);

    }

    // 2.1 SquarePattern
    public static void squarePattern(Scanner inpScanner) {
        System.out.print("Enter the size: ");
        int n = inpScanner.nextInt();
        squarePattern(n);
    }

    public static void squarePattern(int n) {
        // Use for-loops
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.err.print("# ");
            }
            System.out.println();
        }

        System.out.println("-------------------------------");

        // Use while do-loops
        int col = 0;
        int row = 0;
        do {
            if (row < n) {
                row++;
                System.err.print("# ");
            } else if (row == n) {
                row = 0;
                col++;
                System.out.println();
            }
        } while (col < n);
    }

    // 2.2 CheckerPattern
    public static void testCheckerPattern(Scanner inpScanner) {
        System.out.print("Enter the size: ");
        int n = inpScanner.nextInt();
        checkerPattern(n);
    }

    public static void checkerPattern(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row % 2 != 0) {
                    System.out.print(" #");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }

    // 2.3 TimeTable
    public static void testTimeTable(Scanner inpScanner) {
        System.out.print("Enter the size: ");
        int n = inpScanner.nextInt();
        timeTable(n);
    }

    public static void timeTable(int n) {
        for (int row = 0; row <= n; row++) {
            if (row == 0) {
                System.out.printf("%2s | ", "*");
            } else {
                System.out.printf("%4d", row);
            }
        }

        System.err.println();
        String separatingDash = String.format("%" + 2.2 * n + "s", "").replace("", "-");
        System.err.println(separatingDash);

        for (int row = 0; row < n; row++) {
            for (int col = 1; col <= n; col++) {
                if (col == 1) {
                    System.out.printf("%2d | %4d", row + 1, (col) * (row + 1));
                } else {
                    System.out.printf("%4d", (col) * (row + 1));
                }
            }
            System.out.println();
        }
    }

    // 2.4 TriangularPattern
    public static void testTriangularPattern(Scanner in) {
        System.out.print("Enter the size: ");
        int n = in.nextInt();
        triangularPatternA(n);
        triangularPatternB(n);
        triangularPatternC(n);
        triangularPatternD(n);
    }

    public static void triangularPatternA(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (col <= row) {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        System.out.printf("%" + n / 2 + "s (a)", "");
        System.out.println();
    }

    public static void triangularPatternB(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (col >= row) {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        System.out.printf("%" + n / 2 + "s (b)", "");
        System.out.println();
    }

    public static void triangularPatternC(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row - 1; col++) {
                System.out.print("  ");
            }
            for (int i = 0; i <= row; i++) {
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.printf("%" + n / 2 + "s (c)", "");
        System.out.println();
    }

    public static void triangularPatternD(int n) {
        for (int row = n - 1; row >= 0; row--) {
            for (int col = 0; col < n - row - 1; col++) {
                System.out.print("  ");
            }
            for (int i = 0; i <= row; i++) {
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.printf("%" + n / 2 + "s (d)", "");
        System.out.println();
    }

    // 2.5 BoxPattern
    public static void testBoxPattern(Scanner inpScanner) {
        System.out.print("Enter the size: ");
        int n = inpScanner.nextInt();
        boxPatternA(n);
        boxPatternB(n);
        boxPatternC(n);
        boxPatternD(n);
    }

    public static void boxPatternA(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row == 0 || row == n - 1) {
                    System.out.print("# ");
                } else if (row >= 1 && row <= n - 2) {
                    if (col == 0) {
                        System.out.print("# ");
                    } else if (col == n - 1) {
                        System.out.print("# ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
        System.out.printf("%" + n / 2 + "s (a)", "");
        System.out.println();
    }

    public static void boxPatternB(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row == 0 || row == n - 1) {
                    System.out.print("# ");
                } else if (row >= 1 && row <= n - 2) {
                    if (col == row) {
                        System.out.print("# ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
        System.out.printf("%" + n / 2 + "s (b)", "");
        System.out.println();
    }

    public static void boxPatternC(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row == 0 || row == n - 1) {
                    System.out.print("# ");
                } else if (row >= 1 && row <= n - 2) {
                    if (col + row == n - 1) {
                        System.out.print("# ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
        System.out.printf("%" + n / 2 + "s (c)", "");
        System.out.println();
    }

    public static void boxPatternD(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row == 0 || row == n - 1) {
                    System.out.print("# ");
                } else if (row >= 1 && row <= n - 2) {
                    if (col + row == n - 1) {
                        System.out.print("# ");
                    } else if (col == row) {
                        System.out.print("# ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
        System.out.printf("%" + n / 2 + "s (d)", "");
        System.out.println();
    }

    // 2.6 HillPattern
    public static void testHillPatternX(Scanner inpScanner) {
        System.out.print("Enter the size: ");
        int n = inpScanner.nextInt();
        hillPatternA(n);
        hillPatternB(n);
        hillPatternC(n);
        hillPatternD(n);
    }

    public static void hillPatternA(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= 2 * n - 1; col++) {
                if ((row + col >= n + 1) && (row >= col - n + 1)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.printf("%" + n * 2.5 / 2 + "s (a)", "");
        System.out.println();
    }

    public static void hillPatternB(int n) {
        for (int row = n; row >= 1; row--) {
            for (int col = row; col < n; col++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * row - 1; k++) {
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.printf("%" + (n * 2.5) / 2 + "s (b)", "");
        System.out.println();
    }

    public static void hillPatternC(int n) {
        for (int row = 1; row < n; row++) {
            for (int col = 1; col <= 2 * n - 1; col++) {
                if ((row + col >= n + 1) && (row >= col - n + 1)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int row = n; row >= 1; row--) {
            for (int col = row; col < n; col++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * row - 1; k++) {
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.printf("%" + n * 2.5 / 2 + "s (c)", "");
        System.out.println();
    }

    public static void hillPatternD(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 0; col <= 2 * n - 1; col++) {
                if ((row + col >= n + 1) && (row > col - n + 1)) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }

        for (int row = n - 1; row >= 1; row--) {
            for (int col = row; col <= n; col++) {
                System.out.print("# ");
            }
            for (int k = 1; k <= 2 * row - 2; k++) {
                System.out.print("  ");
            }
            for (int i = row; i <= n; i++) {
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.printf("%" + n * 2.5 / 2 + "s (d)", "");
        System.out.println();
    }
}
