import java.sql.Array;

public class Intersection {
    public static void main(String[] args) {
        int[] leadingArray = {10, 32, 22, 11, 99, 43, 87};
        int[] subsetArray = {17, 29, 39, 49};
        arrayIntersection(leadingArray, subsetArray);
        boolean answer = Strangers(leadingArray, subsetArray);
        System.out.println(answer);


    }

    public static int[] arrayIntersection(int[] firstArray, int[] secondArray) {
        int arrayLength = firstArray.length;
        int arrayTwo = secondArray.length;
        int counter = 0;
        int[] intersection = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < arrayTwo; j++) {
                if (firstArray[i] == secondArray[j]) {
                    intersection[i] = firstArray[i];
                    counter++;
                }

            }
        }
        int length = intersection.length;
        int[] newArray = new int[counter];
        for (int j = 0; j < newArray.length; ) {
            for (int i = 0; i < length; i++) {
                if (intersection[i] != 0) {
                    newArray[j] = intersection[i];
                    j++;

                }
            }
        }
        return newArray;
    }

    public static boolean Strangers(int[] Array, int[] arrayTwo) {
        int[] resultArray = arrayIntersection(Array, arrayTwo);
        if (resultArray.length == 0) {
            return true;
        } else {
            return false;
        }
    }
}
