package Loop;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();


        /*

         *
         * *
         * * *
         * * * *
         * * * * *

         */
//        for(int i=0;i<row;i++){
//            for(int j=0;j<=i;j++){
//            System.out.print("*");
//        }
//            System.out.println();
//        }



        /*

        *****
        ****
        ***
        **
        *


         */
//      for(int i=row;i>0;i--){
//          for(int j=1;j<=i;j++){
//              System.out.print("*");
//          }
//          System.out.println();
//      }

/*

1
1 2
1 2 3
1 2 3 4
1 2 3  4 5

 */

//        for(int i=1;i<=row;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j);
//        }
//            System.out.println();
//        }
        /*


1234
123
12
1

        */

        for(int i=row;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);

            }
            System.out.println();
        }
    }
}
