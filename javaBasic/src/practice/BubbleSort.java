package practice;

import java.util.Arrays;

public class BubbleSort {

    void bubbleSort(int[] arr) {
    int temp = 0;
        for(int i = 0; i< arr.length; i++) {
            for(int j=0; j < arr.length-1; j++) {
                if(arr[j-1] < arr[j]) {
                    
                    temp = arr [j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
