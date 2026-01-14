package leetcodeQuestions;

import java.util.Arrays;

public class RemoveElements_27 {

    public static void main(String[] args) {
        int val = 3;
        int[] nums ={3,2,2,3};

        System.out.println(removeElement(nums,val));
    }
    public static int removeElement(int[] nums, int val) {
        int len = 0;
        // int anotherArray[] = new int[len];
        int n = nums.length-1;

        //     int k = 0;
        // for(int i =0;i<n;i++){
        //     int number = nums[i];

        //     if(number == val){

        //         anotherArray[n-i]=val;
        //         k++;
        //     }
        // }
        // return anotherArray.length-1;


        for(int i =0;i<=n;i++){
            if(nums[i] != val){
                nums[len]=nums[i];
                len++;
            }
        }

        return len;
    }
}
