
package com.company;
import com.ryad;
import java.util.Scanner;
/**
 * Lab №1
 * @author Max Dovgopolyi
 */
    public class Main {
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            /**
             * task 2
             */
             class druge {
                public int a;
                public char b;
            }
            druge obj = new druge();
            System.out.println(obj.a + "\n" + obj.b);
                /**
                 * task 3
                */

            int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
            System.out.println(a + ", " + b + ", " + c);

            /**
             * task4
             */
            System.out.println("введіть перше число,друге та довжину р'яду Фібоначі");
            ryad r1=new ryad(in.nextInt(),in.nextInt(),in.nextInt());

            r1.printOddNums();
            r1.Fibon();




        }
    }

