package other.general;

import java.util.Arrays;

/*
* Arrange an array such that all the elements smaller than x are at left of x and all the elements greater than x are on the right of x.
 * */
public class AllElementGreaterThanXIsOnLeft {
    public void allElementGreaterThanXIsOnLeft(int arr[], int indexOfElement) {
        int length = arr.length;
        swap(arr, indexOfElement, length-1);
        indexOfElement = length-1;
        int i = 0, j = length - 2;
        for(; i< length - 2 && i <= j;  ) {
            if(arr[i] > arr[indexOfElement]) {
                swap(arr, i, j--);
            } else {
                i++;
            }
        }
        if(arr[length-1] < arr[i]) {
            swap(arr, i, length-1);
        }

    }
    public void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] =  arr[index2];
        arr[index2] = temp;
    }
}
