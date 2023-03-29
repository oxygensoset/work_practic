package org.example;

public class Interpolation {
    public static int interpolationSearch(int[] A, int target)
    {
        if (A == null || A.length == 0) {
            return -1;
        }
        int left = 0;
        int right = A.length - 1;
        while (A[right] != A[left] && target >= A[left] && target <= A[right])
        {
            int mid = left + ((target - A[left])*(right - left)/(A[right] - A[left]));
            if (target == A[mid]) {
                return mid;
            }
            else if (target < A[mid]) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        if (target == A[left]) {
            return left;
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int[] A = {2, 5, 6, 8, 9, 10, 1, 1, 1,2, 1,3, 1,4 , 1,5, 1, 3, 7, 4, 1,6, 2,8, 99, 88};
        int key = 8;
        int index = interpolationSearch(A, key);
        if (index != -1) {
            System.out.println("Element found at index " + index);
        }
        else {
            System.out.println("Element not found in the array");
        }
    }
}

