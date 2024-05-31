import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        String[] numStrings = Arrays.stream(numbers)
                                   .mapToObj(String::valueOf)
                                   .toArray(String[]::new);
        
        mergeSort(numStrings, 0, numStrings.length - 1);
        
        StringBuilder sb = new StringBuilder();
        for (String num : numStrings) {
            sb.append(num);
        }
        
        if (sb.toString().startsWith("0")) {
            return "0";
        }
        return sb.toString();
    }
    
    private void mergeSort(String[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    
    private void merge(String[] arr, int left, int mid, int right) {
        int i = left, j = mid + 1;
        String[] temp = new String[right - left + 1];
        int k = 0;
        
        while (i <= mid && j <= right) {
            if (compareStrings(arr[i], arr[j]) <= 0) {
                temp[k++] = arr[j++];
            } else {
                temp[k++] = arr[i++];
            }
        }
        
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        
        for (int l = left; l <= right; l++) {
            arr[l] = temp[l - left];
        }
    }
    
    private int compareStrings(String a, String b) {
        String ab = a + b;
        String ba = b + a;
        return ab.compareTo(ba);
    }
}
