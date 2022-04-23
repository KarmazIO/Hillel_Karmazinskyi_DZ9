package com.dz9;

import java.util.Arrays;

public class KarmazinsktiDZ9_2 {
    public static void main(String[] args) {
        int rndm[] = new int[10];
        for (int i = 0; i < rndm.length; i++) {
            rndm[i] = (int) (Math.random() * 101);
        }
        System.out.println(Arrays.toString(rndm));
        shaker(rndm);
        System.out.println(Arrays.toString(rndm));
    }
    static void shaker(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=n-1; i >  0; i--){
            for(int j=i; j > (n-i -1); j--){
                if(arr[j-1] > arr[j]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
            for(int j=n -i; j < i; j++){
                if(arr[j+1] < arr[j]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            }
        }
    }
