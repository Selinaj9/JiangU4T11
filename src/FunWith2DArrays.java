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
}