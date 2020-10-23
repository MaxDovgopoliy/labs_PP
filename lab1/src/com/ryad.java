package com;
/**
 * This main class is created for building, and working with intervals
 **/
public class ryad {
    /**
     * The first number of this interval
     **/
    private int num0;
    /**
     * The last number of this interval
     **/
    private int num1;
    /**
     * Length of array which getFibonacciNums() returns
     **/
    private int num2;
/**
 * Single constructor
 * @param num0 first number of this interval <p>
 * @param num1 last number of this interval <p>
 * @param num2 length of array which getFibonacciNums() returns
 *   **/
    public ryad(int num0, int num1, int num2) {
        this.num0 = num0;
        this.num1 = num1;
        this.num2 = num2;
    }

    /**
     * @return first number of this interval
     **/
    public int getNum0() {
        return num0;
    }
    /**
     * @return second number of this interval
     **/
    public void setNum0(int num0) {
        this.num0 = num0;
    }
    /**
     * @return length of array which getFibonacciNums() reurn
     **/
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }


    /**
     * Prints all EVEN and ODD numbers of this interval through the space
     **/
    public void printOddNums() {
        System.out.println("непарні:");
        for (int i = this.num0; i <= this.num1; i++) {
            if (i % 2 != 0)
                System.out.print(i+ " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("парні:");
        for (int i = this.num1; i >= this.num0; i--) {
            if (i % 2 == 0)
                System.out.print(i+ " ");
        }
        System.out.println();
    }
    /**
     * Prints  an array of Fibonacci's numbers which starts
     * with last two numbers of this interval
     * and Prints percentage of ODD numbers in this interval
     **/
    public void Fibon() {
        System.out.println("Ряд Фібоначі:");
        int neparne = 0;
        int fibonacci0 ,fibonacci1,fibonacci2;
        int vidsotok_neparnuh;
        int vidsotok_parnuh;
        int lenth=this.num2;
        if (this.num1 % 2 != 0) {
            fibonacci0 = this.num1;
            fibonacci1 = this.num1 - 1;
        } else {
            fibonacci0 = this.num1 - 1;
            fibonacci1 = this.num1;
        }

        System.out.print(fibonacci0 + " " + fibonacci1 + " ");
        for (int i = 1; i <= lenth; i++) {
            fibonacci2 = fibonacci0 + fibonacci1;
            System.out.print(fibonacci2 + " ");
            if (fibonacci2 % 2 != 0)
                neparne = neparne + 1;
            fibonacci0 = fibonacci1;
            fibonacci1 = fibonacci2;

        }

        vidsotok_neparnuh = (100 / lenth) * neparne;
        vidsotok_parnuh = 100 - vidsotok_neparnuh;
        System.out.println();
        System.out.println("Процент непарних = " +vidsotok_neparnuh+ "%");
        System.out.println("Процент парних = " +vidsotok_parnuh+ "%");
    }
}