package d.f;

import java.util.Arrays;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        // PART 1
        // 1.1)
        // TODO init it's array by new with size 4.
        float[] firstArray = new float[4];

        // TODO insert some value to start of array and to end of array.
        firstArray[0] = 1;
        firstArray[firstArray.length - 1] = 4;

        /// TODO init and fill it's array with any values. Use {} syntax.
        int[] intArray = {4, 2, 3, 1};

        // 1.2)
        int[] intArrayCopy = {}; // TODO copy "intArray". Use copyOf...
        intArrayCopy = Arrays.copyOf(intArray, intArray.length);

        // 1.3)
        // TODO sort "intArrayCopy", use Arrays sort.
        Arrays.sort(intArrayCopy);

        // 1.4)
        // TODO print "intArrayCopy", use Arrays toString.
        System.out.println(Arrays.toString(intArrayCopy));

        // 1.5)
        // TODO compare "intArray"  and "intArrayCopy", use Arrays equals. Print "Arrays equals" or "Arrays not equals".
        if (intArray.equals(intArrayCopy)) {
            System.out.println("Arrays equals");
        } else {
            System.out.println("Arrays not equals");
        }

        // PART 2
        int[] testArray = {1, 3, 5, 7, 8, 6, 4, 2, 0};

        // Print array values in cycle.
        for (int value : testArray) {
            System.out.print(value + " ");
        }

        // 2.1)
        // TODO calc sum of all array elements and print result.
        int sumOfArrElements = 0;
        for (int value : testArray) {
            sumOfArrElements += value;
        }
        System.out.println("\n" + sumOfArrElements + " - summ of all elements");
        // 2.2)
        // TODO calc sum of all numbers with odd indexes and print result.
        int sumOfOdd = 0;
        for (int i = 0; i < testArray.length; i++) {
            if (testArray[i]%2 != 0) {
                sumOfOdd += testArray[i];
            }
        }
        System.out.println(sumOfOdd + " - odd of testArray");


        // 2.3)
        // TODO find max value in array.
        Arrays.sort(testArray);
        System.out.println(testArray[testArray.length - 1] + "- max value of testArray");

        // PART 3

        //3.1
        // TODO create two-dimensional array with size [3][4]
        int [][] twoDimArr = new int[3][4];
        //3.2
        // TODO fill array with any numbers in cycles.
        int znach = 0;
        for (int x = 0; x < 3; x++)
            for (int y = 0; y < 4; y++) {
                twoDimArr[x][y] = znach;
                znach++;

            }

        //3.3
        // TODO calc sum of all array elements and print result.
        int twoDimArrSum = 0;
        for (int x = 0; x < 3; x++)
            for (int y = 0; y < 4; y++) {
                twoDimArrSum += twoDimArr[x][y];
            }
        System.out.println(twoDimArrSum + " - sum of two dimensional");

        // PART 4*

        long[][] matrix = new long[9][9];

        int ratio = 0;
        for (long[] row : matrix) {
            Arrays.fill(row, ++ratio);
        }

        int sum = 0;
        // TODO* calc sum only max and min values of matrix by expression: 2 < i <= 5 and only every third j value.
        System.out.println(sum);
    }
    }

