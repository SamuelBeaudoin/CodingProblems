// time complexity: O(n) technically 2n
// space complexity: O(n) because using hashMap outside of for loops

class Solution {
    public int singleNumber(int[] nums) {
         HashMap<Integer, Integer> checker = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            if(checker.containsKey(nums[i])){
                checker.put(nums[i], checker.get(nums[i])+1);
            }else{
                checker.put(nums[i], 1);
            }
        }

        for(Integer key : checker.keySet()){
            if(checker.get(key)==1){
                return key;
            }
        }

        return 0;
    }
}
