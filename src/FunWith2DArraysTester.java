public class FunWith2DArraysTester {
    public static void main(String[] args) {
        int[][] testArr1 = {{5, 2}, {1, 3}, {7, 9}};
        int t1 = FunWith2DArrays.totalElements(testArr1);
        System.out.println(t1);
        int[][] testArr2 = {{1, 2, 3}, {6, 5, 4}};
        int t2 = FunWith2DArrays.totalElements(testArr2);
        System.out.println(t2);
        int[][] testArr3 = {{1, 2, 3, 4}, {7, 8, 9, 10}};
        int t3 = FunWith2DArrays.totalElements(testArr3);
        System.out.println(t3);
        int[][] testArr4 = {{4, 5, 2}, {1, 9, 7}, {8, 10, 13}};
        int t4 = FunWith2DArrays.totalElements(testArr4);
        System.out.println(t4);
        int[][] testArr5 = {{4, 5, 2, 4, 1}, {1, 9, 7, 8, 2}, {8, 10, 13, 4, 3}};
        int t5 = FunWith2DArrays.totalElements(testArr5);
        System.out.println(t5);
        int[][] testArr6 = {{4, 5, 2, 4, 8, 9, 10}, {1, 9, 7, 8, 6, 1, 2}};
        int t6 = FunWith2DArrays.totalElements(testArr6);
        System.out.println(t6);
        int[][] testArr7 = {{4}, {7}, {8}, {2}};
        int t7 = FunWith2DArrays.totalElements(testArr7);
        System.out.println(t7);
        int[][] testArr8 = {{4}};
        int t8 = FunWith2DArrays.totalElements(testArr8);
        System.out.println(t8);
        int[][] testArr9 = {{}};
        int t9 = FunWith2DArrays.totalElements(testArr9);
        System.out.println(t9);
        if (t1 == 6 && t2 == 6 && t3 == 8 && t4 == 9 && t5 == 15
                && t6 == 14 && t7 == 4 && t8 == 1 && t9 == 0) {
            System.out.println("TEST PASSES!");
        } else {
            System.out.println("!!!!!!!! TEST FAILS !!!!!!!!");
        }

        System.out.println("-------TEST 1-------");
        String[][] words = {
                {"hi", "bye", "stuff", "go"},
                {"time", "up", "you", "good"},
                {"map", "low", "bow", "mom"}
        };
        FunWith2DArrays.fourCorners(words);
        System.out.println("-------TEST 2-------");
        String[][] words2 = {
                {"time", "up", "bye"},
                {"hi", "hit", "up"},
                {"map", "bam", "low"},
                {"bow", "mom", "joy"}
        };
        FunWith2DArrays.fourCorners(words2);
        System.out.println("-------TEST 3-------");
        String[][] words3 = {{"phone", "mouse", "keyboard"}};
        FunWith2DArrays.fourCorners(words3);
        System.out.println("-------TEST 4-------");
        String[][] words4 = {
                {"cat"},
                {"dog"},
                {"hamster"},
                {"bird"}
        };
        FunWith2DArrays.fourCorners(words4);
        System.out.println("-------TEST 5-------");
        String[][] words5 = {{"time"}};
        FunWith2DArrays.fourCorners(words5);

        System.out.println("-------TEST 1-------");
        String[][] w1 = {
                {"hi", "bye", "stuff", "go"},
                {"time", "up", "you", "good"},
                {"map", "low", "bow", "mom"}
        };
        String[][] w1expected = {
                {"map", "low", "bow", "mom"},
                {"time", "up", "you", "good"},
                {"hi", "bye", "stuff", "go"}
        };
        System.out.println("--Original:");
        for (String[] row : w1) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println("--Modified:");
        FunWith2DArrays.swapFrontAndBackRows(w1);
        for (String[] row : w1) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        boolean test1pass = true;
        for (int row = 0; row < w1.length; row++) {
            for (int col = 0; col < w1[0].length; col++) {
                if (!w1[row][col].equals(w1expected[row][col])) {
                    test1pass = false;
                }
            }
        }
        if (w1.length == 3 && w1[0].length == 4 && test1pass) {
            System.out.println("TEST 1 PASSES");
        } else {
            System.out.println("!!!!!!!!!! TEST 1 FAILS !!!!!!!!!!");
        }
        System.out.println("\n-------TEST 2-------");
        String[][] w2 = {
                {"time", "up", "bye"},
                {"hi", "hit", "up"},
                {"map", "bam", "low"},
                {"bow", "mom", "joy"}
        };
        String[][] w2expected = {
                {"bow", "mom", "joy"},
                {"hi", "hit", "up"},
                {"map", "bam", "low"},
                {"time", "up", "bye"}
        };
        System.out.println("--Original:");
        for (String[] row : w2) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println("--Modified:");
        FunWith2DArrays.swapFrontAndBackRows(w2);
        for (String[] row : w2) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        boolean test2pass = true;
        for (int row = 0; row < w2.length; row++) {
            for (int col = 0; col < w2[0].length; col++) {
                if (!w2[row][col].equals(w2expected[row][col])) {
                    test2pass = false;
                }
            }
        }
        if (w2.length == 4 && w2[0].length == 3 && test2pass) {
            System.out.println("TEST 2 PASSES");
        } else {
            System.out.println("!!!!!!!!!! TEST 2 FAILS !!!!!!!!!!");
        }


        System.out.println("\n-------TEST 3-------");
        String[][] w3 = {{"phone", "mouse", "keyboard"}};
        String[][] w3expected = {{"phone", "mouse", "keyboard"}};
        System.out.println("--Original:");
        for (String[] row : w3) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println("--Modified:");
        FunWith2DArrays.swapFrontAndBackRows(w3);
        for (String[] row : w3) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        boolean test3pass = true;
        for (int row = 0; row < w3.length; row++) {
            for (int col = 0; col < w3[0].length; col++) {
                if (!w3[row][col].equals(w3expected[row][col])) {
                    test3pass = false;
                }
            }
        }
        if (w3.length == 1 && w3[0].length == 3 && test3pass) {
            System.out.println("TEST 3 PASSES");
        } else {
            System.out.println("!!!!!!!!!! TEST 3 FAILS !!!!!!!!!!");
        }


        System.out.println("\n-------TEST 4-------");
        String[][] w4 = {
                {"cat"},
                {"dog"},
                {"hamster"},
                {"bird"}
        };
        String[][] w4expected = {
                {"bird"},
                {"dog"},
                {"hamster"},
                {"cat"}
        };
        System.out.println("--Original:");
        for (String[] row : w4) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println("--Modified:");
        FunWith2DArrays.swapFrontAndBackRows(w4);
        for (String[] row : w4) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        boolean test4pass = true;
        for (int row = 0; row < w4.length; row++) {
            for (int col = 0; col < w4[0].length; col++) {
                if (!w4[row][col].equals(w4expected[row][col])) {
                    test4pass = false;
                }
            }
        }
        if (w4.length == 4 && w4[0].length == 1 && test4pass) {
            System.out.println("TEST 4 PASSES");
        } else {
            System.out.println("!!!!!!!!!! TEST 4 FAILS !!!!!!!!!!");
        }


        System.out.println("\n-------TEST 5-------");
        String[][] w5 = {{"time"}};
        String[][] w5expected = {{"time"}};
        System.out.println("--Original:");
        for (String[] row : w5) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println("--Modified:");
        FunWith2DArrays.swapFrontAndBackRows(w5);
        for (String[] row : w5) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        boolean test5pass = true;
        for (int row = 0; row < w5.length; row++) {
            for (int col = 0; col < w5[0].length; col++) {
                if (!w5[row][col].equals(w5expected[row][col])) {
                    test5pass = false;
                }
            }
        }
        if (w5.length == 1 && w5[0].length == 1 && test5pass) {
            System.out.println("TEST 5 PASSES");
        } else {
            System.out.println("!!!!!!!!!! TEST 5 FAILS !!!!!!!!!!");
        }
    }
}