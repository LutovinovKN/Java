package Seminar_1.untitled.src;

import java.util.Arrays;
import java.util.Scanner;

class Task0 {
    public static void main(String[] args) {
        int[] array = new int[]{1,1,0,1,1,1};
        int count = ex2(array);
        System.out.println(count);
        String s = "Добро пожаловать на курс по Java";
        System.out.println(ex3(s));
        System.out.println(ex4(5, 0));
        int[] arr = new int[]{3,2,5,3};
        int val = 3;
        int[] res = ex5(arr, val);
        System.out.println(Arrays.toString(res));
    }


    public static int ex2(int[] arr){
        int maxCount = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1){
                count++;
            } else {
                if (maxCount < count){
                    maxCount = count;
                }
                count = 0;
            }

        }
        if (maxCount < count){
            maxCount = count;
        }
        return  maxCount;
    }
    public static String ex3(String s){
        String[] arr = s.split(" ");
        String res = "";
        for (int i = arr.length-1; i >= 0 ; i--) {
            res += arr[i] + " ";
        }
        return res;
    }

    public static double ex4(int a, int b){
        if (b == 0) {
            return 1;
        }
        if (a == 0 || a == 1){
            return a;
        }
        double a1 = a;
        if (b < 0) {
            b = -b;
            a1 = 1 / a1;
        }

        double res = 1;
        for (int i = 0; i < b; i++) {
            res *= a1;
        }
        return res;
    }

    public static int[] ex5(int[] arr, int val){
        int[] res = new int[arr.length];
        Arrays.fill(res, val);
        System.out.println(Arrays.toString(res));
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] != val){
                res[j++] = arr[i];
            }
        }
        return res;
    }
}