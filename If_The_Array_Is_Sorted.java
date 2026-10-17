/*
Check if the Array is Sorted I
Given an array arr of size n, the task is to check if the given array is sorted in 
(ascending / Increasing / Non-decreasing) order. If the array is sorted then return True, 
else return False.

Explanation: The given array is sorted i.e Every element in the array is smaller than or 
equals to its next values, So the answer is True.


Example 1:
Input: n = 5, arr = [1,2,3,4,5]

Output: True

Example 2:
Input: n = 5, arr = [5,4,6,7,8]

Output: False

Explanation: The given array is Not sorted i.e Every element in the array is not smaller 
than or equal to its next values, So the answer is False. Here element 5 is not smaller 
than or equal to its future elements.
 */
public class If_The_Array_Is_Sorted {

    
    boolean arraySortedOrNot(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int[] nums = { 1, 2, 2, 4 };

        If_The_Array_Is_Sorted solution = new If_The_Array_Is_Sorted();
        boolean answer = solution.arraySortedOrNot(nums, nums.length);

        System.out.println(answer);

    }
}
