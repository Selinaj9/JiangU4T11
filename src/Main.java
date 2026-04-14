public class Main {
    public static void main(String[] args) {
        String[][] seatingChart = {
                {"Abby", "Don", "George", "Kim"},
                {"Brian", "Elenor", "Harry", "Lenny"},
                {"Cathy", "Fred", "Jill", "Matt"}
        };

        seatingChart[1][2] = "Paul";

        String temp = seatingChart[0][0];
        seatingChart[0][0] = seatingChart[2][3];
        seatingChart[2][3] = temp;

        String[] temp2 = seatingChart[0];
        seatingChart[0] = seatingChart[1];
        seatingChart[1] = temp2;

        for (String[] row : seatingChart) {
            for (String word : row) {
                System.out.print(word + " ");
            }
            System.out.println();
        }
        System.out.println(seatingChart[0][2] + seatingChart[2][0]);

        int[][] arr1 = new int[2][3];
        String[][] arr2 = new String[3][2];

        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;
        arr1[1][0] = 4;
        arr1[1][1] = 5;
        arr1[1][2] = 6;

        for (int[] row : arr1) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        arr2[0][0] = "a";
        arr2[0][1] = "b";
        arr2[1][0] = "c";
        arr2[1][1] = "d";
        arr2[2][0] = "e";
        arr2[2][1] = "f";

        for (String[] row : arr2) {
            for (String word : row) {
                System.out.print(word + " ");
            }
            System.out.println();
        }
        System.out.println(arr1[0][2] + arr2[2][0]);
    }
}