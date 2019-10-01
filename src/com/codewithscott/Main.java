package com.codewithscott;

public class Main {

    public static int maxOfTwoNumbers(int num1, int num2){
        int answer;
        if(num1 > num2){
            answer = num1;
        } else {
            answer = num2;
        }
        return answer;
    }

    public static int maxOfThree(int num1, int num2, int num3){
        int answer;
        if(num1 > num2 && num1 > num3){
            answer = num1;
        } else if(num2 > num1 && num2 > num3){
            answer = num2;
        } else {
            answer = num3;
        }
        return answer;
    }

    public static Boolean isCharacterAVowel(char letter, Boolean isAVowel){

        switch(letter) {
            case 'A':
            case 'a':
                isAVowel = true;
                break;
            case 'E':
            case 'e':
                isAVowel = true;
                break;
            case 'I':
            case 'i':
                isAVowel = true;
                break;
            case 'O':
            case 'o':
                isAVowel = true;
                break;
            case 'U':
            case 'u':
                isAVowel = true;
                break;
            default:
                System.out.println("Not a char");
        }

        return isAVowel;
    }

    public static int numberOfArgs(int ... a){
        int total = a.length;
        return total;
    }

    public static String reverseString(String myString){
        String outputString =  new StringBuilder(myString).reverse().toString();
        System.out.println(outputString);
        return outputString;
    }




    public static void main(String[] args) {
	// write your code here

//          System.out.println(maxOfTwoNumbers(3, 2));
//          System.out.println(maxOfThree(6, 5, 4));
//          System.out.println(isCharacterAVowel('u', false));
//        Write a method that returns the number of arguments passed to it when called.

//        System.out.println(numberOfArgs(1,2,3,4));

        reverseString("Hello Moto");
    }
}
