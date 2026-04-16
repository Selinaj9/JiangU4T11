import java.util.Arrays;
import java.util.ArrayList;

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

        int[][] testArr01 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(FunWith2DArrays.average(testArr01));
        int[][] testArr02 = {{1, 2, 3, 4}, {7, 8, 9, 10}};
        System.out.println(FunWith2DArrays.average(testArr02));
        int[][] testArr03 = {{4, 5, 2}, {1, 9, 7}, {8, 10, 13}};
        System.out.println(FunWith2DArrays.average(testArr03));
        int[][] testArr04 = {{4}, {7}, {8}, {2}};
        System.out.println(FunWith2DArrays.average(testArr04));
        int[][] testArr05 = {{4}};
        System.out.println(FunWith2DArrays.average(testArr05));

        int[][] numbers = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int s1 = FunWith2DArrays.edgeSum(numbers);
        System.out.println(s1);
        int[][] numbers2 = {{1, 2, 3}, {5, 6, 7}, {9, 10, 11}, {13, 14, 15}, {18, 19, 20}};
        int s2 = FunWith2DArrays.edgeSum(numbers2);
        System.out.println(s2);
        int[][] numbers3 = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        int s3 = FunWith2DArrays.edgeSum(numbers3);
        System.out.println(s3);
        int[][] numbers4 = {{1, 2}, {5, 6}};
        int s4 = FunWith2DArrays.edgeSum(numbers4);
        System.out.println(s4);
        if (s1 == 102 && s2 == 123 && s3 == 36 && s4 == 14) {
            System.out.println("TEST PASSES");
        } else {
            System.out.println("!!!!!!! TEST FAILS !!!!!!!");
        }

        System.out.println("----TEST 1-----");
        String[][] letters = {{"a", "b", "c"}, {"c", "d", "e"}};
        boolean test1 = true;
        int[] idx = FunWith2DArrays.indexFound(letters, "c");
        if (!(idx.length == 2 && idx[0] == 1 && idx[1] == 0)) {
            test1 = false;
        }
        System.out.println(Arrays.toString(idx));
        idx = FunWith2DArrays.indexFound(letters, "a");
        if (!(idx.length == 2 && idx[0] == 0 && idx[1] == 0)) {
            test1 = false;
        }
        System.out.println(Arrays.toString(idx));
        idx = FunWith2DArrays.indexFound(letters, "e");
        if (!(idx.length == 2 && idx[0] == 1 && idx[1] == 2)) {
            test1 = false;
        }
        System.out.println(Arrays.toString(idx));
        idx = FunWith2DArrays.indexFound(letters, "g");
        if (!(idx.length == 2 && idx[0] == -1 && idx[1] == -1)) {
            test1 = false;
        }
        System.out.println(Arrays.toString(idx));
        if (test1) {
            System.out.println("TEST 1 PASSES");
        } else {
            System.out.println("!!!!!!! TEST 1 FAILS !!!!!!!");
        }
        System.out.println("\n----TEST 2-----");
        String[][] words0 = {{"hi", "time", "stuff", "hi"}, {"bye", "hi", "time", "up"}, {"time", "low", "time", "hi"}};
        boolean test2 = true;
        idx = FunWith2DArrays.indexFound(words0, "time");
        if (!(idx.length == 2 && idx[0] == 2 && idx[1] == 0)) {
            test2 = false;
        }
        System.out.println(Arrays.toString(idx));
        idx = FunWith2DArrays.indexFound(words0, "hi");
        if (!(idx.length == 2 && idx[0] == 0 && idx[1] == 0)) {
            test2 = false;
        }
        System.out.println(Arrays.toString(idx));
        idx = FunWith2DArrays.indexFound(words0, "up");
        if (!(idx.length == 2 && idx[0] == 1 && idx[1] == 3)) {
            test2 = false;
        }
        System.out.println(Arrays.toString(idx));
        idx = FunWith2DArrays.indexFound(words0, "cat");
        if (!(idx.length == 2 && idx[0] == -1 && idx[1] == -1)) {
            test2 = false;
        }
        System.out.println(Arrays.toString(idx));
        if (test2) {
            System.out.println("TEST 2 PASSES");
        } else {
            System.out.println("!!!!!!! TEST 2 FAILS !!!!!!!");
        }
        System.out.println("\n----TEST 3-----");
        String[][] words02 = {{"time", "up", "bye"}};
        boolean test3 = true;
        idx = FunWith2DArrays.indexFound(words02, "time");
        if (!(idx.length == 2 && idx[0] == 0 && idx[1] == 0)) {
            test3 = false;
        }
        System.out.println(Arrays.toString(idx));
        idx = FunWith2DArrays.indexFound(words02, "up");
        if (!(idx.length == 2 && idx[0] == 0 && idx[1] == 1)) {
            test3 = false;
        }
        System.out.println(Arrays.toString(idx));
        idx = FunWith2DArrays.indexFound(words02, "bye");
        if (!(idx.length == 2 && idx[0] == 0 && idx[1] == 2)) {
            test3 = false;
        }
        System.out.println(Arrays.toString(idx));
        idx = FunWith2DArrays.indexFound(words02, "cat");
        if (!(idx.length == 2 && idx[0] == -1 && idx[1] == -1)) {
            test3 = false;
        }
        System.out.println(Arrays.toString(idx));
        if (test3) {
            System.out.println("TEST 3 PASSES");
        } else {
            System.out.println("!!!!!!! TEST 3 FAILS !!!!!!!");
        }

        System.out.println("----TEST 1-----");
        int[][] testArr06 = {{1, 2, 3}, {4, 5, 6}};
        int[][] t01 = FunWith2DArrays.split(testArr06, 1, 1);
        for (int[] row : t01) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        int[][] exp1 = {{1, 2}, {4, 5}};
        boolean split1 = true;
        if (t01.length == 2 && t01[0].length == 2) {
            for (int r = 0; r < t01.length; r++) {
                for (int c = 0; c < t01[0].length; c++) {
                    if (t01[r][c] != exp1[r][c]) {
                        split1 = false;
                    }
                }
            }
        } else {
            split1 = false;
        }
        if (split1) {
            System.out.println("TEST 1 PASSES");
        } else {
            System.out.println("!!!!!!! TEST 1 FAILS !!!!!!!");
        }

        System.out.println("\n----TEST 2-----");
        int[][] testArr07 = {{10, 11, 12, 13}, {20, 21, 22, 23}, {30, 31, 32, 33}};
        int[][] t02 = FunWith2DArrays.split(testArr07, 2, 1);
        for (int[] row : t02) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        int[][] exp2 = {{10, 11}, {20, 21}, {30, 31}};
        boolean split2 = true;
        if (t02.length == 3 && t02[0].length == 2) {
            for (int r = 0; r < t02.length; r++) {
                for (int c = 0; c < t02[0].length; c++) {
                    if (t02[r][c] != exp2[r][c]) {
                        split2 = false;
                    }
                }
            }
        } else {
            split2 = false;
        }
        if (split2) {
            System.out.println("TEST 2 PASSES");
        } else {
            System.out.println("!!!!!!! TEST 2 FAILS !!!!!!!");
        }

        System.out.println("\n----TEST 3-----");
        int[][] testArr08 = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18},
                {19, 20, 21, 22, 23, 24}
        };
        int[][] t03 = FunWith2DArrays.split(testArr08, 3, 2);
        for (int[] row : t03) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        int[][] exp3 = {{1, 2, 3}, {7, 8, 9}, {13, 14, 15}, {19, 20, 21}};
        boolean split3 = true;
        if (t03.length == 4 && t03[0].length == 3) {
            for (int r = 0; r < t03.length; r++) {
                for (int c = 0; c < t03[0].length; c++) {
                    if (t03[r][c] != exp3[r][c]) {
                        split3 = false;
                    }
                }
            }
        } else {
            split3 = false;
        }
        if (split3) {
            System.out.println("TEST 3 PASSES");
        } else {
            System.out.println("!!!!!!! TEST 3 FAILS !!!!!!!");
        }

        System.out.println("\n----TEST 4-----");
        int[][] t04 = FunWith2DArrays.split(testArr08, 2, 5);
        for (int[] row : t04) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        int[][] exp4 = {{1, 2, 3, 4, 5, 6}, {7, 8, 9, 10, 11, 12}, {13, 14, 15, 16, 17, 18}};
        boolean split4 = true;
        if (t04.length == 3 && t04[0].length == 6) {
            for (int r = 0; r < t04.length; r++) {
                for (int c = 0; c < t04[0].length; c++) {
                    if (t04[r][c] != exp4[r][c]) {
                        split4 = false;
                    }
                }
            }
        } else {
            split4 = false;
        }
        if (split4) {
            System.out.println("TEST 4 PASSES");
        } else {
            System.out.println("!!!!!!! TEST 4 FAILS !!!!!!!");
        }

        System.out.println("\n----TEST 5-----");
        int[][] t08 = FunWith2DArrays.split(testArr08, 0, 4);
        for (int[] row : t08) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        int[][] exp5 = {{1, 2, 3, 4, 5}};
        boolean split5 = true;
        if (t08.length == 1 && t08[0].length == 5) {
            for (int r = 0; r < t08.length; r++) {
                for (int c = 0; c < t08[0].length; c++) {
                    if (t08[r][c] != exp5[r][c]) {
                        split5 = false;
                    }
                }
            }
        } else {
            split5 = false;
        }
        if (split5) {
            System.out.println("TEST 5 PASSES");
        } else {
            System.out.println("!!!!!!! TEST 5 FAILS !!!!!!!");
        }

        System.out.println("\n----TEST 6-----");
        int[][] t09 = FunWith2DArrays.split(testArr08, 0, 0);
        for (int[] row : t09) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        int[][] exp6 = {{1}};
        boolean split6 = true;
        if (t09.length == 1 && t09[0].length == 1) {
            for (int r = 0; r < t09.length; r++) {
                for (int c = 0; c < t09[0].length; c++) {
                    if (t09[r][c] != exp6[r][c]) {
                        split6 = false;
                    }
                }
            }
        } else {
            split6 = false;
        }
        if (split6) {
            System.out.println("TEST 6 PASSES");
        } else {
            System.out.println("!!!!!!! TEST 6 FAILS !!!!!!!");
        }

        System.out.println("\n----TEST 7-----");
        int[][] t05 = FunWith2DArrays.split(testArr08, 3, 5);
        for (int[] row : t05) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        int[][] exp7 = {{1, 2, 3, 4, 5, 6}, {7, 8, 9, 10, 11, 12}, {13, 14, 15, 16, 17, 18}, {19, 20, 21, 22, 23, 24}};
        boolean split7 = true;
        if (t05.length == 4 && t05[0].length == 6) {
            for (int r = 0; r < t05.length; r++) {
                for (int c = 0; c < t05[0].length; c++) {
                    if (t05[r][c] != exp7[r][c]) {
                        split7 = false;
                    }
                }
            }
        } else {
            split7 = false;
        }
        if (split7) {
            System.out.println("TEST 7 PASSES");
        } else {
            System.out.println("!!!!!!! TEST 7 FAILS !!!!!!!");
        }

        System.out.println("\n----TEST 8-----");
        int[][] t10 = FunWith2DArrays.split(testArr08, 3, 0);
        for (int[] row : t10) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        int[][] exp8 = {{1}, {7}, {13}, {19}};
        boolean split8 = true;
        if (t10.length == 4 && t10[0].length == 1) {
            for (int r = 0; r < t10.length; r++) {
                for (int c = 0; c < t10[0].length; c++) {
                    if (t10[r][c] != exp8[r][c]) {
                        split8 = false;
                    }
                }
            }
        } else {
            split8 = false;
        }
        if (split8) {
            System.out.println("TEST 8 PASSES");
        } else {
            System.out.println("!!!!!!! TEST 8 FAILS !!!!!!!");
        }
        System.out.println("\n----TEST 9-----");
        int[][] t06 = FunWith2DArrays.split(testArr08, 4, 2);
        for (int[] row : t06) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        if (t06.length == 0) {
            System.out.println("TEST 9 PASSES");
        } else {
            System.out.println("!!!!!!! TEST 9 FAILS !!!!!!!");
        }
        System.out.println("\n----TEST 10-----");
        int[][] t07 = FunWith2DArrays.split(testArr08, 2, 6);
        for (int[] row : t07) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        if (t07.length == 0) {
            System.out.println("TEST 10 PASSES");
        } else {
            System.out.println("!!!!!!! TEST 10 FAILS !!!!!!!");
        }

        System.out.println("----TEST 1----");
        int[][] inverttest1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int[][] ts1 = FunWith2DArrays.invert(inverttest1);
        for (int[] row : ts1) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        int[][] invertexp1 = {{1, 5, 9}, {2, 6, 10}, {3, 7, 11}, {4, 8, 12}};
        boolean invert1 = true;
        if (ts1.length == 4 && ts1[0].length == 3) {
            for (int r = 0; r < ts1.length; r++) {
                for (int c = 0; c < ts1[0].length; c++) {
                    if (ts1[r][c] != invertexp1[r][c]) {
                        invert1 = false;
                    }
                }
            }
        } else {
            invert1 = false;
        }
        if (invert1) {
            System.out.println("TEST 1 PASSES");
        } else {
            System.out.println("!!!!!!! TEST 1 FAILS !!!!!!!");
        }
        System.out.println("\n----TEST 2----");
        System.out.println("original array should NOT be modified:");
        for (int[] row : inverttest1) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        int[][] invertexp2 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        boolean invert2 = true;
        if (inverttest1.length == 3 && inverttest1[0].length == 4) {
            for (int r = 0; r < inverttest1.length; r++) {
                for (int c = 0; c < inverttest1[0].length; c++) {
                    if (inverttest1[r][c] != invertexp2[r][c]) {
                        invert2 = false;
                    }
                }
            }
        } else {
            invert2 = false;
        }
        if (invert2) {
            System.out.println("TEST 2 PASSES");
        } else {
            System.out.println("!!!!!!! TEST 2 FAILS !!!!!!!");
        }
        System.out.println("\n----TEST 3----");
        int[][] inverttest2 = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18},
                {19, 20, 21, 22, 23, 24}
        };
        int[][] ts2 = FunWith2DArrays.invert(inverttest2);
        for (int[] row : ts2) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        int[][] invertexp3 = {{1, 7, 13, 19}, {2, 8, 14, 20}, {3, 9, 15, 21}, {4, 10, 16, 22}, {5, 11, 17, 23}, {6, 12, 18, 24}};
        boolean invert3 = true;
        if (ts2.length == 6 && ts2[0].length == 4) {
            for (int r = 0; r < ts2.length; r++) {
                for (int c = 0; c < ts2[0].length; c++) {
                    if (ts2[r][c] != invertexp3[r][c]) {
                        invert3 = false;
                    }
                }
            }
        } else {
            invert3 = false;
        }
        if (invert3) {
            System.out.println("TEST 3 PASSES");
        } else {
            System.out.println("!!!!!!! TEST 3 FAILS !!!!!!!");
        }
        System.out.println("\n---invert test3---");
        int[][] inverttest3 = {{10}};
        int[][] ts3 = FunWith2DArrays.invert(inverttest3);
        for (int[] row : ts3) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        int[][] invertexp4 = {{10}};
        boolean invert4 = true;
        if (ts3.length == 1 && ts3[0].length == 1) {
            for (int r = 0; r < ts3.length; r++) {
                for (int c = 0; c < ts3[0].length; c++) {
                    if (ts3[r][c] != invertexp4[r][c]) {
                        invert4 = false;
                    }
                }
            }
        } else {
            invert4 = false;
        }
        if (invert4) {
            System.out.println("TEST 4 PASSES");
        } else {
            System.out.println("!!!!!!! TEST 4 FAILS !!!!!!!");
        }

        int[][] testArr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {4, 6, 8, 3, 5}};
        int t001 = FunWith2DArrays.sumForRow(testArr, 0);
        System.out.println(t001);
        int t002 = FunWith2DArrays.sumForRow(testArr, 1);
        System.out.println(t002);
        int t003 = FunWith2DArrays.sumForRow(testArr, 2);
        System.out.println(t003);
        int[][] testArr002 = {{3, 4, 5}, {8, 9, 10}, {8, 3, 5}, {1, 2, 3}};
        int t004 = FunWith2DArrays.sumForRow(testArr002, 0);
        System.out.println(t004);
        int t005 = FunWith2DArrays.sumForRow(testArr002, 1);
        System.out.println(t005);
        int t006 = FunWith2DArrays.sumForRow(testArr002, 2);
        System.out.println(t006);
        int t007 = FunWith2DArrays.sumForRow(testArr002, 3);
        System.out.println(t007);
        if (t001 == 15 && t002 == 40 && t003 == 26 &&
                t004 == 12 && t005 == 27 && t006 == 16 && t007 == 6) {
            System.out.println("TEST PASSES");
        } else {
            System.out.println("!!!!!!! TEST FAILS !!!!!!!");
        }

        int[][] testArr0 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {4, 6, 8, 3, 5}};
        int t0001 = FunWith2DArrays.sumForColumn(testArr0, 0);
        System.out.println(t0001);
        int t0002 = FunWith2DArrays.sumForColumn(testArr0, 1);
        System.out.println(t0002);
        int t0003 = FunWith2DArrays.sumForColumn(testArr0, 2);
        System.out.println(t0003);
        int t0004 = FunWith2DArrays.sumForColumn(testArr0, 3);
        System.out.println(t0004);
        int t0005 = FunWith2DArrays.sumForColumn(testArr0, 4);
        System.out.println(t0005);
        int[][] testArr00002 = {{3, 4, 5}, {8, 9, 10}, {8, 3, 5}, {1, 2, 3}};
        int t0006 = FunWith2DArrays.sumForColumn(testArr00002, 0);
        System.out.println(t0006);
        int t0007 = FunWith2DArrays.sumForColumn(testArr00002, 1);
        System.out.println(t0007);
        int t0008 = FunWith2DArrays.sumForColumn(testArr00002, 2);
        System.out.println(t0008);
        if (t0001 == 11 && t0002 == 15 && t0003 == 19 && t0004 == 16 &&
                t0005 == 20 && t0006 == 20 && t0007 == 18 && t0008 == 23) {
            System.out.println("TEST PASSES");
        } else {
            System.out.println("!!!!!!! TEST FAILS !!!!!!!");
        }

        System.out.println("----TEST 1----");
        int[][] testArr00 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {4, 6, 8, 3, 5}};
        int changes = FunWith2DArrays.replaceEvensWithZero(testArr00);
        System.out.println("Number of changes: " + changes);
        System.out.println("2D Array modified:");
        for (int[] row : testArr00) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        int[][] exp11 = {{1, 0, 3, 0, 5}, {0, 7, 0, 9, 0}, {0, 0, 0, 3, 5}};
        boolean t1bool = true;
        for (int r = 0; r < testArr00.length; r++) {
            for (int c = 0; c < testArr00[0].length; c++) {
                if (testArr00[r][c] != exp11[r][c]) {
                    t1bool = false;
                }
            }
        }
        if (t1bool && changes == 8) {
            System.out.println("TEST 1 PASSES");
        } else {
            System.out.println("!!!!!!! TEST 1 FAILS !!!!!!!");
        }

        System.out.println("\n----TEST 2----");
        int[][] testArr12 = {{2, 2, 4, 4}, {6, 8, 8, 10}, {4, 6, 8, 2}, {4, 2, 4, 6}};
        changes = FunWith2DArrays.replaceEvensWithZero(testArr12);
        System.out.println("Number of changes: " + changes);
        System.out.println("2D Array modified:");
        for (int[] row : testArr12) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        int[][] exp12 = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        boolean t2bool = true;
        for (int r = 0; r < testArr12.length; r++) {
            for (int c = 0; c < testArr12[0].length; c++) {
                if (testArr12[r][c] != exp12[r][c]) {
                    t2bool = false;
                }
            }
        }
        if (t2bool && changes == 16) {
            System.out.println("TEST 2 PASSES");
        } else {
            System.out.println("!!!!!!! TEST 2 FAILS !!!!!!!");
        }

        System.out.println("\n----TEST 3----");
        int[][] testArr13 = {{1, 3, 5}, {7, 5, 9}};
        changes = FunWith2DArrays.replaceEvensWithZero(testArr13);
        System.out.println("Number of changes: " + changes);
        System.out.println("2D Array not modified:");
        for (int[] row : testArr13) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        int[][] exp13 = {{1, 3, 5}, {7, 5, 9}};
        boolean t3bool = true;
        for (int r = 0; r < testArr13.length; r++) {
            for (int c = 0; c < testArr13[0].length; c++) {
                if (testArr13[r][c] != exp13[r][c]) {
                    t3bool = false;
                }
            }
        }
        if (t3bool && changes == 0) {
            System.out.println("TEST 3 PASSES");
        } else {
            System.out.println("!!!!!!! TEST 3 FAILS !!!!!!!");
        }

        String[][] words00 = {{"hi", "bye", "stuff", "goo"}, {"time", "up", "you", "map"}, {"good", "low", "bow", "mom"}};
        ArrayList<String> returnedList = FunWith2DArrays.findStringsOfLength(words00, 3);
        System.out.println(returnedList);
        if (returnedList.size() == 7 && returnedList.get(0).equals("bye") && returnedList.get(1).equals("goo")
                && returnedList.get(2).equals("you") && returnedList.get(3).equals("map")
                && returnedList.get(4).equals("low") && returnedList.get(5).equals("bow")
                && returnedList.get(6).equals("mom")) {
            System.out.println("TEST 1 PASSES\n");
        } else {
            System.out.println("!!!!!!! TEST 1 FAILS !!!!!!!\n");
        }
        ArrayList<String> returnedList2 = FunWith2DArrays.findStringsOfLength(words00, 4);
        System.out.println(returnedList2);
        if (returnedList2.size() == 2 && returnedList2.get(0).equals("time") && returnedList2.get(1).equals("good")) {
            System.out.println("TEST 2 PASSES\n");
        } else {
            System.out.println("!!!!!!! TEST 2 FAILS !!!!!!!\n");
        }
        ArrayList<String> returnedList3 = FunWith2DArrays.findStringsOfLength(words00, 5);
        System.out.println(returnedList3);
        if (returnedList3.size() == 1 && returnedList3.get(0).equals("stuff")) {
            System.out.println("TEST 3 PASSES\n");
        } else {
            System.out.println("!!!!!!! TEST 3 FAILS !!!!!!!\n");
        }
        ArrayList<String> returnedList4 = FunWith2DArrays.findStringsOfLength(words00, 6);
        System.out.println(returnedList4);
        if (returnedList4.size() == 0) {
            System.out.println("TEST 4 PASSES\n");
        } else {
            System.out.println("!!!!!!! TEST 4 FAILS !!!!!!!\n");
        }
        String[][] words002 = {{"a", "b", "c"}, {"d", "e", "f"}, {"g", "h", "i"}, {"j", "k", "l"}};
        returnedList = FunWith2DArrays.findStringsOfLength(words002, 1);
        System.out.println(returnedList);
        if (returnedList.size() == 12 && returnedList.get(0).equals("a") && returnedList.get(1).equals("b")
                && returnedList.get(2).equals("c") && returnedList.get(3).equals("d")
                && returnedList.get(4).equals("e") && returnedList.get(5).equals("f")
                && returnedList.get(6).equals("g") && returnedList.get(7).equals("h")
                && returnedList.get(8).equals("i") && returnedList.get(9).equals("j")
                && returnedList.get(10).equals("k") && returnedList.get(11).equals("l")) {
            System.out.println("TEST 5 PASSES\n");
        } else {
            System.out.println("!!!!!!! TEST 5 FAILS !!!!!!!\n");
        }
        returnedList2 = FunWith2DArrays.findStringsOfLength(words002, 2);
        System.out.println(returnedList2);
        if (returnedList2.size() == 0) {
            System.out.println("TEST 6 PASSES\n");
        } else {
            System.out.println("!!!!!!! TEST 6 FAILS !!!!!!!\n");
        }

        Student student1 = new Student("Abby", 95);
        Student student2 = new Student("Barb", 98);
        Student student3 = new Student("Cole", 91);
        Student student4 = new Student("Dave", 92);
        Student student5 = new Student("Ellie", 98);
        Student student6 = new Student("Frank", 87);
        Student student7 = new Student("George", 93);
        Student student8 = new Student("Jim", 92);
        Student student9 = new Student("Kara", 95);
        Student student10 = new Student("Lenny", 98);
        Student student11 = new Student("Mona", 100);
        Student student12 = new Student("Nancy", 99);
        Student[][] chart = {{student1, student2, student3}, {student4, student5, student6}, {student7, student8, student9}, {student10, student11, student12}};
        double avg = FunWith2DArrays.classAverage(chart);
        System.out.println(avg);
        Student[][] chart2 = {{student1, student2}, {student4, student5}, {student8, student9}};
        double avg2 = FunWith2DArrays.classAverage(chart2);
        System.out.println(avg2);
        Student[][] chart3 = {{student6}};
        double avg3 = FunWith2DArrays.classAverage(chart3);
        System.out.println(avg3);
        if (avg > 94.833 && avg < 94.834 && avg2 > 94.999 && avg2 < 95.001 && avg3 > 86.999 && avg3 < 87.001) {
            System.out.println("TEST PASSES");
        } else {
            System.out.println("!!!!!!! TEST FAILS !!!!!!!");
        }

        int[][] testArr001 = { // true
                {1, 2, 3, 4},
                {1, 3, 4, 5},
                {3, 4, 5, 6}
        };
        int[][] testArr0002 = { // true
                {1, 2, 3, 4},
                {2, 3, 4, 6},
                {3, 4, 5, 6}
        };
        int[][] testArr003 = { // true
                {7, 7, 3, 4},
                {2, 3, 4, 5},
                {3, 4, 5, 6}
        };
        int[][] testArr004 = { // true
                {1, 2, 3, 4},
                {2, 3, 4, 5},
                {3, 4, 2, 2}
        };
        int[][] testArr005 = { // true
                {1, 2, 3, 4, 5},
                {2, 3, 9, 5, 6},
                {3, 4, 9, 6, 7},
                {4, 5, 6, 7, 8}
        };
        int[][] testArr006 = { // true
                {1, 2, 3, 4, 5},
                {2, 3, 4, 5, 6},
                {3, 4, 1, 1, 7},
                {4, 5, 6, 7, 8}
        };
        int[][] testArr007 = { // true
                {1, 2, 3, 4, 5},
                {2, 3, 4, 5, 6},
                {3, 4, 5, 6, 8},
                {4, 5, 6, 7, 8}
        };
        int[][] testArr008 = { // true
                {1, 2, 3, 4, 5},
                {2, 3, 4, 5, 6},
                {3, 4, 5, 6, 7},
                {4, 5, 6, 8, 8}
        };
        int[][] testArr009 = { // false
                {1, 2, 3, 4},
                {2, 3, 4, 5},
                {3, 4, 5, 6}
        };
        int[][] testArr010 = { // false
                {1, 2, 3, 4, 5},
                {2, 3, 4, 5, 6},
                {3, 4, 5, 6, 7},
                {4, 5, 6, 7, 8}
        };
        boolean test01 = FunWith2DArrays.consecutive(testArr001);
        System.out.println(test01);
        boolean test02 = FunWith2DArrays.consecutive(testArr0002);
        System.out.println(test02);
        boolean test03 = FunWith2DArrays.consecutive(testArr003);
        System.out.println(test03);
        boolean test04 = FunWith2DArrays.consecutive(testArr004);
        System.out.println(test04);
        boolean test05 = FunWith2DArrays.consecutive(testArr005);
        System.out.println(test05);
        boolean test06 = FunWith2DArrays.consecutive(testArr006);
        System.out.println(test06);
        boolean test07 = FunWith2DArrays.consecutive(testArr007);
        System.out.println(test07);
        boolean test08 = FunWith2DArrays.consecutive(testArr008);
        System.out.println(test08);
        boolean test09 = FunWith2DArrays.consecutive(testArr009);
        System.out.println(test09);
        boolean test10 = FunWith2DArrays.consecutive(testArr010);
        System.out.println(test10);
        if (test01 && test02 && test03 && test04 && test05 && test06 && test07 && test08 && !test09 && !test10) {
            System.out.println("\n--- ALL TESTS PASS! ---");
        } else {
            System.out.println("\n!!!!!! TEST FAIL!!!!!!!");
        }
    }
}