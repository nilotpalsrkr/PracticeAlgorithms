package other.general;

public class MergeSort {

    public void mergeSort(int[] a) {
        int length = a.length;
        int mid  = length/2;

        int[] leftArray = new int[mid];
        int[] rightArray = new int[length - mid];

        for (int i = 0; i < mid ; i++) {
            leftArray[i] = a[i];
        }
        for (int i = mid; i < length; i++) {
            rightArray[i] = a[i];
        }

        mergeSort(leftArray);
        mergeSort(rightArray);

        merge( a, leftArray,  rightArray);
    }

    private void merge(int[] a, int[] leftArray, int[] rightArray) {
        int left = 0, right=0;
        int k=0;
        while(left<leftArray.length || right<rightArray.length ) {
            if(leftArray[left] < rightArray[right]) {
                a[k++] = leftArray[left++];
            }
            else {
                a[k++] = rightArray[right++];
            }
        }
        while(left < leftArray.length) {
            a[k++] = leftArray[left++];
        }
        while(right < rightArray.length) {
            a[k++] = rightArray[right++];
        }
    }
}
