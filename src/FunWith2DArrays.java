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
                    return new int[] {r, c};
                }
            }
        }
        return new int[] {-1,-1};
    }

    public static int[][] split(int[][] arr, int row, int col) {
        int[][] nums = new int[row + 1][ col + 1];
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
}