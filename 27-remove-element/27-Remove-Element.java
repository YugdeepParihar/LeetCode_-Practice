class Solution {
    public int removeElement(int[] nums, int val) {
         int k=0;
        int a=0;
        while(k<nums.length){
            if(nums[k]!=val){
                nums[a++]=nums[k++];
            }
            else{
                k++;
            }
        }
        return a;
    }
    }
//     class Solution {
//     public int removeElement(int[] nums, int val) {
        
//         int c = 0;
//         for(int i = 0; i < nums.length; i++){
//             if(nums[i] != val){
//                 nums[c] = nums[i];
//                 c++;
                
//             }
            
//         }
        
//         return c;
//     }
    

// }

