package com.cwiczenia;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random generator = new Random();
        int arr [] = new int [10];
        for(int i=0; i<arr.length; i++) {

            arr [i] = randomValue(100,1000);
        }
        printArray(arr);
        sortArray(arr);
        System.out.println();
        printArray(arr);
        drawSquare();
    }

    public static int randomValue(int leftBound, int rightBound){
        Random random = new Random();
        int x = random.nextInt(rightBound - leftBound + 1);
        int y = x + leftBound;
        return y;
    }
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static int [] sortArray(int [] arr){
        int tmp;
        for (int j = 0; j < arr.length; j++) {
            for(int i = 0; i < arr.length - 1; i++){
                if(arr[i] > arr [i + 1]){
                    tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                }
            }
        }
        return arr;
    }
    public static void drawSquare(){
        Scanner sc = new Scanner(System.in);
        int n;

        do{
            System.out.println("Podaj n ");
            n = sc.nextInt();
            if(n >= 5 && n%2 != 0){
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n; j++) {

                        if(i == 1 || j == 1 || i == n || j == n || i == j){
                            System.out.print("*");
                        }else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }else{
                System.out.println("Podane n musi być nie mniejsze niż 5 i nieparzyste. Wprowadź ponownie n.");
            }
        }while(n < 5 || n%2 == 0);
    }
}