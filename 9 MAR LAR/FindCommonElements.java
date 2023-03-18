package Lab9Mar;
import java.util.*;

public class FindCommonElements {

    public static void main(String[] args) {
        
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 3, 4, 7, 10};
        int[] arr3 = {3, 5, 7, 8, 9};
        int i = 0, j = 0, k = 0;

        // Initialize an ArrayList to store the common elements
        List<Integer> commonElements = new ArrayList<>();
        while (i < arr1.length && j < arr2.length && k < arr3.length) {

            // If the current element is common to all arrays, add it to the list
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                commonElements.add(arr1[i]);
                i++;
                j++;
                k++;
            }
            else if (arr1[i] < arr2[j]) {
                i++;
            }
            else if (arr2[j] < arr3[k]) {
                j++;
            }
            else {
                k++;
            }
        }
        System.out.println("Common elements: " + commonElements.toString());
    }
}