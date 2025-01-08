package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }


    public static boolean isPalindrome(int num) {
        // stringe çevir +
        // baştan sonra string karakterlerini for ile bir arraye at
        // sondan başa string karakterlerini for ile ayrı bir arraye at
        // iki array birbirinin aynısı mı kontrol et?

        String number = String.valueOf(Math.abs(num));
        char[] numberArr =  number.toCharArray();
        char[] array1 = new char[number.length()];
        char[] array2 = new char[number.length()];

        for(int i = 0 ; i<number.length(); i++){
            array1[i] = numberArr[i];
        }

        for(int i = number.length() - 1 , k = 0 ; i>= 0; i--, k++){
            array2[k] = numberArr[i];
        }

        return Arrays.equals(array1, array2);
    }

    public static boolean isPerfectNumber(int num){
        if(num < 0){
            return false;
        }
        //tam bölen yarısından fazla olamaz
        //yarısına kadar tam bölenleri suma ekle

        int sum = 0;
        for(int i = 1; i <= num/2; i++){
            if(num % i == 0){
                sum += i;
            }

        }
        return sum == num ;
    }

    public static String numberToWords(int number){
        if(number < 0){
            return "Invalid Value";
        }
        // 0 : "Zero" , 1: "One" ... , 9: "Nine"
        // for içinde tek tek sayının elemanlarına bak
        // switchle 0..9 hangisine denk geliyorsa yaz

        String numberStr = String.valueOf(number);
        char[] numberArr = numberStr.toCharArray();
        String string = "";

        for (char c : numberArr) {
            switch (c) {
                case ('0'):
                    string += "Zero ";
                    break;
                case ('1'):
                    string += "One ";
                    break;
                case ('2'):
                    string += "Two ";
                    break;
                case ('3'):
                    string += "Three ";
                    break;
                case ('4'):
                    string += "Four ";
                    break;
                case ('5'):
                    string += "Five ";
                    break;
                case ('6'):
                    string += "Six ";
                    break;
                case ('7'):
                    string += "Seven ";
                    break;
                case ('8'):
                    string += "Eight ";
                    break;
                case ('9'):
                    string += "Nine ";
                    break;
            }
        }

        return string.trim();

    }



}


