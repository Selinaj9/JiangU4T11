import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FunWith2DArrays {

    public static int totalElements(int[][] arr) {
        return arr.length * arr[0].length;
    }

    public static void fourCorners(String[][] words) {
        System.out.println(words[0][0]);
        System.out.println(words[0][words[0].length - 1]);
        System.out.println(words[words.length - 1][0]);
        System.out.println(words[words.length - 1][words[words.length - 1].length - 1]);
    }

    public static void swapFrontAndBackRows(String[][] words) {
        String[] temp = words[0];
        words[0] = words[words.length - 1];
        words[words.length - 1] = temp;
    }

    public static double average(int[][] numarr) {
        int sum = 0;
        for (int[] nums : numarr) {
            for (int num : nums) {
                sum += num;
            }
        }
        return (double) sum / (numarr.length * numarr[0].length);
    }

    public static int edgeSum(int[][] numarr) {
        int sum = 0;
        for (int i = 0; i < numarr.length; i++) {
            for (int j = 0; j < numarr[i].length; j++) {
                if (i == 0 || i == numarr.length - 1) {
                    sum += numarr[i][j];
                } else if (j == 0 || j == numarr[i].length - 1) {
                    sum += numarr[i][j];
                }
            }
        }
        return sum;
    }

    public static int[] indexFound(String[][] words, String target) {
        for (int c = 0; c < words[0].length; c++) {
            for (int r = 0; r < words.length; r++) {
                if (words[r][c].equals(target)) {
                    return new int[]{r, c};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static int[][] split(int[][] arr, int row, int col) {
        int[][] nums = new int[row + 1][col + 1];
        if (row > arr.length - 1 || col > arr[0].length - 1) {
            return new int[0][0];
        }
        for (int r = 0; r <= row; r++) {
            for (int c = 0; c <= col; c++) {
                nums[r][c] = arr[r][c];
            }
        }
        return nums;
    }

    public static int[][] invert(int[][] arr) {
        int[][] invert = new int[arr[0].length][arr.length];
        for (int c = 0; c < arr[0].length; c++) {
            for (int r = 0; r < arr.length; r++) {
                invert[c][r] = arr[r][c];
            }
        }
        return invert;
    }

    public static int sumForRow(int[][] arr, int row) {
        int sum = 0;
        for (int c = 0; c < arr[0].length; c++) {
            sum += arr[row][c];
        }
        return sum;
    }

    public static int sumForColumn(int[][] arr, int col) {
        int sum = 0;
        for (int r = 0; r < arr.length; r++) {
            sum += arr[r][col];
        }
        return sum;
    }

    public static int replaceEvensWithZero(int[][] arr) {
        int count = 0;
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[0].length; c++) {
                if (arr[r][c] % 2 == 0) {
                    arr[r][c] = 0;
                    count++;
                }
            }
        }
        return count;
    }

    public static ArrayList<String> findStringsOfLength(String[][] wordChart, int len) {
        ArrayList<String> words = new ArrayList<>();
        for (String[] row : wordChart) {
            for (String word : row) {
                if (word.length() == len) {
                    words.add(word);
                }
            }
        }
        return words;
    }

    public static double classAverage(Student[][] seatingChart) {
        int sum = 0;
        for (Student[] students : seatingChart) {
            for (Student student : students) {
                sum += student.getGrade();
            }
        }
        return (double) sum / (seatingChart.length * seatingChart[0].length);
    }

    public static boolean consecutive(int[][] arr) {
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[0].length; c++) {
                if (r < arr.length - 1 && arr[r][c] == arr[r + 1][c] || c < arr[0].length - 1 && arr[r][c] == arr[r][c + 1]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean magicSquare(int[][] arr) {
        int sum = 0;
        for (int c = 0; c < arr.length; c++) {
            sum += arr[0][c];
        }
        Set<Integer> seen = new HashSet<>();
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[0].length; c++) {
                if (!seen.add(arr[r][c])) {
                    return false;
                }
            }
        }

        int diag = 0;
        int altDiag = 0;
        for (int r = 0; r < arr.length; r++) {
            int hor = 0;
            for (int c = 0; c < arr[0].length; c++) {
                hor += arr[r][c];
                if (r == c) {
                    diag += arr[r][c];
                }
                if (r + c == arr.length - 1) {
                    altDiag += arr[r][c];
                }
            }

            if (hor != sum) {
                return false;
            }
        }

        if (diag != sum || altDiag != sum) {
            return false;
        }

        for (int c = 0; c < arr[0].length; c++) {
            int ver = 0;
            for (int r = 0; r < arr.length; r++) {
                ver += arr[r][c];
            }
            if (ver != sum) {
                return false;
            }
        }
        return true;
    }
}