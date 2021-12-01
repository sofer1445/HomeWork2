public class ArrayUpAndDown {
    public static int arrayNumberUpAndDown(int[] arrayUpDown) {
        int resultNumber = -1;
        int length = arrayUpDown.length;
        if (arrayUpDown[0] < arrayUpDown[1] && arrayUpDown[length - 1] < arrayUpDown[length - 2]) {
            int summit = whoIsTheBiggest(arrayUpDown);
            for (int i = 2; i < length - 2; i++) {
                if (arrayUpDown[i] > arrayUpDown[i - 1] || arrayUpDown[i] == summit) {
                    if (arrayUpDown[i] == arrayUpDown[length - i]) {

                        resultNumber = summit;
                    }
                    if (arrayUpDown[length - i] < arrayUpDown[length - i - 1] || arrayUpDown[length - i] == summit) {
                        if (arrayUpDown[length - i - 1] == arrayUpDown[i]) {

                            resultNumber = summit;
                        }
                    } else {
                        return resultNumber;
                    }
                } else {
                    return resultNumber;
                }
            }
        }
        return resultNumber;
    }

    public static int whoIsTheBiggest(int[] numbers) {
        int result = 0;
        int sum = 1;
        for (int i = 1; i < numbers.length; i++) {
            result = numbers[i];
            if (result > sum) {
                sum = result;


            }

        }
        return sum;

    }

    public static void main(String[] args) {
        int array[] = {1, 3, 5, 6, 12, 8, 3, 0};
        whoIsTheBiggest(array);
        int theAnswer = arrayNumberUpAndDown(array);
        System.out.println(theAnswer);

    }
}

