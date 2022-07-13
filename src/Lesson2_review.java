package CS102;

public class Lesson2_review {
    public static void main(String[] args) {
        //*********************
      /*
      int[][] arr2D = {
                        {3, 5, 6},
                        {},
                        {-1, 5, 7},
                        {6, 8, 4, 9},
                        {0, 0, -4, 5, 2},
                        {5}
                     };

      //Determine if the following exist, and if they do determine the value.
      /*
      a. arr2D[1][0]        Doesnâ€™t exist or Value: _______
      b. arr2D[3][2]        Doesnâ€™t exist or Value: _______
      c. arr2D[arr2D[0][1]][arr2D[4][0]] Doesnâ€™t exist or Value: _______
      d. arr2D[3].length    Doesnâ€™t exist or Value: _______
      e. arr2D.length       Doesnâ€™t exist or Value: _______
      */
      /*
      //System.out.println(arr2D[1][0]);
      System.out.println(arr2D[3][2]);
      System.out.println(arr2D[arr2D[0][1]][arr2D[4][0]]);
      System.out.println(arr2D[3].length);
      System.out.println(arr2D.length);
      */

        //*****************
        //determine the output
      /*
      int[] arr1 = {3, 5, 7, 9, 11};
      int[] arr2 = {3, 5, 7, 9, 11};
      int[] arr3 = arr2;
      arr1[2] = 8;
      arr2[3] = 6;
      arr3[4] = 2;
      for (int i = 0; i < 5; i++)
      {
         System.out.println(arr1[i] + " " + arr2[i] + " " + arr3[i]);
      }
      */


        //******************
      /*
      int[][] arr2D = new int[4][5];
      for (int i = 0; i < arr2D.length; i++)
      {
         for (int j = 0; j < arr2D[i].length; j++)
         {
            arr2D[i][j] = i * j;
         }
      }
      for (int[] i : arr2D)
      {
         for (int j : i)
         {
            System.out.print(j + " ");
         }
         System.out.println();
      }
      */

        //*************
      /*
      //determine the output
      x(5, 7);
      x(5.0, 7);
      x(5, 7.0);
      x(5.0, 7.0);
      x(2, 2);
      */

        //****************
        System.out.println(aMethod(36, 96));
        System.out.println(aMethod(27, 84));
        anotherMethod(8, 6);
        anotherMethod(9, 12);
        anotherMethod(7);


        //*****************
        int[][][] arr3D = new int[2][3][4];
        for (int i = 0; i < arr3D.length; i++) {
            for (int j = 0; j < arr3D[i].length; j++) {
                for (int k = 0; k < arr3D[i][j].length; k++) {
                    arr3D[i][j][k] += i + j + k;
                }
            }
            for (int j = 0; j < arr3D.length; j++) {
                for (int k = 0; k < arr3D.length; k++) {
                    arr3D[i][j][k]++;
                }
            }
        }

        for (int[][] i : arr3D) {
            for (int[] j : i) {
                for (int k : j) {
                    System.out.print(k);
                }
                System.out.println();
            }
            System.out.println();
        }
//        System.out.println(getSum(10));
//        int[]arr = {2,1,50,10};
//        System.out.println(getArraySum(arr));
//        System.out.println(getArrayMax(arr));
//        System.out.println(getArrayAverage(arr));
//        displayArray(arr);
        int N = 10;

        fib(N);
    }


    public static void x(int a, int b) {
        System.out.println(a + b);
    }

    public static void x(double a, double b) {
        System.out.println(a * b);
    }
    /*System.out.println(aMethod(6,18));
      System.out.println(aMethod(27,84));
     */

    public static int aMethod(int i, int j) {
        while (i != 0 && j != 0) {
            if (i > j) {
                i %= j;
            } else {
                j %= i;
            }
        }
        if (i == 0) {
            return j;
        }
        if (j == 0) {
            return i; // return greatest common divisor
        }
        return 0;
    }

    /* anotherMethod(8,6); //Print 24
    anotherMethod(9,12);
    anotherMethod(7);
     */
    public static void anotherMethod(int i, int j) {
        if (i == 0 && j == 0) {
            System.out.println(0);
        } else {
            System.out.println(i * j / aMethod(i, j));
        } //9*12/3->36
    }

    public static void anotherMethod(int i) {
        System.out.println(anotherMethod(i, 2 * i, 3 * i));
        //anotherMethod(7,14,21)-> 42
    }

    public static int anotherMethod(int i, int j, int k) {
        return i + j + k;
    }

    //    a. Create a method that takes an integer n and returns the sum of the odd
//        integers from 1 to n.
//    public static int getSum(int n){
//        int result = 0;
//        for (int i = 1 ; i <=n; i+=2){
//            result +=i;
//        }
//        return result;
//    }
//        b. Create a method that takes an array of ints and returns the sum of the
//        elements in the array.
//    public static int getArraySum(int[] arr) {
//        int result = 0;
//        for (int element : arr) {
//            result += element;
//        }
//        return result;
//    }
//        c. Create a method that takes an array of ints and returns the maximum of the
//        elements in the array.
//    public static int getArrayMax (int[] arr){
//        int result = arr[0];
//        for (int element : arr){
//            if (element>result){
//                result = element;
//            }
//        }
//        return result;
//    }
//        d. Create a method that takes an array of ints and returns the average of the
//        elements in the array.
//    public static double getArrayAverage(int[] arr){
//        double average = 0;
//        return (double) getArraySum(arr)/arr.length;
//    }
//        e. Create a method that takes an array of ints and displays the sum, maximum,
//        and average of the elements in the array.
//    public static void displayArray(int[] arr) {
//        System.out.println("Sum:" + getArraySum(arr));
//        System.out.println("Max" + getArrayMax(arr));
//        System.out.println("Average" + getArrayAverage(arr));
//    }
//        f. Prompt the user for a positive integer n that is less than 75.
//        Then print the nth fibonacci number.
//        (The first two fibonacci numbers are 1 and every fibonacci number afterward is the sum of the
//        previous two.)
//        1,1,2,3,5,8,13,21,34,55,...
//        1,2,3,4,5,6,,7, 8, 9,10
    public static void fib(int N) {
        int num1 = 0, num2 = 1;

        int counter = 0;

        while (counter < N) {

            System.out.print(num1 + " ");

            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }
}
