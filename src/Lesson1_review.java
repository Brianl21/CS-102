package CS102;

public class Lesson1_review {
    public static void main(String[] args) {

//            //Determine what the following will do for:
//      /*
//      i = 3
//      i = 2
//      i = 4
//      i = 10
//      */
//      /*
//      int i = 3;
//      if (i <= 3)
//      {
//          System.out.println(i * 2); //print 6
//          i++; // i=4
//          if (i == 4)
//          {
//              System.out.println(i); // print 4
//          }
//          else
//          {
//              System.out.println(i % 2);
//              System.exit(0); //exits the program
//          }
//      }
//      else if (i < 10)
//      {
//          System.out.println(i); // print 4
//          i *= 2; / i = 8
//      }
//      else {System.exit(0);} //exits the program
//
//      if (i == 4)
//      {
//          System.out.println(i + " is 4"); // print 4 is 4
//      }
//      System.out.println(i); // print 4
//      */
//       output :
//       when i = 3
//        6
//        4
//        4 is 4
//        4
//
//            /**********/
//            //Determine the output of the following:
//            for (int i = 0; i < 20; i++)
//            {
//                if (i == 15 || i == 3) {continue;}
//                if (i % 5 == 0) {System.out.print(i % 4);}
//                else {System.out.println(i % 5);}
//            }
//            /*
//            01
//            2
//            4
//            11
//            2
//             */
//
//
//            /*********/
//            //Determine the output of the following:
//            for (int i = 0; i < 10; i++)
//            {
//                int j = i;
//                switch(j)
//                {
//                    case 4:
//                    case 0:
//                    {
//                        j++;
//                    }
//                    case 1:
//                    {
//                        j++;
//                        break;
//                    }
//                    case 2:
//                    {
//                        j = 5;
//                    }
//                    case 3:
//                    {
//                        j *= 2;
//                    }
//                    case 9:
//                    case 7:
//                    {
//                        break;
//                    }
//                    default:
//                    {
//                        j %= 5;// j = 3
//                    }
//                }
//                System.out.println(i + " " + j);
//            }
//            /*
//            Output:
//            0 2
//            1 2
//            2 10
//            3 6
//            4 6
//            5 0
//            6 1
//            7 7
//            8 3
//            9 9
//             */
//
//
//            /**********/
//            //Determine the output of the following:
//            for (int i = 3; i < 15; System.out.println(i))
//            {
//                i *= 2;
//                if (i == 6)
//                {
//                    i -= 5;
//                }
//                else if (i == 2)
//                {
//                    i -= 5;
//                }
//                else if (i < 0)
//                {
//                    i = 0;
//                }
//                else if (i == 0)
//                {
//                    i += 7;
//                }
//            }
            /*
            Output
            1
            -3
            0
            7
             */

        /**************/
      /*
      Create a program that prints all ordered pairs of integers (i, j) with 0 <= i <= j <= 25.
      */
        int i = 0, j = 0;
        for (i = 0; j <= i; i++) {
            for (j = i; j <= 25; j++) {
                System.out.println("(" + i + "," + j + ")");
            }
        }
        /*
      Create a program that prints all ordered triples of integers (i, j, k) satisfying
      0 <= i <= 5, i <= j <= 2 * i, and j <= k <= 2 * j.
      */
//        int i=0,j=0,k=0;
//        for (i=0;i<=5;i++){
//            for (j=i;j<=2*i;j++){
//                for (k=j;k<=2*j;k++){
//                    System.out.println("(" + i + "," + j + ","+k+ ")");
//                }
//            }
//        }
        /*
      Print the first 100 prime numbers.
      */
//            int count = 0;
//        for (int i=2; count<100; i++){
//            boolean isPrime = true;
//            for (int j =2 ; j<i; j++){
//                if (i%j==0){
//                    isPrime = false;
//                    break;
//                }
//            }
//            if (isPrime){
//                System.out.println(i);
//                count++;
//            }
//        }
    }
}
