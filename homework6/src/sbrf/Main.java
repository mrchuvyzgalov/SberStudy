package sbrf;

import sbrf.myinteger.MyInteger;
import sbrf.myinteger.MyIntegerDifferentDigits;
import sbrf.myinteger.MyIntegerPrimeDivisors;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyInteger[] arr1 = new MyIntegerPrimeDivisors[5];
        arr1[0] = new MyIntegerPrimeDivisors(120);
        arr1[1] = new MyIntegerPrimeDivisors(30);
        arr1[2] = new MyIntegerPrimeDivisors(119);
        arr1[3] = new MyIntegerPrimeDivisors(77);
        arr1[4] = new MyIntegerPrimeDivisors(31);
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        MyInteger[] arr2 = new MyIntegerDifferentDigits[5];
        arr2[0] = new MyIntegerDifferentDigits(34334);
        arr2[1] = new MyIntegerDifferentDigits(212222);
        arr2[2] = new MyIntegerDifferentDigits(111111);
        arr2[3] = new MyIntegerDifferentDigits(121314);
        arr2[4] = new MyIntegerDifferentDigits(112341);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
