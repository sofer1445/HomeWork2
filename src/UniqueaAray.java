public class UniqueaAray {
    public static int[] ArrayNumbers(int[] arrayNumber) {
        boolean answer = false;
        for (int i = 0; i < arrayNumber.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arrayNumber[i] == arrayNumber[j]) {
                    answer = true;
                    break;
                } else {
                    answer = false;
                }
            }
            if (!answer) {
                System.out.print("," + arrayNumber[i]);
            }
        }
        return arrayNumber;
    }


    public static void main(String[] args) {
        int[] arrayNumber = {1, 4, 7, 1, 3, 4, 2, 9, 1};
        int arr[] = ArrayNumbers(arrayNumber);

    }
}

